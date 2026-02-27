package com.springboot.dto;


public class StudentDto {
	private String name;
	private String city;
	private int mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public StudentDto(String name, String city, int mark) {
		super();
		this.name = name;
		this.city = city;
		this.mark = mark;
	}
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", city=" + city + ", mark=" + mark + "]";
	}
	
	
	
}
