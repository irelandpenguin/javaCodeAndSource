/**
 * List集合的特有遍历功能：
 * 列表迭代器
 * 		ListIterator listIterator()：List集合特有的迭代器
 */
package com.yida_02.ListMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.yida_01.List.Student;

public class B_List {

	public static void main(String[] args) {
		/*List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");

		//第一种遍历方式：size()和get()方法结合使用
		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			System.out.println(s);
		}

		System.out.println("------");
		
		//第二种遍历方式：通过listIterator()遍历
		//ListIterator listIterator()：List集合特有的迭代器
		ListIterator it = list.listIterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			int idx  = it.nextIndex();//注意：迭代器索引，默认从1开始。
			System.out.println(s+"---"+idx);
		}
		
		System.out.println("------");
		
		//第三种遍历方式：通过iterator()遍历
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------");
		
		//第四种遍历方式：
		Object[] arr = list.toArray();
		for (int i = 0; i < arr.length; i++) {
			String s = (String)arr[i];
			System.out.println(s);
		}*/

		
		// 创建集合对象
		List lt = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("张三", 25);
		Student s2 = new Student("李四", 31);
		Student s3 = new Student("王五", 23);

		// 把学生添加到集合中
		lt.add(s1);
		lt.add(s2);
		lt.add(s3);

		// 方式一：for循环遍历
		for (int i = 0; i < lt.size(); i++) {
			Student stu = (Student) lt.get(i);
			System.out.println(stu.getName() + "---" + stu.getAge());
		}

		System.out.println("------");

		// 方式二：迭代器遍历
		Iterator it = lt.iterator();
		while (it.hasNext()) {
			Student stu = (Student) it.next();
			System.out.println(stu);
		}
		
		//通过listIterator()遍历
		//通过toArray()遍历
		//以上两种遍历，大家自写。
	}

}
