package com.hzx.mapper;

import com.hzx.pojo.Orderstatus;
import com.hzx.pojo.OrderstatusExample;
import com.hzx.pojo.OrderstatusKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderstatusMapper {
    int countByExample(OrderstatusExample example);

    int deleteByExample(OrderstatusExample example);

    int deleteByPrimaryKey(OrderstatusKey key);

    int insert(Orderstatus record);

    int insertSelective(Orderstatus record);

    List<Orderstatus> selectByExample(OrderstatusExample example);

    Orderstatus selectByPrimaryKey(OrderstatusKey key);

    int updateByExampleSelective(@Param("record") Orderstatus record, @Param("example") OrderstatusExample example);

    int updateByExample(@Param("record") Orderstatus record, @Param("example") OrderstatusExample example);

    int updateByPrimaryKeySelective(Orderstatus record);

    int updateByPrimaryKey(Orderstatus record);
}