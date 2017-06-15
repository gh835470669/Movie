package com.luwei.hackvr.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameExample() {
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

        public Criteria andGameIdIsNull() {
            addCriterion("game_id is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdEqualTo(Integer value) {
            addCriterion("game_id =", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotEqualTo(Integer value) {
            addCriterion("game_id <>", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThan(Integer value) {
            addCriterion("game_id >", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_id >=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThan(Integer value) {
            addCriterion("game_id <", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThanOrEqualTo(Integer value) {
            addCriterion("game_id <=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdIn(List<Integer> values) {
            addCriterion("game_id in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotIn(List<Integer> values) {
            addCriterion("game_id not in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdBetween(Integer value1, Integer value2) {
            addCriterion("game_id between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("game_id not between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(Integer value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(Integer value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(Integer value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(Integer value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<Integer> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<Integer> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(Integer value1, Integer value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andPreinfoIsNull() {
            addCriterion("preinfo is null");
            return (Criteria) this;
        }

        public Criteria andPreinfoIsNotNull() {
            addCriterion("preinfo is not null");
            return (Criteria) this;
        }

        public Criteria andPreinfoEqualTo(String value) {
            addCriterion("preinfo =", value, "preinfo");
            return (Criteria) this;
        }

        public Criteria andPreinfoNotEqualTo(String value) {
            addCriterion("preinfo <>", value, "preinfo");
            return (Criteria) this;
        }

        public Criteria andPreinfoGreaterThan(String value) {
            addCriterion("preinfo >", value, "preinfo");
            return (Criteria) this;
        }

        public Criteria andPreinfoGreaterThanOrEqualTo(String value) {
            addCriterion("preinfo >=", value, "preinfo");
            return (Criteria) this;
        }

        public Criteria andPreinfoLessThan(String value) {
            addCriterion("preinfo <", value, "preinfo");
            return (Criteria) this;
        }

        public Criteria andPreinfoLessThanOrEqualTo(String value) {
            addCriterion("preinfo <=", value, "preinfo");
            return (Criteria) this;
        }

        public Criteria andPreinfoLike(String value) {
            addCriterion("preinfo like", value, "preinfo");
            return (Criteria) this;
        }

        public Criteria andPreinfoNotLike(String value) {
            addCriterion("preinfo not like", value, "preinfo");
            return (Criteria) this;
        }

        public Criteria andPreinfoIn(List<String> values) {
            addCriterion("preinfo in", values, "preinfo");
            return (Criteria) this;
        }

        public Criteria andPreinfoNotIn(List<String> values) {
            addCriterion("preinfo not in", values, "preinfo");
            return (Criteria) this;
        }

        public Criteria andPreinfoBetween(String value1, String value2) {
            addCriterion("preinfo between", value1, value2, "preinfo");
            return (Criteria) this;
        }

        public Criteria andPreinfoNotBetween(String value1, String value2) {
            addCriterion("preinfo not between", value1, value2, "preinfo");
            return (Criteria) this;
        }

        public Criteria andPreimageIsNull() {
            addCriterion("preimage is null");
            return (Criteria) this;
        }

        public Criteria andPreimageIsNotNull() {
            addCriterion("preimage is not null");
            return (Criteria) this;
        }

        public Criteria andPreimageEqualTo(String value) {
            addCriterion("preimage =", value, "preimage");
            return (Criteria) this;
        }

        public Criteria andPreimageNotEqualTo(String value) {
            addCriterion("preimage <>", value, "preimage");
            return (Criteria) this;
        }

        public Criteria andPreimageGreaterThan(String value) {
            addCriterion("preimage >", value, "preimage");
            return (Criteria) this;
        }

        public Criteria andPreimageGreaterThanOrEqualTo(String value) {
            addCriterion("preimage >=", value, "preimage");
            return (Criteria) this;
        }

        public Criteria andPreimageLessThan(String value) {
            addCriterion("preimage <", value, "preimage");
            return (Criteria) this;
        }

        public Criteria andPreimageLessThanOrEqualTo(String value) {
            addCriterion("preimage <=", value, "preimage");
            return (Criteria) this;
        }

        public Criteria andPreimageLike(String value) {
            addCriterion("preimage like", value, "preimage");
            return (Criteria) this;
        }

        public Criteria andPreimageNotLike(String value) {
            addCriterion("preimage not like", value, "preimage");
            return (Criteria) this;
        }

        public Criteria andPreimageIn(List<String> values) {
            addCriterion("preimage in", values, "preimage");
            return (Criteria) this;
        }

        public Criteria andPreimageNotIn(List<String> values) {
            addCriterion("preimage not in", values, "preimage");
            return (Criteria) this;
        }

        public Criteria andPreimageBetween(String value1, String value2) {
            addCriterion("preimage between", value1, value2, "preimage");
            return (Criteria) this;
        }

        public Criteria andPreimageNotBetween(String value1, String value2) {
            addCriterion("preimage not between", value1, value2, "preimage");
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

        public Criteria andSystemIsNull() {
            addCriterion("system is null");
            return (Criteria) this;
        }

        public Criteria andSystemIsNotNull() {
            addCriterion("system is not null");
            return (Criteria) this;
        }

        public Criteria andSystemEqualTo(Integer value) {
            addCriterion("system =", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotEqualTo(Integer value) {
            addCriterion("system <>", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThan(Integer value) {
            addCriterion("system >", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThanOrEqualTo(Integer value) {
            addCriterion("system >=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThan(Integer value) {
            addCriterion("system <", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThanOrEqualTo(Integer value) {
            addCriterion("system <=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemIn(List<Integer> values) {
            addCriterion("system in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotIn(List<Integer> values) {
            addCriterion("system not in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemBetween(Integer value1, Integer value2) {
            addCriterion("system between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotBetween(Integer value1, Integer value2) {
            addCriterion("system not between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceIsNull() {
            addCriterion("display_device is null");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceIsNotNull() {
            addCriterion("display_device is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceEqualTo(String value) {
            addCriterion("display_device =", value, "displayDevice");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceNotEqualTo(String value) {
            addCriterion("display_device <>", value, "displayDevice");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceGreaterThan(String value) {
            addCriterion("display_device >", value, "displayDevice");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("display_device >=", value, "displayDevice");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceLessThan(String value) {
            addCriterion("display_device <", value, "displayDevice");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceLessThanOrEqualTo(String value) {
            addCriterion("display_device <=", value, "displayDevice");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceLike(String value) {
            addCriterion("display_device like", value, "displayDevice");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceNotLike(String value) {
            addCriterion("display_device not like", value, "displayDevice");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceIn(List<String> values) {
            addCriterion("display_device in", values, "displayDevice");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceNotIn(List<String> values) {
            addCriterion("display_device not in", values, "displayDevice");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceBetween(String value1, String value2) {
            addCriterion("display_device between", value1, value2, "displayDevice");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceNotBetween(String value1, String value2) {
            addCriterion("display_device not between", value1, value2, "displayDevice");
            return (Criteria) this;
        }

        public Criteria andControlDeviceIsNull() {
            addCriterion("control_device is null");
            return (Criteria) this;
        }

        public Criteria andControlDeviceIsNotNull() {
            addCriterion("control_device is not null");
            return (Criteria) this;
        }

        public Criteria andControlDeviceEqualTo(String value) {
            addCriterion("control_device =", value, "controlDevice");
            return (Criteria) this;
        }

        public Criteria andControlDeviceNotEqualTo(String value) {
            addCriterion("control_device <>", value, "controlDevice");
            return (Criteria) this;
        }

        public Criteria andControlDeviceGreaterThan(String value) {
            addCriterion("control_device >", value, "controlDevice");
            return (Criteria) this;
        }

        public Criteria andControlDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("control_device >=", value, "controlDevice");
            return (Criteria) this;
        }

        public Criteria andControlDeviceLessThan(String value) {
            addCriterion("control_device <", value, "controlDevice");
            return (Criteria) this;
        }

        public Criteria andControlDeviceLessThanOrEqualTo(String value) {
            addCriterion("control_device <=", value, "controlDevice");
            return (Criteria) this;
        }

        public Criteria andControlDeviceLike(String value) {
            addCriterion("control_device like", value, "controlDevice");
            return (Criteria) this;
        }

        public Criteria andControlDeviceNotLike(String value) {
            addCriterion("control_device not like", value, "controlDevice");
            return (Criteria) this;
        }

        public Criteria andControlDeviceIn(List<String> values) {
            addCriterion("control_device in", values, "controlDevice");
            return (Criteria) this;
        }

        public Criteria andControlDeviceNotIn(List<String> values) {
            addCriterion("control_device not in", values, "controlDevice");
            return (Criteria) this;
        }

        public Criteria andControlDeviceBetween(String value1, String value2) {
            addCriterion("control_device between", value1, value2, "controlDevice");
            return (Criteria) this;
        }

        public Criteria andControlDeviceNotBetween(String value1, String value2) {
            addCriterion("control_device not between", value1, value2, "controlDevice");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNull() {
            addCriterion("download_url is null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNotNull() {
            addCriterion("download_url is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlEqualTo(String value) {
            addCriterion("download_url =", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotEqualTo(String value) {
            addCriterion("download_url <>", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThan(String value) {
            addCriterion("download_url >", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("download_url >=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThan(String value) {
            addCriterion("download_url <", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThanOrEqualTo(String value) {
            addCriterion("download_url <=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLike(String value) {
            addCriterion("download_url like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotLike(String value) {
            addCriterion("download_url not like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIn(List<String> values) {
            addCriterion("download_url in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotIn(List<String> values) {
            addCriterion("download_url not in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlBetween(String value1, String value2) {
            addCriterion("download_url between", value1, value2, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotBetween(String value1, String value2) {
            addCriterion("download_url not between", value1, value2, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadNumIsNull() {
            addCriterion("download_num is null");
            return (Criteria) this;
        }

        public Criteria andDownloadNumIsNotNull() {
            addCriterion("download_num is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadNumEqualTo(Integer value) {
            addCriterion("download_num =", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumNotEqualTo(Integer value) {
            addCriterion("download_num <>", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumGreaterThan(Integer value) {
            addCriterion("download_num >", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_num >=", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumLessThan(Integer value) {
            addCriterion("download_num <", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumLessThanOrEqualTo(Integer value) {
            addCriterion("download_num <=", value, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumIn(List<Integer> values) {
            addCriterion("download_num in", values, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumNotIn(List<Integer> values) {
            addCriterion("download_num not in", values, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumBetween(Integer value1, Integer value2) {
            addCriterion("download_num between", value1, value2, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andDownloadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("download_num not between", value1, value2, "downloadNum");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeIsNull() {
            addCriterion("installation_size is null");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeIsNotNull() {
            addCriterion("installation_size is not null");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeEqualTo(String value) {
            addCriterion("installation_size =", value, "installationSize");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeNotEqualTo(String value) {
            addCriterion("installation_size <>", value, "installationSize");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeGreaterThan(String value) {
            addCriterion("installation_size >", value, "installationSize");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeGreaterThanOrEqualTo(String value) {
            addCriterion("installation_size >=", value, "installationSize");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeLessThan(String value) {
            addCriterion("installation_size <", value, "installationSize");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeLessThanOrEqualTo(String value) {
            addCriterion("installation_size <=", value, "installationSize");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeLike(String value) {
            addCriterion("installation_size like", value, "installationSize");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeNotLike(String value) {
            addCriterion("installation_size not like", value, "installationSize");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeIn(List<String> values) {
            addCriterion("installation_size in", values, "installationSize");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeNotIn(List<String> values) {
            addCriterion("installation_size not in", values, "installationSize");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeBetween(String value1, String value2) {
            addCriterion("installation_size between", value1, value2, "installationSize");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeNotBetween(String value1, String value2) {
            addCriterion("installation_size not between", value1, value2, "installationSize");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Byte value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Byte value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Byte value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Byte value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Byte value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Byte> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Byte> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Byte value1, Byte value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andPreinfoLikeInsensitive(String value) {
            addCriterion("upper(preinfo) like", value.toUpperCase(), "preinfo");
            return (Criteria) this;
        }

        public Criteria andPreimageLikeInsensitive(String value) {
            addCriterion("upper(preimage) like", value.toUpperCase(), "preimage");
            return (Criteria) this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(type) like", value.toUpperCase(), "type");
            return (Criteria) this;
        }

        public Criteria andDisplayDeviceLikeInsensitive(String value) {
            addCriterion("upper(display_device) like", value.toUpperCase(), "displayDevice");
            return (Criteria) this;
        }

        public Criteria andControlDeviceLikeInsensitive(String value) {
            addCriterion("upper(control_device) like", value.toUpperCase(), "controlDevice");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLikeInsensitive(String value) {
            addCriterion("upper(download_url) like", value.toUpperCase(), "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andInstallationSizeLikeInsensitive(String value) {
            addCriterion("upper(installation_size) like", value.toUpperCase(), "installationSize");
            return (Criteria) this;
        }

        public Criteria andAuthorLikeInsensitive(String value) {
            addCriterion("upper(author) like", value.toUpperCase(), "author");
            return (Criteria) this;
        }

        public Criteria andSourceLikeInsensitive(String value) {
            addCriterion("upper(source) like", value.toUpperCase(), "source");
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