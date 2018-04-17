package com.jqiang.hello.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="hello")
@NoArgsConstructor
@Entity
public class Hello {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(length=200,nullable=false)
	private String content;
	
	
	
}
