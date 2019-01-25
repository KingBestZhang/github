package com.chinasoft.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.chinasoft.dao.sqlprovider.UserDynaSqlProvider;
import com.chinasoft.entity.User;
import com.chinasoft.util.HrmConstants;

/**
 * @Decription:
 * @author Administrator  22215@qq.com
 * @version V1.0
 * ��վ <a href="http://www.chinasofti.com">chinasoft</a>
 */
public interface IUserDao {

	//���ݵ�½���������ѯԱ��
	@Select("select * from "+HrmConstants.USERTABLE +" where loginname = #{loginname} and  password =#{password}")
	User selectByLoginnameAndPassword(
			@Param("loginname") String loginname,
			@Param("password")  String password);
	//����ID���û���Ϣ
	@Select("select * from " +HrmConstants.USERTABLE+" where id = #{id}")
	User selectById(Integer id);
	//����IDɾ���û�
	@Delete("delete from "+HrmConstants.USERTABLE +" where id = #{id}" )
	void deleteById(Integer id);
	//��̬�޸��û�
	@SelectProvider(type=UserDynaSqlProvider.class,method="updateUser")
	 void upate(User user);
	//��̬��ѯ
	@SelectProvider(type=UserDynaSqlProvider.class,method="selectWithParam")
	List<User> selectByPage(Map<String,Object> params);
	//̬̬��ѯ�û�����
	@SelectProvider(type=UserDynaSqlProvider.class,method="count")
	Integer count(Map<String,Object> params);
	//��̬���� 
	@SelectProvider(type=UserDynaSqlProvider.class,method="insertUser")
	 void save(User user);
}

