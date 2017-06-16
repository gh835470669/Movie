package com.mymovie.mapper;

import com.mymovie.pojo.Seat;
import com.mymovie.pojo.SeatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SeatMapper {
    int countByExample(SeatExample example);

    int deleteByExample(SeatExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(Seat record);

    int insertSelective(Seat record);

    List<Seat> selectByExampleWithRowbounds(SeatExample example, RowBounds rowBounds);

    List<Seat> selectByExample(SeatExample example);

    Seat selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") Seat record, @Param("example") SeatExample example);

    int updateByExample(@Param("record") Seat record, @Param("example") SeatExample example);

    int updateByPrimaryKeySelective(Seat record);

    int updateByPrimaryKey(Seat record);
}