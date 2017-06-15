package com.luwei.hackvr.mapper;

import com.luwei.hackvr.pojo.Video;
import com.luwei.hackvr.pojo.VideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VideoMapper {
    int countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(Integer videoId);

    int insert(Video record);

    int insertSelective(Video record);

    List<Video> selectByExampleWithRowbounds(VideoExample example, RowBounds rowBounds);

    List<Video> selectByExample(VideoExample example);

    Video selectByPrimaryKey(Integer videoId);

    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
}