package jsjzx.wlyw.sb004.entities;

import java.util.ArrayList;
import java.util.List;

public class AssetOwnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetOwnerExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyname is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyname is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyname =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyname <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyname >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyname >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyname <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyname <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyname like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyname not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyname in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyname not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyname between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyname not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameshortIsNull() {
            addCriterion("companynameshort is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameshortIsNotNull() {
            addCriterion("companynameshort is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameshortEqualTo(String value) {
            addCriterion("companynameshort =", value, "companynameshort");
            return (Criteria) this;
        }

        public Criteria andCompanynameshortNotEqualTo(String value) {
            addCriterion("companynameshort <>", value, "companynameshort");
            return (Criteria) this;
        }

        public Criteria andCompanynameshortGreaterThan(String value) {
            addCriterion("companynameshort >", value, "companynameshort");
            return (Criteria) this;
        }

        public Criteria andCompanynameshortGreaterThanOrEqualTo(String value) {
            addCriterion("companynameshort >=", value, "companynameshort");
            return (Criteria) this;
        }

        public Criteria andCompanynameshortLessThan(String value) {
            addCriterion("companynameshort <", value, "companynameshort");
            return (Criteria) this;
        }

        public Criteria andCompanynameshortLessThanOrEqualTo(String value) {
            addCriterion("companynameshort <=", value, "companynameshort");
            return (Criteria) this;
        }

        public Criteria andCompanynameshortLike(String value) {
            addCriterion("companynameshort like", value, "companynameshort");
            return (Criteria) this;
        }

        public Criteria andCompanynameshortNotLike(String value) {
            addCriterion("companynameshort not like", value, "companynameshort");
            return (Criteria) this;
        }

        public Criteria andCompanynameshortIn(List<String> values) {
            addCriterion("companynameshort in", values, "companynameshort");
            return (Criteria) this;
        }

        public Criteria andCompanynameshortNotIn(List<String> values) {
            addCriterion("companynameshort not in", values, "companynameshort");
            return (Criteria) this;
        }

        public Criteria andCompanynameshortBetween(String value1, String value2) {
            addCriterion("companynameshort between", value1, value2, "companynameshort");
            return (Criteria) this;
        }

        public Criteria andCompanynameshortNotBetween(String value1, String value2) {
            addCriterion("companynameshort not between", value1, value2, "companynameshort");
            return (Criteria) this;
        }

        public Criteria andDepartmentameIsNull() {
            addCriterion("departmentame is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentameIsNotNull() {
            addCriterion("departmentame is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentameEqualTo(String value) {
            addCriterion("departmentame =", value, "departmentame");
            return (Criteria) this;
        }

        public Criteria andDepartmentameNotEqualTo(String value) {
            addCriterion("departmentame <>", value, "departmentame");
            return (Criteria) this;
        }

        public Criteria andDepartmentameGreaterThan(String value) {
            addCriterion("departmentame >", value, "departmentame");
            return (Criteria) this;
        }

        public Criteria andDepartmentameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentame >=", value, "departmentame");
            return (Criteria) this;
        }

        public Criteria andDepartmentameLessThan(String value) {
            addCriterion("departmentame <", value, "departmentame");
            return (Criteria) this;
        }

        public Criteria andDepartmentameLessThanOrEqualTo(String value) {
            addCriterion("departmentame <=", value, "departmentame");
            return (Criteria) this;
        }

        public Criteria andDepartmentameLike(String value) {
            addCriterion("departmentame like", value, "departmentame");
            return (Criteria) this;
        }

        public Criteria andDepartmentameNotLike(String value) {
            addCriterion("departmentame not like", value, "departmentame");
            return (Criteria) this;
        }

        public Criteria andDepartmentameIn(List<String> values) {
            addCriterion("departmentame in", values, "departmentame");
            return (Criteria) this;
        }

        public Criteria andDepartmentameNotIn(List<String> values) {
            addCriterion("departmentame not in", values, "departmentame");
            return (Criteria) this;
        }

        public Criteria andDepartmentameBetween(String value1, String value2) {
            addCriterion("departmentame between", value1, value2, "departmentame");
            return (Criteria) this;
        }

        public Criteria andDepartmentameNotBetween(String value1, String value2) {
            addCriterion("departmentame not between", value1, value2, "departmentame");
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