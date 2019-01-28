package com.chinasoft.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	UserService userDao =  (UserService) context.getBean("service");
   System.out.println(userDao);
   System.out.println(userDao.selectById());
}
}
