package com.mmt.mailserver.receiver;

import com.mmt.vhr.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Date;

@Component
public class MailReceiver {
    public static final Logger logger = LoggerFactory.getLogger(MailReceiver.class);
    @Autowired
    JavaMailSender javaMailSender;
    @Autowired
    MailProperties mailProperties;
    @Autowired
    TemplateEngine templateEngine;

    @RabbitListener(queues = "mmt.mail.welcome")
    public void handel(Employee employee) {
        logger.info(employee.toString());
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message);
        try {
            mimeMessageHelper.setTo(employee.getEmail());
            mimeMessageHelper.setFrom(mailProperties.getUsername());
            mimeMessageHelper.setSubject("入职欢迎");
            mimeMessageHelper.setSentDate(new Date());
            Context context = new Context();
            context.setVariable("name", employee.getName());
            context.setVariable("posName", employee.getPosId());
            context.setVariable("joblevelName", employee.getJoblevelId());
            context.setVariable("departmentName", employee.getDepartmentId());
            String mail = templateEngine.process("mail", context);
            mimeMessageHelper.setText(mail, true);
            javaMailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
            logger.error("邮件发送失败" + e.getMessage());
        }
    }
}
