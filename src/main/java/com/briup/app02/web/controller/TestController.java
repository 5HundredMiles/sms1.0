package com.briup.app02.web.controller;

import javax.xml.ws.soap.Addressing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

/**
 * 路由的命名空间
 * http://123.0.0.1:8080 可以访问到当前项目
 * http://123.0.0.1:8080/test 可以访问到当前项目的TestController这个类
 * http://123.0.0.1:8080//test/hello 可以访问到hello这个函数
 * 
 */
@ApiIgnore
@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("world")
	public String world() {
		return "hello world";
	}
}
