package com.yida_03;

public class Person {
	private String name;
	private int age;
	
	//无参构造
	public Person() {}
	//带参构造
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//get和set方法
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	//成员方法
	public void show() {
		System.out.println(name+"---"+age);
	}
}
