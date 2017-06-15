package com.luwei.hackvr.mapper;

import com.luwei.hackvr.pojo.Article_pool;
import com.luwei.hackvr.pojo.Article_poolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Article_poolMapper {
    int countByExample(Article_poolExample example);

    int deleteByExample(Article_poolExample example);

    int deleteByPrimaryKey(Integer articleId);

    int insert(Article_pool record);

    int insertSelective(Article_pool record);

    List<Article_pool> selectByExampleWithBLOBsWithRowbounds(Article_poolExample example, RowBounds rowBounds);

    List<Article_pool> selectByExampleWithBLOBs(Article_poolExample example);

    List<Article_pool> selectByExampleWithRowbounds(Article_poolExample example, RowBounds rowBounds);

    List<Article_pool> selectByExample(Article_poolExample example);

    Article_pool selectByPrimaryKey(Integer articleId);

    int updateByExampleSelective(@Param("record") Article_pool record, @Param("example") Article_poolExample example);

    int updateByExampleWithBLOBs(@Param("record") Article_pool record, @Param("example") Article_poolExample example);

    int updateByExample(@Param("record") Article_pool record, @Param("example") Article_poolExample example);

    int updateByPrimaryKeySelective(Article_pool record);

    int updateByPrimaryKeyWithBLOBs(Article_pool record);

    int updateByPrimaryKey(Article_pool record);
}