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
import com.mymovie.pojo.Order;
import com.mymovie.service.CommentService;
import com.mymovie.service.MovieService;
import com.mymovie.service.OrderService;





@Controller
@RequestMapping("/order")
public class OrderController {
    
    @Autowired
    private OrderService orderService;
    
    
    
    @ResponseBody
    @RequestMapping("/getOrders")
    public Map<String, Object> uploadComment(
            @RequestParam(value="o_id") String o_id,
            @RequestParam(value="u_id") String u_id,
            HttpServletRequest request,
            HttpServletResponse response) {
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	List<Order> orders = orderService.getUserOrder(u_id);
    	if (orders == null) {
    		map.put("state", "fail");
    	} else {
    		map.put("state", "success");
    		map.put("data", orders);
    	}
    	
		return map;
    }
    
    @ResponseBody
    @RequestMapping("/delete")
    public Map<String, Object> deleteOrder(
            @RequestParam(value="o_id") String o_id,
            @RequestParam(value="u_id") String u_id,
            HttpServletRequest request,
            HttpServletResponse response) {
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	int n = orderService.delete(o_id, u_id);
    	if (n > 0) {
    		map.put("state", "success");
    	} else {
    		map.put("state", "fail");
    	}
    	
		return map;
    }

    
    @ResponseBody
    @RequestMapping("/new")
    public Map<String, Object> uploadComment(
            @RequestParam(value="u_id") String u_id,
            @RequestParam(value="m_name") String m_name,
            @RequestParam(value="showtime") String showtime,
            @RequestParam(value="cinema") String cinema,
            @RequestParam(value="seat") String seat,
            @RequestParam(value="price") String price,
            @RequestParam(value="telphone") String telphone,
            HttpServletRequest request,
            HttpServletResponse response) {
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	int n = orderService.insert(u_id, m_name, showtime, cinema, seat, price, telphone);
    	if (n > 0) {
    		map.put("state", "success");
    	} else {
    		map.put("state", "fail");
    	}
    	
		return map;
    }
    
    
    
}
