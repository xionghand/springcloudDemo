package com.pojo;

import java.io.Serializable;

public class Stock implements Serializable {
    private Integer id;
    private Integer goodId;
    private Integer stockNumber;
    private String stockLoc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getStockLoc() {
        return stockLoc;
    }

    public void setStockLoc(String stockLoc) {
        this.stockLoc = stockLoc;
    }
}
