package com.mmt.springbootstudy;

import com.mmt.vhr.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootstudyApplicationTests {
    @Autowired
    EmployeeService employeeService;

    @Test
    void contextLoads() {
        employeeService.sentMail();
    }

}
