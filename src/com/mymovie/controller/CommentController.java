package com.mymovie.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mymovie.pojo.Comment;
import com.mymovie.pojo.Movie;
import com.mymovie.service.CommentService;
import com.mymovie.service.MovieService;





@Controller
@RequestMapping("/comment")
public class CommentController {
    
    @Autowired
    private CommentService commentService;
    
    @ResponseBody
    @RequestMapping("/new")
    public Map<String, Object> uploadComment(
            @RequestParam(value="m_id") String m_id,
            @RequestParam(value="u_id") String u_id,
            @RequestParam(value="comment") String comment,
            HttpServletRequest request,
            HttpServletResponse response) {
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	int n = commentService.updateComment(m_id, u_id, comment);
    	if (n > 0) {
    		map.put("state", "success");
    	} else {
    		map.put("state", "fail");
    	}
    	
		return map;
    }
    
    @ResponseBody
    @RequestMapping("/getAll")
    public Map<String, Object> getUserLike(
            @RequestParam(value="u_id") String u_id,
            HttpServletRequest request,
            HttpServletResponse response) {
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	List<Comment> comments = commentService.getUserComment(u_id);
    	
    	if (comments == null) {
    		map.put("state", "fail");
    	} else {
    		map.put("state", "success");
    		map.put("data", comments);
    	}
    	
		return map;
    }
    
    @ResponseBody
    @RequestMapping("/delete")
    public Map<String, Object> updateHaveSeen(
            @RequestParam(value="m_id") String m_id,
            @RequestParam(value="u_id") String u_id,
            HttpServletRequest request,
            HttpServletResponse response) {
    	Map<String, Object> map = new HashMap<String, Object>();
    	int n = commentService.deleteComment(m_id, u_id);
    	if (n > 0) {
    		map.put("state", "success");
    	} else {
    		map.put("state", "fail");
    	}
    	
		return map;
    }
    
}
