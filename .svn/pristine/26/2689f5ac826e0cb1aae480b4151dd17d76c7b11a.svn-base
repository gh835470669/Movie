package com.luwei.hackvr.mapper;

import com.luwei.hackvr.pojo.GameType;
import com.luwei.hackvr.pojo.GameTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GameTypeMapper {
    int countByExample(GameTypeExample example);

    int deleteByExample(GameTypeExample example);

    int deleteByPrimaryKey(Integer gameTypeId);

    int insert(GameType record);

    int insertSelective(GameType record);

    List<GameType> selectByExampleWithRowbounds(GameTypeExample example, RowBounds rowBounds);

    List<GameType> selectByExample(GameTypeExample example);

    GameType selectByPrimaryKey(Integer gameTypeId);

    int updateByExampleSelective(@Param("record") GameType record, @Param("example") GameTypeExample example);

    int updateByExample(@Param("record") GameType record, @Param("example") GameTypeExample example);

    int updateByPrimaryKeySelective(GameType record);

    int updateByPrimaryKey(GameType record);
}