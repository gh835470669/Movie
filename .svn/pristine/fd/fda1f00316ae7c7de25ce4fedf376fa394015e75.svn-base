 package com.luwei.hackvr.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.inject.New;

import org.apache.commons.collections.CollectionUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luwei.hackvr.mapper.GameMapper;
import com.luwei.hackvr.mapper.GameTypeMapMapper;
import com.luwei.hackvr.mapper.GameTypeMapper;
import com.luwei.hackvr.mapper.DisplayDeviceMapper;
import com.luwei.hackvr.mapper.DisplayDeviceMapMapper;
import com.luwei.hackvr.pojo.DisplayDevice;
import com.luwei.hackvr.pojo.Game;
import com.luwei.hackvr.pojo.GameExample;
import com.luwei.hackvr.pojo.GameType;
import com.luwei.hackvr.pojo.GameTypeExample;
import com.luwei.hackvr.pojo.GameTypeMap;
import com.luwei.hackvr.pojo.GameTypeMapExample;
import com.luwei.hackvr.pojo.DisplayDeviceExample;
import com.luwei.hackvr.pojo.DisplayDeviceMap;
import com.luwei.hackvr.pojo.DisplayDeviceMapExample;
import com.luwei.hackvr.pojo.Toutiao;
import com.luwei.hackvr.service.GameService;
import com.luwei.hackvr.service.ToutiaoService;
import com.luwei.hackvr.utils.ConstantUtils;

@Service("gameService")
public class GameServiceImpl implements GameService {

    @Autowired
    GameMapper gameMapper;
    
    @Autowired
    GameTypeMapper gameTypeMapper;
    
    @Autowired
    GameTypeMapMapper gameTypeMapMapper;
    
    @Autowired
    DisplayDeviceMapper displayDeviceMapper;
    
    @Autowired
    DisplayDeviceMapMapper displayDeviceMapMapper;

    @Autowired 
    private ToutiaoService toutiaoService;
    
    @Override
    public List<Map<String, Object>> getToutiaoGames(int num) {
        List<Toutiao> toutiaos = toutiaoService.getYouxiToutiaos(num);
        
        if (CollectionUtils.isEmpty(toutiaos)) {
            return null;
        }
        
        List<Map<String, Object>> retList = new ArrayList<Map<String, Object>>();
        for (Toutiao toutiao : toutiaos) {
            Map<String, Object> map = new HashMap<String, Object>();
            Game game = gameMapper.selectByPrimaryKey(toutiao.getArticleId());
            map.put("gameId", game.getGameId());
            map.put("title", game.getTitle());
            map.put("type", game.getType());
            map.put("createTime", game.getCreateTime());
            map.put("preimage", toutiao.getImgUrl());
            
            retList.add(map);
        }

        return retList;
    }
    
    
//    type: pc; ios; android
    @Override
    public List<Map<String, Object>> getTuijieGames(int num, String type) {
        List<Toutiao> toutiaos = new ArrayList<Toutiao>();
        if (type.equals("pc")) {
            toutiaos = toutiaoService.getPcToutiaos(num);
        } else if (type.equals("ios")) {
            toutiaos = toutiaoService.getIosToutiaos(num);
        } else if (type.equals("android")) {
            toutiaos = toutiaoService.getAndroidToutiaos(num);
        } else {
            return null;
        }
        
        if (CollectionUtils.isEmpty(toutiaos)) {
            return null;
        }
        
        List<Map<String, Object>> retList = new ArrayList<Map<String, Object>>();
        for (Toutiao toutiao : toutiaos) {
            Map<String, Object> map = new HashMap<String, Object>();
            Game game = gameMapper.selectByPrimaryKey(toutiao.getArticleId());
            map.put("gameId", game.getGameId());
            map.put("title", game.getTitle());
            map.put("type", game.getType());
            map.put("createTime", game.getCreateTime());
            map.put("preimage", toutiao.getImgUrl());
            
            retList.add(map);
        }

        return retList;
    }
    
    @Override
    public Map<String, Object> getLateGames(int index, int num) {
        GameExample example = new GameExample();
        example.setOrderByClause("create_time desc");
        example.createCriteria().andFlagEqualTo((byte)1);
        
        RowBounds rowBounds = new RowBounds(index, num);
        List<Game> gameList = gameMapper.selectByExampleWithBLOBsWithRowbounds(example, rowBounds);

        int count = gameMapper.countByExample(example);
        Map<String, Object> retMap = new HashMap<String,Object>();
        retMap.put("amount", count);
        retMap.put("dataList", gameList);
        
        return retMap;
    }

