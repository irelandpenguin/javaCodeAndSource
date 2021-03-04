package com.yidahulian_04;

/*
 * 单例模式：保证类在内存中只有一个对象。
 * 
 * 如何保证类在内存中只有一个对象呢?
 * 		A：把构造方法私有化
 * 		B:在成员位置自己创建一个静态对象
 * 		C:通过一个公共的方法提供访问
 */
public class StudentDemo {

	public static void main(String[] args) {
		Student stu1 = Student.getStudent();
		Student stu2 = Student.getStudent();
		if (stu1 == stu2) {
			System.out.println(stu1);
			System.out.println(stu2);
			System.out.println("同一个学生对象");
		}
	}

}
