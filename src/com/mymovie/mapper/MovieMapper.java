package com.mymovie.mapper;

import com.mymovie.pojo.Movie;
import com.mymovie.pojo.MovieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MovieMapper {
    int countByExample(MovieExample example);

    int deleteByExample(MovieExample example);

    int deleteByPrimaryKey(Integer mlId);

    int insert(Movie record);

    int insertSelective(Movie record);

    List<Movie> selectByExampleWithRowbounds(MovieExample example, RowBounds rowBounds);

    List<Movie> selectByExample(MovieExample example);

    Movie selectByPrimaryKey(Integer mlId);

    int updateByExampleSelective(@Param("record") Movie record, @Param("example") MovieExample example);

    int updateByExample(@Param("record") Movie record, @Param("example") MovieExample example);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKey(Movie record);
}