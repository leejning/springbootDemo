package com.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.pojo.Teacher;

public interface TeacherDao extends CrudRepository<Teacher, Long>{

}
