package com.api;

import com.api.hystrix.HystrixIntegral;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "eureka-integral",fallback = HystrixIntegral.class)
public interface IntegralApi {

    @RequestMapping("/point/addPoint")
    public Map<String,Object> addPoint(@RequestParam("userId") int userId, @RequestParam("pointNumber") int pointNumber);
}
