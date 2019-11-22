package com.service;

import com.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface GoodsService {
    public List<Goods> queryAll();
    public int buyGoods(int goodId);
}
