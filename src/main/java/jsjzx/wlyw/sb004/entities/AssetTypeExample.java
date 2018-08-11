package jsjzx.wlyw.sb004.entities;

import java.util.ArrayList;
import java.util.List;

public class AssetTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetTypeExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andBrandcnIsNull() {
            addCriterion("brandcn is null");
            return (Criteria) this;
        }

        public Criteria andBrandcnIsNotNull() {
            addCriterion("brandcn is not null");
            return (Criteria) this;
        }

        public Criteria andBrandcnEqualTo(String value) {
            addCriterion("brandcn =", value, "brandcn");
            return (Criteria) this;
        }

        public Criteria andBrandcnNotEqualTo(String value) {
            addCriterion("brandcn <>", value, "brandcn");
            return (Criteria) this;
        }

        public Criteria andBrandcnGreaterThan(String value) {
            addCriterion("brandcn >", value, "brandcn");
            return (Criteria) this;
        }

        public Criteria andBrandcnGreaterThanOrEqualTo(String value) {
            addCriterion("brandcn >=", value, "brandcn");
            return (Criteria) this;
        }

        public Criteria andBrandcnLessThan(String value) {
            addCriterion("brandcn <", value, "brandcn");
            return (Criteria) this;
        }

        public Criteria andBrandcnLessThanOrEqualTo(String value) {
            addCriterion("brandcn <=", value, "brandcn");
            return (Criteria) this;
        }

        public Criteria andBrandcnLike(String value) {
            addCriterion("brandcn like", value, "brandcn");
            return (Criteria) this;
        }

        public Criteria andBrandcnNotLike(String value) {
            addCriterion("brandcn not like", value, "brandcn");
            return (Criteria) this;
        }

        public Criteria andBrandcnIn(List<String> values) {
            addCriterion("brandcn in", values, "brandcn");
            return (Criteria) this;
        }

        public Criteria andBrandcnNotIn(List<String> values) {
            addCriterion("brandcn not in", values, "brandcn");
            return (Criteria) this;
        }

        public Criteria andBrandcnBetween(String value1, String value2) {
            addCriterion("brandcn between", value1, value2, "brandcn");
            return (Criteria) this;
        }

        public Criteria andBrandcnNotBetween(String value1, String value2) {
            addCriterion("brandcn not between", value1, value2, "brandcn");
            return (Criteria) this;
        }

        public Criteria andBrandenIsNull() {
            addCriterion("branden is null");
            return (Criteria) this;
        }

        public Criteria andBrandenIsNotNull() {
            addCriterion("branden is not null");
            return (Criteria) this;
        }

        public Criteria andBrandenEqualTo(String value) {
            addCriterion("branden =", value, "branden");
            return (Criteria) this;
        }

        public Criteria andBrandenNotEqualTo(String value) {
            addCriterion("branden <>", value, "branden");
            return (Criteria) this;
        }

        public Criteria andBrandenGreaterThan(String value) {
            addCriterion("branden >", value, "branden");
            return (Criteria) this;
        }

        public Criteria andBrandenGreaterThanOrEqualTo(String value) {
            addCriterion("branden >=", value, "branden");
            return (Criteria) this;
        }

        public Criteria andBrandenLessThan(String value) {
            addCriterion("branden <", value, "branden");
            return (Criteria) this;
        }

        public Criteria andBrandenLessThanOrEqualTo(String value) {
            addCriterion("branden <=", value, "branden");
            return (Criteria) this;
        }

        public Criteria andBrandenLike(String value) {
            addCriterion("branden like", value, "branden");
            return (Criteria) this;
        }

        public Criteria andBrandenNotLike(String value) {
            addCriterion("branden not like", value, "branden");
            return (Criteria) this;
        }

        public Criteria andBrandenIn(List<String> values) {
            addCriterion("branden in", values, "branden");
            return (Criteria) this;
        }

        public Criteria andBrandenNotIn(List<String> values) {
            addCriterion("branden not in", values, "branden");
            return (Criteria) this;
        }

        public Criteria andBrandenBetween(String value1, String value2) {
            addCriterion("branden between", value1, value2, "branden");
            return (Criteria) this;
        }

        public Criteria andBrandenNotBetween(String value1, String value2) {
            addCriterion("branden not between", value1, value2, "branden");
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