package com.chinasoft.service;

import java.util.List;

import com.chinasoft.entity.Employee;
import com.chinasoft.entity.User;
import com.chinasoft.util.PageModel;

/**
 * 
 * @author Administrator
 *  ���¹�������ӿ�
 *  @version V1.0
 */
public interface HrmService {

	/**
	 * �û���½
	 * @param loginname
	 * @param password
	 * @return  User����
	 */
	User login(String loginname,String password);
	
	/**
	 * ����ID��ѯ�û�
	 * @param id
	 * @return User����
	 */
	User findUserById(Integer id);
	/**
	 * ��������û�
	 * @param user
	 * @param pageModel
	 * @return User����ļ���
	 */
	List<User> findAllUser(User user,PageModel pageModel);
	/**
	 * ����IDɾ���û�
	 * @param id
	 */
	void removeUserById(Integer id);
	/**
	 * �޸��û�
	 * @param user
	 */
	void modifyUser(User user);
	/**
	 * ����û�
	 * @param user
	 */
	void addUser(User user);
	/**
	 * �������Ա����Ϣ
	 * @param employee ��ѯ������
	 * @param pageModel ��ҳ����
	 * @return Ա������ļ���
	 */
	List<Employee> findEmployee(Employee employee,PageModel pageModel);
}
