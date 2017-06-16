package com.mymovie.serviceImpl;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymovie.mapper.CommentMapper;
import com.mymovie.pojo.Comment;
import com.mymovie.pojo.CommentExample;
import com.mymovie.service.CommentService;



@Service("commentService")
public class CommentServiceImpl implements CommentService{
    
    @Autowired
    private CommentMapper CommentMapper;
    
    @Override
    public List<Comment> getUserComment(String u_id) {
    	if (u_id == null || u_id.length() == 0) return null;
    	int uId = Integer.parseInt(u_id);
    	CommentExample example = new CommentExample();
    	example.createCriteria().andUIdEqualTo(uId).andFlagEqualTo(1);
    	List<Comment> Comments = CommentMapper.selectByExample(example);
    	
    	return Comments;
    }
    
    
    @Override
    public int updateComment(String m_id, String u_id, String comment) {
    	if (m_id == null || u_id == null) return 0;
    	if (m_id.length()==0 || u_id.length()==0) return 0;
    	
    	int mId = Integer.parseInt(m_id);
    	int uId = Integer.parseInt(u_id);
    	
    	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    	String t =  formatter.format(System.currentTimeMillis());
    	Comment record = new Comment();
    	record.setComment(comment);
    	record.setmId(mId);
    	record.setuId(uId);
    	record.setDate(t);
    	record.setFlag(1);
		
    	if (isExisted(mId, uId) > 0) {
			CommentExample example = new CommentExample();
	    	example.createCriteria().andMIdEqualTo(mId).andUIdEqualTo(uId);
			return CommentMapper.updateByExampleSelective(record, example);
		} else {
			return CommentMapper.insertSelective(record);
		}
    }
    
    @Override
    public int deleteComment(String m_id, String u_id) {
    	if (m_id == null || u_id == null) return 0;
    	if (m_id.length()==0 || u_id.length()==0) return 0;
    	
    	int mId = Integer.parseInt(m_id);
    	int uId = Integer.parseInt(u_id);
    	
    	if (isExisted(mId, uId) > 0) {
    		Comment record = new Comment();
        	record.setFlag(0);
    		CommentExample example = new CommentExample();
    		example.createCriteria().andMIdEqualTo(mId).andUIdEqualTo(uId);
    		return CommentMapper.updateByExampleSelective(record, example);
    	} else {
    		return 0;
    	}
    }
	
    @Override
    public int isExisted(int m_id, int u_id) {
    	CommentExample example = new CommentExample();
    	example.createCriteria().andMIdEqualTo(m_id).andUIdEqualTo(u_id);
    	return CommentMapper.countByExample(example);
    }
    
}
