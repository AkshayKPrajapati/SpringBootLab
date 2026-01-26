package com.xml.data.entity;

import jakarta.persistence.Entity;

@Entity
public class StudentEntity {
	
	private int id;
	private String name;
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
		return "StudentEntity [id=" + id + ", name=" + name + "]";
	}
	public StudentEntity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
