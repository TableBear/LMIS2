package com.hzx.mapper;

import com.hzx.pojo.Citys;
import com.hzx.pojo.CitysExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CitysMapper {
    int countByExample(CitysExample example);

    int deleteByExample(CitysExample example);

    int deleteByPrimaryKey(Integer cityid);

    int insert(Citys record);

    int insertSelective(Citys record);

    List<Citys> selectByExample(CitysExample example);

    Citys selectByPrimaryKey(Integer cityid);

    int updateByExampleSelective(@Param("record") Citys record, @Param("example") CitysExample example);

    int updateByExample(@Param("record") Citys record, @Param("example") CitysExample example);

    int updateByPrimaryKeySelective(Citys record);

    int updateByPrimaryKey(Citys record);
}