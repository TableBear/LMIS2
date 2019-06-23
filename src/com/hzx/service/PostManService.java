package com.hzx.service;

import com.hzx.mapper.PostmanMapper;
import com.hzx.pojo.Postman;
import com.hzx.pojo.PostmanExample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostManService
{
  @Autowired
  PostmanExample postmanExample;
  @Autowired
  PostmanMapper postmanMapper;
  
  public List<Postman> getAllPostman()
  {
    this.postmanExample.clear();
    List<Postman> postmanList = this.postmanMapper.selectByExample(this.postmanExample);
    return postmanList;
  }
  
  public int savePostman(String name, String telephone)
  {
    Postman postman = new Postman();
    postman.setName(name);
    postman.setTelephon(telephone);
    postman.setPassword("123456");
    int insert = this.postmanMapper.insert(postman);
    return insert;
  }
}
