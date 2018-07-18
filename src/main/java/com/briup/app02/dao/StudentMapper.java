package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Clazz;
import com.briup.app02.bean.Course;
import com.briup.app02.bean.Course1;
import com.briup.app02.bean.Grade;
import com.briup.app02.bean.School;
import com.briup.app02.bean.Student;
import com.briup.app02.bean.User;

public interface StudentMapper {
	List<Student> findAll();
	
	Student findById(long id);
	
	List<Course1> findAllCourse() ;
	
	Course1 findCourseByCnum(Integer num);
	
	void InsertStudent(Student student);
	void save(Student student);
	void update(Student student);

}
