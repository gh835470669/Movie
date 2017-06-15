package com.luwei.hackvr.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luwei.hackvr.mapper.GameTypeMapper;
import com.luwei.hackvr.pojo.GameType;
import com.luwei.hackvr.pojo.GameTypeExample;
import com.luwei.hackvr.service.GameTypeService;

@Service("gameTypeService")
public class GameTypeServiceImpl implements GameTypeService {

    @Autowired
    GameTypeMapper gameTypeMapper;
    
    @Override
    public List<GameType> getGameTypes() {
        GameTypeExample gameTypeExample = new GameTypeExample();
        gameTypeExample.setOrderByClause("game_type_id asc");
        gameTypeExample.createCriteria().andFlagEqualTo((byte)1);
        
        List<GameType> retList = gameTypeMapper.selectByExample(gameTypeExample);
        
        if (CollectionUtils.isEmpty(retList)) {
            return null;
        }
        
        return retList;
    }
    
    @Override
    public List<Map<String, String>> getGameTypesWithExtent() {
        GameTypeExample gameTypeExample = new GameTypeExample();
        gameTypeExample.setOrderByClause("game_type_id asc");
        gameTypeExample.createCriteria().andFlagEqualTo((byte)1);
        
        List<GameType> retList = gameTypeMapper.selectByExample(gameTypeExample);
        
        List<Map<String, String>> result = new ArrayList<Map<String, String>>();
        Map<String, String> retMap = new HashMap<String, String>();
        retMap.put("name", "全部");
        retMap.put("url", "all");
        result.add(retMap);
        
        for (GameType gameType : retList) {
            retMap.clear();
            retMap.put("name", gameType.getGameTypeName());
            retMap.put("url", gameType.getUrlName());
            result.add(retMap);
        }
        
        retMap.clear();
        retMap.put("name", "其他");
        retMap.put("url", "typeothers");
        result.add(retMap);
        
        return result;
    }

}
