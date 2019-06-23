package com.hzx.mapper;

import com.hzx.pojo.County;
import com.hzx.pojo.CountyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CountyMapper {
    int countByExample(CountyExample example);

    int deleteByExample(CountyExample example);

    int deleteByPrimaryKey(Integer countyid);

    int insert(County record);

    int insertSelective(County record);

    List<County> selectByExample(CountyExample example);

    County selectByPrimaryKey(Integer countyid);

    int updateByExampleSelective(@Param("record") County record, @Param("example") CountyExample example);

    int updateByExample(@Param("record") County record, @Param("example") CountyExample example);

    int updateByPrimaryKeySelective(County record);

    int updateByPrimaryKey(County record);
}