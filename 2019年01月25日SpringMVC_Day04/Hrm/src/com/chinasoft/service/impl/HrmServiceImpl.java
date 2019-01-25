package com.chinasoft.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.dao.IUserDao;
import com.chinasoft.entity.Employee;
import com.chinasoft.entity.User;
import com.chinasoft.service.HrmService;
import com.chinasoft.util.PageModel;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("hrmService")
public class HrmServiceImpl implements HrmService{

	/**
	 * 自动注入持久层对象DAO
	 */
	@Autowired
	private IUserDao userDao;
	
	/**
	 * 用户服务接口的实现
	 */
	@Transactional(readOnly=true)
	@Override
	public User login(String loginname, String password) {
		
		return userDao.selectByLoginnameAndPassword(loginname, password);
	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUser(User user, PageModel pageModel) {
     Map<String,Object> params = new HashMap<String,Object>();
      params.put("user", user);
      int recordCount = userDao.count(params);
      pageModel.setRecordCount(recordCount);
      if(recordCount > 0)
      {
    	  params.put("pageModel", pageModel);
      }
      List<User> users = userDao.selectByPage(params);
		return users;
	}

	@Override
	public void removeUserById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findEmployee(Employee employee, PageModel pageModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
