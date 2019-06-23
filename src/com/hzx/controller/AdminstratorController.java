package com.hzx.controller;

import com.hzx.pojo.*;
import com.hzx.service.*;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminstratorController
{
  @Autowired
  UserService userService;
  @Autowired
  PostManService postManService;
  @Autowired
  StationService stationService;
  @Autowired
  AdminService adminService;
  @Autowired
  OrderstatusService orderstatusService;

  
  @RequestMapping({"/userManage.action", "/manage.action"})
  public ModelAndView userManage()
  {
    ModelAndView mav = new ModelAndView("usertable");
    List<User> users = this.userService.queryAllUser();
    mav.addObject("users", users);
    return mav;
  }
  
  @RequestMapping({"/postmanManage.action"})
  public String postmanManage(HttpServletRequest request)
  {
    List<Postman> postmans = this.postManService.getAllPostman();
    request.setAttribute("postmans", postmans);
    return "postmantable";
  }
  
  @RequestMapping({"/savePostman.action"})
  public void savePostMan(HttpServletRequest request, HttpServletResponse response)
    throws IOException
  {
    int i = this.postManService.savePostman(request.getParameter("name"), request.getParameter("telephone"));
    if (i > 0) {
      response.sendRedirect("/LMIS2/postmanManage.action");
    }
  }
  
  @RequestMapping({"/manageStations.action"})
  public String manageAllStation(Model model)
  {
    List<Station> stations = this.stationService.getAllStation();
    model.addAttribute("stations", stations);
    return "stationtable";
  }
  
  @RequestMapping({"/deleteStation.action"})
  public String deleteStation(Integer[] stationIds)
  {
    for (Integer i : stationIds) {
      System.out.println(i);
    }
    this.stationService.deleteStation(stationIds);
    return "redirect:/manageStations.action";
  }
  
  @RequestMapping({"/oderOperate.action"})
  public String orderoperate(Model model)
  {
    List<Orderstatus> orderStatus = orderstatusService.getAllOrderStatus();
    model.addAttribute("orders",orderStatus);
    return "new_operate";
  }
  
  @RequestMapping({"/registeAdmin.action"})
  public String adminRegiste(HttpServletRequest request, String username, String password)
  {
    this.adminService.saveAmind(username, password);
    HttpSession session = request.getSession();
    session.setAttribute("username", username);
    session.setAttribute("password", password);
    return "redirect:/manage.action";
  }

  @RequestMapping("adminlogin.action")
  public String adminLogin(){
    return "adminlogin";
  }
}
