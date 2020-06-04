package com.xxt.boot.type;

import com.xgimi.commons.base.BaseType;

import java.util.List;

/**
 * @Auther: haytt.xiang
 * @Date: 2020/5/23 10:42
 * @Description: 订单取消人工审核工单状态
 */
public class ReviewStatus extends BaseType {

    public static final    ReviewStatus CHECK_PENDING = new    ReviewStatus(0,"待审核");
    public static final    ReviewStatus AUDIT_PASS  = new    ReviewStatus(1,"审核通过");
    public static final    ReviewStatus AUDIT_UNPASS  = new    ReviewStatus(0,"审核不通过");
    public static final    ReviewStatus ORDER_ABNORMAL = new    ReviewStatus(0,"订单状态异常");

    protected ReviewStatus(int code, String msg) {
        super(code, msg);
    }

    public static List<ReviewStatus> getValues() {
        return BaseType.getValues(   ReviewStatus.class);
    }

    public static    ReviewStatus parse(Integer code) {
        return BaseType.parse(getValues(), code);
    }

}
