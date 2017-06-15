package com.luwei.hackvr.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.luwei.hackvr.service.GameService;

public class BaseController {
	
	Logger log = Logger.getLogger(getClass()); 
	
	@Autowired
	GameService gameService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy/MM/dd HH:mm"), true));
	}
	
	@InitBinder
	public void initDatabase(WebDataBinder binder) {
	    gameService.initGameTypeMap();
	    gameService.initDisplayDeviceMap();
	}
	
}
