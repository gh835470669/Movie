package com.luwei.hackvr.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luwei.hackvr.mapper.ToutiaoMapper;
import com.luwei.hackvr.mapper.UserMapper;
import com.luwei.hackvr.pojo.Toutiao;
import com.luwei.hackvr.pojo.ToutiaoExample;
import com.luwei.hackvr.service.ToutiaoService;
import com.luwei.hackvr.utils.BeansUtils;

@Service("toutiaoService")
public class ToutiaoServiceImpl implements ToutiaoService {
    @Autowired
    private ToutiaoMapper toutiaoMapper;

    @Override 
    public List<Toutiao> getShouyeToutiaos(int num) {
        return getToutiaos(num, 0);
    }
    
    @Override
    public Toutiao getShixunToutiao() {
        return getToutiao(1);
    }

    @Override
    public Toutiao getGuanchaToutiao() {
        return getToutiao(2);
    }

    @Override
    public Toutiao getYouxiToutiao() {
        return getToutiao(3);
    }

    @Override
    public Toutiao getYingshiToutiao() {
        return getToutiao(4);
    }

    @Override
    public Toutiao getToutiao(int type) {
        ToutiaoExample example = new ToutiaoExample();
        example.createCriteria().andTypeEqualTo((byte)type).andFlagEqualTo((byte)1);
        List<Toutiao> toutiaos = toutiaoMapper.selectByExample(example);
        
        if (CollectionUtils.isEmpty(toutiaos)) {
            return null;
        }
        
        return toutiaos.get(0);
    }
    
    @Override
    public List<Toutiao> getZixunToutiaos(int num) {
        return getToutiaos(num, 5);
    }
    
    @Override
    public List<Toutiao> getShipinToutiaos(int num) {
        return getToutiaos(num, 6);
    }
    
    @Override
    public List<Toutiao> getYouxiToutiaos(int num) {
        return getToutiaos(num, 7);
    }
    
    @Override
    public List<Toutiao> getPcToutiaos(int num) {
        return getToutiaos(num, 8);
    }
    
    @Override
    public List<Toutiao> getIosToutiaos(int num) {
        return getToutiaos(num, 9);
    }
    
    @Override
    public List<Toutiao> getAndroidToutiaos(int num) {
        return getToutiaos(num, 10);
    }
    
    @Override
    public List<Toutiao> getToutiaos(int num, int type) {
        ToutiaoExample example = new ToutiaoExample();
        example.setOrderByClause("sort desc");
        example.createCriteria().andFlagEqualTo((byte)1).andTypeEqualTo((byte)type);
        RowBounds rowBounds = new RowBounds(0, num);
        List<Toutiao> toutiaos = toutiaoMapper.selectByExampleWithRowbounds(example, rowBounds);
        
        if (CollectionUtils.isEmpty(toutiaos)) {
            return null;
        }
        
        return toutiaos;
    }
    
    
    @Override
    @Transactional
    public int setToutiao(int id, int type) {
        ToutiaoExample example = new ToutiaoExample();
        example.createCriteria().andTypeEqualTo((byte)type).andFlagEqualTo((byte)1);
        List<Toutiao> toutiaos = toutiaoMapper.selectByExample(example);
        Toutiao record = toutiaos.get(0);
        record.setFlag((byte)0);
        int affectedCount = toutiaoMapper.updateByExampleSelective(record, example);
        if (affectedCount == 0) {
            throw new RuntimeException("更新头条A出错");
        }
        record.setArticleId(id);
        record.setFlag((byte)1);
        int affectedCount2 = toutiaoMapper.insert(record);
        if (affectedCount2 == 0) {
            throw new RuntimeException("更新头条A出错");
        }
        if (affectedCount == 1 && affectedCount2 == 1) {
            return 1;
        } else {
            return 0;
        }
    }@Override
    public int addToutiao(Toutiao toutiao) {
        return toutiaoMapper.insertSelective(toutiao);
    }

    @Override
    public int updateToutiao(Toutiao toutiao) {
        return toutiaoMapper.updateByPrimaryKeySelective(toutiao);
    }

    @Override
    public int deleteToutiao(Integer id) {
        Toutiao toutiao = toutiaoMapper.selectByPrimaryKey(id);
        toutiao.setFlag((byte) 0);
        return updateToutiao(toutiao);
    }

    // 根据类别来获取头条新闻，获取一整类
    @Override
    public List<Map<String, Object>> getToutiaoByType(Byte type) {
        ToutiaoExample toutiaoExample = new ToutiaoExample();
        toutiaoExample.setOrderByClause("sort asc");
        toutiaoExample.createCriteria().andTypeEqualTo(type).andFlagEqualTo((byte)1);
        List<Toutiao> toutiaoList = toutiaoMapper
                .selectByExample(toutiaoExample);
        if (CollectionUtils.isEmpty(toutiaoList)) {
            return new ArrayList<Map<String, Object>>();
        }
        List<Map<String, Object>> retList = new ArrayList<Map<String, Object>>();
        for (Toutiao toutiao : toutiaoList) {
            Map<String, Object> map = BeansUtils.transBean2Map(toutiao);
            retList.add(map);
        }
        return retList;
    }

    // 设置头条的排序
    @Override
    public boolean setOrder(List<Integer> listId) {
        int ret = 0;
        for (int i = 0; i < listId.size(); i++) {
            Toutiao toutiao = toutiaoMapper.selectByPrimaryKey(listId.get(i));
            toutiao.setSort(i);
            ret = ret + updateToutiao(toutiao);
        }
        return ret == listId.size() && ret != 0;
    }

    @Override
    public Toutiao getToutiaoById(Integer id) {
        return toutiaoMapper.selectByPrimaryKey(id);
    }
}

