package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Course;
import com.briup.app02.service.IPollService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "课程相关接口")
@RestController
@RequestMapping("/CourseController")
public class CourseController {
	@Autowired
	private IPollService pollService;
	
	@ApiOperation(value = "查询所有课程")
	@GetMapping("selectAllCourse")
	MsgResponse selectAllCourse(){
		try {
			return MsgResponse.success("成功",pollService.selectAllCourse() );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "通过id查询课程")
	@GetMapping("selectCourseById")
	public MsgResponse selectCourseById(Long id) {
		try {
			return MsgResponse.success("成功",pollService.selectCourseById(id) );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "插入新的课程")
	@PutMapping("insertCourse")
	MsgResponse insertCourse(Course course) {
		try {
			pollService.insertCourse(course);
			return MsgResponse.success("成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "通过id删除课程")
	@DeleteMapping("deleteCourseById")
	public MsgResponse deleteCourseById(Long id) {
		try {
			 pollService.deleteCourseById(id);
			return MsgResponse.success("删除成功!",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("删除失败!");
		}
	}
	
	@ApiOperation(value = "通过id修改课程")
	@PostMapping("updateCourseById")
	public MsgResponse updateCourseById(Course course) {
		try {
			pollService.UpdateCourseById(course);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			
			return MsgResponse.error("更新失败"+e.toString());
		}
	}
	
	
}
