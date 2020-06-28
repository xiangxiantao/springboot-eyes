package com.xxt.boot.entity;

import java.util.Date;

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

    public OrderCancelLog(Long id, String workOrderId, String orderId, String originStatus, String opsStatus, String opsRemark, String workOperator, String createdBy, Date createdTime, String updatedBy, Date updatedTime) {
        this.id = id;
        this.workOrderId = workOrderId;
        this.orderId = orderId;
        this.originStatus = originStatus;
        this.opsStatus = opsStatus;
        this.opsRemark = opsRemark;
        this.workOperator = workOperator;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public OrderCancelLog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId == null ? null : workOrderId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOriginStatus() {
        return originStatus;
    }

    public void setOriginStatus(String originStatus) {
        this.originStatus = originStatus == null ? null : originStatus.trim();
    }

    public String getOpsStatus() {
        return opsStatus;
    }

    public void setOpsStatus(String opsStatus) {
        this.opsStatus = opsStatus == null ? null : opsStatus.trim();
    }

    public String getOpsRemark() {
        return opsRemark;
    }

    public void setOpsRemark(String opsRemark) {
        this.opsRemark = opsRemark == null ? null : opsRemark.trim();
    }

    public String getWorkOperator() {
        return workOperator;
    }

    public void setWorkOperator(String workOperator) {
        this.workOperator = workOperator == null ? null : workOperator.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}