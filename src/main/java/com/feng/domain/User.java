package com.feng.domain;

import java.util.Date;

public class User {
	private Long id;// ID，表中的主键
	private String userName;// 用户名
	private String password;// 密码
	private String name;// 姓名
	private Integer age;// 年龄
	private Integer sex;// 性别：1男性，0女性
	private Date birthday;// 出生日期
	private Date created;// 创建时间
	private Date updated;// 更新时间

	public User(Long id, String userName, String password, String name, Integer age, Integer sex, Date birthday, Date created, Date updated) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.birthday = birthday;
		this.created = created;
		this.updated = updated;
	}

	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", name=" + name + ", age=" + age + ", sex=" + sex
				+ ", birthday=" + birthday + ", created=" + created
				+ ", updated=" + updated + "]";
	}

}