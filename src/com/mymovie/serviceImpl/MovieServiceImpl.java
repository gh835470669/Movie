package com.mymovie.serviceImpl;


import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymovie.mapper.MovieMapper;
import com.mymovie.pojo.Movie;
import com.mymovie.pojo.MovieExample;
import com.mymovie.service.MovieService;



@Service("movieService")
public class MovieServiceImpl implements MovieService{
    
    @Autowired
    private MovieMapper movieMapper;
    
    @Override
    public List<Movie> getUserLike(String u_id) {
    	if (u_id == null || u_id.length() == 0) return null;
    	int uId = Integer.parseInt(u_id);
    	MovieExample example = new MovieExample();
    	example.createCriteria().andUIdEqualTo(uId).andUserLikeEqualTo(1);
    	List<Movie> movies = movieMapper.selectByExample(example);
    	
    	return movies;
    }
    
    @Override
    public List<Movie> getUserHaveSeen(String u_id) {
    	if (u_id == null || u_id.length() == 0) return null;
    	int uId = Integer.parseInt(u_id);
    	MovieExample example = new MovieExample();
    	example.createCriteria().andUIdEqualTo(uId).andHaveSeenEqualTo(1);
    	List<Movie> movies = movieMapper.selectByExample(example);
    	
    	return movies;
    }
    
    @Override
    public int updateLike(String m_id, String m_name, String m_data, String u_id, String like) {
    	if (m_id == null || u_id == null) return 0;
    	if (m_id.length()==0 || u_id.length()==0) return 0;
    	
    	int mId = Integer.parseInt(m_id);
    	int uId = Integer.parseInt(u_id);
    	Movie record = new Movie();
		record.setData(m_data);
		record.setmId(mId);
		record.setmName(m_name);
		record.setuId(uId);
		
    	if (StringUtils.equals(like, "1")) {
			record.setUserLike(1);
    	} else {
    		record.setUserLike(0);
    	}
    	if (isExisted(mId) > 0) {
			MovieExample example = new MovieExample();
	    	example.createCriteria().andMIdEqualTo(mId);
			return movieMapper.updateByExampleSelective(record, example);
		} else {
			return movieMapper.insertSelective(record);
		}
    }
    
    @Override
    public int updateHaveSeen(String m_id, String m_name, String m_data, String u_id, String haveSeen) {
    	if (m_id == null || u_id == null) return 0;
    	if (m_id.length()==0 || u_id.length()==0) return 0;
    	
    	int mId = Integer.parseInt(m_id);
    	int uId = Integer.parseInt(u_id);
    	Movie record = new Movie();
		record.setData(m_data);
		record.setmId(mId);
		record.setmName(m_name);
		record.setuId(uId);
    	if (StringUtils.equals(haveSeen, "1")) {
			record.setHaveSeen(1);
    	} else {
    		record.setHaveSeen(0);
    	}
    	if (isExisted(mId) > 0) {
			MovieExample example = new MovieExample();
	    	example.createCriteria().andMIdEqualTo(mId);
			return movieMapper.updateByExampleSelective(record, example);
		} else {
			return movieMapper.insertSelective(record);
		}
    }
	
    @Override
    public int isExisted(int m_id) {
    	MovieExample example = new MovieExample();
    	example.createCriteria().andMIdEqualTo(m_id);
    	return movieMapper.countByExample(example);
    }
    
}
