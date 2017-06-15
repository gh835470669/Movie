package com.luwei.hackvr.mapper;

import com.luwei.hackvr.pojo.DisplayDeviceMap;
import com.luwei.hackvr.pojo.DisplayDeviceMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DisplayDeviceMapMapper {
    int countByExample(DisplayDeviceMapExample example);

    int deleteByExample(DisplayDeviceMapExample example);

    int deleteByPrimaryKey(Integer displayDeviceMapperId);

    int insert(DisplayDeviceMap record);

    int insertSelective(DisplayDeviceMap record);

    List<DisplayDeviceMap> selectByExampleWithRowbounds(DisplayDeviceMapExample example, RowBounds rowBounds);

    List<DisplayDeviceMap> selectByExample(DisplayDeviceMapExample example);

    DisplayDeviceMap selectByPrimaryKey(Integer displayDeviceMapperId);

    int updateByExampleSelective(@Param("record") DisplayDeviceMap record, @Param("example") DisplayDeviceMapExample example);

    int updateByExample(@Param("record") DisplayDeviceMap record, @Param("example") DisplayDeviceMapExample example);

    int updateByPrimaryKeySelective(DisplayDeviceMap record);

    int updateByPrimaryKey(DisplayDeviceMap record);
}