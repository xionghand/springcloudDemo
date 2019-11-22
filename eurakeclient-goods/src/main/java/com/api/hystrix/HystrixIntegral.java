package com.api.hystrix;

import com.api.IntegralApi;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class HystrixIntegral implements IntegralApi {

    @Override
    public Map<String, Object> addPoint(int userId, int pointNumber) {

        System.out.println("服务正在维修");
        return null;
    }
}
