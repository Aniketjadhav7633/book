package com.book.pojo;

import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="publications")
public class Publication {
             
	private Integer id;
	private String name;
	
}
