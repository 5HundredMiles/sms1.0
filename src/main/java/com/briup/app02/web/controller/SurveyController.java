package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Survey;
import com.briup.app02.service.IPollService;
import com.briup.app02.service.ISurveyVMService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="调查相关接口")
@RestController
@RequestMapping("/SurveyController")
public class SurveyController {

	@Autowired
	private IPollService pollService;
	
	@Autowired
	private ISurveyVMService surveyVMService;
	
	@ApiOperation(value = "查询所有调查")
	@GetMapping("selectAllSurvey")
	MsgResponse selectAllSurvey(){
		try {
			return MsgResponse.success("成功",pollService.selectAllSurvey() );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@GetMapping("selectSurveyById")
	MsgResponse selectSurveyById(Long id) {
		try {
			return MsgResponse.success("查询成功",pollService.selectSurveyById(id));
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("查询失败");
		}
	}
	
	@GetMapping("findAllSurveyVM")
	MsgResponse findAllSurveyVM(){
		try {
			return MsgResponse.success("成功",surveyVMService.findAllSurveyVM() );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "插入新的调查")
	@PutMapping("insertSurvey")
	public MsgResponse insertSurvey(Survey survey)  {
		try {
			pollService.insertSurvey(survey);
			return MsgResponse.success("成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
		
	}
	
	@ApiOperation(value = "通过id删除调查")
	@DeleteMapping("deleteSurveyById")
	public MsgResponse deleteSurveyById(Long id) {
		try {
			 pollService.deleteSurveyById(id);
			return MsgResponse.success("删除成功!",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("删除失败!");
		}
	}
	
	@ApiOperation(value = "通过id修改调查")
	@PostMapping("updateSurveyById")
	public MsgResponse updateSurveyById(Survey survey) {
		try {
			pollService.UpdateSurveyById(survey);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			return MsgResponse.error("更新失败"+e.toString());
		}
	}
}
