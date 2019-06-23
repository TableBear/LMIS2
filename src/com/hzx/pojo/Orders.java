package com.hzx.pojo;

import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class Orders {
    private String ordersid;

    private Date createtime;

    private String sendername;

    private String sendermobielephone;

    private String sendertelephone;

    private String origin;

    private String receivername;

    private String receivermobilephone;

    private String receivertelephone;

    private String destination;

    private Long postalfree;

    private Long goodsize;

    private Long goodweight;

    private java.sql.Date requestdate;

    private Byte state;

    private String note;

    public String getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(String ordersid) {
        this.ordersid = ordersid == null ? null : ordersid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getSendername() {
        return sendername;
    }

    public void setSendername(String sendername) {
        this.sendername = sendername == null ? null : sendername.trim();
    }

    public String getSendermobielephone() {
        return sendermobielephone;
    }

    public void setSendermobielephone(String sendermobielephone) {
        this.sendermobielephone = sendermobielephone == null ? null : sendermobielephone.trim();
    }

    public String getSendertelephone() {
        return sendertelephone;
    }

    public void setSendertelephone(String sendertelephone) {
        this.sendertelephone = sendertelephone == null ? null : sendertelephone.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername == null ? null : receivername.trim();
    }

    public String getReceivermobilephone() {
        return receivermobilephone;
    }

    public void setReceivermobilephone(String receivermobilephone) {
        this.receivermobilephone = receivermobilephone == null ? null : receivermobilephone.trim();
    }

    public String getReceivertelephone() {
        return receivertelephone;
    }

    public void setReceivertelephone(String receivertelephone) {
        this.receivertelephone = receivertelephone == null ? null : receivertelephone.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public Long getPostalfree() {
        return postalfree;
    }

    public void setPostalfree(Long postalfree) {
        this.postalfree = postalfree;
    }

    public Long getGoodsize() {
        return goodsize;
    }

    public void setGoodsize(Long goodsize) {
        this.goodsize = goodsize;
    }

    public Long getGoodweight() {
        return goodweight;
    }

    public void setGoodweight(Long goodweight) {
        this.goodweight = goodweight;
    }

    public java.sql.Date getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(java.sql.Date requestdate) {
        this.requestdate = requestdate;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}