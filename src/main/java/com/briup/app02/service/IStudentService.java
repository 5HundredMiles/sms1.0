package com.briup.app02.service;

import java.util.List;
import com.briup.app02.bean.Course1;
import com.briup.app02.bean.Student;


public interface IStudentService {
	List<Student> findAll() throws Exception;	
	Student findById(long id) throws Exception;
	void InsertStudent(Student student) throws Exception;
	
	List<Course1> findAllCourse() throws Exception;
	Course1 findCourseByCnum(Integer num) throws Exception;
	
	void save(Student student) throws Exception;
	void update(Student student) throws Exception;
	
}
