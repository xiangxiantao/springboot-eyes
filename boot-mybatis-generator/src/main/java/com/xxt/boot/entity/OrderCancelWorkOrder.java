package com.xxt.boot.entity;

import com.xxt.boot.type.OrderStatus;
import com.xxt.boot.type.ReviewStatus;
import com.xxt.boot.type.SendStatus;
import java.time.LocalDateTime;

public class OrderCancelWorkOrder {
    private Long id;

    private String workOrderId;

    private String orderId;

    private Long userId;

    private OrderStatus orderStatus;

    private SendStatus sendStatus;

    private ReviewStatus reviewStatus;

    private String cancelOperator;

    private String postscript;

    private Long refundMoney;

    private String createdBy;

    private LocalDateTime createdTime;

    private String updatedBy;

    private LocalDateTime updatedTime;

    public OrderCancelWorkOrder(Long id, String workOrderId, String orderId, Long userId, OrderStatus orderStatus, SendStatus sendStatus, ReviewStatus reviewStatus, String cancelOperator, String postscript, Long refundMoney, String createdBy, LocalDateTime createdTime, String updatedBy, LocalDateTime updatedTime) {
        this.id = id;
        this.workOrderId = workOrderId;
        this.orderId = orderId;
        this.userId = userId;
        this.orderStatus = orderStatus;
        this.sendStatus = sendStatus;
        this.reviewStatus = reviewStatus;
        this.cancelOperator = cancelOperator;
        this.postscript = postscript;
        this.refundMoney = refundMoney;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public OrderCancelWorkOrder() {
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public SendStatus getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(SendStatus sendStatus) {
        this.sendStatus = sendStatus;
    }

    public ReviewStatus getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(ReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getCancelOperator() {
        return cancelOperator;
    }

    public void setCancelOperator(String cancelOperator) {
        this.cancelOperator = cancelOperator == null ? null : cancelOperator.trim();
    }

    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript == null ? null : postscript.trim();
    }

    public Long getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(Long refundMoney) {
        this.refundMoney = refundMoney;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }
}