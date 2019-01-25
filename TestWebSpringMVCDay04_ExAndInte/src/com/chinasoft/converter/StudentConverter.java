package com.chinasoft.converter;

import org.springframework.core.convert.converter.Converter;

import com.chinasoft.entity.Student;

//自定义类型转换器
public class StudentConverter implements Converter<String, Student>{

	//{1001-tom-23}
	@Override
	public Student convert(String source) {
	    
		String [] value = source.split("-");
		Student stu = new Student();
		int studentNo = Integer.parseInt(value[0]);
		 stu.setStuNo(studentNo);
		 stu.setStuName(value[1]);
		 stu.setStuAge(Integer.parseInt(value[2]));
		return stu;
	}

}
