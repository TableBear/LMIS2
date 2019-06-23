package com.hzx.pojo;

import org.springframework.stereotype.Service;

@Service
public class Postman {
    private Integer postmanid;

    private String name;

    private String password;

    private String telephon;

    public Integer getPostmanid() {
        return postmanid;
    }

    public void setPostmanid(Integer postmanid) {
        this.postmanid = postmanid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTelephon() {
        return telephon;
    }

    public void setTelephon(String telephon) {
        this.telephon = telephon == null ? null : telephon.trim();
    }
}