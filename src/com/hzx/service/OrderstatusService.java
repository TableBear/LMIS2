package com.hzx.service;

import com.hzx.mapper.OrderstatusMapper;
import com.hzx.pojo.Orderstatus;
import com.hzx.pojo.OrderstatusExample;
import com.hzx.pojo.OrderstatusExample.Criteria;
import com.hzx.pojo.Station;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderstatusService
{
  @Autowired
  OrderstatusMapper orderstatusMapper;
  @Autowired
  StationService stationService;
  @Autowired
  Orderstatus orderstatus;
  @Autowired
  OrderstatusExample orderstatusExample;
  
  public int saveOrderstatus(String id, int stationId, int postmanId, String operateType)
  {
    this.orderstatus.setOrdersid(id);
    this.orderstatus.setStationid(Integer.valueOf(stationId));
    this.orderstatus.setOperatetype(operateType);
    this.orderstatus.setPostmanid(Integer.valueOf(postmanId));
    this.orderstatus.setOperatetime(new Date());
    int insert = this.orderstatusMapper.insert(this.orderstatus);
    return insert;
  }
  
  public List<OrdersMessage> getOrdersMessage(String orderId)
  {
    this.orderstatusExample.clear();
    this.orderstatusExample.setOrderByClause("operateTime asc");
    Criteria criteria = this.orderstatusExample.createCriteria();
    criteria.andOrdersidEqualTo(orderId);
    List<Orderstatus> list = this.orderstatusMapper.selectByExample(this.orderstatusExample);
    if (!list.isEmpty())
    {
      List<OrdersMessage> messageList = new ArrayList();
      for (int i = 0; i < list.size(); i++)
      {
        Station station = this.stationService.getStationById(list.get(i).getStationid().intValue());
//        System.out.println(station);
//        System.out.println(list.get(i).getStationid().intValue());
//        System.out.println(i);
        messageList.add(new OrdersMessage(((Orderstatus)list.get(i)).getOperatetime(), station.getCity(), station.getStationname(), ((Orderstatus)list.get(i)).getOperatetype()));
      }
      return messageList;
    }
    return null;
  }

//  public int saveOrderStatue(Orderstatus orderstatus){
//    orderstatusMapper.insert(orderstatus);
//  }

  public List getAllOrderStatus(){
    orderstatusExample.clear();
    orderstatusExample.setDistinct(true);
    orderstatusExample.setOrderByClause("operatetime");
    List<Orderstatus> list = orderstatusMapper.selectByExample(orderstatusExample);
    return list;
  }
}
