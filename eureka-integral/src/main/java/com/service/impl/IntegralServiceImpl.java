package com.service.impl;

import com.dao.IntegralDao;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.pojo.Integral;
import com.service.IntegralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegralServiceImpl implements IntegralService {
    @Autowired
    private IntegralDao integralDao;
    @Override
    public int addPoint(int userId,int pointNumber) {
        Integral integral = new Integral();
        integral.setUserId(userId);
        integral.setPointNumber(pointNumber);
        return integralDao.addPoint(integral);
    }

}
