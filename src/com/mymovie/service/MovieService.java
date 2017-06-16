package com.mymovie.service;

import java.util.List;

import com.mymovie.pojo.Movie;


public interface MovieService {
	public int isExisted(int m_id);
	
    public List<Movie> getUserLike(String u_id);
    
    public List<Movie> getUserHaveSeen(String u_id);
    
    public int updateLike(String m_id, String m_name, String m_data, String u_id, String like);
    
    public int updateHaveSeen(String m_id, String m_name, String m_data, String u_id, String haveSeen);
}
