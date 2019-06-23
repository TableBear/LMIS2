package com.hzx.controller;

import com.hzx.service.UserService;
import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController
{
  @Resource(name="userService")
  UserService userService;
  
  @RequestMapping({"/toLogin.action"})
  public String toLogin()
  {
    return "login";
  }
  
  @RequestMapping({"/login.action"})
  public void login(HttpServletRequest request, HttpServletResponse response)
    throws IOException
  {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    boolean b = this.userService.queryUserByNameAndPassword(username, password);
    if (!b)
    {
      response.sendRedirect("/LMIS2/toLogin.action");
    }
    else
    {
      int userID = this.userService.queryIdByName(username);
      HttpSession session = request.getSession();
      session.removeAttribute("userID");
      session.setAttribute("userID", Integer.valueOf(userID));
      session.setAttribute("userName", username);
      if (userID > 0) {
        response.sendRedirect("/LMIS2/");
      }
    }
  }
  
  @RequestMapping({"/toRegister.action"})
  public String toRegiste()
  {
    return "register";
  }
  
  @RequestMapping({"/register.action"})
  public void registe(HttpServletRequest request, HttpServletResponse response)
    throws IOException
  {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String phone = request.getParameter("telephone");
    int i = this.userService.saveUserByName_Password_Phone(username, password, phone);
    if (i == 0)
    {
      response.sendRedirect("/LMIS2/toRegiste.action");
    }
    else
    {
      int userID = this.userService.queryIdByName(username);
      HttpSession session = request.getSession();
      session.removeAttribute("userID");
      session.removeAttribute("userName");
      session.setAttribute("userID", Integer.valueOf(userID));
      session.setAttribute("userName", username);
      if (userID > 0) {
        response.sendRedirect("/LMIS2/");
      }
    }
  }
  
  @RequestMapping({"logout.action"})
  public void logout(HttpServletRequest request, HttpServletResponse response)
    throws IOException
  {
    HttpSession session = request.getSession();
    session.removeAttribute("userID");
    session.removeAttribute("userName");
    response.sendRedirect("/LMIS2/");
  }
}
