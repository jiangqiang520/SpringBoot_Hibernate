package com.jqiang.hello.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jqiang.hello.po.Hello;
@Repository
public interface HelloDAO extends CrudRepository<Hello, Integer>{

	@Query("from Hello where id=?1")
	public Hello findById(int id);
	
	
	
}
