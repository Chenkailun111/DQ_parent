package com.itqf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DqActivitiesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DqActivitiesExample() {
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

        public Criteria andEntityIdIsNull() {
            addCriterion("entity_id is null");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNotNull() {
            addCriterion("entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntityIdEqualTo(Integer value) {
            addCriterion("entity_id =", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotEqualTo(Integer value) {
            addCriterion("entity_id <>", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThan(Integer value) {
            addCriterion("entity_id >", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("entity_id >=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThan(Integer value) {
            addCriterion("entity_id <", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThanOrEqualTo(Integer value) {
            addCriterion("entity_id <=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdIn(List<Integer> values) {
            addCriterion("entity_id in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotIn(List<Integer> values) {
            addCriterion("entity_id not in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdBetween(Integer value1, Integer value2) {
            addCriterion("entity_id between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("entity_id not between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andOrganigerIdIsNull() {
            addCriterion("organiger_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganigerIdIsNotNull() {
            addCriterion("organiger_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganigerIdEqualTo(Integer value) {
            addCriterion("organiger_id =", value, "organigerId");
            return (Criteria) this;
        }

        public Criteria andOrganigerIdNotEqualTo(Integer value) {
            addCriterion("organiger_id <>", value, "organigerId");
            return (Criteria) this;
        }

        public Criteria andOrganigerIdGreaterThan(Integer value) {
            addCriterion("organiger_id >", value, "organigerId");
            return (Criteria) this;
        }

        public Criteria andOrganigerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("organiger_id >=", value, "organigerId");
            return (Criteria) this;
        }

        public Criteria andOrganigerIdLessThan(Integer value) {
            addCriterion("organiger_id <", value, "organigerId");
            return (Criteria) this;
        }

        public Criteria andOrganigerIdLessThanOrEqualTo(Integer value) {
            addCriterion("organiger_id <=", value, "organigerId");
            return (Criteria) this;
        }

        public Criteria andOrganigerIdIn(List<Integer> values) {
            addCriterion("organiger_id in", values, "organigerId");
            return (Criteria) this;
        }

        public Criteria andOrganigerIdNotIn(List<Integer> values) {
            addCriterion("organiger_id not in", values, "organigerId");
            return (Criteria) this;
        }

        public Criteria andOrganigerIdBetween(Integer value1, Integer value2) {
            addCriterion("organiger_id between", value1, value2, "organigerId");
            return (Criteria) this;
        }

        public Criteria andOrganigerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("organiger_id not between", value1, value2, "organigerId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStartAtIsNull() {
            addCriterion("start_at is null");
            return (Criteria) this;
        }

        public Criteria andStartAtIsNotNull() {
            addCriterion("start_at is not null");
            return (Criteria) this;
        }

        public Criteria andStartAtEqualTo(Date value) {
            addCriterion("start_at =", value, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtNotEqualTo(Date value) {
            addCriterion("start_at <>", value, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtGreaterThan(Date value) {
            addCriterion("start_at >", value, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtGreaterThanOrEqualTo(Date value) {
            addCriterion("start_at >=", value, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtLessThan(Date value) {
            addCriterion("start_at <", value, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtLessThanOrEqualTo(Date value) {
            addCriterion("start_at <=", value, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtIn(List<Date> values) {
            addCriterion("start_at in", values, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtNotIn(List<Date> values) {
            addCriterion("start_at not in", values, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtBetween(Date value1, Date value2) {
            addCriterion("start_at between", value1, value2, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtNotBetween(Date value1, Date value2) {
            addCriterion("start_at not between", value1, value2, "startAt");
            return (Criteria) this;
        }

        public Criteria andFinishAtIsNull() {
            addCriterion("finish_at is null");
            return (Criteria) this;
        }

        public Criteria andFinishAtIsNotNull() {
            addCriterion("finish_at is not null");
            return (Criteria) this;
        }

        public Criteria andFinishAtEqualTo(Date value) {
            addCriterion("finish_at =", value, "finishAt");
            return (Criteria) this;
        }

        public Criteria andFinishAtNotEqualTo(Date value) {
            addCriterion("finish_at <>", value, "finishAt");
            return (Criteria) this;
        }

        public Criteria andFinishAtGreaterThan(Date value) {
            addCriterion("finish_at >", value, "finishAt");
            return (Criteria) this;
        }

        public Criteria andFinishAtGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_at >=", value, "finishAt");
            return (Criteria) this;
        }

        public Criteria andFinishAtLessThan(Date value) {
            addCriterion("finish_at <", value, "finishAt");
            return (Criteria) this;
        }

        public Criteria andFinishAtLessThanOrEqualTo(Date value) {
            addCriterion("finish_at <=", value, "finishAt");
            return (Criteria) this;
        }

        public Criteria andFinishAtIn(List<Date> values) {
            addCriterion("finish_at in", values, "finishAt");
            return (Criteria) this;
        }

        public Criteria andFinishAtNotIn(List<Date> values) {
            addCriterion("finish_at not in", values, "finishAt");
            return (Criteria) this;
        }

        public Criteria andFinishAtBetween(Date value1, Date value2) {
            addCriterion("finish_at between", value1, value2, "finishAt");
            return (Criteria) this;
        }

        public Criteria andFinishAtNotBetween(Date value1, Date value2) {
            addCriterion("finish_at not between", value1, value2, "finishAt");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andGatherAtIsNull() {
            addCriterion("gather_at is null");
            return (Criteria) this;
        }

        public Criteria andGatherAtIsNotNull() {
            addCriterion("gather_at is not null");
            return (Criteria) this;
        }

        public Criteria andGatherAtEqualTo(String value) {
            addCriterion("gather_at =", value, "gatherAt");
            return (Criteria) this;
        }

        public Criteria andGatherAtNotEqualTo(String value) {
            addCriterion("gather_at <>", value, "gatherAt");
            return (Criteria) this;
        }

        public Criteria andGatherAtGreaterThan(String value) {
            addCriterion("gather_at >", value, "gatherAt");
            return (Criteria) this;
        }

        public Criteria andGatherAtGreaterThanOrEqualTo(String value) {
            addCriterion("gather_at >=", value, "gatherAt");
            return (Criteria) this;
        }

        public Criteria andGatherAtLessThan(String value) {
            addCriterion("gather_at <", value, "gatherAt");
            return (Criteria) this;
        }

        public Criteria andGatherAtLessThanOrEqualTo(String value) {
            addCriterion("gather_at <=", value, "gatherAt");
            return (Criteria) this;
        }

        public Criteria andGatherAtLike(String value) {
            addCriterion("gather_at like", value, "gatherAt");
            return (Criteria) this;
        }

        public Criteria andGatherAtNotLike(String value) {
            addCriterion("gather_at not like", value, "gatherAt");
            return (Criteria) this;
        }

        public Criteria andGatherAtIn(List<String> values) {
            addCriterion("gather_at in", values, "gatherAt");
            return (Criteria) this;
        }

        public Criteria andGatherAtNotIn(List<String> values) {
            addCriterion("gather_at not in", values, "gatherAt");
            return (Criteria) this;
        }

        public Criteria andGatherAtBetween(String value1, String value2) {
            addCriterion("gather_at between", value1, value2, "gatherAt");
            return (Criteria) this;
        }

        public Criteria andGatherAtNotBetween(String value1, String value2) {
            addCriterion("gather_at not between", value1, value2, "gatherAt");
            return (Criteria) this;
        }

        public Criteria andPublicLevelIsNull() {
            addCriterion("public_level is null");
            return (Criteria) this;
        }

        public Criteria andPublicLevelIsNotNull() {
            addCriterion("public_level is not null");
            return (Criteria) this;
        }

        public Criteria andPublicLevelEqualTo(String value) {
            addCriterion("public_level =", value, "publicLevel");
            return (Criteria) this;
        }

        public Criteria andPublicLevelNotEqualTo(String value) {
            addCriterion("public_level <>", value, "publicLevel");
            return (Criteria) this;
        }

        public Criteria andPublicLevelGreaterThan(String value) {
            addCriterion("public_level >", value, "publicLevel");
            return (Criteria) this;
        }

        public Criteria andPublicLevelGreaterThanOrEqualTo(String value) {
            addCriterion("public_level >=", value, "publicLevel");
            return (Criteria) this;
        }

        public Criteria andPublicLevelLessThan(String value) {
            addCriterion("public_level <", value, "publicLevel");
            return (Criteria) this;
        }

        public Criteria andPublicLevelLessThanOrEqualTo(String value) {
            addCriterion("public_level <=", value, "publicLevel");
            return (Criteria) this;
        }

        public Criteria andPublicLevelLike(String value) {
            addCriterion("public_level like", value, "publicLevel");
            return (Criteria) this;
        }

        public Criteria andPublicLevelNotLike(String value) {
            addCriterion("public_level not like", value, "publicLevel");
            return (Criteria) this;
        }

        public Criteria andPublicLevelIn(List<String> values) {
            addCriterion("public_level in", values, "publicLevel");
            return (Criteria) this;
        }

        public Criteria andPublicLevelNotIn(List<String> values) {
            addCriterion("public_level not in", values, "publicLevel");
            return (Criteria) this;
        }

        public Criteria andPublicLevelBetween(String value1, String value2) {
            addCriterion("public_level between", value1, value2, "publicLevel");
            return (Criteria) this;
        }

        public Criteria andPublicLevelNotBetween(String value1, String value2) {
            addCriterion("public_level not between", value1, value2, "publicLevel");
            return (Criteria) this;
        }

        public Criteria andIsLimitIsNull() {
            addCriterion("is_limit is null");
            return (Criteria) this;
        }

        public Criteria andIsLimitIsNotNull() {
            addCriterion("is_limit is not null");
            return (Criteria) this;
        }

        public Criteria andIsLimitEqualTo(Byte value) {
            addCriterion("is_limit =", value, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitNotEqualTo(Byte value) {
            addCriterion("is_limit <>", value, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitGreaterThan(Byte value) {
            addCriterion("is_limit >", value, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_limit >=", value, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitLessThan(Byte value) {
            addCriterion("is_limit <", value, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitLessThanOrEqualTo(Byte value) {
            addCriterion("is_limit <=", value, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitIn(List<Byte> values) {
            addCriterion("is_limit in", values, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitNotIn(List<Byte> values) {
            addCriterion("is_limit not in", values, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitBetween(Byte value1, Byte value2) {
            addCriterion("is_limit between", value1, value2, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitNotBetween(Byte value1, Byte value2) {
            addCriterion("is_limit not between", value1, value2, "isLimit");
            return (Criteria) this;
        }

        public Criteria andMaxParticipantIsNull() {
            addCriterion("max_participant is null");
            return (Criteria) this;
        }

        public Criteria andMaxParticipantIsNotNull() {
            addCriterion("max_participant is not null");
            return (Criteria) this;
        }

        public Criteria andMaxParticipantEqualTo(Integer value) {
            addCriterion("max_participant =", value, "maxParticipant");
            return (Criteria) this;
        }

        public Criteria andMaxParticipantNotEqualTo(Integer value) {
            addCriterion("max_participant <>", value, "maxParticipant");
            return (Criteria) this;
        }

        public Criteria andMaxParticipantGreaterThan(Integer value) {
            addCriterion("max_participant >", value, "maxParticipant");
            return (Criteria) this;
        }

        public Criteria andMaxParticipantGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_participant >=", value, "maxParticipant");
            return (Criteria) this;
        }

        public Criteria andMaxParticipantLessThan(Integer value) {
            addCriterion("max_participant <", value, "maxParticipant");
            return (Criteria) this;
        }

        public Criteria andMaxParticipantLessThanOrEqualTo(Integer value) {
            addCriterion("max_participant <=", value, "maxParticipant");
            return (Criteria) this;
        }

        public Criteria andMaxParticipantIn(List<Integer> values) {
            addCriterion("max_participant in", values, "maxParticipant");
            return (Criteria) this;
        }

        public Criteria andMaxParticipantNotIn(List<Integer> values) {
            addCriterion("max_participant not in", values, "maxParticipant");
            return (Criteria) this;
        }

        public Criteria andMaxParticipantBetween(Integer value1, Integer value2) {
            addCriterion("max_participant between", value1, value2, "maxParticipant");
            return (Criteria) this;
        }

        public Criteria andMaxParticipantNotBetween(Integer value1, Integer value2) {
            addCriterion("max_participant not between", value1, value2, "maxParticipant");
            return (Criteria) this;
        }

        public Criteria andMinParticipantIsNull() {
            addCriterion("min_participant is null");
            return (Criteria) this;
        }

        public Criteria andMinParticipantIsNotNull() {
            addCriterion("min_participant is not null");
            return (Criteria) this;
        }

        public Criteria andMinParticipantEqualTo(Integer value) {
            addCriterion("min_participant =", value, "minParticipant");
            return (Criteria) this;
        }

        public Criteria andMinParticipantNotEqualTo(Integer value) {
            addCriterion("min_participant <>", value, "minParticipant");
            return (Criteria) this;
        }

        public Criteria andMinParticipantGreaterThan(Integer value) {
            addCriterion("min_participant >", value, "minParticipant");
            return (Criteria) this;
        }

        public Criteria andMinParticipantGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_participant >=", value, "minParticipant");
            return (Criteria) this;
        }

        public Criteria andMinParticipantLessThan(Integer value) {
            addCriterion("min_participant <", value, "minParticipant");
            return (Criteria) this;
        }

        public Criteria andMinParticipantLessThanOrEqualTo(Integer value) {
            addCriterion("min_participant <=", value, "minParticipant");
            return (Criteria) this;
        }

        public Criteria andMinParticipantIn(List<Integer> values) {
            addCriterion("min_participant in", values, "minParticipant");
            return (Criteria) this;
        }

        public Criteria andMinParticipantNotIn(List<Integer> values) {
            addCriterion("min_participant not in", values, "minParticipant");
            return (Criteria) this;
        }

        public Criteria andMinParticipantBetween(Integer value1, Integer value2) {
            addCriterion("min_participant between", value1, value2, "minParticipant");
            return (Criteria) this;
        }

        public Criteria andMinParticipantNotBetween(Integer value1, Integer value2) {
            addCriterion("min_participant not between", value1, value2, "minParticipant");
            return (Criteria) this;
        }

        public Criteria andIsAutoCancelIsNull() {
            addCriterion("is_auto_cancel is null");
            return (Criteria) this;
        }

        public Criteria andIsAutoCancelIsNotNull() {
            addCriterion("is_auto_cancel is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutoCancelEqualTo(Byte value) {
            addCriterion("is_auto_cancel =", value, "isAutoCancel");
            return (Criteria) this;
        }

        public Criteria andIsAutoCancelNotEqualTo(Byte value) {
            addCriterion("is_auto_cancel <>", value, "isAutoCancel");
            return (Criteria) this;
        }

        public Criteria andIsAutoCancelGreaterThan(Byte value) {
            addCriterion("is_auto_cancel >", value, "isAutoCancel");
            return (Criteria) this;
        }

        public Criteria andIsAutoCancelGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_auto_cancel >=", value, "isAutoCancel");
            return (Criteria) this;
        }

        public Criteria andIsAutoCancelLessThan(Byte value) {
            addCriterion("is_auto_cancel <", value, "isAutoCancel");
            return (Criteria) this;
        }

        public Criteria andIsAutoCancelLessThanOrEqualTo(Byte value) {
            addCriterion("is_auto_cancel <=", value, "isAutoCancel");
            return (Criteria) this;
        }

        public Criteria andIsAutoCancelIn(List<Byte> values) {
            addCriterion("is_auto_cancel in", values, "isAutoCancel");
            return (Criteria) this;
        }

        public Criteria andIsAutoCancelNotIn(List<Byte> values) {
            addCriterion("is_auto_cancel not in", values, "isAutoCancel");
            return (Criteria) this;
        }

        public Criteria andIsAutoCancelBetween(Byte value1, Byte value2) {
            addCriterion("is_auto_cancel between", value1, value2, "isAutoCancel");
            return (Criteria) this;
        }

        public Criteria andIsAutoCancelNotBetween(Byte value1, Byte value2) {
            addCriterion("is_auto_cancel not between", value1, value2, "isAutoCancel");
            return (Criteria) this;
        }

        public Criteria andIsAutoApproveIsNull() {
            addCriterion("is_auto_approve is null");
            return (Criteria) this;
        }

        public Criteria andIsAutoApproveIsNotNull() {
            addCriterion("is_auto_approve is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutoApproveEqualTo(Byte value) {
            addCriterion("is_auto_approve =", value, "isAutoApprove");
            return (Criteria) this;
        }

        public Criteria andIsAutoApproveNotEqualTo(Byte value) {
            addCriterion("is_auto_approve <>", value, "isAutoApprove");
            return (Criteria) this;
        }

        public Criteria andIsAutoApproveGreaterThan(Byte value) {
            addCriterion("is_auto_approve >", value, "isAutoApprove");
            return (Criteria) this;
        }

        public Criteria andIsAutoApproveGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_auto_approve >=", value, "isAutoApprove");
            return (Criteria) this;
        }

        public Criteria andIsAutoApproveLessThan(Byte value) {
            addCriterion("is_auto_approve <", value, "isAutoApprove");
            return (Criteria) this;
        }

        public Criteria andIsAutoApproveLessThanOrEqualTo(Byte value) {
            addCriterion("is_auto_approve <=", value, "isAutoApprove");
            return (Criteria) this;
        }

        public Criteria andIsAutoApproveIn(List<Byte> values) {
            addCriterion("is_auto_approve in", values, "isAutoApprove");
            return (Criteria) this;
        }

        public Criteria andIsAutoApproveNotIn(List<Byte> values) {
            addCriterion("is_auto_approve not in", values, "isAutoApprove");
            return (Criteria) this;
        }

        public Criteria andIsAutoApproveBetween(Byte value1, Byte value2) {
            addCriterion("is_auto_approve between", value1, value2, "isAutoApprove");
            return (Criteria) this;
        }

        public Criteria andIsAutoApproveNotBetween(Byte value1, Byte value2) {
            addCriterion("is_auto_approve not between", value1, value2, "isAutoApprove");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andChargeModeIsNull() {
            addCriterion("charge_mode is null");
            return (Criteria) this;
        }

        public Criteria andChargeModeIsNotNull() {
            addCriterion("charge_mode is not null");
            return (Criteria) this;
        }

        public Criteria andChargeModeEqualTo(Byte value) {
            addCriterion("charge_mode =", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeNotEqualTo(Byte value) {
            addCriterion("charge_mode <>", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeGreaterThan(Byte value) {
            addCriterion("charge_mode >", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeGreaterThanOrEqualTo(Byte value) {
            addCriterion("charge_mode >=", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeLessThan(Byte value) {
            addCriterion("charge_mode <", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeLessThanOrEqualTo(Byte value) {
            addCriterion("charge_mode <=", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeIn(List<Byte> values) {
            addCriterion("charge_mode in", values, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeNotIn(List<Byte> values) {
            addCriterion("charge_mode not in", values, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeBetween(Byte value1, Byte value2) {
            addCriterion("charge_mode between", value1, value2, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeNotBetween(Byte value1, Byte value2) {
            addCriterion("charge_mode not between", value1, value2, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargePerpIsNull() {
            addCriterion("charge_perp is null");
            return (Criteria) this;
        }

        public Criteria andChargePerpIsNotNull() {
            addCriterion("charge_perp is not null");
            return (Criteria) this;
        }

        public Criteria andChargePerpEqualTo(Float value) {
            addCriterion("charge_perp =", value, "chargePerp");
            return (Criteria) this;
        }

        public Criteria andChargePerpNotEqualTo(Float value) {
            addCriterion("charge_perp <>", value, "chargePerp");
            return (Criteria) this;
        }

        public Criteria andChargePerpGreaterThan(Float value) {
            addCriterion("charge_perp >", value, "chargePerp");
            return (Criteria) this;
        }

        public Criteria andChargePerpGreaterThanOrEqualTo(Float value) {
            addCriterion("charge_perp >=", value, "chargePerp");
            return (Criteria) this;
        }

        public Criteria andChargePerpLessThan(Float value) {
            addCriterion("charge_perp <", value, "chargePerp");
            return (Criteria) this;
        }

        public Criteria andChargePerpLessThanOrEqualTo(Float value) {
            addCriterion("charge_perp <=", value, "chargePerp");
            return (Criteria) this;
        }

        public Criteria andChargePerpIn(List<Float> values) {
            addCriterion("charge_perp in", values, "chargePerp");
            return (Criteria) this;
        }

        public Criteria andChargePerpNotIn(List<Float> values) {
            addCriterion("charge_perp not in", values, "chargePerp");
            return (Criteria) this;
        }

        public Criteria andChargePerpBetween(Float value1, Float value2) {
            addCriterion("charge_perp between", value1, value2, "chargePerp");
            return (Criteria) this;
        }

        public Criteria andChargePerpNotBetween(Float value1, Float value2) {
            addCriterion("charge_perp not between", value1, value2, "chargePerp");
            return (Criteria) this;
        }

        public Criteria andMaxChargePerpIsNull() {
            addCriterion("max_charge_perp is null");
            return (Criteria) this;
        }

        public Criteria andMaxChargePerpIsNotNull() {
            addCriterion("max_charge_perp is not null");
            return (Criteria) this;
        }

        public Criteria andMaxChargePerpEqualTo(Float value) {
            addCriterion("max_charge_perp =", value, "maxChargePerp");
            return (Criteria) this;
        }

        public Criteria andMaxChargePerpNotEqualTo(Float value) {
            addCriterion("max_charge_perp <>", value, "maxChargePerp");
            return (Criteria) this;
        }

        public Criteria andMaxChargePerpGreaterThan(Float value) {
            addCriterion("max_charge_perp >", value, "maxChargePerp");
            return (Criteria) this;
        }

        public Criteria andMaxChargePerpGreaterThanOrEqualTo(Float value) {
            addCriterion("max_charge_perp >=", value, "maxChargePerp");
            return (Criteria) this;
        }

        public Criteria andMaxChargePerpLessThan(Float value) {
            addCriterion("max_charge_perp <", value, "maxChargePerp");
            return (Criteria) this;
        }

        public Criteria andMaxChargePerpLessThanOrEqualTo(Float value) {
            addCriterion("max_charge_perp <=", value, "maxChargePerp");
            return (Criteria) this;
        }

        public Criteria andMaxChargePerpIn(List<Float> values) {
            addCriterion("max_charge_perp in", values, "maxChargePerp");
            return (Criteria) this;
        }

        public Criteria andMaxChargePerpNotIn(List<Float> values) {
            addCriterion("max_charge_perp not in", values, "maxChargePerp");
            return (Criteria) this;
        }

        public Criteria andMaxChargePerpBetween(Float value1, Float value2) {
            addCriterion("max_charge_perp between", value1, value2, "maxChargePerp");
            return (Criteria) this;
        }

        public Criteria andMaxChargePerpNotBetween(Float value1, Float value2) {
            addCriterion("max_charge_perp not between", value1, value2, "maxChargePerp");
            return (Criteria) this;
        }

        public Criteria andMinChargePerpIsNull() {
            addCriterion("min_charge_perp is null");
            return (Criteria) this;
        }

        public Criteria andMinChargePerpIsNotNull() {
            addCriterion("min_charge_perp is not null");
            return (Criteria) this;
        }

        public Criteria andMinChargePerpEqualTo(Float value) {
            addCriterion("min_charge_perp =", value, "minChargePerp");
            return (Criteria) this;
        }

        public Criteria andMinChargePerpNotEqualTo(Float value) {
            addCriterion("min_charge_perp <>", value, "minChargePerp");
            return (Criteria) this;
        }

        public Criteria andMinChargePerpGreaterThan(Float value) {
            addCriterion("min_charge_perp >", value, "minChargePerp");
            return (Criteria) this;
        }

        public Criteria andMinChargePerpGreaterThanOrEqualTo(Float value) {
            addCriterion("min_charge_perp >=", value, "minChargePerp");
            return (Criteria) this;
        }

        public Criteria andMinChargePerpLessThan(Float value) {
            addCriterion("min_charge_perp <", value, "minChargePerp");
            return (Criteria) this;
        }

        public Criteria andMinChargePerpLessThanOrEqualTo(Float value) {
            addCriterion("min_charge_perp <=", value, "minChargePerp");
            return (Criteria) this;
        }

        public Criteria andMinChargePerpIn(List<Float> values) {
            addCriterion("min_charge_perp in", values, "minChargePerp");
            return (Criteria) this;
        }

        public Criteria andMinChargePerpNotIn(List<Float> values) {
            addCriterion("min_charge_perp not in", values, "minChargePerp");
            return (Criteria) this;
        }

        public Criteria andMinChargePerpBetween(Float value1, Float value2) {
            addCriterion("min_charge_perp between", value1, value2, "minChargePerp");
            return (Criteria) this;
        }

        public Criteria andMinChargePerpNotBetween(Float value1, Float value2) {
            addCriterion("min_charge_perp not between", value1, value2, "minChargePerp");
            return (Criteria) this;
        }

        public Criteria andChargePerphIsNull() {
            addCriterion("charge_perph is null");
            return (Criteria) this;
        }

        public Criteria andChargePerphIsNotNull() {
            addCriterion("charge_perph is not null");
            return (Criteria) this;
        }

        public Criteria andChargePerphEqualTo(Float value) {
            addCriterion("charge_perph =", value, "chargePerph");
            return (Criteria) this;
        }

        public Criteria andChargePerphNotEqualTo(Float value) {
            addCriterion("charge_perph <>", value, "chargePerph");
            return (Criteria) this;
        }

        public Criteria andChargePerphGreaterThan(Float value) {
            addCriterion("charge_perph >", value, "chargePerph");
            return (Criteria) this;
        }

        public Criteria andChargePerphGreaterThanOrEqualTo(Float value) {
            addCriterion("charge_perph >=", value, "chargePerph");
            return (Criteria) this;
        }

        public Criteria andChargePerphLessThan(Float value) {
            addCriterion("charge_perph <", value, "chargePerph");
            return (Criteria) this;
        }

        public Criteria andChargePerphLessThanOrEqualTo(Float value) {
            addCriterion("charge_perph <=", value, "chargePerph");
            return (Criteria) this;
        }

        public Criteria andChargePerphIn(List<Float> values) {
            addCriterion("charge_perph in", values, "chargePerph");
            return (Criteria) this;
        }

        public Criteria andChargePerphNotIn(List<Float> values) {
            addCriterion("charge_perph not in", values, "chargePerph");
            return (Criteria) this;
        }

        public Criteria andChargePerphBetween(Float value1, Float value2) {
            addCriterion("charge_perph between", value1, value2, "chargePerph");
            return (Criteria) this;
        }

        public Criteria andChargePerphNotBetween(Float value1, Float value2) {
            addCriterion("charge_perph not between", value1, value2, "chargePerph");
            return (Criteria) this;
        }

        public Criteria andChargeTotalIsNull() {
            addCriterion("charge_total is null");
            return (Criteria) this;
        }

        public Criteria andChargeTotalIsNotNull() {
            addCriterion("charge_total is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTotalEqualTo(Float value) {
            addCriterion("charge_total =", value, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalNotEqualTo(Float value) {
            addCriterion("charge_total <>", value, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalGreaterThan(Float value) {
            addCriterion("charge_total >", value, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("charge_total >=", value, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalLessThan(Float value) {
            addCriterion("charge_total <", value, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalLessThanOrEqualTo(Float value) {
            addCriterion("charge_total <=", value, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalIn(List<Float> values) {
            addCriterion("charge_total in", values, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalNotIn(List<Float> values) {
            addCriterion("charge_total not in", values, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalBetween(Float value1, Float value2) {
            addCriterion("charge_total between", value1, value2, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andChargeTotalNotBetween(Float value1, Float value2) {
            addCriterion("charge_total not between", value1, value2, "chargeTotal");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andFollowCountIsNull() {
            addCriterion("follow_count is null");
            return (Criteria) this;
        }

        public Criteria andFollowCountIsNotNull() {
            addCriterion("follow_count is not null");
            return (Criteria) this;
        }

        public Criteria andFollowCountEqualTo(Integer value) {
            addCriterion("follow_count =", value, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountNotEqualTo(Integer value) {
            addCriterion("follow_count <>", value, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountGreaterThan(Integer value) {
            addCriterion("follow_count >", value, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_count >=", value, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountLessThan(Integer value) {
            addCriterion("follow_count <", value, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountLessThanOrEqualTo(Integer value) {
            addCriterion("follow_count <=", value, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountIn(List<Integer> values) {
            addCriterion("follow_count in", values, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountNotIn(List<Integer> values) {
            addCriterion("follow_count not in", values, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountBetween(Integer value1, Integer value2) {
            addCriterion("follow_count between", value1, value2, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_count not between", value1, value2, "followCount");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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