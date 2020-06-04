package com.xxt.boot.dao;

import com.xxt.boot.entity.OrderCancelWorkOrder;
import com.xxt.boot.entity.OrderCancelWorkOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCancelWorkOrderMapper {
    long countByExample(OrderCancelWorkOrderExample example);

    int deleteByExample(OrderCancelWorkOrderExample example);

    int insert(OrderCancelWorkOrder record);

    int insertSelective(OrderCancelWorkOrder record);

    List<OrderCancelWorkOrder> selectByExample(OrderCancelWorkOrderExample example);

    int updateByExampleSelective(@Param("record") OrderCancelWorkOrder record, @Param("example") OrderCancelWorkOrderExample example);

    int updateByExample(@Param("record") OrderCancelWorkOrder record, @Param("example") OrderCancelWorkOrderExample example);
}