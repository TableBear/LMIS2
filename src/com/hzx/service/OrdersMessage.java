package com.hzx.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrdersMessage
{
  private String time;
  private String city;
  private String stationName;
  private String operateType;
  
  public OrdersMessage(Date time, String city, String stationName, String operateType)
  {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    this.time = sdf.format(time);
    this.city = city;
    this.stationName = stationName;
    this.operateType = operateType;
  }
  
  public String getTime()
  {
    return this.time;
  }
  
  public void setTime(String time)
  {
    this.time = time;
  }
  
  public String getCity()
  {
    return this.city;
  }
  
  public void setCity(String city)
  {
    this.city = city;
  }
  
  public String getStationName()
  {
    return this.stationName;
  }
  
  public void setStationName(String stationName)
  {
    this.stationName = stationName;
  }
  
  public String getOperateType()
  {
    return this.operateType;
  }
  
  public void setOperateType(String operateType)
  {
    this.operateType = operateType;
  }
}
