package com.hzx.controller;

import com.hzx.pojo.Citys;
import com.hzx.pojo.County;
import com.hzx.pojo.Provinces;
import com.hzx.service.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class AddressController
{
  @Autowired
  AdressService adressService;
  
  @RequestMapping({"/getProvincce.action"})
  @ResponseBody
  public Provinces getProvince(HttpServletRequest request)
    throws UnsupportedEncodingException
  {
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    Provinces province;
    if (id != null)
    {
      province = this.adressService.getProvincesById(Integer.parseInt(id));
    }
    else
    {
      if (name != null)
      {
        System.out.println("Controller===========>" + name);
        province = this.adressService.getProvinceByName(name);
      }
      else
      {
        return new Provinces();
      }
    }
    return null;
  }
  
  @RequestMapping(value={"/getAllProvince.action"}, produces={"application/json;charset=UTF-8"})
  @ResponseBody
  public List<Provinces> getAllProvinces()
  {
    List<Provinces> allProvinces = this.adressService.getAllProvinces();
    return allProvinces;
  }
  
  @RequestMapping({"/getAllCity.action"})
  @ResponseBody
  public List<Citys> getAllCitys(String proCode)
  {
    List<Citys> citys = this.adressService.getCitysByProvincesCode(proCode);
    return citys;
  }
  
  @RequestMapping({"/getAllCounty.action"})
  @ResponseBody
  public List<County> getAllCount(String citCode)
  {
    List<County> county = this.adressService.getCountyByCitsCode(citCode);
    return county;
  }
}
