/**
 * 需求：存储自定义对象，并保证元素的唯一性。要求：如果两个对象的成员变量值都相同，则默认为同一个元素。
 */
package com.yida_02.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class B_HashSet {

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();

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
		hs.add(null);

		// 增加for遍历
		for (Student stu : hs) {
			if (stu != null) {
				System.out.println(stu.getName() + "---" + stu.getAge());
			}
		}

		System.out.println("------");

		// 迭代器遍历
		Iterator<Student> it = hs.iterator();
		while (it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu);
		}

		/*
		 * 发现，目前的结果是不符合需求的：因为我们知道HashSet底层依赖的是hashCode()和equals()方法。
		 * 而这两个方法我们在学生类中没有重写，所以，默认使用的是Object类的，Object类的hashCode()方
		 * 法获取的哈希值默认是依赖实际对象的内存地址，而对象的内存地址默认是不相同的。
		 * 
		 * 解决方法：在学生类中自动生成hashCode()和equals()方法即可。
		 */
	}

}
