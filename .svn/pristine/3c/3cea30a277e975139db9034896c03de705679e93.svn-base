package com.luwei.hackvr.service;

import java.util.List;
import java.util.Map;

import com.luwei.hackvr.pojo.Toutiao;

public interface ToutiaoService {
    public int setToutiao(int id, int type); 
    public List<Toutiao> getShouyeToutiaos(int num);
    public Toutiao getShixunToutiao();
    public Toutiao getGuanchaToutiao();
    public Toutiao getYingshiToutiao();
    public Toutiao getYouxiToutiao();
    public Toutiao getToutiao(int type);
    public List<Toutiao> getZixunToutiaos(int num);
    public List<Toutiao> getShipinToutiaos(int num);
    public List<Toutiao> getYouxiToutiaos(int num);
    public List<Toutiao> getPcToutiaos(int num);
    public List<Toutiao> getAndroidToutiaos(int num);
    public List<Toutiao> getIosToutiaos(int num);
    public List<Toutiao> getToutiaos(int num, int type);
    
    
    public int addToutiao(Toutiao toutiao);
    public int updateToutiao(Toutiao toutiao);
    public int deleteToutiao(Integer id);
    public List<Map<String, Object>> getToutiaoByType(Byte type);
    public boolean setOrder(List<Integer> listId);
    public Toutiao getToutiaoById(Integer id);
}
