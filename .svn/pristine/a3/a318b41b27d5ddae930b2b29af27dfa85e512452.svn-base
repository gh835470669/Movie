package com.luwei.hackvr.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luwei.hackvr.mapper.DisplayDeviceMapper;
import com.luwei.hackvr.pojo.DisplayDevice;
import com.luwei.hackvr.pojo.DisplayDeviceExample;
import com.luwei.hackvr.pojo.GameType;
import com.luwei.hackvr.service.DisplayDeviceService;

@Service("displayDeviceService")
public class DisplayDeviceServiceImpl implements DisplayDeviceService {

    @Autowired
    DisplayDeviceMapper displayDeviceMapper;
    
    @Override
    public List<DisplayDevice> getDisplayDevices() {
        DisplayDeviceExample displayDeviceExample = new DisplayDeviceExample();
        displayDeviceExample.setOrderByClause("display_device_id asc");
        displayDeviceExample.createCriteria().andFlagEqualTo((byte)1);
        
        List<DisplayDevice> displayDevices = displayDeviceMapper.selectByExample(displayDeviceExample);
        
        if (CollectionUtils.isEmpty(displayDevices)) {
            return null;
        }
        
        return displayDevices;
    }

    @Override
    public List<Map<String, String>> getDisplayDeviceWithExtent() {
        DisplayDeviceExample displayDeviceExample = new DisplayDeviceExample();
        displayDeviceExample.setOrderByClause("display_device_id asc");
        displayDeviceExample.createCriteria().andFlagEqualTo((byte)1);
        
        List<DisplayDevice> displayDevices = displayDeviceMapper.selectByExample(displayDeviceExample);

        List<Map<String, String>> result = new ArrayList<Map<String, String>>();
        Map<String, String> retMap = new HashMap<String, String>();
        retMap.put("name", "全部");
        retMap.put("url", "all");
        result.add(retMap);
        
        for (DisplayDevice displayDevice : displayDevices) {
            retMap.clear();
            retMap.put("name", displayDevice.getDisplayDeciveName());
            retMap.put("url", displayDevice.getUrlName());
            result.add(retMap);
        }
        
        retMap.clear();
        retMap.put("name", "其他");
        retMap.put("url", "deviceothers");
        result.add(retMap);
        
        return result;
    }
    
}
