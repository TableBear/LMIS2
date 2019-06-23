package com.hzx.interceptor;

import com.hzx.service.UserService;
import java.io.PrintStream;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor
  implements HandlerInterceptor
{
  @Resource(name="userService")
  UserService userService;
  
  public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o)
    throws Exception
  {
    String username = httpServletRequest.getParameter("username");
    String password = httpServletRequest.getParameter("password");
    System.out.println("拦截器");
    System.out.println(username + " " + password);
    if ((username == null) || (password == null))
    {
      httpServletResponse.sendRedirect("/LMIS2/toLogin.action");
      return false;
    }
    return true;
  }
  
  public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView)
    throws Exception
  {}
  
  public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e)
    throws Exception
  {}
}
