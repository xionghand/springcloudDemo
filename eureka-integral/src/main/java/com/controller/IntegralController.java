package com.controller;

import com.pojo.Integral;
import com.service.IntegralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/point")
public class IntegralController {
    @Autowired
    private IntegralService integralService;
    @ResponseBody
    @RequestMapping("/addPoint")
    public Map<String,Object> addPoint(@RequestParam("userId") int userId, @RequestParam("pointNumber") int pointNumber){
        Map<String,Object> map = new HashMap<>();
        int flag = integralService.addPoint(userId,pointNumber);
        map.put("index",flag);
        return map;
    }
}
