package com.mymovie.service;

import java.util.List;

import com.mymovie.pojo.Seat;





public interface SeatService {
	
    public List<Seat> getNonEmptySeat(String cinema_id, String hall_id);
    
    
    public int insert(String cinema_id, String hall_id, Integer position);
    
    public int delete(String cinema_id, String hall_id);
    
}
