package com.service.impl;

import com.dao.GoodsDao;
import com.pojo.Goods;
import com.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> queryAll() {
        return goodsDao.queryAll();
    }
}
