package com.chinasoft.service;

import java.util.List;

import com.chinasoft.enity.Employee;
import com.chinasoft.enity.User;
import com.chinasoft.unity.PageModel;

/** 
 * 
 * @author Administrator
 * 人事管理服务层接口
 *@version V1.0
 */
public interface HrmService {
	/** 
	 * 用户登录
	 * @param loginame
	 * @param password
	 * @return User 对象
	 */
    User login(String loginame,String password);
    /** 
     * 根据ID查询用户
     * @param id
     * @return User对象
     */
    User findUserById(Integer id);
    /** 
     * 获取所有用户
     * @param user
     * @param pageMode
     * @return User用户集合
     */
    List<User> findAllUser(User user,PageModel pageMode);
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
      * @param pageModel
      * @return 分页用户对象集合
      */
     List<Employee> findEmployee(Employee employee,PageModel pageModel);
}
