package com.hzx.mapper;

import com.hzx.pojo.Deliverystatus;
import com.hzx.pojo.DeliverystatusExample;
import com.hzx.pojo.DeliverystatusKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeliverystatusMapper {
    int countByExample(DeliverystatusExample example);

    int deleteByExample(DeliverystatusExample example);

    int deleteByPrimaryKey(DeliverystatusKey key);

    int insert(Deliverystatus record);

    int insertSelective(Deliverystatus record);

    List<Deliverystatus> selectByExample(DeliverystatusExample example);

    Deliverystatus selectByPrimaryKey(DeliverystatusKey key);

    int updateByExampleSelective(@Param("record") Deliverystatus record, @Param("example") DeliverystatusExample example);

    int updateByExample(@Param("record") Deliverystatus record, @Param("example") DeliverystatusExample example);

    int updateByPrimaryKeySelective(Deliverystatus record);

    int updateByPrimaryKey(Deliverystatus record);
}