    @Override
    public Map<String, Object> getLateGames(int index, int num, String type, String system, String device) {
        Map<String, Object> retMap = new HashMap<String,Object>();
        
//      按类型获取
        List<Integer> gameIdListByType = new ArrayList<Integer>();
        if (type == "全部") {
            GameExample example = new GameExample();
            example.createCriteria().andFlagEqualTo((byte)1);
            List<Game> gameList = gameMapper.selectByExample(example);
            for (Game game : gameList) {
                gameIdListByType.add(game.getGameId());
            }
        } else if (type == "其他") {
            GameExample example = new GameExample();
            com.luwei.hackvr.pojo.GameExample.Criteria criteriaTmp = example.createCriteria().andFlagEqualTo((byte)1);
//            for (int i = 1; i < ConstantUtils.gameTypeStore.length; i++) {
//                criteriaTmp.andTypeNotLike(ConstantUtils.gameTypeStore[i]);
//            }
            criteriaTmp.andTypeEqualTo(type);
            List<Game> gameList = gameMapper.selectByExample(example);
            for (Game game : gameList) {
                gameIdListByType.add(game.getGameId());
            }
        } else {
            GameTypeExample typeExample = new GameTypeExample();
            typeExample.createCriteria().andFlagEqualTo((byte)1).andGameTypeNameEqualTo(type);
            if (gameTypeMapper.countByExample(typeExample) > 0) {
                int gameTypeId = gameTypeMapper.selectByExample(typeExample).get(0).getGameTypeId();
                
                GameTypeMapExample gameTypeMapExample = new GameTypeMapExample();
                gameTypeMapExample.createCriteria().andFlagEqualTo((byte)1).andGameTypeIdEqualTo(gameTypeId);
                List<GameTypeMap> gameTypeMaps = gameTypeMapMapper.selectByExample(gameTypeMapExample);

                for (GameTypeMap tmp : gameTypeMaps) {
                    gameIdListByType.add(tmp.getGameId());
                }
            }
        }

//      按显示设备获取
        List<Integer> gameIdListByDevice = new ArrayList<Integer>();
        if (device == "全部") {
            GameExample example = new GameExample();
            example.createCriteria().andFlagEqualTo((byte)1);
            List<Game> gameList = gameMapper.selectByExample(example);
            for (Game game : gameList) {
                gameIdListByDevice.add(game.getGameId());
            }
        } else if (device == "其他") {
            GameExample example = new GameExample();
            com.luwei.hackvr.pojo.GameExample.Criteria criteriaTmp = example.createCriteria().andFlagEqualTo((byte)1);
            for (int i = 1; i < ConstantUtils.deviceTypeStore.length; i++) {
                criteriaTmp.andDisplayDeviceNotLike(ConstantUtils.deviceTypeStore[i]);
            }
            List<Game> gameList = gameMapper.selectByExample(example);
            for (Game game : gameList) {
                gameIdListByDevice.add(game.getGameId());
            }
        } else {
            DisplayDeviceExample deviceExample = new DisplayDeviceExample();
            deviceExample.createCriteria().andFlagEqualTo((byte)1).andDisplayDeciveNameEqualTo(device);
            if (displayDeviceMapper.countByExample(deviceExample) > 0) {
                int displayDeviceId = displayDeviceMapper.selectByExample(deviceExample).get(0).getDisplayDeviceId();
                
                
                DisplayDeviceMapExample displayDeviceMapExample = new DisplayDeviceMapExample();
                displayDeviceMapExample.createCriteria().andFlagEqualTo((byte)1).andDisplayDeviceIdEqualTo(displayDeviceId);
                List<DisplayDeviceMap> displayDeviceMaps = displayDeviceMapMapper.selectByExample(displayDeviceMapExample);
                
                for (DisplayDeviceMap tmp : displayDeviceMaps) {
                    gameIdListByDevice.add(tmp.getGameId());
                }
            }
        }
        
//      按系统获取
        int systemType = -1;
        if (system.equals("pc")) {
            systemType = 1;
        } else if (system.equals("android")) {
            systemType = 2;
        } else if (system.equals("ios")) {
            systemType = 3;
        } else if (system.equals("playstation")) {
            systemType = 4;
        } else if (system.equals("systemothers")) {
            systemType = 0;
        }

        List<Integer> gameIdList = new ArrayList<Integer>();
        gameIdListByType.retainAll(gameIdListByDevice);
        gameIdList = gameIdListByType;
        
        GameExample example = new GameExample();
        com.luwei.hackvr.pojo.GameExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("create_time desc");
        if (gameIdList.size() <= 0) {
            retMap.put("amount", 0);
            retMap.put("dataList", new ArrayList<Game>());
            return retMap;
        } else if (system == "all") {
            criteria.andFlagEqualTo((byte)1).andGameIdIn(gameIdList);
        } else if (systemType == -1) {
            retMap.put("amount", 0);
            retMap.put("dataList", new ArrayList<Game>());
            return retMap;
        } else {
            criteria.andFlagEqualTo((byte)1).andGameIdIn(gameIdList).andSystemEqualTo(systemType);
        }
        
        RowBounds rowBounds = new RowBounds(index, num);
        List<Game> gameList = gameMapper.selectByExampleWithBLOBsWithRowbounds(example, rowBounds);
        
        int count = gameMapper.countByExample(example);
        retMap.put("amount", count);
        retMap.put("dataList", gameList);
        
        return retMap;
    }
    
