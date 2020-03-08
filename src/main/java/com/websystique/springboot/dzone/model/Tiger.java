package com.websystique.springboot.dzone.model;

public class Tiger {
private long id;
	
	private String name;
	
	private int age;
	
	

	public Tiger(){
		id=0;
	}



	public Tiger(long incrementAndGet, String string, int i) {
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
