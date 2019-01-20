package com.chinasoft.test;

import static org.junit.Assert.*;

import java.awt.geom.GeneralPath;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinasoft.dao.UserMapper;
import com.chinasoft.enity.User;
import com.chinasoft.service.UserService;

public class Test {
	@Resource(name="service")
    private UserService userService;
	@org.junit.Test
	public void test() {
		File f =new File("src/main/resources/generatorConfig.xml");
		List<String> warnings = new ArrayList<String>();
		ConfigurationParser cp  = new ConfigurationParser(warnings);
		try {
			Configuration config = cp.parseConfiguration(f);
			DefaultShellCallback callBack = new DefaultShellCallback(true);
			MyBatisGenerator generator = new MyBatisGenerator(config, callBack, warnings);
			generator.generate(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@org.junit.Test
	public void test1() {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		UserService userDao =  (UserService) context.getBean("service");
		   User user =userDao.queryUser(1111);
		   System.out.println(user);
	}
	@org.junit.Test
	public void test2() {
	
		
		 
	}
}
