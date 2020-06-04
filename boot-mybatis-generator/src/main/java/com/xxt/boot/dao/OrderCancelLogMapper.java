package com.xxt.boot.dao;

import com.xxt.boot.entity.OrderCancelLog;
import com.xxt.boot.entity.OrderCancelLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCancelLogMapper {
    long countByExample(OrderCancelLogExample example);

    int deleteByExample(OrderCancelLogExample example);

    int insert(OrderCancelLog record);

    int insertSelective(OrderCancelLog record);

    List<OrderCancelLog> selectByExample(OrderCancelLogExample example);

    int updateByExampleSelective(@Param("record") OrderCancelLog record, @Param("example") OrderCancelLogExample example);

    int updateByExample(@Param("record") OrderCancelLog record, @Param("example") OrderCancelLogExample example);
}