package com.hzx.service;

import com.hzx.mapper.AdministratorMapper;
import com.hzx.pojo.Administrator;
import com.hzx.pojo.AdministratorExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService
{
  @Autowired
  Administrator administrator;
  @Autowired
  AdministratorExample administratorExample;
  @Autowired
  AdministratorMapper administratorMapper;
  
  public int saveAmind(String usernaem, String password)
  {
    this.administrator.setName(usernaem);
    this.administrator.setPassword(password);
    int insert = this.administratorMapper.insert(this.administrator);
    return insert;
  }
}
