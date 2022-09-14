package com.book.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="Books")
public class Book {

	 @Id 
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @JsonProperty("id")
	private Integer bookId;
	 @Column(length =30)
	private String title;
	 @Column(length =100)
	private String description;
	 @Column(length =30)
	 @ManyToMany

		@JoinTable(name = "books_author", 
		joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
	private Author author;
	 @Column(length =30)
	 @OneToOne
	private Category category;
	 @OneToOne
	 @Column(length =30)
	 
	private Publication publication;
}
