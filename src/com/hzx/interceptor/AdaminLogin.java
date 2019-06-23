package com.hzx.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AdaminLogin
  implements HandlerInterceptor
{
  public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o)
    throws Exception
  {
    HttpSession session = httpServletRequest.getSession();
    String username = (String)session.getAttribute("username");
    String password = (String)session.getAttribute("password");
    if ((username == null) || (password == null))
    {
      httpServletResponse.sendRedirect("/LMIS2/adminlogin.action");
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
