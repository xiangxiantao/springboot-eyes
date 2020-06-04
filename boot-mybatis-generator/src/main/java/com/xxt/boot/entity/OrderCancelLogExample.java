package com.xxt.boot.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderCancelLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderCancelLogExample() {
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
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
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

        public Criteria andOriginStatusIsNull() {
            addCriterion("origin_status is null");
            return (Criteria) this;
        }

        public Criteria andOriginStatusIsNotNull() {
            addCriterion("origin_status is not null");
            return (Criteria) this;
        }

        public Criteria andOriginStatusEqualTo(String value) {
            addCriterion("origin_status =", value, "originStatus");
            return (Criteria) this;
        }

        public Criteria andOriginStatusNotEqualTo(String value) {
            addCriterion("origin_status <>", value, "originStatus");
            return (Criteria) this;
        }

        public Criteria andOriginStatusGreaterThan(String value) {
            addCriterion("origin_status >", value, "originStatus");
            return (Criteria) this;
        }

        public Criteria andOriginStatusGreaterThanOrEqualTo(String value) {
            addCriterion("origin_status >=", value, "originStatus");
            return (Criteria) this;
        }

        public Criteria andOriginStatusLessThan(String value) {
            addCriterion("origin_status <", value, "originStatus");
            return (Criteria) this;
        }

        public Criteria andOriginStatusLessThanOrEqualTo(String value) {
            addCriterion("origin_status <=", value, "originStatus");
            return (Criteria) this;
        }

        public Criteria andOriginStatusLike(String value) {
            addCriterion("origin_status like", value, "originStatus");
            return (Criteria) this;
        }

        public Criteria andOriginStatusNotLike(String value) {
            addCriterion("origin_status not like", value, "originStatus");
            return (Criteria) this;
        }

        public Criteria andOriginStatusIn(List<String> values) {
            addCriterion("origin_status in", values, "originStatus");
            return (Criteria) this;
        }

        public Criteria andOriginStatusNotIn(List<String> values) {
            addCriterion("origin_status not in", values, "originStatus");
            return (Criteria) this;
        }

        public Criteria andOriginStatusBetween(String value1, String value2) {
            addCriterion("origin_status between", value1, value2, "originStatus");
            return (Criteria) this;
        }

        public Criteria andOriginStatusNotBetween(String value1, String value2) {
            addCriterion("origin_status not between", value1, value2, "originStatus");
            return (Criteria) this;
        }

        public Criteria andOpsStatusIsNull() {
            addCriterion("ops_status is null");
            return (Criteria) this;
        }

        public Criteria andOpsStatusIsNotNull() {
            addCriterion("ops_status is not null");
            return (Criteria) this;
        }

        public Criteria andOpsStatusEqualTo(String value) {
            addCriterion("ops_status =", value, "opsStatus");
            return (Criteria) this;
        }

        public Criteria andOpsStatusNotEqualTo(String value) {
            addCriterion("ops_status <>", value, "opsStatus");
            return (Criteria) this;
        }

        public Criteria andOpsStatusGreaterThan(String value) {
            addCriterion("ops_status >", value, "opsStatus");
            return (Criteria) this;
        }

        public Criteria andOpsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ops_status >=", value, "opsStatus");
            return (Criteria) this;
        }

        public Criteria andOpsStatusLessThan(String value) {
            addCriterion("ops_status <", value, "opsStatus");
            return (Criteria) this;
        }

        public Criteria andOpsStatusLessThanOrEqualTo(String value) {
            addCriterion("ops_status <=", value, "opsStatus");
            return (Criteria) this;
        }

        public Criteria andOpsStatusLike(String value) {
            addCriterion("ops_status like", value, "opsStatus");
            return (Criteria) this;
        }

        public Criteria andOpsStatusNotLike(String value) {
            addCriterion("ops_status not like", value, "opsStatus");
            return (Criteria) this;
        }

        public Criteria andOpsStatusIn(List<String> values) {
            addCriterion("ops_status in", values, "opsStatus");
            return (Criteria) this;
        }

        public Criteria andOpsStatusNotIn(List<String> values) {
            addCriterion("ops_status not in", values, "opsStatus");
            return (Criteria) this;
        }

        public Criteria andOpsStatusBetween(String value1, String value2) {
            addCriterion("ops_status between", value1, value2, "opsStatus");
            return (Criteria) this;
        }

        public Criteria andOpsStatusNotBetween(String value1, String value2) {
            addCriterion("ops_status not between", value1, value2, "opsStatus");
            return (Criteria) this;
        }

        public Criteria andOpsRemarkIsNull() {
            addCriterion("ops_remark is null");
            return (Criteria) this;
        }

        public Criteria andOpsRemarkIsNotNull() {
            addCriterion("ops_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOpsRemarkEqualTo(String value) {
            addCriterion("ops_remark =", value, "opsRemark");
            return (Criteria) this;
        }

        public Criteria andOpsRemarkNotEqualTo(String value) {
            addCriterion("ops_remark <>", value, "opsRemark");
            return (Criteria) this;
        }

        public Criteria andOpsRemarkGreaterThan(String value) {
            addCriterion("ops_remark >", value, "opsRemark");
            return (Criteria) this;
        }

        public Criteria andOpsRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ops_remark >=", value, "opsRemark");
            return (Criteria) this;
        }

        public Criteria andOpsRemarkLessThan(String value) {
            addCriterion("ops_remark <", value, "opsRemark");
            return (Criteria) this;
        }

        public Criteria andOpsRemarkLessThanOrEqualTo(String value) {
            addCriterion("ops_remark <=", value, "opsRemark");
            return (Criteria) this;
        }

        public Criteria andOpsRemarkLike(String value) {
            addCriterion("ops_remark like", value, "opsRemark");
            return (Criteria) this;
        }

        public Criteria andOpsRemarkNotLike(String value) {
            addCriterion("ops_remark not like", value, "opsRemark");
            return (Criteria) this;
        }

        public Criteria andOpsRemarkIn(List<String> values) {
            addCriterion("ops_remark in", values, "opsRemark");
            return (Criteria) this;
        }

        public Criteria andOpsRemarkNotIn(List<String> values) {
            addCriterion("ops_remark not in", values, "opsRemark");
            return (Criteria) this;
        }

        public Criteria andOpsRemarkBetween(String value1, String value2) {
            addCriterion("ops_remark between", value1, value2, "opsRemark");
            return (Criteria) this;
        }

        public Criteria andOpsRemarkNotBetween(String value1, String value2) {
            addCriterion("ops_remark not between", value1, value2, "opsRemark");
            return (Criteria) this;
        }

        public Criteria andWorkOperatorIsNull() {
            addCriterion("work_operator is null");
            return (Criteria) this;
        }

        public Criteria andWorkOperatorIsNotNull() {
            addCriterion("work_operator is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOperatorEqualTo(String value) {
            addCriterion("work_operator =", value, "workOperator");
            return (Criteria) this;
        }

        public Criteria andWorkOperatorNotEqualTo(String value) {
            addCriterion("work_operator <>", value, "workOperator");
            return (Criteria) this;
        }

        public Criteria andWorkOperatorGreaterThan(String value) {
            addCriterion("work_operator >", value, "workOperator");
            return (Criteria) this;
        }

        public Criteria andWorkOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("work_operator >=", value, "workOperator");
            return (Criteria) this;
        }

        public Criteria andWorkOperatorLessThan(String value) {
            addCriterion("work_operator <", value, "workOperator");
            return (Criteria) this;
        }

        public Criteria andWorkOperatorLessThanOrEqualTo(String value) {
            addCriterion("work_operator <=", value, "workOperator");
            return (Criteria) this;
        }

        public Criteria andWorkOperatorLike(String value) {
            addCriterion("work_operator like", value, "workOperator");
            return (Criteria) this;
        }

        public Criteria andWorkOperatorNotLike(String value) {
            addCriterion("work_operator not like", value, "workOperator");
            return (Criteria) this;
        }

        public Criteria andWorkOperatorIn(List<String> values) {
            addCriterion("work_operator in", values, "workOperator");
            return (Criteria) this;
        }

        public Criteria andWorkOperatorNotIn(List<String> values) {
            addCriterion("work_operator not in", values, "workOperator");
            return (Criteria) this;
        }

        public Criteria andWorkOperatorBetween(String value1, String value2) {
            addCriterion("work_operator between", value1, value2, "workOperator");
            return (Criteria) this;
        }

        public Criteria andWorkOperatorNotBetween(String value1, String value2) {
            addCriterion("work_operator not between", value1, value2, "workOperator");
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

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
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

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
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