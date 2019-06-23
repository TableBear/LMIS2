package com.hzx.Utils;

import java.text.SimpleDateFormat;

public class DateUtil
{
  public static java.sql.Date Convert(String str)
  {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    try
    {
      java.util.Date d = sdf.parse(str);
      return new java.sql.Date(d.getTime());
    }
    catch (Exception exception)
    {
      exception.printStackTrace();
    }
    return null;
  }
}
