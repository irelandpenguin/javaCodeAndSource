package com.yida_02.Test;

/*
 * ����������
 */
public class Dog implements Comparable<Dog> {
	private String name;// ����
	private int age;// ����
	private char sex;// �Ա�
	private String color;// ��ɫ

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
		// ��Ҫ����
		int num = this.name.compareTo(o.getName());
		// ��Ҫ����1����Ϊ������ͬ����������������ͬ
		int num2 = num == 0 ? this.age - o.getAge() : num;
		// ��Ҫ����2����ʹ������ͬ��Ҳ���������Ա���ͬ
		int num3 = num2 == 0 ? this.sex - o.getSex() : num2;
		// ��Ҫ����3����ʹ�Ա���ͬ��Ҳ����������ɫ��ͬ
		int num4 = num3 == 0 ? this.color.compareTo(o.getColor()) : num3;
		return num4;
	}
}
