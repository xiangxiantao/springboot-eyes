package com.xxt.boot;

import com.xxt.boot.entity.OrderCancelLog;
import com.xxt.boot.mapper.OrderCancelLogMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MbpTest {

    @Autowired
    private OrderCancelLogMapper orderCancelLogMapper;

    @Test
    public void testSelect(){
        List<OrderCancelLog> orderCancelLogs = orderCancelLogMapper.selectList(null);
        System.out.println(orderCancelLogs);
    }


}
