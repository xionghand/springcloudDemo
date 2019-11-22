package com.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("eureka-stock")
public interface StockApi {
    @RequestMapping("/stock/query")
    public Map<String, Object> queryByGoodId(@RequestParam("id") int goodId);

    @RequestMapping("/stock/updateStockNumber")
    public Map<String,Object> updateStockNumber(@RequestParam("id")int goodId,@RequestParam("stockNumber")int stockNumber);
}
