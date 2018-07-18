package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Question;
import com.briup.app02.service.IPollService;
import com.briup.app02.service.IQuestionVMService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiKeyAuthDefinition;
import io.swagger.annotations.ApiOperation;

@Api(description = "问题相关接口")
@RestController
@RequestMapping("/QuestionController")
public class QuestionController {
	@Autowired
	private IPollService pollService;
	
	@Autowired
	private IQuestionVMService questionVMService;
	
	@ApiOperation(value = "查询所有问题")
	@GetMapping("selectAllQuestion")
	MsgResponse selectAllQuestion(){
		try {
			return MsgResponse.success("成功",pollService.selectAllQuestion() );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "通过id查询问题")
	@GetMapping("selectQuestionById")
	MsgResponse selectQuestionById(Long id){
		try {
			return MsgResponse.success("成功",pollService.selectQuestionById(id) );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	
	@ApiOperation(value = "插入新问题")
	@PutMapping("insertQuestion")
	public MsgResponse insertQuestion(Question question)  {
		try {
			pollService.insertQuestion(question);
			return MsgResponse.success("成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
		
	}
	
	@ApiOperation(value = "通过id删除问题")
	@DeleteMapping("deleteQuestionById")
	public MsgResponse deleteQuestionById(Long id) {
		try {
			 pollService.deleteQuestionById(id);
			return MsgResponse.success("删除成功!",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("删除失败!");
		}
	}
	
	@ApiOperation(value = "通过id修改问题")
	@PostMapping("updateQuestionById")
	public MsgResponse updateQuestionById(Question question) {
		try {
			pollService.UpdateQuestionById(question);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			return MsgResponse.error("更新失败"+e.toString());
		}
	}
	
	@ApiOperation("查询所有问题及对应选项")
	@GetMapping("findAllQuestionVM")
	public MsgResponse findAllQuestionVM() {
		try {
			return	MsgResponse.success("成功", questionVMService.findAllQuestionVM());
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败"+e.toString());
			
		}
	}
}
