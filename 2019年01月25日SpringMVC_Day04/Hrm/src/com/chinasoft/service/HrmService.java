package com.chinasoft.service;

import java.util.List;

import com.chinasoft.entity.Employee;
import com.chinasoft.entity.User;
import com.chinasoft.util.PageModel;

/**
 * 
 * @author Administrator
 *  人事管理服务层接口
 *  @version V1.0
 */
public interface HrmService {

	/**
	 * 用户登陆
	 * @param loginname
	 * @param password
	 * @return  User对象
	 */
	User login(String loginname,String password);
	
	/**
	 * 根据ID查询用户
	 * @param id
	 * @return User对象
	 */
	User findUserById(Integer id);
	/**
	 * 获得所有用户
	 * @param user
	 * @param pageModel
	 * @return User对象的集合
	 */
	List<User> findAllUser(User user,PageModel pageModel);
	/**
	 * 根据ID删除用户
	 * @param id
	 */
	void removeUserById(Integer id);
	/**
	 * 修改用户
	 * @param user
	 */
	void modifyUser(User user);
	/**
	 * 添加用户
	 * @param user
	 */
	void addUser(User user);
	/**
	 * 获得所有员工信息
	 * @param employee 查询的条件
	 * @param pageModel 分页对象
	 * @return 员工对象的集合
	 */
	List<Employee> findEmployee(Employee employee,PageModel pageModel);
}
