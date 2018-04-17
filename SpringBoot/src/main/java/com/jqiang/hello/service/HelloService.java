package com.jqiang.hello.service;

import com.jqiang.hello.po.Hello;

public interface HelloService {

	
	public void save(Hello hello);
	
	public Hello findById(int id);

	public Iterable<Hello> findAllByIds(Iterable<Integer> ids);
	
}
