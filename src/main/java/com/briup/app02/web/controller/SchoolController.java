package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.School;
import com.briup.app02.service.IPollService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "学校相关接口")
@RestController
@RequestMapping("/SchoolController")
public class SchoolController {

	@Autowired
	private IPollService pollService;
	
	@ApiOperation(value = "查询所有学校")
	@GetMapping("selectSchool")
	MsgResponse  selectSchool() {
		try {
			return MsgResponse.success("成功", pollService.selectSchool());
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "插入学校信息")
	@PutMapping("insertSchool")
	public MsgResponse insertSchool(School school)  {
		try {
			pollService.insertSchool(school);
			return MsgResponse.success("成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
		
	}
	
	@ApiOperation(value = "通过id删除学校信息")
	@DeleteMapping("deleteSchoolById")
	public MsgResponse deleteSchoolById(Long id) {
		try {
			pollService.deleteSchoolById(id);
			return MsgResponse.success("删除成功!",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("删除失败!");
		}
	}
	
	@ApiOperation(value = "通过id修改学校信息")
	@PostMapping("updateSchoolById")
	public MsgResponse updateSchoolById(School school) {
		try {
			pollService.UpdateSchoolById(school);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			return MsgResponse.error("更新失败"+e.toString());
		}
	}
}
