package com.luwei.hackvr.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 获取Spring bean工具类
 */
@Component
public class SpringUtil implements ApplicationContextAware {

	public static ApplicationContext context;

	public static ApplicationContext getApplicationContext() {
		return context;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringUtil.context = applicationContext;
	}
	
	/**
	 * 根据名称获取bean
	 * @param name
	 * @return
	 * @throws BeansException
	 */
	public static Object getBean(String name) throws BeansException{
		return context.getBean(name);
	}
	
	/**
	 * 根据类型获取bean
	 * @param clazz
	 * @return
	 */
	public static <T> T getBean(Class<T> clazz){
		return context.getBean(clazz);
	}
}