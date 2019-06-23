package com.hzx.controller;

import com.hzx.Utils.DateUtil;
import com.hzx.Utils.WebUtil;
import com.hzx.pojo.Orders;
import com.hzx.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class OrdersController
{
  @Autowired
  Orders orders;
  @Autowired
  OrdersService ordersService;
  
  @RequestMapping({"/createOrders.action"})
  @ResponseBody
  public String saveOrders(HttpServletRequest request, HttpServletResponse response)
    throws IOException
  {
    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
    java.util.Date dateo = new java.util.Date();
    String date = sdf.format(dateo);
    String[] strings = date.split("-");
    this.orders.setOrdersid(WebUtil.creatOrderNumber());
    this.orders.setCreatetime(new java.sql.Date(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]), Integer.parseInt(strings[2])));
    this.orders.setDestination(request.getParameter("destination"));
    this.orders.setOrigin(request.getParameter("origin"));
    this.orders.setGoodsize(Long.valueOf(Long.parseLong(request.getParameter("goodsize"))));
    this.orders.setGoodweight(Long.valueOf(Long.parseLong(request.getParameter("goodweight"))));
    this.orders.setReceivername(request.getParameter("receivername"));
    this.orders.setSendername(request.getParameter("sendername"));
    this.orders.setSendermobielephone(request.getParameter("sendermobielephone"));
    this.orders.setReceivermobilephone(request.getParameter("receivermobilephone"));
    if (request.getParameter("sendertelephone") != null) {
      this.orders.setSendertelephone(request.getParameter("sendertelephone"));
    }
    if (request.getParameter("receivertelephone") != null) {
      this.orders.setSendertelephone(request.getParameter("receivertelephone"));
    }
    this.orders.setRequestdate(DateUtil.Convert(request.getParameter("requestdate")));
    this.orders.setPostalfree(Long.valueOf(Math.round(Double.parseDouble(request.getParameter("postalFree")))));
    this.orders.setState(Byte.valueOf((byte)0));
    ordersService.saveOrders(orders);
    return orders.getOrdersid();
  }
  @RequestMapping("createOrder.action")
  public String createOrder(){
    return "createOrder";
  }

  @RequestMapping("orderComplete.action")
  public ModelAndView createOrderComplete(String orderId){
    ModelAndView mav = new ModelAndView("orderComplete");
    mav.addObject("orderId", orderId);
    return mav;
  }

  @RequestMapping("orderHistory.action")
  public String getOrderHistory(Model model){
    List<Orders> orders = ordersService.getOrdersByUserName("AAA");
    model.addAttribute("orders",orders);
    return "history";
  }


}
