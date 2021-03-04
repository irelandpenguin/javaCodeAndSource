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
		// ��Ҫ�������������С��������
		int num = this.age - o.age;// �����Ӵ�С������ֻ��Ҫo.age-this.age;
		// ��Ҫ������������ͬ����������������ͬ
		int num2 = num == 0 ? this.name.compareTo(o.name) : num;
		return num2;
	}

}
