package com.mymovie.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mymovie.service.MovieService;


import cn.jpush.api.common.connection.IHttpClient.RequestMethod;




@Controller
@RequestMapping("/movie")
public class MovieController {
    //private static Logger logger = Logger.getLogger(JsonController.class);
    
    
    @Autowired
    private MovieService movieService;
    
    @RequestMapping(value = {"/","/index", ""})
    public String index(Map<String, Object> model){
      // 直接返回字符串，框架默认会去 spring.view.prefix 目录下的 （index拼接spring.view.suffix）页面
      // 本例为 /WEB-INF/jsp/index.jsp
      model.put("time", "aa");
      model.put("message", "cc");
      return "index";
    }
    
    @ResponseBody
    @RequestMapping("like")
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
    	
		return map;
    }
    
    @ResponseBody
    @RequestMapping("haveSeen")
    public Map<String, Object> updateHaveSeen(
    		@RequestParam(value="m_name") String m_name,
            @RequestParam(value="m_id") String m_id,
            @RequestParam(value="m_data") String m_data,
            @RequestParam(value="u_id") String u_id,
            @RequestParam(value="haveSeen") String haveSeen,
            HttpServletRequest request,
            HttpServletResponse response) {
    	Map<String, Object> map = new HashMap<String, Object>();
    	int n = movieService.updateLike(m_id, m_name, m_data, u_id, haveSeen);
    	if (n > 0) {
    		map.put("state", "success");
    	} else {
    		map.put("state", "fail");
    	}
    	
		return map;
    }
    
    
}
