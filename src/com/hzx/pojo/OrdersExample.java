package com.hzx.pojo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrdersidIsNull() {
            addCriterion("ordersId is null");
            return (Criteria) this;
        }

        public Criteria andOrdersidIsNotNull() {
            addCriterion("ordersId is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersidEqualTo(String value) {
            addCriterion("ordersId =", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotEqualTo(String value) {
            addCriterion("ordersId <>", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidGreaterThan(String value) {
            addCriterion("ordersId >", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidGreaterThanOrEqualTo(String value) {
            addCriterion("ordersId >=", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLessThan(String value) {
            addCriterion("ordersId <", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLessThanOrEqualTo(String value) {
            addCriterion("ordersId <=", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLike(String value) {
            addCriterion("ordersId like", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotLike(String value) {
            addCriterion("ordersId not like", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidIn(List<String> values) {
            addCriterion("ordersId in", values, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotIn(List<String> values) {
            addCriterion("ordersId not in", values, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidBetween(String value1, String value2) {
            addCriterion("ordersId between", value1, value2, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotBetween(String value1, String value2) {
            addCriterion("ordersId not between", value1, value2, "ordersid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andSendernameIsNull() {
            addCriterion("senderName is null");
            return (Criteria) this;
        }

        public Criteria andSendernameIsNotNull() {
            addCriterion("senderName is not null");
            return (Criteria) this;
        }

        public Criteria andSendernameEqualTo(String value) {
            addCriterion("senderName =", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameNotEqualTo(String value) {
            addCriterion("senderName <>", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameGreaterThan(String value) {
            addCriterion("senderName >", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameGreaterThanOrEqualTo(String value) {
            addCriterion("senderName >=", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameLessThan(String value) {
            addCriterion("senderName <", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameLessThanOrEqualTo(String value) {
            addCriterion("senderName <=", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameLike(String value) {
            addCriterion("senderName like", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameNotLike(String value) {
            addCriterion("senderName not like", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameIn(List<String> values) {
            addCriterion("senderName in", values, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameNotIn(List<String> values) {
            addCriterion("senderName not in", values, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameBetween(String value1, String value2) {
            addCriterion("senderName between", value1, value2, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameNotBetween(String value1, String value2) {
            addCriterion("senderName not between", value1, value2, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendermobielephoneIsNull() {
            addCriterion("senderMobielephone is null");
            return (Criteria) this;
        }

        public Criteria andSendermobielephoneIsNotNull() {
            addCriterion("senderMobielephone is not null");
            return (Criteria) this;
        }

        public Criteria andSendermobielephoneEqualTo(String value) {
            addCriterion("senderMobielephone =", value, "sendermobielephone");
            return (Criteria) this;
        }

        public Criteria andSendermobielephoneNotEqualTo(String value) {
            addCriterion("senderMobielephone <>", value, "sendermobielephone");
            return (Criteria) this;
        }

        public Criteria andSendermobielephoneGreaterThan(String value) {
            addCriterion("senderMobielephone >", value, "sendermobielephone");
            return (Criteria) this;
        }

        public Criteria andSendermobielephoneGreaterThanOrEqualTo(String value) {
            addCriterion("senderMobielephone >=", value, "sendermobielephone");
            return (Criteria) this;
        }

        public Criteria andSendermobielephoneLessThan(String value) {
            addCriterion("senderMobielephone <", value, "sendermobielephone");
            return (Criteria) this;
        }

        public Criteria andSendermobielephoneLessThanOrEqualTo(String value) {
            addCriterion("senderMobielephone <=", value, "sendermobielephone");
            return (Criteria) this;
        }

        public Criteria andSendermobielephoneLike(String value) {
            addCriterion("senderMobielephone like", value, "sendermobielephone");
            return (Criteria) this;
        }

        public Criteria andSendermobielephoneNotLike(String value) {
            addCriterion("senderMobielephone not like", value, "sendermobielephone");
            return (Criteria) this;
        }

        public Criteria andSendermobielephoneIn(List<String> values) {
            addCriterion("senderMobielephone in", values, "sendermobielephone");
            return (Criteria) this;
        }

        public Criteria andSendermobielephoneNotIn(List<String> values) {
            addCriterion("senderMobielephone not in", values, "sendermobielephone");
            return (Criteria) this;
        }

        public Criteria andSendermobielephoneBetween(String value1, String value2) {
            addCriterion("senderMobielephone between", value1, value2, "sendermobielephone");
            return (Criteria) this;
        }

        public Criteria andSendermobielephoneNotBetween(String value1, String value2) {
            addCriterion("senderMobielephone not between", value1, value2, "sendermobielephone");
            return (Criteria) this;
        }

        public Criteria andSendertelephoneIsNull() {
            addCriterion("senderTelephone is null");
            return (Criteria) this;
        }

        public Criteria andSendertelephoneIsNotNull() {
            addCriterion("senderTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andSendertelephoneEqualTo(String value) {
            addCriterion("senderTelephone =", value, "sendertelephone");
            return (Criteria) this;
        }

        public Criteria andSendertelephoneNotEqualTo(String value) {
            addCriterion("senderTelephone <>", value, "sendertelephone");
            return (Criteria) this;
        }

        public Criteria andSendertelephoneGreaterThan(String value) {
            addCriterion("senderTelephone >", value, "sendertelephone");
            return (Criteria) this;
        }

        public Criteria andSendertelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("senderTelephone >=", value, "sendertelephone");
            return (Criteria) this;
        }

        public Criteria andSendertelephoneLessThan(String value) {
            addCriterion("senderTelephone <", value, "sendertelephone");
            return (Criteria) this;
        }

        public Criteria andSendertelephoneLessThanOrEqualTo(String value) {
            addCriterion("senderTelephone <=", value, "sendertelephone");
            return (Criteria) this;
        }

        public Criteria andSendertelephoneLike(String value) {
            addCriterion("senderTelephone like", value, "sendertelephone");
            return (Criteria) this;
        }

        public Criteria andSendertelephoneNotLike(String value) {
            addCriterion("senderTelephone not like", value, "sendertelephone");
            return (Criteria) this;
        }

        public Criteria andSendertelephoneIn(List<String> values) {
            addCriterion("senderTelephone in", values, "sendertelephone");
            return (Criteria) this;
        }

        public Criteria andSendertelephoneNotIn(List<String> values) {
            addCriterion("senderTelephone not in", values, "sendertelephone");
            return (Criteria) this;
        }

        public Criteria andSendertelephoneBetween(String value1, String value2) {
            addCriterion("senderTelephone between", value1, value2, "sendertelephone");
            return (Criteria) this;
        }

        public Criteria andSendertelephoneNotBetween(String value1, String value2) {
            addCriterion("senderTelephone not between", value1, value2, "sendertelephone");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNull() {
            addCriterion("receiverName is null");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNotNull() {
            addCriterion("receiverName is not null");
            return (Criteria) this;
        }

        public Criteria andReceivernameEqualTo(String value) {
            addCriterion("receiverName =", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotEqualTo(String value) {
            addCriterion("receiverName <>", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThan(String value) {
            addCriterion("receiverName >", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThanOrEqualTo(String value) {
            addCriterion("receiverName >=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThan(String value) {
            addCriterion("receiverName <", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThanOrEqualTo(String value) {
            addCriterion("receiverName <=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLike(String value) {
            addCriterion("receiverName like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotLike(String value) {
            addCriterion("receiverName not like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameIn(List<String> values) {
            addCriterion("receiverName in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotIn(List<String> values) {
            addCriterion("receiverName not in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameBetween(String value1, String value2) {
            addCriterion("receiverName between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotBetween(String value1, String value2) {
            addCriterion("receiverName not between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivermobilephoneIsNull() {
            addCriterion("receiverMobilephone is null");
            return (Criteria) this;
        }

        public Criteria andReceivermobilephoneIsNotNull() {
            addCriterion("receiverMobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivermobilephoneEqualTo(String value) {
            addCriterion("receiverMobilephone =", value, "receivermobilephone");
            return (Criteria) this;
        }

        public Criteria andReceivermobilephoneNotEqualTo(String value) {
            addCriterion("receiverMobilephone <>", value, "receivermobilephone");
            return (Criteria) this;
        }

        public Criteria andReceivermobilephoneGreaterThan(String value) {
            addCriterion("receiverMobilephone >", value, "receivermobilephone");
            return (Criteria) this;
        }

        public Criteria andReceivermobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiverMobilephone >=", value, "receivermobilephone");
            return (Criteria) this;
        }

        public Criteria andReceivermobilephoneLessThan(String value) {
            addCriterion("receiverMobilephone <", value, "receivermobilephone");
            return (Criteria) this;
        }

        public Criteria andReceivermobilephoneLessThanOrEqualTo(String value) {
            addCriterion("receiverMobilephone <=", value, "receivermobilephone");
            return (Criteria) this;
        }

        public Criteria andReceivermobilephoneLike(String value) {
            addCriterion("receiverMobilephone like", value, "receivermobilephone");
            return (Criteria) this;
        }

        public Criteria andReceivermobilephoneNotLike(String value) {
            addCriterion("receiverMobilephone not like", value, "receivermobilephone");
            return (Criteria) this;
        }

        public Criteria andReceivermobilephoneIn(List<String> values) {
            addCriterion("receiverMobilephone in", values, "receivermobilephone");
            return (Criteria) this;
        }

        public Criteria andReceivermobilephoneNotIn(List<String> values) {
            addCriterion("receiverMobilephone not in", values, "receivermobilephone");
            return (Criteria) this;
        }

        public Criteria andReceivermobilephoneBetween(String value1, String value2) {
            addCriterion("receiverMobilephone between", value1, value2, "receivermobilephone");
            return (Criteria) this;
        }

        public Criteria andReceivermobilephoneNotBetween(String value1, String value2) {
            addCriterion("receiverMobilephone not between", value1, value2, "receivermobilephone");
            return (Criteria) this;
        }

        public Criteria andReceivertelephoneIsNull() {
            addCriterion("receiverTelephone is null");
            return (Criteria) this;
        }

        public Criteria andReceivertelephoneIsNotNull() {
            addCriterion("receiverTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivertelephoneEqualTo(String value) {
            addCriterion("receiverTelephone =", value, "receivertelephone");
            return (Criteria) this;
        }

        public Criteria andReceivertelephoneNotEqualTo(String value) {
            addCriterion("receiverTelephone <>", value, "receivertelephone");
            return (Criteria) this;
        }

        public Criteria andReceivertelephoneGreaterThan(String value) {
            addCriterion("receiverTelephone >", value, "receivertelephone");
            return (Criteria) this;
        }

        public Criteria andReceivertelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiverTelephone >=", value, "receivertelephone");
            return (Criteria) this;
        }

        public Criteria andReceivertelephoneLessThan(String value) {
            addCriterion("receiverTelephone <", value, "receivertelephone");
            return (Criteria) this;
        }

        public Criteria andReceivertelephoneLessThanOrEqualTo(String value) {
            addCriterion("receiverTelephone <=", value, "receivertelephone");
            return (Criteria) this;
        }

        public Criteria andReceivertelephoneLike(String value) {
            addCriterion("receiverTelephone like", value, "receivertelephone");
            return (Criteria) this;
        }

        public Criteria andReceivertelephoneNotLike(String value) {
            addCriterion("receiverTelephone not like", value, "receivertelephone");
            return (Criteria) this;
        }

        public Criteria andReceivertelephoneIn(List<String> values) {
            addCriterion("receiverTelephone in", values, "receivertelephone");
            return (Criteria) this;
        }

        public Criteria andReceivertelephoneNotIn(List<String> values) {
            addCriterion("receiverTelephone not in", values, "receivertelephone");
            return (Criteria) this;
        }

        public Criteria andReceivertelephoneBetween(String value1, String value2) {
            addCriterion("receiverTelephone between", value1, value2, "receivertelephone");
            return (Criteria) this;
        }

        public Criteria andReceivertelephoneNotBetween(String value1, String value2) {
            addCriterion("receiverTelephone not between", value1, value2, "receivertelephone");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andPostalfreeIsNull() {
            addCriterion("postalFree is null");
            return (Criteria) this;
        }

        public Criteria andPostalfreeIsNotNull() {
            addCriterion("postalFree is not null");
            return (Criteria) this;
        }

        public Criteria andPostalfreeEqualTo(Long value) {
            addCriterion("postalFree =", value, "postalfree");
            return (Criteria) this;
        }

        public Criteria andPostalfreeNotEqualTo(Long value) {
            addCriterion("postalFree <>", value, "postalfree");
            return (Criteria) this;
        }

        public Criteria andPostalfreeGreaterThan(Long value) {
            addCriterion("postalFree >", value, "postalfree");
            return (Criteria) this;
        }

        public Criteria andPostalfreeGreaterThanOrEqualTo(Long value) {
            addCriterion("postalFree >=", value, "postalfree");
            return (Criteria) this;
        }

        public Criteria andPostalfreeLessThan(Long value) {
            addCriterion("postalFree <", value, "postalfree");
            return (Criteria) this;
        }

        public Criteria andPostalfreeLessThanOrEqualTo(Long value) {
            addCriterion("postalFree <=", value, "postalfree");
            return (Criteria) this;
        }

        public Criteria andPostalfreeIn(List<Long> values) {
            addCriterion("postalFree in", values, "postalfree");
            return (Criteria) this;
        }

        public Criteria andPostalfreeNotIn(List<Long> values) {
            addCriterion("postalFree not in", values, "postalfree");
            return (Criteria) this;
        }

        public Criteria andPostalfreeBetween(Long value1, Long value2) {
            addCriterion("postalFree between", value1, value2, "postalfree");
            return (Criteria) this;
        }

        public Criteria andPostalfreeNotBetween(Long value1, Long value2) {
            addCriterion("postalFree not between", value1, value2, "postalfree");
            return (Criteria) this;
        }

        public Criteria andGoodsizeIsNull() {
            addCriterion("goodSize is null");
            return (Criteria) this;
        }

        public Criteria andGoodsizeIsNotNull() {
            addCriterion("goodSize is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsizeEqualTo(Long value) {
            addCriterion("goodSize =", value, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeNotEqualTo(Long value) {
            addCriterion("goodSize <>", value, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeGreaterThan(Long value) {
            addCriterion("goodSize >", value, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeGreaterThanOrEqualTo(Long value) {
            addCriterion("goodSize >=", value, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeLessThan(Long value) {
            addCriterion("goodSize <", value, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeLessThanOrEqualTo(Long value) {
            addCriterion("goodSize <=", value, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeIn(List<Long> values) {
            addCriterion("goodSize in", values, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeNotIn(List<Long> values) {
            addCriterion("goodSize not in", values, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeBetween(Long value1, Long value2) {
            addCriterion("goodSize between", value1, value2, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodsizeNotBetween(Long value1, Long value2) {
            addCriterion("goodSize not between", value1, value2, "goodsize");
            return (Criteria) this;
        }

        public Criteria andGoodweightIsNull() {
            addCriterion("goodWeight is null");
            return (Criteria) this;
        }

        public Criteria andGoodweightIsNotNull() {
            addCriterion("goodWeight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodweightEqualTo(Long value) {
            addCriterion("goodWeight =", value, "goodweight");
            return (Criteria) this;
        }

        public Criteria andGoodweightNotEqualTo(Long value) {
            addCriterion("goodWeight <>", value, "goodweight");
            return (Criteria) this;
        }

        public Criteria andGoodweightGreaterThan(Long value) {
            addCriterion("goodWeight >", value, "goodweight");
            return (Criteria) this;
        }

        public Criteria andGoodweightGreaterThanOrEqualTo(Long value) {
            addCriterion("goodWeight >=", value, "goodweight");
            return (Criteria) this;
        }

        public Criteria andGoodweightLessThan(Long value) {
            addCriterion("goodWeight <", value, "goodweight");
            return (Criteria) this;
        }

        public Criteria andGoodweightLessThanOrEqualTo(Long value) {
            addCriterion("goodWeight <=", value, "goodweight");
            return (Criteria) this;
        }

        public Criteria andGoodweightIn(List<Long> values) {
            addCriterion("goodWeight in", values, "goodweight");
            return (Criteria) this;
        }

        public Criteria andGoodweightNotIn(List<Long> values) {
            addCriterion("goodWeight not in", values, "goodweight");
            return (Criteria) this;
        }

        public Criteria andGoodweightBetween(Long value1, Long value2) {
            addCriterion("goodWeight between", value1, value2, "goodweight");
            return (Criteria) this;
        }

        public Criteria andGoodweightNotBetween(Long value1, Long value2) {
            addCriterion("goodWeight not between", value1, value2, "goodweight");
            return (Criteria) this;
        }

        public Criteria andRequestdateIsNull() {
            addCriterion("requestDate is null");
            return (Criteria) this;
        }

        public Criteria andRequestdateIsNotNull() {
            addCriterion("requestDate is not null");
            return (Criteria) this;
        }

        public Criteria andRequestdateEqualTo(java.sql.Date value) {
            addCriterion("requestDate =", value, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateNotEqualTo(Date value) {
            addCriterion("requestDate <>", value, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateGreaterThan(java.sql.Date value) {
            addCriterion("requestDate >", value, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateGreaterThanOrEqualTo(java.sql.Date value) {
            addCriterion("requestDate >=", value, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateLessThan(java.sql.Date value) {
            addCriterion("requestDate <", value, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateLessThanOrEqualTo(java.sql.Date value) {
            addCriterion("requestDate <=", value, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateIn(List<java.sql.Date> values) {
            addCriterion("requestDate in", values, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateNotIn(List<java.sql.Date> values) {
            addCriterion("requestDate not in", values, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("requestDate between", value1, value2, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateNotBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("requestDate not between", value1, value2, "requestdate");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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