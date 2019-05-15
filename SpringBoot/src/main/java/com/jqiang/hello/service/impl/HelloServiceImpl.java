package com.jqiang.hello.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import com.jqiang.hello.dao.HelloDAO;
import com.jqiang.hello.po.Hello;
import com.jqiang.hello.response.ResponseInfo;
import com.jqiang.hello.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService{

	
	
	@Autowired
	private HelloDAO dao;

	@Override
	public ResponseInfo<String> save(Hello hello) {
		ResponseInfo<String> res = new ResponseInfo<>();
		dao.save(hello);
		res.setCode("0000");
		res.setMessage("操作成功");
		res.setData("ok");
		return res;
	}

	@Override
	public Hello findById(int id) {
		return dao.findById(id);
	}

	@Override
	public Iterable<Hello> findAllByIds(Iterable<Integer> ids) {
		
		return dao.findAllById(ids);
	}
	
	
	public ResponseInfo<String> getHello(int id){
		ResponseInfo<String> res = new ResponseInfo<>();
		res.setCode("00");
		res.setData(dao.findById(id).toString());
		return res;
	}
	
	@CacheEvict
	public void remove(int id){
		
	}
}
