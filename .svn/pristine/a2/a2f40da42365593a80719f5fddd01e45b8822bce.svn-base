package com.luwei.hackvr.serviceImpl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luwei.hackvr.mapper.UserMapper;
import com.luwei.hackvr.pojo.User;
import com.luwei.hackvr.pojo.UserExample;
import com.luwei.hackvr.service.UserService;
import com.luwei.hackvr.utils.Md5Encrypt;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired 
	private UserMapper userMapper;
	
	@Override 
	public int register(User user) {
		// TODO Auto-generated method stub
		return userMapper.insert(user);
	}

	@Override
	public User login(String userName, String password) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		example.createCriteria().andUserNameEqualTo(userName).andPasswdEqualTo(Md5Encrypt.md5(password));
		List<User> userList = userMapper.selectByExample(example);
		if(CollectionUtils.isEmpty(userList)){
			return null;
		}
		
		return userList.get(0);
	}

	@Override
	public int isExist(String userName) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		example.createCriteria().andUserNameEqualTo(userName);
		return userMapper.countByExample(example);
	}

}
