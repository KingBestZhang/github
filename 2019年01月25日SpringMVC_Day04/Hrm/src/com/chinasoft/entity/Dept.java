package com.chinasoft.entity;

import java.io.Serializable;

/**
 * @Decription:
 * @author Administrator  22215@qq.com
 * @version V1.0
 * ��վ <a href="http://www.chinasofti.com">chinasoft</a>
 */
public class Dept implements Serializable {

	private Integer id;     //����ID
	private String  name;   //��������
	private String  remark; //��ϸ����
	
	//�޲ι���
	public Dept() {
		super();
	}
	//setter��getter����

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
