package com.book.pojo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity

@Table(name="Orders")
public class Order {

	  @Id 
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @JsonProperty("id")
	  private Integer orderId;
	  private LocalDate orderDate;
	  private Integer userId;
	  private Integer bookId;
	  private Payment payment
	  
}
