package com.mymovie.serviceImpl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymovie.mapper.UserMapper;
import com.mymovie.pojo.User;
import com.mymovie.pojo.UserExample;
import com.mymovie.pojo.MovieExample;
import com.mymovie.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserMapper userMapper;
    
    
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
    public String getUserInfo(String username) {
    	//if (uid == null || uid.length() == 0) return "";
    	
    	//int uId = Integer.parseInt(uid);
    	UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(username);
		List<User> userList = userMapper.selectByExample(example);
		if(CollectionUtils.isEmpty(userList)){
			return "";
		} else {
			int uid = userList.get(0).getuId();
			int account = userList.get(0).getAccount();
			
			MovieExample m =  
		}
    }
    
}
