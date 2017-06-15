package com.luwei.hackvr.mapper;

import com.luwei.hackvr.pojo.Toutiao;
import com.luwei.hackvr.pojo.ToutiaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ToutiaoMapper {
    int countByExample(ToutiaoExample example);

    int deleteByExample(ToutiaoExample example);

    int deleteByPrimaryKey(Integer toutiaoId);

    int insert(Toutiao record);

    int insertSelective(Toutiao record);

    List<Toutiao> selectByExampleWithRowbounds(ToutiaoExample example, RowBounds rowBounds);

    List<Toutiao> selectByExample(ToutiaoExample example);

    Toutiao selectByPrimaryKey(Integer toutiaoId);

    int updateByExampleSelective(@Param("record") Toutiao record, @Param("example") ToutiaoExample example);

    int updateByExample(@Param("record") Toutiao record, @Param("example") ToutiaoExample example);

    int updateByPrimaryKeySelective(Toutiao record);

    int updateByPrimaryKey(Toutiao record);
}