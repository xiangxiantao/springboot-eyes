package com.xxt.boot.type;

import com.xgimi.commons.base.BaseType;

import java.util.List;

/**
 * 在线商场-交易中心-订单:
 * <p>发货状态定义
 *
 * @author 庞先海 2017-07-26
 */
public class SendStatus extends BaseType {

    public final static    SendStatus UNSENT = new    SendStatus(0, "未发货");

    public final static    SendStatus SENDING = new    SendStatus(1, "发货中");

    public final static    SendStatus PART_SENT = new    SendStatus(2, "部分发货");

    public final static    SendStatus SENT = new    SendStatus(3, "已发货");

    public final static    SendStatus RECEIVED = new    SendStatus(4, "已收货");

    protected SendStatus(int code, String msg) {
        super(code, msg);
    }

    public static List<SendStatus> getValues() {
        return BaseType.getValues(   SendStatus.class);
    }

    public static    SendStatus parse(Integer code) {
        return BaseType.parse(getValues(), code);
    }
}