    @Override
    public List<Game> getPaihangGames(int index, int num) {
        GameExample example = new GameExample();
        example.setOrderByClause("download_num desc");
        example.createCriteria().andFlagEqualTo((byte)1);
        
        RowBounds rowBounds = new RowBounds(index, num);
        List<Game> gameList = gameMapper.selectByExampleWithBLOBsWithRowbounds(example, rowBounds);
        
        if (CollectionUtils.isEmpty(gameList)) {
            return new ArrayList<Game>();
        }
        
        return gameList;
    }
    
    @Override
    public List<Game> getPaihangGamesBySystem(int index, int num, String type) {
        int gameType = -1;
        if (type.equals("pc")) {
            gameType = 1;
        } else if (type.equals("android")) {
            gameType = 2;
        } else if (type.equals("ios")) {
            gameType = 3;
        } else if (type.equals("playstation")) {
            gameType = 4;
        }
        if (gameType == -1) {
            return new ArrayList<Game>();
        }
        
        GameExample example = new GameExample();
        example.setOrderByClause("download_num desc");
        example.createCriteria().andFlagEqualTo((byte)1).andSystemEqualTo(gameType);
        
        RowBounds rowBounds = new RowBounds(index, num);
        List<Game> gameList = gameMapper.selectByExampleWithBLOBsWithRowbounds(example, rowBounds);
        
        if (CollectionUtils.isEmpty(gameList)) {
            return new ArrayList<Game>();
        }
        
        return gameList;
    }
    
    @Override
    public Game getGameById(int id) {
        Game game = gameMapper.selectByPrimaryKey(id);
        if (game != null) {
            game.setDisplayDevice(game.getDisplayDevice().replace("|", " "));
            game.setControlDevice(game.getControlDevice().replace("|", " "));
        }
        
        return game;
    }

    @Override
    public List<Game> getRemenGames(int index, int num) {
        GameExample example = new GameExample();
        example.setOrderByClause("download_num desc");
        example.createCriteria().andFlagEqualTo((byte)1);
        
        RowBounds rowBounds = new RowBounds(index, num);
        List<Game> gameList = gameMapper.selectByExampleWithBLOBsWithRowbounds(example, rowBounds);
        
        if (CollectionUtils.isEmpty(gameList)) {
            return new ArrayList<Game>();
        }
        
        return gameList;
    }

