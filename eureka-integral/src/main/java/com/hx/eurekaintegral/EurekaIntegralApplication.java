package com.hx.eurekaintegral;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@ComponentScan("com")
@MapperScan("com.dao")
public class EurekaIntegralApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaIntegralApplication.class, args);
    }

}
