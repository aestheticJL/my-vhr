package com.mmt.springbootstudy;

import com.mmt.vhr.service.HrService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootstudyApplicationTests {
@Autowired
HrService userService;
    @Test
    void contextLoads() {
        System.out.println(userService.loadUserByUsername("李白").getUsername());
    }

}
