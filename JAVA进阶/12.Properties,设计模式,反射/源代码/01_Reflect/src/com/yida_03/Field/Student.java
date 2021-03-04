package com.yida_03.Field;

public class Student {
	// 成员变量
	private String name;
	int age;
	public String address;

	// 构造方法
	public Student() {}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address="
				+ address + "]";
	}
}
