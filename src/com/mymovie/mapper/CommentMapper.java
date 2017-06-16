package com.mymovie.mapper;

import com.mymovie.pojo.Comment;
import com.mymovie.pojo.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CommentMapper {
    int countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExampleWithRowbounds(CommentExample example, RowBounds rowBounds);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}