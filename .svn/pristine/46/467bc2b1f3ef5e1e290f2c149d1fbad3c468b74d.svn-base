package com.luwei.hackvr.mapper;

import com.luwei.hackvr.pojo.Game;
import com.luwei.hackvr.pojo.GameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GameMapper {
    int countByExample(GameExample example);

    int deleteByExample(GameExample example);

    int deleteByPrimaryKey(Integer gameId);

    int insert(Game record);

    int insertSelective(Game record);

    List<Game> selectByExampleWithBLOBsWithRowbounds(GameExample example, RowBounds rowBounds);

    List<Game> selectByExampleWithBLOBs(GameExample example);

    List<Game> selectByExampleWithRowbounds(GameExample example, RowBounds rowBounds);

    List<Game> selectByExample(GameExample example);

    Game selectByPrimaryKey(Integer gameId);

    int updateByExampleSelective(@Param("record") Game record, @Param("example") GameExample example);

    int updateByExampleWithBLOBs(@Param("record") Game record, @Param("example") GameExample example);

    int updateByExample(@Param("record") Game record, @Param("example") GameExample example);

    int updateByPrimaryKeySelective(Game record);

    int updateByPrimaryKeyWithBLOBs(Game record);

    int updateByPrimaryKey(Game record);
}