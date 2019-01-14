package com.chinasoft.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.chiansoft.dao.UserDao;
import com.chiansoft.enity.User;

public class UserMapperDemo {
	SqlSessionFactory sessionFactroy=null;
@Before
public void createSqlSessionFactroy()
{
	Reader reader;
	String resource ="mybatis-config.xml";
	try {
		reader = Resources.getResourceAsReader(resource);
		sessionFactroy = new SqlSessionFactoryBuilder().build(reader);

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
	@Test
	public void test() {
		SqlSession session = sessionFactroy.openSession();
          UserDao userdao =session.getMapper(UserDao.class);
          User user =userdao.queryUser(1);
          System.out.println(user);
	}

}
