package com.service.impl;

import com.api.IntegralApi;
import com.api.StockApi;
import com.dao.GoodsDao;
import com.pojo.Goods;
import com.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private StockApi  stockApi;
    @Autowired
    private IntegralApi integralApi;
    @Override
    public List<Goods> queryAll() {
        return goodsDao.queryAll();
    }

    @Override
    public int buyGoods(int id) {
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> map1 = new HashMap<>();
        Map<String,Object> map2 = new HashMap<>();
        map = stockApi.queryByGoodId(id);
        if (map!=null){
            System.out.println(map.get("message"));
            map1 = stockApi.updateStockNumber(id,1);
            System.out.println(map1.get("message"));
        }
        /*
        *   添加积分
        * */
        map2 = integralApi.addPoint(1,20);
        if (map2!=null){
            System.out.println(map2.get("index"));
        }else{
            System.out.println("程序出现问题，请稍后！");
        }
        return 0;
    }


}