    @Override
    public List<Game> getRemenGamesByType(int index, int num, String type) {
        GameTypeExample typeExample = new GameTypeExample();
        typeExample.createCriteria().andFlagEqualTo((byte)1).andGameTypeNameEqualTo(type);
        if (gameTypeMapper.countByExample(typeExample) == 0) {
            return new ArrayList<Game>();
        }
        int gameTypeId = gameTypeMapper.selectByExample(typeExample).get(0).getGameTypeId();
        
        GameTypeMapExample gameTypeMapExample = new GameTypeMapExample();
        gameTypeMapExample.createCriteria().andFlagEqualTo((byte)1).andGameTypeIdEqualTo(gameTypeId);
        List<GameTypeMap> gameTypeMaps = gameTypeMapMapper.selectByExample(gameTypeMapExample);
        
        if (CollectionUtils.isEmpty(gameTypeMaps)) {
            return new ArrayList<Game>();
        }
        
        List<Integer> gameIdList = new ArrayList<Integer>();
        for (GameTypeMap tmp : gameTypeMaps) {
            gameIdList.add(tmp.getGameId());
        }
        
        GameExample example = new GameExample();
        example.setOrderByClause("download_num desc");
        example.createCriteria().andFlagEqualTo((byte)1).andGameIdIn(gameIdList);
        
        RowBounds rowBounds = new RowBounds(index, num);
        List<Game> gameList = gameMapper.selectByExampleWithBLOBsWithRowbounds(example, rowBounds);
        
        if (CollectionUtils.isEmpty(gameList)) {
            return new ArrayList<Game>();
        }
        
        return gameList;
    }

    @Autowired
    public int initGameTypeMap() {
        GameExample gameExample = new GameExample();
        gameExample.createCriteria();
        List<Game> gameList = gameMapper.selectByExample(gameExample);
        int affectCount = 1;
        for (int i = 1; i < ConstantUtils.gameTypeStore.length-1; i++) {
            GameTypeExample gameTypeExample = new GameTypeExample();
            gameTypeExample.clear();
            gameTypeExample.createCriteria().andFlagEqualTo((byte)1).andGameTypeNameEqualTo(ConstantUtils.gameTypeStore[i]);
            if (gameTypeMapper.countByExample(gameTypeExample) > 0) {
                continue;
            }
            
            
            GameType gameType = new GameType();
            gameType.setGameTypeName(ConstantUtils.gameTypeStore[i]);
            gameType.setUrlName(ConstantUtils.gameType[i]);
            affectCount = gameTypeMapper.insertSelective(gameType);
            if (affectCount == 0) {
                throw new RuntimeException("插入失败");
            }
            
            for (Game game : gameList) {
                GameTypeMap gameTypeMap = new GameTypeMap();
                if (game.getType().contains(ConstantUtils.gameTypeStore[i])) {
                    gameTypeMap.setGameId(game.getGameId());
                    gameTypeMap.setGameTypeId(gameType.getGameTypeId());
                    affectCount = gameTypeMapMapper.insertSelective(gameTypeMap);
                    if (affectCount == 0) {
                        throw new RuntimeException("插入失败");
                    }
                }
            }
            
        }
        return affectCount;
    }
    
    @Autowired
    public int initDisplayDeviceMap() {
        GameExample gameExample = new GameExample();
        gameExample.createCriteria();
        List<Game> gameList = gameMapper.selectByExample(gameExample);
        int affectCount = 1;
        for (int i = 1; i < ConstantUtils.deviceTypeStore.length-1; i++) {
            DisplayDeviceExample displayDeviceExample = new DisplayDeviceExample();
            displayDeviceExample.clear();
            displayDeviceExample.createCriteria().andFlagEqualTo((byte)1).andDisplayDeciveNameEqualTo(ConstantUtils.deviceTypeStore[i]);
            if (displayDeviceMapper.countByExample(displayDeviceExample) > 0) {
                continue;
            }
            
            DisplayDevice displayDevice = new DisplayDevice();
            displayDevice.setDisplayDeciveName(ConstantUtils.deviceTypeStore[i]);
            displayDevice.setUrlName(ConstantUtils.deviceType[i]);
            affectCount = displayDeviceMapper.insertSelective(displayDevice);
            if (affectCount == 0) {
                throw new RuntimeException("插入失败");
            }
            
            for (Game game : gameList) {
                DisplayDeviceMap displayDeviceMap = new DisplayDeviceMap();
                if (game.getDisplayDevice().contains(ConstantUtils.deviceTypeStore[i])) {
                    displayDeviceMap.setGameId(game.getGameId());
                    displayDeviceMap.setDisplayDeviceId(displayDevice.getDisplayDeviceId());
                    affectCount = displayDeviceMapMapper.insertSelective(displayDeviceMap);
                    if (affectCount == 0) {
                        throw new RuntimeException("插入失败");
                    }
                }
            }
            
        }
        return affectCount;
    }
    
}
