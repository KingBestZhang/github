package com.chinasoft.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Decription:
 * @author Administrator  22215@qq.com
 * @version V1.0
 * 网站 <a href="http://www.chinasofti.com">chinasoft</a>
 */
public class Employee implements Serializable {

	private Integer id;    		    //员工编号
	private Dept    dept;			//员工所在的部门
	private Job     job;            //员工职位
	private String  name;           //员工姓名
	private String  cardId;         //身份证
	private String  address;        //地址
	private String  postCode;       //邮编
	private String  tel;            //电话
	private String  qqNum;          //qq号
	private String  email;           //邮箱
	private Integer sex;             //性别
	private String party;            //政治面貌
	private String phone;            //手机
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
    private  Date   birthday;       //生日
	private  String  race;          //民族
	private  String  education;     //学历
	private  String  speciality;    //专业
	private  String   hobby;        //爱好
	private  String   remark;       //备注
	private  Date    createDate;    //建档日期

	//无参构造
	public Employee() {
		super();
	}
	//setter和getter方法
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getQqNum() {
		return qqNum;
	}

	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", dept=" + dept + ", job=" + job
				+ ", name=" + name + ", cardId=" + cardId + ", address="
				+ address + ", postCode=" + postCode + ", tel=" + tel
				+ ", qqNum=" + qqNum + ", email=" + email + ", sex=" + sex
				+ ", party=" + party + ", phone=" + phone + ", birthday="
				+ birthday + ", race=" + race + ", education=" + education
				+ ", speciality=" + speciality + ", hobby=" + hobby
				+ ", remark=" + remark + ", createDate=" + createDate + "]";
	}
	

	
	
}
