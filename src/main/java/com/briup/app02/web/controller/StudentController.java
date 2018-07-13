package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Course;
import com.briup.app02.bean.Student;
import com.briup.app02.dao.StudentMapper;
import com.briup.app02.service.IStudentService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/student")
public class StudentController {
	//注入StudentService的实例
	@Autowired
	private IStudentService studentService;
	
	//http:127.0.0.1:8080/student/findAllStudent
	@GetMapping("finAllStudent")
	public List<Student> findAllStudent(){
		try {
			List<Student> list = studentService.findAll();
			return list;
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("findStudentByID")
	public Student findStudentById(Long id) {
		try {
			Student student = studentService.findById(id);
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}
	@GetMapping("findAllCourse")
	public List<Course> findAllCourse(){
		try {
			return studentService.findAllCourse();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("findCourseByCnum")
	public Course findCourseByCnum(Integer num) {
		try {
			return studentService.findCourseByCnum(num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@PutMapping("InsertStudent")
	public MsgResponse InsertStudent(Student student) {
		try {
			studentService.InsertStudent(student);
			return MsgResponse.success("删除成功!", null);
			
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("删除失败！");
		}
	}
	@PostMapping("saveStudent")
	public void Save(Student student) {
		try {
			studentService.save(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@PostMapping("UpdateStudent")
	public String updateStudent(Student student) {
		try {
			studentService.update(student);
			return "修改成功";
		} catch (Exception e) {
			// TODO: handle exception
			return e.getMessage();
		}
	}
}
