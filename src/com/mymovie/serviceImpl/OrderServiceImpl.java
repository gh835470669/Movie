package com.mymovie.serviceImpl;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymovie.mapper.OrderMapper;
import com.mymovie.pojo.Order;
import com.mymovie.pojo.OrderExample;
import com.mymovie.service.OrderService;





@Service("orderService")
public class OrderServiceImpl implements OrderService{
    
    @Autowired
    private OrderMapper orderMapper;
    
    public List<Order> getUserOrder(String u_id) {
    	if (u_id == null || u_id.length() ==0) return null;
    	int uId = Integer.parseInt(u_id);
    	OrderExample example = new OrderExample();
    	example.createCriteria().andUIdEqualTo(uId).andFlagEqualTo(1);
    	return orderMapper.selectByExample(example);//.
    }
    
    
    public int insert(String u_id, String m_name, String showtime, 
    		String cinema, String seat, String price, String telphone) {
    	if (u_id == null || u_id.length() ==0 || price==null||price.length()==0) return 0;
    	int uId = Integer.parseInt(u_id);
    	float orderPrice = Float.parseFloat(price);
    	Order order = new Order();
    	order.setuId(uId);
    	order.setCinema(cinema);
    	order.setFlag(1);
    	order.setmName(m_name);
    	order.setOrderPrice(orderPrice);
    	order.setSeat(seat);
    	order.setTelphone(telphone);
    	order.setShowtime(showtime);
    	
    	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    	String t =  formatter.format(System.currentTimeMillis());
    	order.setOrderTime(t);
    	
    	return orderMapper.insertSelective(order);
    }
    
    public int delete(String o_id, String u_id) {
    	if (u_id == null || u_id.length() ==0 || o_id==null||o_id.length()==0) return 0;
    	int uId = Integer.parseInt(u_id);
    	int oId = Integer.parseInt(o_id);
    	OrderExample example = new OrderExample();
    	example.createCriteria().andUIdEqualTo(uId).andOIdEqualTo(oId);
    	Order record = new Order();
    	record.setFlag(0);
    	return orderMapper.updateByExampleSelective(record, example);
    }
}
