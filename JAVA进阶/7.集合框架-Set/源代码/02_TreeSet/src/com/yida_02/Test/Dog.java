package com.yida_02.Test;

/*
 * 按姓名排序
 */
public class Dog implements Comparable<Dog> {
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

	@Override
	public int compareTo(Dog o) {
		// 主要排序
		int num = this.name.compareTo(o.getName());
		// 次要排序1，因为姓名相同，并不代表年龄相同
		int num2 = num == 0 ? this.age - o.getAge() : num;
		// 次要排序2，即使年龄相同，也并不代表性别相同
		int num3 = num2 == 0 ? this.sex - o.getSex() : num2;
		// 次要排序3，即使性别相同，也并不代表颜色相同
		int num4 = num3 == 0 ? this.color.compareTo(o.getColor()) : num3;
		return num4;
	}
}
