package com.xxt.boot.type;

import com.xgimi.commons.base.BaseType;

import java.util.List;

/**
 * 在线商场-交易中心-订单:
 *
 * <p>订单状态类型定义
 *
 * @author 庞先海 2017-07-22
 */
public class OrderStatus extends BaseType {

    /**
     * 没有支付任何金额
     */
    public final static   OrderStatus UNPAID = new   OrderStatus(1, "待支付");

    public final static   OrderStatus DEPOSITS_PAID = new   OrderStatus(0, "已支付定金");

    /**
     * 支付完所有的金额
     */
    public final static   OrderStatus PAID = new   OrderStatus(2, "已支付");

    public final static   OrderStatus CANCEL = new   OrderStatus(3, "已取消");

    public final static   OrderStatus COMPLETE = new   OrderStatus(5, "已完成");

    public final static   OrderStatus REFUND = new   OrderStatus(6, "退款中");

    public final static   OrderStatus REFUND_COMPLETE = new   OrderStatus(7, "退款完成");

    protected OrderStatus(int code, String msg) {
        super(code, msg);
    }

    public static List<OrderStatus> getValues() {
        return BaseType.getValues(  OrderStatus.class);
    }

    public static   OrderStatus parse(Integer code) {
        return BaseType.parse(getValues(), code);
    }
}
