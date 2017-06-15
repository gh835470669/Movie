package com.luwei.hackvr.mapper;

import com.luwei.hackvr.pojo.GameTypeMap;
import com.luwei.hackvr.pojo.GameTypeMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GameTypeMapMapper {
    int countByExample(GameTypeMapExample example);

    int deleteByExample(GameTypeMapExample example);

    int deleteByPrimaryKey(Integer gameTypeMapperId);

    int insert(GameTypeMap record);

    int insertSelective(GameTypeMap record);

    List<GameTypeMap> selectByExampleWithRowbounds(GameTypeMapExample example, RowBounds rowBounds);

    List<GameTypeMap> selectByExample(GameTypeMapExample example);

    GameTypeMap selectByPrimaryKey(Integer gameTypeMapperId);

    int updateByExampleSelective(@Param("record") GameTypeMap record, @Param("example") GameTypeMapExample example);

    int updateByExample(@Param("record") GameTypeMap record, @Param("example") GameTypeMapExample example);

    int updateByPrimaryKeySelective(GameTypeMap record);

    int updateByPrimaryKey(GameTypeMap record);
}