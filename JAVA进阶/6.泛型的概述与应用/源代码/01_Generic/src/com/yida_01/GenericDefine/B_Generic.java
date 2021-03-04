/**
 * 泛型在哪些地方使用呢?
 * 		看API，如果类，接口，抽象类后面跟的有<E>就说明使用了泛型。一般来说就是在集合中使用。
 * 
 */
package com.yida_01.GenericDefine;

import java.util.ArrayList;
import java.util.Iterator;

public class B_Generic {

	public static void main(String[] args) {
		// 利用泛型+集合添加和遍历字符串对象
		//genericTest1();

		// 利用泛型+集合添加Integer数字对象
		//genericTest2();

		// 利用泛型+集合添加学生对象
		genericTest3();
	}

	public static void genericTest1() {
		ArrayList<String> list = new ArrayList<String>();
		// ArrayList<String> list = new ArrayList<>();// JDK7的新特性：泛型推断。但不建议使用。
		list.add("hello");
		list.add("world");
		list.add("java");

		// 迭代器遍历
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("-------");

		// for循环遍历
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
	}

	public static void genericTest2() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// ArrayList<Integer> list = new ArrayList<>();// JDK7的新特性：泛型推断。但不建议使用。
		list.add(new Integer(100));
		list.add(10);// 采用jdk5的新特性：装箱功能
		list.add(Integer.valueOf(20));

		// 迭代器遍历
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}

		System.out.println("------");

		// for循环遍历
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void genericTest3() {
		/*
		 * 需求：存储自定义对象并遍历。
		 * A:创建学生类 B:创建集合对象 C:创建元素对象 D:把元素添加到集合 E:遍历集合
		 */

		ArrayList<Student> list = new ArrayList<Student>();
		// ArrayList<Student> list = new ArrayList<>();// JDK7的新特性：泛型推断。但不建议使用。
		Student stu1 = new Student("张三", 26);
		Student stu2 = new Student("李四", 30);
		Student stu3 = new Student("王五", 28);
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);

		// 迭代器遍历
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu);
		}

		System.out.println("------");

		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			System.out.println(stu);
		}
	}
}
