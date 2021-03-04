package com.yida_02;

/**
 * 一个完整的学生类
 * 
 * @author Administrator
 * 
 */
public class Student {
	// 成员变量
	private String name;
	private int age;
	private char sex;

	// 无参构造
	public Student() {

	}

	// 带参构造
	public Student(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	// get和set方法
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public char getSex() {
		return sex;
	}

	// 成员方法
	public void show() {
		System.out.println(name + "---" + age + "----" + sex);
	}

	public static void main(String[] args) {
		// 使用无参构造，创建的对象
		Student s = new Student();
		s.setName("黄小明");
		s.setAge(32);
		s.setSex('男');
		System.out.println(s.getName() + "---" + s.getAge() + "---"
				+ s.getSex());

		System.out.println("----------------");

		// 使用带参构造，创建对象
		Student s2 = new Student("邓超", 41, '男');
		s2.show();
	}

}
