package com.mymovie.serviceImpl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymovie.mapper.MovieMapper;
import com.mymovie.service.MovieService;



@Service("movieService")
public class MovieServiceImpl implements MovieService{
    
    @Autowired
    private MovieMapper movieMapper;
    
    
    
	
    
}
