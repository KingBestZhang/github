package com.chinasoft.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.dao.UserMapper;
import com.chinasoft.enity.User;
@Service("service")
public class UserService {
	 @Resource(name="userDao")
      private UserMapper userMapper;
	public User queryUser(int class_id)
	{	
		return userMapper.selectByPrimaryKey(class_id);
			
	}
	public User selectByPrimaryKey(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
