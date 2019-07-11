package com.springboot.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "t_course")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Course extends BaseEntity<Long> implements Serializable {
	private String course_name;
	private String course_desc;
	private String course_cover;
	private Boolean course_open;
	private Teacher teacher;

	@ManyToOne
	@JoinColumn(name="teacher_id")
	@JsonManagedReference
	public Teacher getTeacher() {
		return teacher;
	}

	public String getCourse_name() {
		return course_name;
	}

	public Boolean getCourse_open() {
		return course_open;
	}

	public void setCourse_open(Boolean course_open) {
		this.course_open = course_open;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public String getCourse_cover() {
		return course_cover;
	}

	public void setCourse_cover(String course_cover) {
		this.course_cover = course_cover;
	}

	public String getCourse_desc() {
		return course_desc;
	}

	public void setCourse_desc(String course_desc) {
		this.course_desc = course_desc;
	}


	public Course(Long id,String course_name) {
		super(id);
		this.course_name = course_name;
	}

	public Course() {
		super();
	}




}
