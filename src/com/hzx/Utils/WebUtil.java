package com.hzx.Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class WebUtil
{
  public static String creatOrderNumber()
  {
    String str = null;
    
    DateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
    
    String format = df.format(new Date());
    
    Random r = new Random();
    for (int i = 0; i < 3; i++) {
      format = format + r.nextInt(10);
    }
    return format;
  }
}
