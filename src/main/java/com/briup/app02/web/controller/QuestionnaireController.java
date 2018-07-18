package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Questionnaire;
import com.briup.app02.service.IPollService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "问卷调查相关接口")
@RestController
@RequestMapping("/QuestionnaireControlller")
public class QuestionnaireController {
	@Autowired
	private IPollService pollService;
	
	@ApiOperation(value = "查询所有问卷调查")
	@GetMapping("selectAllQuestionNaire")
	MsgResponse selectAllQuestionNaire(){
		try {
			return MsgResponse.success("成功",pollService.selectAllQuestionNaire() );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "通过id查询问卷调查")
	@GetMapping("selectQuestionnaireById")
	MsgResponse selectQuestionnaireById(Long id){
		try {
			return MsgResponse.success("成功",pollService.selectQuestionnaireById(id) );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "插入新的问卷调查")
	@PutMapping("insertQuestionNaire")
	public MsgResponse insertQuestionNaire(Questionnaire questionnaire)  {
		try {
			pollService.insertQuestionNaire(questionnaire);
			return MsgResponse.success("成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
		
	}
	
	@ApiOperation(value = "通过id删除问卷调查")
	@DeleteMapping("deleteQuestionNaireById")
	public MsgResponse deleteQuestionNaireById(Long id) {
		try {
			 pollService.deleteQuestionNaireById(id);
			return MsgResponse.success("删除成功!",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("删除失败!");
		}
	}
	
	@ApiOperation(value = "通过id修改问卷调查")
	@PostMapping("updateQuestionnaireById")
	public MsgResponse updateQuestionnaireById(Questionnaire questionnaire) {
		try {
			pollService.UpdateQuestionNaireById(questionnaire);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			return MsgResponse.error("更新失败"+e.toString());
		}
	}
}
