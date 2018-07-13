package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Course;
import com.briup.app02.bean.Student;

public interface StudentMapper {
	List<Student> findAll();
	
	Student findById(long id);
	
	List<Course> findAllCourse() ;
	
	Course findCourseByCnum(Integer num);
	
	void InsertStudent(Student student);
	void save(Student student);
	void update(Student student);
}
