/**
 * 需求：ArrayList存储自定义对象并遍历。要求加入泛型，并用增强for遍历。
 * A:迭代器遍历
 * B:普通for遍历
 * C:增强for遍历
 * 
 * LinkedList,Vector,Colleciton,List等存储，我要求你们自已课后练习。
 * 
 * 增强for是用来替代迭代器。
 */
package com.yida_01.jdk5new;

import java.util.ArrayList;
import java.util.Iterator;

public class B_For {

	public static void main(String[] args) {
		ArrayList<Student> lt = new ArrayList<Student>();
		Student stu1 = new Student("张三", 30);
		Student stu2 = new Student("李四", 23);
		Student stu3 = new Student("王五", 28);
		Student stu4 = new Student("赵六", 25);
		lt.add(stu1);
		lt.add(stu2);
		lt.add(stu3);
		lt.add(stu4);

		// 迭代器遍历
		System.out.println("---迭代器遍历---");
		Iterator<Student> it = lt.iterator();
		while (it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu);
		}

		
		// 普通for遍历
		System.out.println("---普通for遍历---");
		for (int i = 0; i < lt.size(); i++) {
			Student stu = lt.get(i);
			System.out.println(stu.toString());
		}
		
		// 增强for遍历
		System.out.println("---增强for遍历---");
		for (Student stu : lt) {
			System.out.println(stu.toString());
		}
	}

}
