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

import com.mymovie.pojo.User;
import com.mymovie.pojo.UserExample;
import com.mymovie.service.UserService;

import cn.jpush.api.common.connection.IHttpClient.RequestMethod;




@Controller
@RequestMapping("/user")
public class UserController {
    //private static Logger logger = Logger.getLogger(JsonController.class);
    
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(value = {"/","/index", ""})
    public String index(Map<String, Object> model){
      // 直接返回字符串，框架默认会去 spring.view.prefix 目录下的 （index拼接spring.view.suffix）页面
      // 本例为 /WEB-INF/jsp/index.jsp
      model.put("time", "aa");
      model.put("message", "cc");
      return "index";
    }
    
    @ResponseBody
    @RequestMapping("update")
    public Map<String, Object> update(
    		@RequestParam(value="username") String username,
            @RequestParam(value="password") String password,
            @RequestParam(value="newinfo") String newinfo,
            @RequestParam(value="flag") String flag,
            HttpServletRequest request,
            HttpServletResponse response) {
    	Map<String, Object> map = new HashMap<String, Object>();
    	//flag为1表示修改用户名
    	int result = userService.updateUserInfo(username, password, newinfo, flag);
    	if (result == 1) {
    		map.put("state", "success");
    	} else {
    		map.put("state", "fail");
    	}
    	
		return map;
    }
    
    
    
    @ResponseBody
    @RequestMapping("/signin")
    public Map<String, Object> signin(
            @RequestParam(value="username") String username,
            @RequestParam(value="password") String password,
            HttpServletRequest request, Model model,
            HttpServletResponse response) throws Exception{
        
    	Map<String, Object> map = new HashMap<String, Object>();
    	if (userService.signin(username, password) == 1) {
    		map.put("state", "success");
    	} else {
    		map.put("state", "fail");
    	}
    	
        return map;
    }
    
    @ResponseBody
    @RequestMapping("/signup")
    public Map<String, Object> signup(
            @RequestParam(value="username") String username,
            @RequestParam(value="password") String password,
            HttpServletRequest request, Model model,
            HttpServletResponse response) throws Exception{
        
    	Map<String, Object> map = new HashMap<String, Object>();
    	if (userService.isExisted(username) > 0) {
    		map.put("state", "fail");
    	} else {
    		User newuser = new User();
        	newuser.setAccount(0);
        	newuser.setPassword(password);
        	newuser.setUsername(username);
        	int result = userService.insertUser(newuser);
            if (result == 0) {
                map.put("state", "fail");
            } else {
                map.put("state", "success");
            }
    	}
        return map;
    }
}
