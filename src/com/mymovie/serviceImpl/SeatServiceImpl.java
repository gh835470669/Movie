package com.mymovie.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymovie.mapper.SeatMapper;
import com.mymovie.pojo.Seat;
import com.mymovie.pojo.SeatExample;
import com.mymovie.service.SeatService;





@Service("seatService")
public class SeatServiceImpl implements SeatService{
    
    @Autowired
    private SeatMapper seatMapper;
    
    public List<Seat> getNonEmptySeat(String cinema_id, String hall_id) {
    	if (cinema_id == null || cinema_id.length() ==0
    			||hall_id == null || hall_id.length() ==0) return null;
    	int cinemaId = Integer.parseInt(cinema_id);
    	int hallId = Integer.parseInt(hall_id);
    	SeatExample example = new SeatExample();
    	example.createCriteria().andCinemaIdEqualTo(cinemaId).andHallIdEqualTo(hallId);
    	return seatMapper.selectByExample(example);
    }
    
    
    public int insert(String cinema_id, String hall_id, Integer position) {
    	if (cinema_id == null || cinema_id.length() ==0
    			||hall_id == null || hall_id.length() ==0) return 0;
    	int cinemaId = Integer.parseInt(cinema_id);
    	int hallId = Integer.parseInt(hall_id);
    	
    	Seat record = new Seat();
    	record.setCinemaId(cinemaId);
    	record.setHallId(hallId);
    	record.setNonEmpty(position);
    	return seatMapper.insertSelective(record);
    }
    
    public int delete(String cinema_id, String hall_id) {
    	if (cinema_id == null || cinema_id.length() ==0
    			||hall_id == null || hall_id.length() ==0) return 0;
    	int cinemaId = Integer.parseInt(cinema_id);
    	int hallId = Integer.parseInt(hall_id);
    	
    	SeatExample example = new SeatExample();
    	example.createCriteria().andCinemaIdEqualTo(cinemaId).andHallIdEqualTo(hallId);
    	return seatMapper.deleteByExample(example);
    }
}
