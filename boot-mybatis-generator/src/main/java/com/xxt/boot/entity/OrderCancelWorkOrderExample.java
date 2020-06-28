package com.xxt.boot.entity;

import com.xxt.boot.type.OrderStatus;
import com.xxt.boot.type.ReviewStatus;
import com.xxt.boot.type.SendStatus;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderCancelWorkOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderCancelWorkOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> orderStatusCriteria;

        protected List<Criterion> sendStatusCriteria;

        protected List<Criterion> reviewStatusCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            orderStatusCriteria = new ArrayList<Criterion>();
            sendStatusCriteria = new ArrayList<Criterion>();
            reviewStatusCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getOrderStatusCriteria() {
            return orderStatusCriteria;
        }

        protected void addOrderStatusCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            orderStatusCriteria.add(new Criterion(condition, value, "com.xxt.boot.type.MyBaseTypeHandler"));
            allCriteria = null;
        }

        protected void addOrderStatusCriterion(String condition, OrderStatus value1, OrderStatus value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            orderStatusCriteria.add(new Criterion(condition, value1, value2, "com.xxt.boot.type.MyBaseTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getSendStatusCriteria() {
            return sendStatusCriteria;
        }

        protected void addSendStatusCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            sendStatusCriteria.add(new Criterion(condition, value, "com.xxt.boot.type.MyBaseTypeHandler"));
            allCriteria = null;
        }

        protected void addSendStatusCriterion(String condition, SendStatus value1, SendStatus value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            sendStatusCriteria.add(new Criterion(condition, value1, value2, "com.xxt.boot.type.MyBaseTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getReviewStatusCriteria() {
            return reviewStatusCriteria;
        }

        protected void addReviewStatusCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            reviewStatusCriteria.add(new Criterion(condition, value, "com.xxt.boot.type.MyBaseTypeHandler"));
            allCriteria = null;
        }

        protected void addReviewStatusCriterion(String condition, ReviewStatus value1, ReviewStatus value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            reviewStatusCriteria.add(new Criterion(condition, value1, value2, "com.xxt.boot.type.MyBaseTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || orderStatusCriteria.size() > 0
                || sendStatusCriteria.size() > 0
                || reviewStatusCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(orderStatusCriteria);
                allCriteria.addAll(sendStatusCriteria);
                allCriteria.addAll(reviewStatusCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdIsNull() {
            addCriterion("work_order_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdIsNotNull() {
            addCriterion("work_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdEqualTo(String value) {
            addCriterion("work_order_id =", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotEqualTo(String value) {
            addCriterion("work_order_id <>", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdGreaterThan(String value) {
            addCriterion("work_order_id >", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("work_order_id >=", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdLessThan(String value) {
            addCriterion("work_order_id <", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdLessThanOrEqualTo(String value) {
            addCriterion("work_order_id <=", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdLike(String value) {
            addCriterion("work_order_id like", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotLike(String value) {
            addCriterion("work_order_id not like", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdIn(List<String> values) {
            addCriterion("work_order_id in", values, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotIn(List<String> values) {
            addCriterion("work_order_id not in", values, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdBetween(String value1, String value2) {
            addCriterion("work_order_id between", value1, value2, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotBetween(String value1, String value2) {
            addCriterion("work_order_id not between", value1, value2, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(OrderStatus value) {
            addOrderStatusCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(OrderStatus value) {
            addOrderStatusCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(OrderStatus value) {
            addOrderStatusCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(OrderStatus value) {
            addOrderStatusCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(OrderStatus value) {
            addOrderStatusCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(OrderStatus value) {
            addOrderStatusCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<OrderStatus> values) {
            addOrderStatusCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<OrderStatus> values) {
            addOrderStatusCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(OrderStatus value1, OrderStatus value2) {
            addOrderStatusCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(OrderStatus value1, OrderStatus value2) {
            addOrderStatusCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNull() {
            addCriterion("send_status is null");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNotNull() {
            addCriterion("send_status is not null");
            return (Criteria) this;
        }

        public Criteria andSendStatusEqualTo(SendStatus value) {
            addSendStatusCriterion("send_status =", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotEqualTo(SendStatus value) {
            addSendStatusCriterion("send_status <>", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThan(SendStatus value) {
            addSendStatusCriterion("send_status >", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThanOrEqualTo(SendStatus value) {
            addSendStatusCriterion("send_status >=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThan(SendStatus value) {
            addSendStatusCriterion("send_status <", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThanOrEqualTo(SendStatus value) {
            addSendStatusCriterion("send_status <=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIn(List<SendStatus> values) {
            addSendStatusCriterion("send_status in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotIn(List<SendStatus> values) {
            addSendStatusCriterion("send_status not in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusBetween(SendStatus value1, SendStatus value2) {
            addSendStatusCriterion("send_status between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotBetween(SendStatus value1, SendStatus value2) {
            addSendStatusCriterion("send_status not between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNull() {
            addCriterion("review_status is null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNotNull() {
            addCriterion("review_status is not null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusEqualTo(ReviewStatus value) {
            addReviewStatusCriterion("review_status =", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotEqualTo(ReviewStatus value) {
            addReviewStatusCriterion("review_status <>", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThan(ReviewStatus value) {
            addReviewStatusCriterion("review_status >", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThanOrEqualTo(ReviewStatus value) {
            addReviewStatusCriterion("review_status >=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThan(ReviewStatus value) {
            addReviewStatusCriterion("review_status <", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThanOrEqualTo(ReviewStatus value) {
            addReviewStatusCriterion("review_status <=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIn(List<ReviewStatus> values) {
            addReviewStatusCriterion("review_status in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotIn(List<ReviewStatus> values) {
            addReviewStatusCriterion("review_status not in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusBetween(ReviewStatus value1, ReviewStatus value2) {
            addReviewStatusCriterion("review_status between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotBetween(ReviewStatus value1, ReviewStatus value2) {
            addReviewStatusCriterion("review_status not between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andCancelOperatorIsNull() {
            addCriterion("cancel_operator is null");
            return (Criteria) this;
        }

        public Criteria andCancelOperatorIsNotNull() {
            addCriterion("cancel_operator is not null");
            return (Criteria) this;
        }

        public Criteria andCancelOperatorEqualTo(String value) {
            addCriterion("cancel_operator =", value, "cancelOperator");
            return (Criteria) this;
        }

        public Criteria andCancelOperatorNotEqualTo(String value) {
            addCriterion("cancel_operator <>", value, "cancelOperator");
            return (Criteria) this;
        }

        public Criteria andCancelOperatorGreaterThan(String value) {
            addCriterion("cancel_operator >", value, "cancelOperator");
            return (Criteria) this;
        }

        public Criteria andCancelOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_operator >=", value, "cancelOperator");
            return (Criteria) this;
        }

        public Criteria andCancelOperatorLessThan(String value) {
            addCriterion("cancel_operator <", value, "cancelOperator");
            return (Criteria) this;
        }

        public Criteria andCancelOperatorLessThanOrEqualTo(String value) {
            addCriterion("cancel_operator <=", value, "cancelOperator");
            return (Criteria) this;
        }

        public Criteria andCancelOperatorLike(String value) {
            addCriterion("cancel_operator like", value, "cancelOperator");
            return (Criteria) this;
        }

        public Criteria andCancelOperatorNotLike(String value) {
            addCriterion("cancel_operator not like", value, "cancelOperator");
            return (Criteria) this;
        }

        public Criteria andCancelOperatorIn(List<String> values) {
            addCriterion("cancel_operator in", values, "cancelOperator");
            return (Criteria) this;
        }

        public Criteria andCancelOperatorNotIn(List<String> values) {
            addCriterion("cancel_operator not in", values, "cancelOperator");
            return (Criteria) this;
        }

        public Criteria andCancelOperatorBetween(String value1, String value2) {
            addCriterion("cancel_operator between", value1, value2, "cancelOperator");
            return (Criteria) this;
        }

        public Criteria andCancelOperatorNotBetween(String value1, String value2) {
            addCriterion("cancel_operator not between", value1, value2, "cancelOperator");
            return (Criteria) this;
        }

        public Criteria andPostscriptIsNull() {
            addCriterion("postscript is null");
            return (Criteria) this;
        }

        public Criteria andPostscriptIsNotNull() {
            addCriterion("postscript is not null");
            return (Criteria) this;
        }

        public Criteria andPostscriptEqualTo(String value) {
            addCriterion("postscript =", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotEqualTo(String value) {
            addCriterion("postscript <>", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptGreaterThan(String value) {
            addCriterion("postscript >", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptGreaterThanOrEqualTo(String value) {
            addCriterion("postscript >=", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLessThan(String value) {
            addCriterion("postscript <", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLessThanOrEqualTo(String value) {
            addCriterion("postscript <=", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLike(String value) {
            addCriterion("postscript like", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotLike(String value) {
            addCriterion("postscript not like", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptIn(List<String> values) {
            addCriterion("postscript in", values, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotIn(List<String> values) {
            addCriterion("postscript not in", values, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptBetween(String value1, String value2) {
            addCriterion("postscript between", value1, value2, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotBetween(String value1, String value2) {
            addCriterion("postscript not between", value1, value2, "postscript");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIsNull() {
            addCriterion("refund_money is null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIsNotNull() {
            addCriterion("refund_money is not null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyEqualTo(Long value) {
            addCriterion("refund_money =", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotEqualTo(Long value) {
            addCriterion("refund_money <>", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThan(Long value) {
            addCriterion("refund_money >", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("refund_money >=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThan(Long value) {
            addCriterion("refund_money <", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThanOrEqualTo(Long value) {
            addCriterion("refund_money <=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIn(List<Long> values) {
            addCriterion("refund_money in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotIn(List<Long> values) {
            addCriterion("refund_money not in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyBetween(Long value1, Long value2) {
            addCriterion("refund_money between", value1, value2, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotBetween(Long value1, Long value2) {
            addCriterion("refund_money not between", value1, value2, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(LocalDateTime value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(LocalDateTime value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(LocalDateTime value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(LocalDateTime value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<LocalDateTime> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<LocalDateTime> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(LocalDateTime value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(LocalDateTime value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(LocalDateTime value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(LocalDateTime value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<LocalDateTime> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<LocalDateTime> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}