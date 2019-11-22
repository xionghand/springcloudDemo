package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.service.StockService;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private StockService stockService;
    @ResponseBody
    @RequestMapping("/query")
    public Map<String,Object> queryByGoodId(@RequestParam("id")int goodId){
        int index = stockService.queryStockByGoodsId(goodId);
        Map<String,Object> map = new HashMap<>();
        if (index!=0){
            map.put("HttpStatus","200");
            map.put("goodId",index);
            map.put("message","success");
        }
        return map;
    }

    @ResponseBody
    @RequestMapping("/updateStockNumber")
    public Map<String,Object> updateStockNumber(@RequestParam("id")int goodId,@RequestParam("stockNumber")int stockNumber){
        Map<String,Object> map = new HashMap<>();
        int index = stockService.updateStock(goodId,stockNumber);
        if (index>0){
            map.put("message","success");
        }
        return map;

    }
}
