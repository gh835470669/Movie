package com.luwei.hackvr.mapper;

import com.luwei.hackvr.pojo.Label;
import com.luwei.hackvr.pojo.LabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LabelMapper {
    int countByExample(LabelExample example);

    int deleteByExample(LabelExample example);

    int deleteByPrimaryKey(Integer labelId);

    int insert(Label record);

    int insertSelective(Label record);

    List<Label> selectByExampleWithRowbounds(LabelExample example, RowBounds rowBounds);

    List<Label> selectByExample(LabelExample example);

    Label selectByPrimaryKey(Integer labelId);

    int updateByExampleSelective(@Param("record") Label record, @Param("example") LabelExample example);

    int updateByExample(@Param("record") Label record, @Param("example") LabelExample example);

    int updateByPrimaryKeySelective(Label record);

    int updateByPrimaryKey(Label record);
}