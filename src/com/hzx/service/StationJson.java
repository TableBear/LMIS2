package com.hzx.service;

public class StationJson
{
  private String title;
  private String content;
  private String point;
  private int isOpen;
  private Icon icon;
  
  public StationJson(String title, String content, String point, int isOpen, Icon icon)
  {
    this.title = title;
    this.content = content;
    this.point = point;
    this.isOpen = isOpen;
    this.icon = icon;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public void setTitle(String title)
  {
    this.title = title;
  }
  
  public String getContent()
  {
    return this.content;
  }
  
  public void setContent(String content)
  {
    this.content = content;
  }
  
  public String getPoint()
  {
    return this.point;
  }
  
  public void setPoint(String point)
  {
    this.point = point;
  }
  
  public int getIsOpen()
  {
    return this.isOpen;
  }
  
  public void setIsOpen(int isOpen)
  {
    this.isOpen = isOpen;
  }
  
  public Icon getIcon()
  {
    return this.icon;
  }
  
  public void setIcon(Icon icon)
  {
    this.icon = icon;
  }
  
  public String toString()
  {
    return "StationJson{title='" + this.title + '\'' + ", content='" + this.content + '\'' + ", point='" + this.point + '\'' + ", isOpen=" + this.isOpen + ", iconJson=" + this.icon + '}';
  }
}
