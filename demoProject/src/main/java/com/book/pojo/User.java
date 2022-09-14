package com.book.pojo;

import javax.persistence.Column;
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
@Table(name="Users")
public class User {
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("id")
  private Integer userId;
  @Column(length =30)
  private String fname;
  @Column(length =30)
  private String lname;
  @Column(length =30)
  private String email;
  @Column(length =30)
  private String password;
  @Column(length =30)
  private Role role;
  
}
