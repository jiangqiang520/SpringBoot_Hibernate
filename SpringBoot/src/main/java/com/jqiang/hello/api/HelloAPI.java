package com.jqiang.hello.api;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jqiang.hello.po.Hello;
import com.jqiang.hello.response.ResponseInfo;
import com.jqiang.hello.service.impl.HelloServiceImpl;

@RestController
@Slf4j
public class HelloAPI {

	@Autowired
	private HelloServiceImpl service;
	
	@RequestMapping("/api/getHello")
	public ResponseInfo<String> hello(int id){
	
		return service.getHello(id);
	}
	
	
	@RequestMapping("/api/saveHello")
	public ResponseInfo<String> saveHello(@RequestParam("content")String content){
		log.info("content:"+content);
		Hello hello = new Hello();
		hello.setContent(content);
		return service.save(hello);
	}
}
