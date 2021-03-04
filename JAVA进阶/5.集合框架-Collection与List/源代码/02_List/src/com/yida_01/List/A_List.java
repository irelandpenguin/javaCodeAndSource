/**
	首先看 数据结构之数组和链表 图解，掌握内存中数组与链表的数据存储。
	知道了数组与链接的内存数据存储特点以后，下面再看List子类特点就比较容易了。
	List:(面试题：List的子类特点)
	ArrayList:
		底层数据结构是数组，查询快，增删慢。
		线程不安全，效率高。
	Vector:
		底层数据结构是数组，查询快，增删慢。
		线程安全，效率低。
	LinkedList:
		底层数据结构是链表，查询慢，增删快。
		线程不安全，效率高。
		
	List有三个儿子，我们到底使用谁呢?
		看需求(情况)。
		要安全吗?
			要：Vector(即使要安全，也不用这个了，后面有替代的)
			不要：ArrayList或者LinkedList
			查询多：ArrayList
			增删多：LinkedList
			
	如果你什么都不懂，就用ArrayList。
	
	
	需求：List集合存储字符串并遍历。
	List集合的特点：有序(存储和取出的元素一致)，存储元素可以重复。简称：有序可重复。
 */
package com.yida_01.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A_List {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 创建字符串并添加字符串
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("java");

		// 遍历集合
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

		System.out.println("------");
		
		Object[] arr = list.toArray();
		for(int i = 0; i < arr.length; i++) {
			String s = (String)arr[i];
			System.out.println(s);
		}

		
		// 创建集合对象
		List list2 = new ArrayList();

		// 创建学生对象
		Student stu1 = new Student("张三", 23);
		Student stu2 = new Student("李四", 33);
		Student stu3 = new Student("王五", 26);
		Student stu4 = new Student("赵六", 28);
		Student stu5 = new Student("刘七", 25);

		// 把学生对象添加到集合中
		list2.add(stu1);
		list2.add(stu2);
		list2.add(stu3);
		list2.add(stu4);
		list2.add(stu5);

		// 遍历集合
		Iterator it2 = list2.iterator();
		while (it2.hasNext()) {
			Student s = (Student) it2.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
