package com.hzx.controller;

import com.hzx.Utils.StationUtil;
import com.hzx.pojo.Station;
import com.hzx.service.AdressService;
import com.hzx.service.StationJson;
import com.hzx.service.StationService;
import java.io.PrintStream;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StationController
{
  @Autowired
  StationService stationService;
  @Autowired
  AdressService adressService;
  
  @RequestMapping({"/getStations.action"})
  @ResponseBody
  public List<StationJson> getAllStation()
  {
    List<Station> stations = this.stationService.getAllStation();
    List<StationJson> stationJsons = StationUtil.stationsToJsons(stations);
    for (StationJson json : stationJsons) {
      System.out.println(json);
    }
    return stationJsons;
  }
  
  @RequestMapping({"/getStation.action"})
  @ResponseBody
  public StationJson getStationLikeName(String name)
  {
    Station stationByName = this.stationService.getStationByName(name);
    StationJson stationJson = StationUtil.stationToJson(stationByName);
    System.out.println(stationJson);
    return stationJson;
  }
  
  @RequestMapping({"/saveStatio.action"})
  public String saveStatio(String stationName, String province, String city, String county, String telephone, String address, String point)
  {
    System.out.println("OK");
    province = this.adressService.getProvinceNameByCode(province);
    city = this.adressService.getCityNameByCode(city);
    county = this.adressService.getCountyNameByCode(county);
    this.stationService.saveStation(stationName, province, city, county, telephone, address, point);
    return "redirect:/manageStations.action";
  }
}
