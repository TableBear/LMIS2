package com.hzx.pojo;

import org.springframework.stereotype.Service;

@Service
public class Deliverystatus extends DeliverystatusKey {
    private Byte deliverStatus;

    public Byte getDeliverStatus() {
        return deliverStatus;
    }

    public void setDeliverStatus(Byte deliverStatus) {
        this.deliverStatus = deliverStatus;
    }
}