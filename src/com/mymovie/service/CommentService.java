package com.mymovie.service;

import java.util.List;

import com.mymovie.pojo.Comment;



public interface CommentService {
	public int isExisted(int m_id, int u_id);
	
    public List<Comment> getUserComment(String u_id);
    
    
    public int updateComment(String m_id, String u_id, String comment);
    
    public int deleteComment(String m_id, String u_id);
    
}
