package com.service.impl;

import com.dao.StockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.StockService;

import java.util.HashMap;
import java.util.Map;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    private StockDao st;
    @Override
    public int queryStockByGoodsId(int goodId) {
        int index = st.queryStockByGoodsId(goodId);
        return index;
    }

    @Override
    public int updateStock(int goodId,int stockNumber) {
        Map<String,Object> map = new HashMap<>();
        map.put("goodId",goodId);
        map.put("stockNumber",stockNumber);
        int index = st.updateStock(map);
        return index;
    }
}
