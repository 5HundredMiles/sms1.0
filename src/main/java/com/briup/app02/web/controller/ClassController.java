package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Clazz;
import com.briup.app02.service.IClazzVMService;
import com.briup.app02.service.IPollService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "班级相关接口")
@RestController
@RequestMapping("/ClassController")
public class ClassController {

	@Autowired
	private IPollService pollService;
	
	@Autowired
	private IClazzVMService clazzVMService;
	
	@ApiOperation(value = "查询所有班级")
	@GetMapping("selectAllClass")
	MsgResponse selectAllClass(){
		try {
			return MsgResponse.success("成功", pollService.selectAllClass());
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "通过id查询班级")
	@GetMapping("selectClassById")
	public MsgResponse selectClassById(Long id) {
		try {
			return MsgResponse.success("成功",pollService.selectClassById(id) );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "插入班级信息")
	@PutMapping("insertClass")
	MsgResponse insertClass(Clazz clazz) {
		try {
			pollService.insertClass(clazz);
			return MsgResponse.success("成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "通过id删除班级")
	@DeleteMapping("deleteClassById")
	public MsgResponse deleteClassById(Long id) {
		try {
			 pollService.deleteClassById(id);
			return MsgResponse.success("删除成功!",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("删除失败!");
		}
	}
	
	@ApiOperation(value = "通过id更新班级信息")
	@PostMapping("updateClassById")
	public MsgResponse updateClassById(Clazz clazz) {
		try {
			pollService.UpdateClassById(clazz);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			return MsgResponse.error("更新失败"+e.toString());
		}
	}
	
	@GetMapping("selectAll")
	public MsgResponse SelectAll() {
		try {
			
			return MsgResponse.success("查找成功", clazzVMService.findAllClazzVM());
		} catch (Exception e) {
			return MsgResponse.error("查找失败"+e.toString());
		}
	}
}
