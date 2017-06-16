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

import com.mymovie.pojo.Movie;
import com.mymovie.service.MovieService;





@Controller
@RequestMapping("/movie")
public class MovieController {
    //private static Logger logger = Logger.getLogger(JsonController.class);
    
    
    @Autowired
    private MovieService movieService;
    
    @RequestMapping(value = {"/","/index", ""})
    public String index(Map<String, Object> model){
      // ֱ�ӷ����ַ��������Ĭ�ϻ�ȥ spring.view.prefix Ŀ¼�µ� ��indexƴ��spring.view.suffix��ҳ��
      // ����Ϊ /WEB-INF/jsp/index.jsp
      model.put("time", "aa");
      model.put("message", "cc");
      return "index";
    }
    
    @ResponseBody
    @RequestMapping("/like")
    public Map<String, Object> updateLike(
    		@RequestParam(value="m_name") String m_name,
            @RequestParam(value="m_id") String m_id,
            @RequestParam(value="m_data") String m_data,
            @RequestParam(value="u_id") String u_id,
            @RequestParam(value="like") String like,
            HttpServletRequest request,
            HttpServletResponse response) {
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	int n = movieService.updateLike(m_id, m_name, m_data, u_id, like);
    	if (n > 0) {
    		map.put("state", "success");
    	} else {
    		map.put("state", "fail");
    	}
    	//System.out.println(m_data+"\n");
    	
		return map;
    }
    
    @ResponseBody
    @RequestMapping("/getUserLike")
    public Map<String, Object> getUserLike(
            @RequestParam(value="u_id") String u_id,
            HttpServletRequest request,
            HttpServletResponse response) {
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	List<Movie> movies = movieService.getUserLike(u_id);
    	
    	if (movies == null) {
    		map.put("state", "fail");
    	} else {
    		map.put("state", "success");
    		map.put("data", movies);
    	}
    	//System.out.println(m_data+"\n");
    	
		return map;
    }
    
    @ResponseBody
    @RequestMapping("/haveSeen")
    public Map<String, Object> updateHaveSeen(
    		@RequestParam(value="m_name") String m_name,
            @RequestParam(value="m_id") String m_id,
            @RequestParam(value="m_data") String m_data,
            @RequestParam(value="u_id") String u_id,
            @RequestParam(value="haveSeen") String haveSeen,
            HttpServletRequest request,
            HttpServletResponse response) {
    	Map<String, Object> map = new HashMap<String, Object>();
    	int n = movieService.updateHaveSeen(m_id, m_name, m_data, u_id, haveSeen);
    	if (n > 0) {
    		map.put("state", "success");
    	} else {
    		map.put("state", "fail");
    	}
    	
		return map;
    }
    
    @ResponseBody
    @RequestMapping("/getUserHaveSeen")
    public Map<String, Object> getUserHaveSeen(
            @RequestParam(value="u_id") String u_id,
            HttpServletRequest request,
            HttpServletResponse response) {
    	Map<String, Object> map = new HashMap<String, Object>();
    	List<Movie> movies = movieService.getUserHaveSeen(u_id);
    	if (movies == null) {
    		map.put("state", "fail");
    	} else {
    		map.put("state", "success");
    		map.put("data", movies);
    	}
    	
		return map;
    }
    
}
