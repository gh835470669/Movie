package com.mymovie.service;


import java.util.Map;

import com.mymovie.pojo.User;

public interface UserService {
    
    public int insertUser(User user);
    
    public int isExisted(String userName);
    
    public Map<String, Object> getUserInfo(String uid);
    
    public int signin(String username, String password);
    
    public int updateUserInfo(String username, String password, String newinfo, String flag);
}
