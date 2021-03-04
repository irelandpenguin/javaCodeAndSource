package com.yida_04.Method;

public class Student {
	// 成员变量
	private String name;
	int age;
	public String address;

	// 构造方法
	public Student() {
	}

	private Student(String name) {
		this.name = name;
	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	// 成员方法
	public void show() {
		System.out.println(name + "--" + age + "--" + address);
	}

	private void print() {
		System.out.println("java");
	}

	void hello() {
		System.out.println("hello world");
	}

	public void test1(String str, int num) {
		System.out.println(str + "---" + num);
	}

	public String test2(String s, int num1, int num2) {
		return s + "--" + num1 + "--" + num2;
	}

	private int test3(int a, int b) {
		return (a + b);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
