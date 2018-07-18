package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Answer;
import com.briup.app02.service.IAnswerVMService;
import com.briup.app02.service.IPollService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "答案相关接口")
@RestController
@RequestMapping("/AnswerController")
public class AnswerController {
	@Autowired
	private IPollService pollService;
	
	@Autowired
	private IAnswerVMService answerVMService;
	
	@ApiOperation(value = "查询所有答案")
	@GetMapping("selectAllAnswer")
	MsgResponse selectAllAnswer(){
		try {
			return MsgResponse.success("成功",pollService.selectAllAnswer() );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}

	@ApiOperation(value = "插入新的答案")
	@PutMapping("insertAnswer")
	public MsgResponse insertAnswer(Answer answer)  {
		try {
			pollService.insertAnswer(answer);
			return MsgResponse.success("成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
		
	}

	@ApiOperation(value = "通过id删除答案")
	@DeleteMapping("deleteAnswerById")
	public MsgResponse deleteAnswerById(Long id) {
		try {
			 pollService.deleteAnswerById(id);
			return MsgResponse.success("删除成功!",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("删除失败!");
		}
	}
	

	@ApiOperation(value = "通过id修改答案")
	@PostMapping("updateAnswerById")
	public MsgResponse updateAnswerById(Answer answer) {
		try {
			pollService.UpdateAnswerById(answer);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			return MsgResponse.error("更新失败"+e.toString());
		}
	}
	
	@GetMapping("findAllAnswerVM")
	public MsgResponse findAllAnswerVM() {
		try {		
			return MsgResponse.success("查询成功",answerVMService.findAllAnswerVM());
		} catch (Exception e) {
			return MsgResponse.error("查询失败"+e.toString());
		}
	}
}
