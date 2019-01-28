package com.chinasoft.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.chinasoft.dao.UserDao;
import com.chinasoft.enity.User;
@Service("service")
public class UserService {
	@Autowired
  private UserDao userDao;
	public User selectById()
	{
		
		User user = userDao.selectById(6);
		
		return user;
	
	}
}
