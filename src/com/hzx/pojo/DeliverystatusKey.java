package com.hzx.pojo;

public class DeliverystatusKey {
    private String ordersid;

    private Integer postmanid;

    public String getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(String ordersid) {
        this.ordersid = ordersid == null ? null : ordersid.trim();
    }

    public Integer getPostmanid() {
        return postmanid;
    }

    public void setPostmanid(Integer postmanid) {
        this.postmanid = postmanid;
    }
}