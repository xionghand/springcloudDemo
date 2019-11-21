package com.service;

import java.util.Map;

public interface StockService {
    public int queryStockByGoodsId(int goodId);
    public int updateStock(int goodId,int stockNumber);
}
