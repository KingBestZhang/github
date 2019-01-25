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
public class Job implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
       private Integer id;//职位的编号
       private  String name;//职位名称
       private  String  remark;//职位描述
       
       
}
