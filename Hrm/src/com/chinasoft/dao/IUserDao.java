package com.chinasoft.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;


import com.chinasoft.dao.sqlprovide.UserDynaSqlProvider;
import com.chinasoft.enity.User;
import com.chinasoft.unity.HrmConstans;

public interface IUserDao {
  //根据登录名和密码查询员工
	@Select("select * from"+HrmConstans.USERTABLE+"where loginname = #{loginname} and password = #{password}")
	User selectByLoginnameAndPassword(@Param("loginname") String loginname,@Param("password")String password);
	//根据ID查用户信息
	@Select("select * from"+HrmConstans.USERTABLE+"where id = #{id}")
	User selectById(Integer id);
	@Delete("delete from"+HrmConstans.USERTABLE+"where id=#{id}" )
	void deleteById(Integer id);
	//动态修改用户
	@SelectProvider(type=UserDynaSqlProvider.class,method="updateUser")
	void upate(User user);
	//动态查询
	@SelectProvider(type=UserDynaSqlProvider.class,method="selectWithParam")
	List<User> selectByPage(Map<String,Object> params);
	//动态查询用户总数
	@SelectProvider(type=UserDynaSqlProvider.class,method="count")
	Integer count(Map<String,Object> params);
	//动态插入
	@SelectProvider(type=UserDynaSqlProvider.class,method="inserUser")
	void save(User user);
}
