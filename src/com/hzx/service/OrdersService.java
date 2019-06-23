package com.hzx.service;

import com.hzx.mapper.OrdersMapper;
import com.hzx.pojo.Orders;
import com.hzx.pojo.OrdersExample;
import com.hzx.pojo.Orderstatus;
import com.hzx.pojo.OrderstatusExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService
{
  @Autowired
  OrdersMapper ordersMapper;
  @Autowired
  OrdersExample ordersExample;


  
  public int saveOrders(Orders orders)
  {
    int insert = this.ordersMapper.insert(orders);
    return insert;
  }

  public List<Orders> getAllOrders(){
    ordersExample.clear();
    ordersExample.setDistinct(true);
    ordersExample.setOrderByClause("ordersid");
    List<Orders> list = ordersMapper.selectByExample(ordersExample);
    return list;
  }


  public List<Orders> getOrdersByUserName(String name){
    ordersExample.clear();
    ordersExample.setOrderByClause("createtime");
    OrdersExample.Criteria criteria = ordersExample.createCriteria();
    criteria.andSendernameEqualTo(name);
    List<Orders> orders = ordersMapper.selectByExample(ordersExample);
    System.out.println(orders.size());
    return orders;
  }


}
