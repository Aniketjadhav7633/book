package com.book.pojo;

import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="Categories")
public class Category {

	private Integer id;
	private String name;
	
	
	
}
