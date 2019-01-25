package com.chinasoft.entity;

import java.io.Serializable;

/**
 * @Decription:
 * @author Administrator  22215@qq.com
 * @version V1.0
 * 网站 <a href="http://www.chinasofti.com">chinasoft</a>
 */
public class Dept implements Serializable {

	private Integer id;     //部门ID
	private String  name;   //部门名称
	private String  remark; //详细描述
	
	//无参构造
	public Dept() {
		super();
	}
	//setter和getter方法

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", remark=" + remark + "]";
	}
	
	
}
