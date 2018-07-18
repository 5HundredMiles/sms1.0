package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Option;
import com.briup.app02.service.IPollService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "选项相关接口")
@RestController
@RequestMapping("/OptionController")
public class OptionController {
	@Autowired
	private IPollService pollService;
	
	
	@ApiOperation(value = "查询所有选项")
	@GetMapping("selectAllOption")
	MsgResponse selectAllOption(){
		try {
			return MsgResponse.success("成功",pollService.selectAllOption() );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "通过问题Id查询选项")
	@GetMapping("findByQuestionId")
	MsgResponse findByQuestionId(Long id){
		try {
			return MsgResponse.success("成功",pollService.findByQuestionId(id) );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败"+e.toString());
		}
	}
	
	@ApiOperation(value = "插入选项")
	@PutMapping("insertOption")
	public MsgResponse insertOption(Option option)  {
		try {
			pollService.insertOption(option);
			return MsgResponse.success("成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
		
	}
	
	@ApiOperation(value = "通过id删除选项")
	@DeleteMapping("deleteOptionById")
	public MsgResponse deleteOptionById(Long id) {
		try {
			 pollService.deleteOptionById(id);
			return MsgResponse.success("删除成功!",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("删除失败!");
		}
	}
	
	@ApiOperation(value = "通过id修改选项")
	@PostMapping("updateOptionById")
	public MsgResponse updateOptionById(Option option) {
		try {
			pollService.UpdateOptionById(option);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			return MsgResponse.error("更新失败"+e.toString());
		}
	}



}
