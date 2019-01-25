package com.chinasoft.converter;

import org.springframework.core.convert.converter.Converter;

import com.chinasoft.entity.Stu;

public class StudentLoginConverter implements Converter<String, Stu>{

	//{tom,123435}
	@Override
	public Stu convert(String source) {
		
		String [] value = source.split(",");
		Stu student = new Stu();
		student.setUsername(value[0]);
		student.setUserpass(value[1]);
		return student;
	}

}
