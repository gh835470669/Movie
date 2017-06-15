package com.luwei.hackvr.mapper;

import com.luwei.hackvr.pojo.LabelMap;
import com.luwei.hackvr.pojo.LabelMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LabelMapMapper {
    int countByExample(LabelMapExample example);

    int deleteByExample(LabelMapExample example);

    int deleteByPrimaryKey(Integer mapperId);

    int insert(LabelMap record);

    int insertSelective(LabelMap record);

    List<LabelMap> selectByExampleWithRowbounds(LabelMapExample example, RowBounds rowBounds);

    List<LabelMap> selectByExample(LabelMapExample example);

    LabelMap selectByPrimaryKey(Integer mapperId);

    int updateByExampleSelective(@Param("record") LabelMap record, @Param("example") LabelMapExample example);

    int updateByExample(@Param("record") LabelMap record, @Param("example") LabelMapExample example);

    int updateByPrimaryKeySelective(LabelMap record);

    int updateByPrimaryKey(LabelMap record);
}