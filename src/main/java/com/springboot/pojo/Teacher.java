package com.springboot.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "t_teacher")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Teacher extends BaseEntity<Long> implements Serializable {

	private String teacher_name;
	private String teacher_num;
	private Account account;

	private List<Course> courses = new ArrayList<Course>();

	@OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	public List<Course> getCourses() {
		return courses;
	}

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public String getTeacher_num() {
		return teacher_num;
	}

	public void setTeacher_num(String teacher_num) {
		this.teacher_num = teacher_num;
	}


}
