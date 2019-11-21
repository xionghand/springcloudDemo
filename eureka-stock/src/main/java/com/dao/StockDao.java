package com.dao;

import java.util.List;
import java.util.Map;

public interface StockDao {
    public int queryStockByGoodsId(int goodId);
    public int updateStock(Map<String,Object> map);
}
