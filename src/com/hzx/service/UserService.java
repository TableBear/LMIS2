package com.hzx.service;

import com.hzx.mapper.UserMapper;
import com.hzx.pojo.User;
import com.hzx.pojo.UserExample;
import com.hzx.pojo.UserExample.Criteria;
import java.io.PrintStream;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService
{
  @Autowired
  UserExample userExample;
  @Autowired
  UserMapper userMapper;
  @Autowired
  User user;
  
  public boolean queryUserByNameAndPassword(String name, String password)
  {
    System.out.println("queryUserByNameAndPassword=======>" + name);
    this.userExample.clear();
    this.userExample.setOrderByClause("username asc");
    this.userExample.setDistinct(false);
    Criteria criteria = this.userExample.createCriteria();
    criteria.andUsernameEqualTo(name);
    criteria.andPasswordEqualTo(password);
    List<User> users = this.userMapper.selectByExample(this.userExample);
    for (User user : users) {
      System.out.println(user);
    }
    if (users.isEmpty()) {
      return false;
    }
    return true;
  }
  
  public void saveUser(User user)
  {
    int insert = this.userMapper.insert(user);
    System.out.println(insert);
  }
  
  public int queryIdByName(String name)
  {
    this.userExample.clear();
    this.userExample.setOrderByClause("userId asc");
    this.userExample.setDistinct(false);
    Criteria criteria = this.userExample.createCriteria();
    criteria.andUsernameEqualTo(name);
    List<User> users = this.userMapper.selectByExample(this.userExample);
    for (User user : users) {
      System.out.println(user.getUsername());
    }
    if (users.isEmpty()) {
      return -1;
    }
    return ((User)users.get(0)).getUserid().intValue();
  }
  
  public int saveUserByName_Password_Phone(String username, String password, String phone)
  {
    this.user.setUsername(username);
    this.user.setPassword(password);
    this.user.setUsertelephone(phone);
    int insertId = this.userMapper.insert(this.user);
    return insertId;
  }
  
  public List<User> queryAllUser()
  {
    this.userExample.clear();
    List<User> users = this.userMapper.selectByExample(this.userExample);
    return users;
  }
}
