package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Qq;
import com.briup.app02.service.IPollService;
import com.briup.app02.service.IQqVMService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/QqController")
public class QqController {
	@Autowired
	private IPollService pollService;
	
	@Autowired
	private IQqVMService qqVMService;
	

	@GetMapping("selectAllQq")
	MsgResponse selectAllQq(){
		try {
			return MsgResponse.success("成功",pollService.selectAllQq() );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@GetMapping("selectAllQqVM")
	MsgResponse selectAllQqVM(){
		try {
			return MsgResponse.success("成功",qqVMService.findAllQqVM() );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	
	@PutMapping("insertQq")
	public MsgResponse insertQq(Qq qq)  {
		try {
			pollService.insertQq(qq);
			return MsgResponse.success("成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
		
	}
	

	@DeleteMapping("deleteQqById")
	public MsgResponse deleteQqById(Long id) {
		try {
			 pollService.deleteQqById(id);
			return MsgResponse.success("删除成功!",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("删除失败!");
		}
	}
	
	
	@PostMapping("updateQqById")
	public MsgResponse updateQqById(Qq qq) {
		try {
			pollService.UpdateQqById(qq);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			return MsgResponse.error("更新失败"+e.toString());
		}
	}
}
