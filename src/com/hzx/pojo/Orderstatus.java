package com.hzx.pojo;

import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class Orderstatus extends OrderstatusKey {
    private Integer postmanid;

    private Date operatetime;

    public Integer getPostmanid() {
        return postmanid;
    }

    public void setPostmanid(Integer postmanid) {
        this.postmanid = postmanid;
    }

    public Date getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }
}