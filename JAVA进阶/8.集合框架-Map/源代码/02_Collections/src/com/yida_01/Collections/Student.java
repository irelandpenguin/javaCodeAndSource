package com.yida_01.Collections;

public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
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

	@Override
	public int compareTo(Student o) {
		// 主要条件，按年龄从大到小排序
		int num = o.age - this.age;// 从大到小排
		// 次要条件，年龄相同，并不代表姓名相同，还需要再区分
		int num2 = num == 0 ? o.name.compareTo(this.name) : num;
		return num2;
	}

}
