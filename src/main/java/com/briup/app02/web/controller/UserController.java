package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.User;
import com.briup.app02.service.IPollService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "用户相关接口")
@RestController
@RequestMapping("/UserController")
public class UserController {
	@Autowired
	private IPollService pollService;
	

	@ApiOperation(value = "查询所有用户")
	@GetMapping("selectAllUser")
	MsgResponse selectAllUser(){
		try {
			return MsgResponse.success("成功",  pollService.selectAllUser());
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "通过id查询用户")
	@GetMapping("selectUserById")
	public MsgResponse selectUserById(Long id) {
		try {
			return MsgResponse.success("成功",pollService.selectUserById(id) );
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "插入用户")
	@PutMapping("insertUser")
	MsgResponse insertUser(User user) {
		try {
			pollService.insertUser(user);
			return MsgResponse.success("成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("失败");
		}
	}
	
	@ApiOperation(value = "通过id删除用户")
	@DeleteMapping("deleteUserById")
	public MsgResponse deleteUserById(Long id) {
		try {
			 pollService.deleteUserById(id);
			return MsgResponse.success("删除成功!",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error("删除失败!");
		}
	}
	
	@ApiOperation(value = "通过id修改用户")
	@PostMapping("updateUserById")
	public MsgResponse updateUserById(User user) {
		try {
			pollService.UpdateUserById(user);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			return MsgResponse.error("更新失败"+e.toString());
		}
	}
}
