package com.hx.eurakeclientgoods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com")
@MapperScan("com.dao")
@EnableFeignClients("com.api")
@EnableCircuitBreaker
public class EurakeclientGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakeclientGoodsApplication.class, args);
    }

}
