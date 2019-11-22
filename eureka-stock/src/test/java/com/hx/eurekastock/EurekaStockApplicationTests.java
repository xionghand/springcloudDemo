package com.hx.eurekastock;

import com.service.StockService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EurekaStockApplicationTests {

    @Autowired
    StockService stockService;
    @Test
    void contextLoads() {
        System.out.println("开始");
        int i = stockService.updateStock(1,1);
        System.out.println(i);
    }

}
