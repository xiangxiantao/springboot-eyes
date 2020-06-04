
package com.xxt.boot;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xxt.boot.dao.OrderCancelWorkOrderMapper;
import com.xxt.boot.entity.OrderCancelWorkOrder;
import com.xxt.boot.entity.OrderCancelWorkOrderExample;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @Auther: haytt.xiang
 * @Date: 2020/5/25 15:44
 * @Description:
 */


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {APP.class})// 指定启动类
public class MybatisTest {

    @Autowired
    OrderCancelWorkOrderMapper orderCancelWorkOrderMapper;

    @Test
    public void testMapper(){
        OrderCancelWorkOrderExample example=new OrderCancelWorkOrderExample();
        example.createCriteria().andWorkOrderIdEqualTo("12345678933");
        List<OrderCancelWorkOrder> orderCancelWorkOrders = orderCancelWorkOrderMapper.selectByExample(example);
        System.out.println(orderCancelWorkOrders);
    }


    /**
     * 分页插件的测试
     */
    @Test
    public void testPageQuery(){
        OrderCancelWorkOrderExample example=new OrderCancelWorkOrderExample();
        //example.createCriteria().
        PageHelper.startPage(3,10);
        List<OrderCancelWorkOrder> orderCancelWorkOrders = orderCancelWorkOrderMapper.selectByExample(null);
        PageInfo<OrderCancelWorkOrder> pageInfo=new PageInfo<>(orderCancelWorkOrders);
        System.out.println(pageInfo);

    }

}

