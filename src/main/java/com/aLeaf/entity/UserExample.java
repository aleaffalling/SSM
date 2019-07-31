package com.aLeaf.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andu_idIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andu_idIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andu_idEqualTo(Integer value) {
            addCriterion("u_id =", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idGreaterThan(Integer value) {
            addCriterion("u_id >", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idLessThan(Integer value) {
            addCriterion("u_id <", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idIn(List<Integer> values) {
            addCriterion("u_id in", values, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_idNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "u_id");
            return (Criteria) this;
        }

        public Criteria andu_nameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andu_nameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andu_nameEqualTo(String value) {
            addCriterion("u_name =", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andu_nameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andu_nameGreaterThan(String value) {
            addCriterion("u_name >", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andu_nameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andu_nameLessThan(String value) {
            addCriterion("u_name <", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andu_nameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andu_nameLike(String value) {
            addCriterion("u_name like", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andu_nameNotLike(String value) {
            addCriterion("u_name not like", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andu_nameIn(List<String> values) {
            addCriterion("u_name in", values, "u_name");
            return (Criteria) this;
        }

        public Criteria andu_nameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "u_name");
            return (Criteria) this;
        }

        public Criteria andu_nameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "u_name");
            return (Criteria) this;
        }

        public Criteria andu_nameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "u_name");
            return (Criteria) this;
        }

        public Criteria andu_sexIsNull() {
            addCriterion("u_sex is null");
            return (Criteria) this;
        }

        public Criteria andu_sexIsNotNull() {
            addCriterion("u_sex is not null");
            return (Criteria) this;
        }

        public Criteria andu_sexEqualTo(Integer value) {
            addCriterion("u_sex =", value, "u_sex");
            return (Criteria) this;
        }

        public Criteria andu_sexNotEqualTo(Integer value) {
            addCriterion("u_sex <>", value, "u_sex");
            return (Criteria) this;
        }

        public Criteria andu_sexGreaterThan(Integer value) {
            addCriterion("u_sex >", value, "u_sex");
            return (Criteria) this;
        }

        public Criteria andu_sexGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_sex >=", value, "u_sex");
            return (Criteria) this;
        }

        public Criteria andu_sexLessThan(Integer value) {
            addCriterion("u_sex <", value, "u_sex");
            return (Criteria) this;
        }

        public Criteria andu_sexLessThanOrEqualTo(Integer value) {
            addCriterion("u_sex <=", value, "u_sex");
            return (Criteria) this;
        }

        public Criteria andu_sexIn(List<Integer> values) {
            addCriterion("u_sex in", values, "u_sex");
            return (Criteria) this;
        }

        public Criteria andu_sexNotIn(List<Integer> values) {
            addCriterion("u_sex not in", values, "u_sex");
            return (Criteria) this;
        }

        public Criteria andu_sexBetween(Integer value1, Integer value2) {
            addCriterion("u_sex between", value1, value2, "u_sex");
            return (Criteria) this;
        }

        public Criteria andu_sexNotBetween(Integer value1, Integer value2) {
            addCriterion("u_sex not between", value1, value2, "u_sex");
            return (Criteria) this;
        }

        public Criteria andu_passwordIsNull() {
            addCriterion("u_password is null");
            return (Criteria) this;
        }

        public Criteria andu_passwordIsNotNull() {
            addCriterion("u_password is not null");
            return (Criteria) this;
        }

        public Criteria andu_passwordEqualTo(String value) {
            addCriterion("u_password =", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andu_passwordNotEqualTo(String value) {
            addCriterion("u_password <>", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andu_passwordGreaterThan(String value) {
            addCriterion("u_password >", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andu_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("u_password >=", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andu_passwordLessThan(String value) {
            addCriterion("u_password <", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andu_passwordLessThanOrEqualTo(String value) {
            addCriterion("u_password <=", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andu_passwordLike(String value) {
            addCriterion("u_password like", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andu_passwordNotLike(String value) {
            addCriterion("u_password not like", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andu_passwordIn(List<String> values) {
            addCriterion("u_password in", values, "u_password");
            return (Criteria) this;
        }

        public Criteria andu_passwordNotIn(List<String> values) {
            addCriterion("u_password not in", values, "u_password");
            return (Criteria) this;
        }

        public Criteria andu_passwordBetween(String value1, String value2) {
            addCriterion("u_password between", value1, value2, "u_password");
            return (Criteria) this;
        }

        public Criteria andu_passwordNotBetween(String value1, String value2) {
            addCriterion("u_password not between", value1, value2, "u_password");
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