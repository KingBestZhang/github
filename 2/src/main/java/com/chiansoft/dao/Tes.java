package com.chiansoft.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.chiansoft.enity.User;

public class Tes {
public static void main(String[] args) {
	Reader reader;
	SqlSessionFactory sessionFactroy=null;
	String resource ="mybatis-config.xml";
	try {
		reader = Resources.getResourceAsReader(resource);
		sessionFactroy = new SqlSessionFactoryBuilder().build(reader);

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	SqlSession session = sessionFactroy.openSession();
    UserDao userdao =session.getMapper(UserDao.class);
    User user =userdao.queryUser(1);
    System.out.println(user);
}
}
