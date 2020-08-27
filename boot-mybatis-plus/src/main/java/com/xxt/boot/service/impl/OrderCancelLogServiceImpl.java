package com.xxt.boot.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxt.boot.entity.OrderCancelLog;
import com.xxt.boot.mapper.OrderCancelLogMapper;
import com.xxt.boot.service.OrderCancelLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

@Service
public class OrderCancelLogServiceImpl implements OrderCancelLogService {

    @Autowired
    private OrderCancelLogMapper orderCancelLogMapper;

    @Override
    public boolean saveBatch(Collection<OrderCancelLog> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<OrderCancelLog> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<OrderCancelLog> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(OrderCancelLog entity) {
        return false;
    }

    @Override
    public OrderCancelLog getOne(Wrapper<OrderCancelLog> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<OrderCancelLog> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<OrderCancelLog> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<OrderCancelLog> getBaseMapper() {
        return orderCancelLogMapper;
    }
}
