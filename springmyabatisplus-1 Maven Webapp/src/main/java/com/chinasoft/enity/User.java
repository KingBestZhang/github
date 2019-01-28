package com.chinasoft.enity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

@TableName(value="user")
public class User {
	@TableId(value = "user_id",type = IdType.AUTO)
	 private int id;
	@TableField(value="user_name",exist=true)
	   private String name;
	@TableField(value="user_sex",exist=true)
	   private String sex;
	@TableField(value="user_age",exist=true)
	   private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	public User() {
		super();
	}
	   
}
