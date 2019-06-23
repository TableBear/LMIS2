package com.hzx.pojo;

import org.springframework.stereotype.Service;

@Service
public class Provinces {
    private Integer provinceid;

    private String provincecode;

    private String provincesname;

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode == null ? null : provincecode.trim();
    }

    public String getProvincesname() {
        return provincesname;
    }

    public void setProvincesname(String provincesname) {
        this.provincesname = provincesname == null ? null : provincesname.trim();
    }
}