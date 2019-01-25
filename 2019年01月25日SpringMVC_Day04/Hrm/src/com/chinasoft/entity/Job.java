package com.chinasoft.entity;

import java.io.Serializable;
/**
 * @Decription:
 * @author Administrator  22215@qq.com
 * @version V1.0
 * 网站 <a href="http://www.chinasofti.com">chinasoft</a>
 */
public class Job  implements Serializable{

	private Integer id;     //职位编号
	private String  name;   //职位名称
	private String  remark; //职位详细描术
		
	//无参构造
	
	public Job() {
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
		return "Job [id=" + id + ", name=" + name + ", remark=" + remark + "]";
	}
	
	
	
}
