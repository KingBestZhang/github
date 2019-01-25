package com.chinasoft.enity;

import java.io.Serializable;

import lombok.Data;

/**
 * @Decription
 * @author Administrator ccq.com
 * @version V1.0
 * 网站<a href="http://www.chinasoft.com"></a>
 */
@Data
public class Dept implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;//部门ID
	private String name;//部门名称
	private String remark;//详细描述
	

}
