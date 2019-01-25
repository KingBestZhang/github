package com.chinasoft.enity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @Decription
 * @author Administrator ccq.com
 * @version V1.0
 * 网站<a href="http://www.chinasoft.com"></a>
 */
@Data
public class User implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//id
    private String  username;//用户名
    private String  loginame;//登录名
    private String  password;//登录密码
    private Integer status; //用户状态
    private Date    createDate;//建档日期
    
    
}
