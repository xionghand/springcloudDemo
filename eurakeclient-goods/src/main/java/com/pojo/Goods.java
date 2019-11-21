package com.pojo;

import java.io.Serializable;

public class Goods implements Serializable {
    private Integer id;
    private String goodName;
    private String goodId;
    private Double goodPrice;
    private Integer goodType;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodName='" + goodName + '\'' +
                ", goodId='" + goodId + '\'' +
                ", goodPrice=" + goodPrice +
                ", goodType=" + goodType +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public Double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Integer getGoodType() {
        return goodType;
    }

    public void setGoodType(Integer goodType) {
        this.goodType = goodType;
    }
}
