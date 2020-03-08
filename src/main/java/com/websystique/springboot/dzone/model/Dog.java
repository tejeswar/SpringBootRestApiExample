package com.websystique.springboot.dzone.model;

public class Dog {

private long id;
	
	private String name;
	
	private int age;
	
	

	public Dog(){
		id=0;
	}



	public Dog(long incrementAndGet, String string, int i) {
		// TODO Auto-generated constructor stub
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	
	
}
