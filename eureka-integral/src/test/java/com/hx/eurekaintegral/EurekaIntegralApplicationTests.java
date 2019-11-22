package com.hx.eurekaintegral;

import com.dao.IntegralDao;
import com.pojo.Integral;
import com.service.IntegralService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EurekaIntegralApplicationTests {

    @Autowired
    IntegralDao service;
    @Test
    void contextLoads() {
        System.out.println("开始");
        Integral integral = new Integral();
        integral.setUserId(1);
        integral.setPointNumber(22);
        int i = service.addPoint(integral);
        System.out.println(i);
    }

}
