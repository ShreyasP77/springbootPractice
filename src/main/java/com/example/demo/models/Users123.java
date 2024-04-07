package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Users123 {

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  
	private int id;
	
	private String name;

	public Users123() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users123(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Users123 [id=" + id + ", name=" + name + "]";
	}
	
	
}
