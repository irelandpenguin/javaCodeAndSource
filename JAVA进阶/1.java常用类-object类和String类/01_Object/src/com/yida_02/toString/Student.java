package com.yida_02.toString;

public class Student {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
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

	/*
	//手工重写，把该类的所有成员变量值组成返回
	@Override //标记作用，表示子类重写父类的方法
	public String toString() {
		return "姓名:"+name+", 年龄:"+age;
	}
	*/
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
