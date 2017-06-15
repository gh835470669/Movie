package com.mymovie.service;


public interface MovieService {
	public int isExisted(int m_id);
	
    
    
    public int updateLike(String m_id, String m_name, String m_data, String u_id, String like);
    
    public int updateHaveSeen(String m_id, String m_name, String m_data, String u_id, String haveSeen);
}
