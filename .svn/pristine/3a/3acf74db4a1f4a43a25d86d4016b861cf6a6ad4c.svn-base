package com.luwei.hackvr.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(Integer value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(Integer value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(Integer value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(Integer value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(Integer value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<Integer> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<Integer> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(Integer value1, Integer value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
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

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
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

        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("label not between", value1, value2, "label");
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

        public Criteria andClickNumIsNull() {
            addCriterion("click_num is null");
            return (Criteria) this;
        }

        public Criteria andClickNumIsNotNull() {
            addCriterion("click_num is not null");
            return (Criteria) this;
        }

        public Criteria andClickNumEqualTo(Integer value) {
            addCriterion("click_num =", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumNotEqualTo(Integer value) {
            addCriterion("click_num <>", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumGreaterThan(Integer value) {
            addCriterion("click_num >", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_num >=", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumLessThan(Integer value) {
            addCriterion("click_num <", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumLessThanOrEqualTo(Integer value) {
            addCriterion("click_num <=", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumIn(List<Integer> values) {
            addCriterion("click_num in", values, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumNotIn(List<Integer> values) {
            addCriterion("click_num not in", values, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumBetween(Integer value1, Integer value2) {
            addCriterion("click_num between", value1, value2, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumNotBetween(Integer value1, Integer value2) {
            addCriterion("click_num not between", value1, value2, "clickNum");
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

        public Criteria andLikeNumIsNull() {
            addCriterion("like_num is null");
            return (Criteria) this;
        }

        public Criteria andLikeNumIsNotNull() {
            addCriterion("like_num is not null");
            return (Criteria) this;
        }

        public Criteria andLikeNumEqualTo(Integer value) {
            addCriterion("like_num =", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotEqualTo(Integer value) {
            addCriterion("like_num <>", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumGreaterThan(Integer value) {
            addCriterion("like_num >", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_num >=", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumLessThan(Integer value) {
            addCriterion("like_num <", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumLessThanOrEqualTo(Integer value) {
            addCriterion("like_num <=", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumIn(List<Integer> values) {
            addCriterion("like_num in", values, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotIn(List<Integer> values) {
            addCriterion("like_num not in", values, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumBetween(Integer value1, Integer value2) {
            addCriterion("like_num between", value1, value2, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("like_num not between", value1, value2, "likeNum");
            return (Criteria) this;
        }

        public Criteria andUnlikeNumIsNull() {
            addCriterion("unlike_num is null");
            return (Criteria) this;
        }

        public Criteria andUnlikeNumIsNotNull() {
            addCriterion("unlike_num is not null");
            return (Criteria) this;
        }

        public Criteria andUnlikeNumEqualTo(Integer value) {
            addCriterion("unlike_num =", value, "unlikeNum");
            return (Criteria) this;
        }

        public Criteria andUnlikeNumNotEqualTo(Integer value) {
            addCriterion("unlike_num <>", value, "unlikeNum");
            return (Criteria) this;
        }

        public Criteria andUnlikeNumGreaterThan(Integer value) {
            addCriterion("unlike_num >", value, "unlikeNum");
            return (Criteria) this;
        }

        public Criteria andUnlikeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("unlike_num >=", value, "unlikeNum");
            return (Criteria) this;
        }

        public Criteria andUnlikeNumLessThan(Integer value) {
            addCriterion("unlike_num <", value, "unlikeNum");
            return (Criteria) this;
        }

        public Criteria andUnlikeNumLessThanOrEqualTo(Integer value) {
            addCriterion("unlike_num <=", value, "unlikeNum");
            return (Criteria) this;
        }

        public Criteria andUnlikeNumIn(List<Integer> values) {
            addCriterion("unlike_num in", values, "unlikeNum");
            return (Criteria) this;
        }

        public Criteria andUnlikeNumNotIn(List<Integer> values) {
            addCriterion("unlike_num not in", values, "unlikeNum");
            return (Criteria) this;
        }

        public Criteria andUnlikeNumBetween(Integer value1, Integer value2) {
            addCriterion("unlike_num between", value1, value2, "unlikeNum");
            return (Criteria) this;
        }

        public Criteria andUnlikeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("unlike_num not between", value1, value2, "unlikeNum");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIsNull() {
            addCriterion("qrcode_url is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIsNotNull() {
            addCriterion("qrcode_url is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlEqualTo(String value) {
            addCriterion("qrcode_url =", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotEqualTo(String value) {
            addCriterion("qrcode_url <>", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlGreaterThan(String value) {
            addCriterion("qrcode_url >", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode_url >=", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLessThan(String value) {
            addCriterion("qrcode_url <", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLessThanOrEqualTo(String value) {
            addCriterion("qrcode_url <=", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLike(String value) {
            addCriterion("qrcode_url like", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotLike(String value) {
            addCriterion("qrcode_url not like", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIn(List<String> values) {
            addCriterion("qrcode_url in", values, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotIn(List<String> values) {
            addCriterion("qrcode_url not in", values, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlBetween(String value1, String value2) {
            addCriterion("qrcode_url between", value1, value2, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotBetween(String value1, String value2) {
            addCriterion("qrcode_url not between", value1, value2, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andVideoLengthIsNull() {
            addCriterion("video_length is null");
            return (Criteria) this;
        }

        public Criteria andVideoLengthIsNotNull() {
            addCriterion("video_length is not null");
            return (Criteria) this;
        }

        public Criteria andVideoLengthEqualTo(String value) {
            addCriterion("video_length =", value, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthNotEqualTo(String value) {
            addCriterion("video_length <>", value, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthGreaterThan(String value) {
            addCriterion("video_length >", value, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthGreaterThanOrEqualTo(String value) {
            addCriterion("video_length >=", value, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthLessThan(String value) {
            addCriterion("video_length <", value, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthLessThanOrEqualTo(String value) {
            addCriterion("video_length <=", value, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthLike(String value) {
            addCriterion("video_length like", value, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthNotLike(String value) {
            addCriterion("video_length not like", value, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthIn(List<String> values) {
            addCriterion("video_length in", values, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthNotIn(List<String> values) {
            addCriterion("video_length not in", values, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthBetween(String value1, String value2) {
            addCriterion("video_length between", value1, value2, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoLengthNotBetween(String value1, String value2) {
            addCriterion("video_length not between", value1, value2, "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoClarityIsNull() {
            addCriterion("video_clarity is null");
            return (Criteria) this;
        }

        public Criteria andVideoClarityIsNotNull() {
            addCriterion("video_clarity is not null");
            return (Criteria) this;
        }

        public Criteria andVideoClarityEqualTo(String value) {
            addCriterion("video_clarity =", value, "videoClarity");
            return (Criteria) this;
        }

        public Criteria andVideoClarityNotEqualTo(String value) {
            addCriterion("video_clarity <>", value, "videoClarity");
            return (Criteria) this;
        }

        public Criteria andVideoClarityGreaterThan(String value) {
            addCriterion("video_clarity >", value, "videoClarity");
            return (Criteria) this;
        }

        public Criteria andVideoClarityGreaterThanOrEqualTo(String value) {
            addCriterion("video_clarity >=", value, "videoClarity");
            return (Criteria) this;
        }

        public Criteria andVideoClarityLessThan(String value) {
            addCriterion("video_clarity <", value, "videoClarity");
            return (Criteria) this;
        }

        public Criteria andVideoClarityLessThanOrEqualTo(String value) {
            addCriterion("video_clarity <=", value, "videoClarity");
            return (Criteria) this;
        }

        public Criteria andVideoClarityLike(String value) {
            addCriterion("video_clarity like", value, "videoClarity");
            return (Criteria) this;
        }

        public Criteria andVideoClarityNotLike(String value) {
            addCriterion("video_clarity not like", value, "videoClarity");
            return (Criteria) this;
        }

        public Criteria andVideoClarityIn(List<String> values) {
            addCriterion("video_clarity in", values, "videoClarity");
            return (Criteria) this;
        }

        public Criteria andVideoClarityNotIn(List<String> values) {
            addCriterion("video_clarity not in", values, "videoClarity");
            return (Criteria) this;
        }

        public Criteria andVideoClarityBetween(String value1, String value2) {
            addCriterion("video_clarity between", value1, value2, "videoClarity");
            return (Criteria) this;
        }

        public Criteria andVideoClarityNotBetween(String value1, String value2) {
            addCriterion("video_clarity not between", value1, value2, "videoClarity");
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

        public Criteria andVideoUrlLikeInsensitive(String value) {
            addCriterion("upper(video_url) like", value.toUpperCase(), "videoUrl");
            return (Criteria) this;
        }

        public Criteria andPreimageLikeInsensitive(String value) {
            addCriterion("upper(preimage) like", value.toUpperCase(), "preimage");
            return (Criteria) this;
        }

        public Criteria andSourceLikeInsensitive(String value) {
            addCriterion("upper(source) like", value.toUpperCase(), "source");
            return (Criteria) this;
        }

        public Criteria andAuthorLikeInsensitive(String value) {
            addCriterion("upper(author) like", value.toUpperCase(), "author");
            return (Criteria) this;
        }

        public Criteria andLabelLikeInsensitive(String value) {
            addCriterion("upper(label) like", value.toUpperCase(), "label");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLikeInsensitive(String value) {
            addCriterion("upper(qrcode_url) like", value.toUpperCase(), "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andVideoLengthLikeInsensitive(String value) {
            addCriterion("upper(video_length) like", value.toUpperCase(), "videoLength");
            return (Criteria) this;
        }

        public Criteria andVideoClarityLikeInsensitive(String value) {
            addCriterion("upper(video_clarity) like", value.toUpperCase(), "videoClarity");
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