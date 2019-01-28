package com.chinasoft.test;

import static org.junit.Assert.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinasoft.enity.User;
import com.chinasoft.service.UserService;

public class Test {

	@org.junit.Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		UserService userDao =  (UserService) context.getBean("service");
	   System.out.println(userDao);
	   System.out.println(userDao.selectById());
	    
	}

}
