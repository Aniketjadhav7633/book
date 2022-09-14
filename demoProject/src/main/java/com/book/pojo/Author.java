package com.book.pojo;

import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="Authors")
public class Author {

	private Integer id;
	private String name;
	private String email;


}
