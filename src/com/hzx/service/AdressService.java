package com.hzx.service;

import com.hzx.mapper.CitysMapper;
import com.hzx.mapper.CountyMapper;
import com.hzx.mapper.ProvincesMapper;
import com.hzx.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdressService
{
  @Autowired
  Provinces provinces;
  @Autowired
  Citys citys;
  @Autowired
  County county;
  @Autowired
  ProvincesExample provincesExample;
  @Autowired
  CitysExample citysExample;
  @Autowired
  CountyExample countyExample;
  @Autowired
  ProvincesMapper provincesMapper;
  @Autowired
  CitysMapper citysMapper;
  @Autowired
  CountyMapper countyMapper;
  
  public Provinces getProvinceByName(String provinces)
  {
    System.out.println("Test================>" + provinces);
    this.provincesExample.clear();
    ProvincesExample.Criteria criteria = this.provincesExample.createCriteria();
    criteria.andProvincesnameEqualTo(provinces);
    List<Provinces> provinces1 = this.provincesMapper.selectByExample(this.provincesExample);
    if (provinces1.size() != 0) {
      return (Provinces)provinces1.get(0);
    }
    return new Provinces();
  }
  
  public Provinces getProvincesById(int id)
  {
    Provinces provinces = this.provincesMapper.selectByPrimaryKey(Integer.valueOf(id));
    return provinces;
  }
  
  public List<Provinces> getAllProvinces()
  {
    this.provincesExample.clear();
    
    List<Provinces> provincesList = this.provincesMapper.selectByExample(this.provincesExample);
    return provincesList;
  }
  
  public List<Citys> getCitysByProvincesCode(String code)
  {
    this.citysExample.clear();
    CitysExample.Criteria criteria = this.citysExample.createCriteria();
    criteria.andProvincecodeEqualTo(code);
    List<Citys> citys = this.citysMapper.selectByExample(this.citysExample);
    return citys;
  }
  
  public List<County> getCountyByCitsCode(String code)
  {
    this.countyExample.clear();
    CountyExample.Criteria criteria = this.countyExample.createCriteria();
    criteria.andCitycodeEqualTo(code);
    List<County> counties = this.countyMapper.selectByExample(this.countyExample);
    return counties;
  }
  
  public String getProvinceNameByCode(String code)
  {
    this.provincesExample.clear();
    ProvincesExample.Criteria criteria = this.provincesExample.createCriteria();
    criteria.andProvincecodeEqualTo(code);
    List<Provinces> provinces = this.provincesMapper.selectByExample(this.provincesExample);
    return ((Provinces)provinces.get(0)).getProvincesname();
  }
  
  public String getCityNameByCode(String code)
  {
    this.citysExample.clear();
    CitysExample.Criteria criteria = this.citysExample.createCriteria();
    criteria.andCitycodeEqualTo(code);
    List<Citys> provinces = this.citysMapper.selectByExample(this.citysExample);
    return ((Citys)provinces.get(0)).getCityname();
  }
  
  public String getCountyNameByCode(String code)
  {
    this.countyExample.clear();
    CountyExample.Criteria criteria = this.countyExample.createCriteria();
    criteria.andCountycodeEqualTo(code);
    List<County> provinces = this.countyMapper.selectByExample(this.countyExample);
    return ((County)provinces.get(0)).getCountyname();
  }
}
