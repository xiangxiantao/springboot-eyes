package com.xxt.boot.entity;

import lombok.Data;

import java.util.Date;

@Data
public class OrderCancelLog {

    private Long id;

    private String workOrderId;

    private String orderId;

    private String originStatus;

    private String opsStatus;

    private String opsRemark;

    private String workOperator;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

}