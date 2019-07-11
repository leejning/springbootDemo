package com.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.pojo.Course;

public interface CourseDao extends CrudRepository<Course, Long>{

}
