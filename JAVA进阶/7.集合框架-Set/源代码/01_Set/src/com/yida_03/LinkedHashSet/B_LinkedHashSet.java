package com.yida_03.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class B_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Student> hs = new LinkedHashSet<Student>();

		// 创建学生对象
		Student stu1 = new Student("张三", 26);
		Student stu2 = new Student("李四", 33);
		Student stu3 = new Student("王五", 28);
		Student stu4 = new Student("赵六", 21);
		Student stu5 = new Student("刘七", 25);
		Student stu6 = new Student("张三", 26);
		Student stu7 = new Student("王五", 28);
		Student stu8 = new Student("刘七", 25);

		// 添加元素
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		hs.add(stu4);
		hs.add(stu5);
		hs.add(stu6);
		hs.add(stu7);
		hs.add(stu8);

		// 增加for遍历
		for (Student stu : hs) {
			System.out.println(stu.getName() + "---" + stu.getAge());
		}

		System.out.println("------");

		// 迭代器遍历
		Iterator<Student> it = hs.iterator();
		while (it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu.getName() + "---" + stu.getAge());
		}
	}

}
