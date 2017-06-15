package com.luwei.hackvr.service;

import java.util.List;
import java.util.Map;

import com.luwei.hackvr.pojo.Game;

public interface GameService {
    public List<Map<String, Object>> getToutiaoGames(int num);
    public List<Map<String, Object>> getTuijieGames(int num, String type);
    public Map<String, Object> getLateGames(int index, int num);
    public Map<String, Object> getLateGames(int index, int num, String type, String system, String device);
    public List<Game> getPaihangGames(int index, int num);
    public List<Game> getPaihangGamesBySystem(int index, int num, String type);
    public Game getGameById(int id);
    public List<Game> getRemenGames(int index, int num);
    public List<Game> getRemenGamesByType(int index, int num, String type);
    
    public int initGameTypeMap();
    public int initDisplayDeviceMap();
}
