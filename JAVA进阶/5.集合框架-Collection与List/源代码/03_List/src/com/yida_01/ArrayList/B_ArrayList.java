/**
 * ArrayList存储自定义对象并遍历
 */
package com.yida_01.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class B_ArrayList {

	public static void main(String[] args) {
		// 创建集合对象
		ArrayList list = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("张三", 29);
		Student s2 = new Student("李四", 27);
		Student s3 = new Student("王五", 31);
		Student s4 = new Student("赵六", 22);

		// 添加元素
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		// 迭代器遍历
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

		System.out.println("------");

		// for循环遍历
		for (int x = 0; x < list.size(); x++) {
			Student stu = (Student) list.get(x);
			System.out.println(stu.getName() + "---" + stu.getAge());
		}
	}

}
