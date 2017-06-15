package com.luwei.hackvr.mapper;

import com.luwei.hackvr.pojo.DisplayDevice;
import com.luwei.hackvr.pojo.DisplayDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DisplayDeviceMapper {
    int countByExample(DisplayDeviceExample example);

    int deleteByExample(DisplayDeviceExample example);

    int deleteByPrimaryKey(Integer displayDeviceId);

    int insert(DisplayDevice record);

    int insertSelective(DisplayDevice record);

    List<DisplayDevice> selectByExampleWithRowbounds(DisplayDeviceExample example, RowBounds rowBounds);

    List<DisplayDevice> selectByExample(DisplayDeviceExample example);

    DisplayDevice selectByPrimaryKey(Integer displayDeviceId);

    int updateByExampleSelective(@Param("record") DisplayDevice record, @Param("example") DisplayDeviceExample example);

    int updateByExample(@Param("record") DisplayDevice record, @Param("example") DisplayDeviceExample example);

    int updateByPrimaryKeySelective(DisplayDevice record);

    int updateByPrimaryKey(DisplayDevice record);
}