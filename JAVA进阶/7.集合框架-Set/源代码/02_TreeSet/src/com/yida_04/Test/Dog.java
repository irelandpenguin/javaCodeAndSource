package com.yida_04.Test;

public class Dog {
	private String name;// 姓名
	private int age;// 年龄
	private char sex;// 性别
	private String color;// 颜色

	public Dog() {
		super();
	}

	public Dog(String name, int age, char sex, String color) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.color = color;
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

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return name + "--" + age + "--" + sex + "--" + color;
	}
}
