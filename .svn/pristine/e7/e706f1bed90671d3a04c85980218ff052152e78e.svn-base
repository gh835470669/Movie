package com.luwei.hackvr.mapper;

import com.luwei.hackvr.pojo.Kuaixun;
import com.luwei.hackvr.pojo.KuaixunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface KuaixunMapper {
    int countByExample(KuaixunExample example);

    int deleteByExample(KuaixunExample example);

    int deleteByPrimaryKey(Integer kuaixunId);

    int insert(Kuaixun record);

    int insertSelective(Kuaixun record);

    List<Kuaixun> selectByExampleWithRowbounds(KuaixunExample example, RowBounds rowBounds);

    List<Kuaixun> selectByExample(KuaixunExample example);

    Kuaixun selectByPrimaryKey(Integer kuaixunId);

    int updateByExampleSelective(@Param("record") Kuaixun record, @Param("example") KuaixunExample example);

    int updateByExample(@Param("record") Kuaixun record, @Param("example") KuaixunExample example);

    int updateByPrimaryKeySelective(Kuaixun record);

    int updateByPrimaryKey(Kuaixun record);
}