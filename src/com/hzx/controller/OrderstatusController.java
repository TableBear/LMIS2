package com.hzx.controller;

import com.hzx.service.OrdersMessage;
import com.hzx.service.OrderstatusService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderstatusController
{
  @Autowired
  OrderstatusService orderstatusService;
  
  @RequestMapping({"/changeOrderstatus.action"})
  @ResponseBody
  public int saveOrderstatus(String id, int stationId, int postmanId, String operateType)
  {
    if (operateType.equals("派送")) {
      operateType = "正在" + operateType;
    } else {
      operateType = "已" + operateType;
    }
    this.orderstatusService.saveOrderstatus(id, stationId, postmanId, operateType);
    return 202;
  }
  
  @RequestMapping({"/getOrderstatusJson.action"})
  @ResponseBody
  public List<OrdersMessage> getOrderstatusJson(String orderId)
  {
    List<OrdersMessage> message = this.orderstatusService.getOrdersMessage(orderId);
    return message;
  }
  
  @RequestMapping({"/getOrderstatus.action"})
  public ModelAndView getOrderstatus(String orderId)
  {
    List<OrdersMessage> message = this.orderstatusService.getOrdersMessage(orderId);
    ModelAndView mav = new ModelAndView("package-detail");
    mav.addObject("orderId", orderId);
    mav.addObject("messages", message);
    return mav;
  }
}
