package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Grade;
import com.briup.app02.service.IPollService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "成绩相关接口")
@RestController
@RequestMapping("/GradeController")
public class GradeController {
	
	@Autowired
	private IPollService pollService;
	
	@ApiOperation(value = "查询所有成绩")
	@GetMapping("selectAllGrade")
	MsgResponse selectAllGrade(){
		try {
			return MsgResponse.success("成功",pollService.selectAllGrade() );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "通过id查询成绩")
	@GetMapping("selectGradeById")
	MsgResponse selectGradeById(Long id){
		try {
			return MsgResponse.success("成功",pollService.selectGradeById(id) );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	
	
	@ApiOperation(value = "插入新的成绩")
	@PutMapping("insertGrade")
	MsgResponse insertGrade(Grade grade) {
		try {
			pollService.insertGrade(grade);
			return MsgResponse.success("成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "通过id删除成绩")
	@DeleteMapping("deleteGradeById")
	public MsgResponse deleteGradeById(Long id) {
		try {
			pollService.deleteGradeById(id);
			return MsgResponse.success("删除成功!",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("删除失败!");
		}
	}
	
	@ApiOperation(value = "通过id修改成绩")
	@PostMapping("updateGradeById")
	public MsgResponse updateGradeById(Grade grade) {
		try {
			pollService.UpdateGradeById(grade);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			return MsgResponse.error("更新失败"+e.toString());
		}
	}
}
