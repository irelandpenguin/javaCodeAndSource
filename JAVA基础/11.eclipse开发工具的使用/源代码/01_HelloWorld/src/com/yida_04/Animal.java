package com.yida_04;

public abstract class Animal {
	private String name;
	
	public Animal(){}
	public Animal(String name) {
		this.name = name;
	}
	
	//getºÍset·½·¨
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void eat();//³Ô
	public abstract void sleep();//Ë¯
}
