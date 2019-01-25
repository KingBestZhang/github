package com.chinasoft.enity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
/**
 * @Decription
 * @author Administrator ccq.com
 * @version V1.0
 * 网站<a href="http://www.chinasoft.com"></a>
 */
@Data
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private  Integer id;        //员工编号
	private Dept dept;         //员工所在的部门
	private Job job;           //员工所在的职位
	private String name;        //员工的姓名
	private String cardId;     //身份证
	private String address;     //地址
	private String postCode;   //邮编
	private String tel;         //电话
	private String qqNum;        //qq
	private String eMail;        //邮箱
	private Integer sex;         //性别
	private String  party;        //政治面貌
	private  String phone;         //手机
	@DateTimeFormat(pattern="yyyy--MM-dd")
	private Date   bitrhday;        //生日
	private String race;            //民族
	private String education;       //学历
	private String speciality;      //专业
	private String hobby;           //爱好
	private String remark;          //备注
	private Date createDate;        //建档日期
	
}
