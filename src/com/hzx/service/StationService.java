package com.hzx.service;

import com.hzx.mapper.StationMapper;
import com.hzx.pojo.Station;
import com.hzx.pojo.StationExample;
import com.hzx.pojo.StationExample.Criteria;
import java.io.PrintStream;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationService
{
  @Autowired
  private StationExample stationExample;
  @Autowired
  private StationMapper stationMapper;
  @Autowired
  private Station station;
  
  public List<Station> getAllStation()
  {
    this.stationExample.clear();
    this.stationExample.setOrderByClause("stationid asc");
    this.stationExample.setDistinct(false);
    List<Station> stations = this.stationMapper.selectByExample(this.stationExample);
    for (Station station : stations) {
      System.out.println(station.getStationname());
    }
    return stations;
  }
  
  public Station getStationByName(String name)
  {
    this.stationExample.clear();
    Criteria criteria = this.stationExample.createCriteria();
    criteria.andStationnameLike("%" + name + "%");
    List<Station> list = this.stationMapper.selectByExample(this.stationExample);
    if (list.size() != 0) {
      return (Station)list.get(0);
    }
    return null;
  }
  
  public void deleteStation(Integer[] ids)
  {
    for (Integer id : ids) {
      this.stationMapper.deleteByPrimaryKey(id);
    }
  }
  
  public int saveStation(String name, String province, String city, String county, String telephone, String address, String point)
  {
    this.station.setStationname(name);
    this.station.setProvince(province);
    this.station.setCity(city);
    this.station.setCounty(county);
    this.station.setTelephone(telephone);
    this.station.setAddress(address);
    this.station.setPoint(point);
    System.out.println(province);
    int insert = this.stationMapper.insert(this.station);
    return insert;
  }
  
  public Station getStationById(int id)
  {
    Station station = this.stationMapper.selectByPrimaryKey(Integer.valueOf(id));
    return station;
  }
}
