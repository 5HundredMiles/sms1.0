package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Clazz;
import com.briup.app02.bean.Course;
import com.briup.app02.bean.Course1;
import com.briup.app02.bean.Grade;
import com.briup.app02.bean.School;
import com.briup.app02.bean.Student;
import com.briup.app02.bean.User;
import com.briup.app02.dao.StudentMapper;
import com.briup.app02.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentMapper studentMapper;	
	
	@Override
	public List<Student> findAll() throws Exception {
	    List<Student>	list =  studentMapper.findAll();
		return list;
	}
	
	public Student findById(long id) throws Exception{
		return studentMapper.findById(id);
	}
	
	@Override
	public List<Course1> findAllCourse() throws Exception {
		return studentMapper.findAllCourse();
	}
	@Override
	public Course1 findCourseByCnum(Integer num) throws Exception {
		return studentMapper.findCourseByCnum(num);
	}
	@Override
	public void InsertStudent(Student student) throws Exception {
		 studentMapper.InsertStudent(student);
	}
	@Override
	public void save(Student student) throws Exception {
		studentMapper.save(student);
		
	}
	@Override
	public void update(Student student) throws Exception {
		studentMapper.update(student);
	}

}
