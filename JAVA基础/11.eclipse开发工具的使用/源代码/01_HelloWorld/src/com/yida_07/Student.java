package com.yida_07;

public class Student {
	private String name;
	private int age;
	private char sex;

	// 无参构造方法 在代码区域右键--source--Generate Constructors from Superclass
	// 带参构造方法 在代码区域右键--source--Generate Constructors using fields..
	// 使用快捷自动生成构造方法(带参，无参都可以) alt+shift+s
	public Student() {
		super();
	}

	public Student(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//在代码区域右键--source--Generate Getters and Setters...
	// 使用快捷自动生成get和set方法，alt+shift+s
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

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

}
