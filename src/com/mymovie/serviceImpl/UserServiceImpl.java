package com.mymovie.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymovie.mapper.CommentMapper;
import com.mymovie.mapper.MovieMapper;
import com.mymovie.mapper.OrderMapper;
import com.mymovie.mapper.UserMapper;
import com.mymovie.pojo.CommentExample;
import com.mymovie.pojo.OrderExample;
import com.mymovie.pojo.User;
import com.mymovie.pojo.UserExample;
import com.mymovie.pojo.MovieExample;
import com.mymovie.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private MovieMapper movieMapper;
    
    @Autowired
    private OrderMapper orderMapper;
    
    @Autowired
    private CommentMapper commentMapper;
    
    
    @Override
    public int insertUser(User user) {
    	return userMapper.insert(user);
    }
    
    @Override
	public int isExisted(String userName) {
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(userName);
		return userMapper.countByExample(example);
	}
    
    @Override
    public int updateUserInfo(String username, String password, String newinfo, String flag) {
    	if (StringUtils.equals("1", flag)) {
    		if (isExisted(newinfo) > 0) {
    			return 0;
    		} else {
    			User user = new User();
        		user.setUsername(newinfo);
        		UserExample example = new UserExample();
        		example.createCriteria().andUsernameEqualTo(username);
    			return userMapper.updateByExampleSelective(user, example);
    		}
    		
    	} else {
    		User user = new User();
    		user.setPassword(newinfo);
    		UserExample example = new UserExample();
    		example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
    		return userMapper.updateByExampleSelective(user, example);
    	}
    	
    }
    
    
    
    @Override
    public int signin(String username, String password) {
	    UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
		List<User> userList = userMapper.selectByExample(example);
		if(CollectionUtils.isEmpty(userList)){
			return 0;
		}
		return 1;
    }
	
    @Override
    public Map<String, Object> getUserInfo(String username) {
    	
    	UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(username);
		List<User> userList = userMapper.selectByExample(example);
		if(CollectionUtils.isEmpty(userList)){
			return null;
		} else {
			int uid = userList.get(0).getuId();
			int account = userList.get(0).getAccount();
			
			MovieExample m = new  MovieExample();
			m.createCriteria().andUIdEqualTo(uid).andUserLikeEqualTo(1);
			
			int userlike_num = movieMapper.countByExample(m);
			m.createCriteria().andUIdEqualTo(uid).andHaveSeenEqualTo(1);
			int haveSeen_num = movieMapper.countByExample(m);
			
			OrderExample or = new  OrderExample();
			or.createCriteria().andUIdEqualTo(uid).andFlagEqualTo(1);
			int order_num = orderMapper.countByExample(or);
			
			CommentExample com = new  CommentExample();
			com.createCriteria().andUIdEqualTo(uid).andFlagEqualTo(1);
			int comment_num = commentMapper.countByExample(com);
			
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("u_id", uid);
			result.put("account", account);
			result.put("userlike_num", userlike_num);
			result.put("haveSeen_num", haveSeen_num);
			result.put("order_num", order_num);
			result.put("comment_num", comment_num);
			
			return result;
		}
		
    }
    
}
