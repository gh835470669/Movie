package com.mymovie.service;

import java.util.List;

import com.mymovie.pojo.Order;




public interface OrderService {
	
    public List<Order> getUserOrder(String u_id);
    
    
    public int insert(String u_id, String m_name, String showtime, 
    		String cinema, String seat, String price, String telphone);
    
    public int delete(String o_id, String u_id);
    
}
