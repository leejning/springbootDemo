package com.springboot.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "t_account")
public class Account extends BaseEntity<Long> {

	private String account_num;
	private String name;
	private String phone;
	private String email;
	private String qq;
	private String password;
	private Integer status; // 1代表账号可用，0代表账号停用，-1代表账号未通过验证
	private String head_photo;
	private Teacher teacher;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	public Teacher getTeacher() {
		return teacher;
	}

//	@Column(unique = true)
	public String getAccount_num() {
		return account_num;
	}

	public String getPassword() {
		return password;
	}

	public Integer getStatus() {
		return status;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(unique = true)
	public String getHead_photo() {
		return head_photo;
	}

	public void setHead_photo(String head_photo) {
		this.head_photo = head_photo;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
