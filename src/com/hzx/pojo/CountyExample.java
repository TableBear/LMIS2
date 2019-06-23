package com.hzx.pojo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CountyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CountyExample() {
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

        public Criteria andCountyidIsNull() {
            addCriterion("countyId is null");
            return (Criteria) this;
        }

        public Criteria andCountyidIsNotNull() {
            addCriterion("countyId is not null");
            return (Criteria) this;
        }

        public Criteria andCountyidEqualTo(Integer value) {
            addCriterion("countyId =", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotEqualTo(Integer value) {
            addCriterion("countyId <>", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidGreaterThan(Integer value) {
            addCriterion("countyId >", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("countyId >=", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLessThan(Integer value) {
            addCriterion("countyId <", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLessThanOrEqualTo(Integer value) {
            addCriterion("countyId <=", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidIn(List<Integer> values) {
            addCriterion("countyId in", values, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotIn(List<Integer> values) {
            addCriterion("countyId not in", values, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidBetween(Integer value1, Integer value2) {
            addCriterion("countyId between", value1, value2, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotBetween(Integer value1, Integer value2) {
            addCriterion("countyId not between", value1, value2, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountycodeIsNull() {
            addCriterion("countyCode is null");
            return (Criteria) this;
        }

        public Criteria andCountycodeIsNotNull() {
            addCriterion("countyCode is not null");
            return (Criteria) this;
        }

        public Criteria andCountycodeEqualTo(String value) {
            addCriterion("countyCode =", value, "countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeNotEqualTo(String value) {
            addCriterion("countyCode <>", value, "countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeGreaterThan(String value) {
            addCriterion("countyCode >", value, "countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeGreaterThanOrEqualTo(String value) {
            addCriterion("countyCode >=", value, "countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeLessThan(String value) {
            addCriterion("countyCode <", value, "countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeLessThanOrEqualTo(String value) {
            addCriterion("countyCode <=", value, "countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeLike(String value) {
            addCriterion("countyCode like", value, "countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeNotLike(String value) {
            addCriterion("countyCode not like", value, "countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeIn(List<String> values) {
            addCriterion("countyCode in", values, "countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeNotIn(List<String> values) {
            addCriterion("countyCode not in", values, "countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeBetween(String value1, String value2) {
            addCriterion("countyCode between", value1, value2, "countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeNotBetween(String value1, String value2) {
            addCriterion("countyCode not between", value1, value2, "countycode");
            return (Criteria) this;
        }

        public Criteria andCountynameIsNull() {
            addCriterion("countyName is null");
            return (Criteria) this;
        }

        public Criteria andCountynameIsNotNull() {
            addCriterion("countyName is not null");
            return (Criteria) this;
        }

        public Criteria andCountynameEqualTo(String value) {
            addCriterion("countyName =", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotEqualTo(String value) {
            addCriterion("countyName <>", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameGreaterThan(String value) {
            addCriterion("countyName >", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameGreaterThanOrEqualTo(String value) {
            addCriterion("countyName >=", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameLessThan(String value) {
            addCriterion("countyName <", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameLessThanOrEqualTo(String value) {
            addCriterion("countyName <=", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameLike(String value) {
            addCriterion("countyName like", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotLike(String value) {
            addCriterion("countyName not like", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameIn(List<String> values) {
            addCriterion("countyName in", values, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotIn(List<String> values) {
            addCriterion("countyName not in", values, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameBetween(String value1, String value2) {
            addCriterion("countyName between", value1, value2, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotBetween(String value1, String value2) {
            addCriterion("countyName not between", value1, value2, "countyname");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("cityCode is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("cityCode is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("cityCode =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("cityCode <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("cityCode >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("cityCode >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("cityCode <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("cityCode <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("cityCode like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("cityCode not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("cityCode in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("cityCode not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("cityCode between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("cityCode not between", value1, value2, "citycode");
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