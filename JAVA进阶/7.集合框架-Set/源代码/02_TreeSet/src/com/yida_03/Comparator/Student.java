package com.yida_03.Comparator;

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
		// 主要排序，默认按年龄排
		int age = this.age - o.age;
		//如果年龄相同呢？我们还需要次要排序，因为年龄相同，并不代表同一个人。我们还需要比较姓名。
		int num = (age == 0) ? this.name.compareTo(o.name) : age;
		return num;
	}

}
