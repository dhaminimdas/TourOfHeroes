package com.in28minutes.spring.basics.springbootin10Steps;

public class Hero 
{
	int id;
	String name;
	
	public Hero(int id, String name) 
	{
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
	
}
