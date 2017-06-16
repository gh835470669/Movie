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
import com.mymovie.pojo.Seat;
import com.mymovie.service.CommentService;
import com.mymovie.service.MovieService;
import com.mymovie.service.OrderService;
import com.mymovie.service.SeatService;





@Controller
@RequestMapping("/seat")
public class SeatController {
    
    @Autowired
    private SeatService seatService;
    
    
    
    @ResponseBody
    @RequestMapping("/getNonEmptySeat")
    public Map<String, Object> uploadComment(
            @RequestParam(value="cinema_id") String cinema_id,
            @RequestParam(value="hall_id") String hall_id,
            HttpServletRequest request,
            HttpServletResponse response) {
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	List<Seat> seats = seatService.getNonEmptySeat(cinema_id, hall_id);
    	if (seats == null) {
    		map.put("state", "fail");
    	} else {
    		map.put("state", "success");
    		map.put("data", seats);
    	}
    	
		return map;
    }
    
    @ResponseBody
    @RequestMapping("/delete")
    public Map<String, Object> deleteOrder(
    		@RequestParam(value="cinema_id") String cinema_id,
            @RequestParam(value="hall_id") String hall_id,
            HttpServletRequest request,
            HttpServletResponse response) {
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	int n = seatService.delete(cinema_id, hall_id);
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
    		@RequestParam(value="cinema_id") String cinema_id,
            @RequestParam(value="hall_id") String hall_id,
            @RequestParam(value="position") Integer position,
            HttpServletRequest request,
            HttpServletResponse response) {
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	int n = seatService.insert(cinema_id, hall_id, position);
    	if (n > 0) {
    		map.put("state", "success");
    	} else {
    		map.put("state", "fail");
    	}
    	
		return map;
    }
    
    
    
}
