package com.yidahulian_04;

/*
 * 创建单例学生类
 */
public class Student {
	// 构造方法私有化，防止外界创建对象
	private Student() {
	}

	// 在成员位置创建一个静态成员对象，用private修饰，访问外界直接调用
	private static Student stu = new Student();

	// 创建一个公共方法，提供访问
	public static Student getStudent() {
		return stu;
	}
}
