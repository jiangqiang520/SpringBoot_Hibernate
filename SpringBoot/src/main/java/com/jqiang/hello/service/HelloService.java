package com.jqiang.hello.service;

import com.jqiang.hello.po.Hello;
import com.jqiang.hello.response.ResponseInfo;

public interface HelloService {

	
	public ResponseInfo<String> save(Hello hello);
	
	public Hello findById(int id);

	public Iterable<Hello> findAllByIds(Iterable<Integer> ids);
	
}
