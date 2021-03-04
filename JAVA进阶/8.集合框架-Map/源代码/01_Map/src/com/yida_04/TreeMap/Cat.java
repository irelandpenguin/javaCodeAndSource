package com.yida_04.TreeMap;

public class Cat implements Comparable<Cat> {
	private String name;
	private int age;

	public Cat() {
		super();
	}

	public Cat(String name, int age) {
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
	public int compareTo(Cat o) {
		// 主要条件，按年龄从小到大排序
		int num = this.age - o.age;// 如果想从大小到排序，只需要o.age-this.age;
		// 次要条件，年龄相同，并不代表姓名相同
		int num2 = num == 0 ? this.name.compareTo(o.name) : num;
		return num2;
	}

}
