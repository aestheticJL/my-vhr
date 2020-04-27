package com.mmt.vhr.service;

import com.mmt.vhr.mapper.EmployeeMapper;
import com.mmt.vhr.model.Employee;
import com.mmt.vhr.model.RespPageBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    public static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    RabbitTemplate rabbitTemplate;

    public RespPageBean getEmployeeByPage(Integer page, Integer size, String key) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<Employee> data = employeeMapper.getEmployeeByPage(page, size, key);
        Long total = employeeMapper.getTotal(key);
        return new RespPageBean(total, data);
    }

    public Integer deleteEmployee(Integer id) {
        return employeeMapper.deleteByPrimaryKey(id);
    }

    public void sentMail() {
        Employee employee = employeeMapper.selectByPrimaryKey(1);
        logger.info(employee.toString());
        rabbitTemplate.convertAndSend("mmt.mail.welcome", employee);
    }
}
