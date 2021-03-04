/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。
 * (1).用for循环遍历。
 * (2).用迭代器遍历。
 */
package com.yida_03.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class B_Test {

	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建学生对象
		Student stu1 = new Student("张三", 23);
		Student stu2 = new Student("李四", 33);
		Student stu3 = new Student("王五", 26);
		Student stu4 = new Student("赵六", 28);
		Student stu5 = new Student("刘七", 25);

		// 把学生对象添加到集合中
		c.add(stu1);
		c.add(stu2);
		c.add(stu3);
		c.add(stu4);
		c.add(stu5);

		// 方式一：for循环遍历
		/*Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			Student stu = (Student) arr[i];//强制类型转换
			System.out.println(stu.getName() + "---" + stu.getAge());
		}

		System.out.println("------");*/

		
		// 方式二：迭代器遍历
		Iterator itt = c.iterator();
		while (itt.hasNext()) {
			Student stu = (Student) itt.next();//强制类型转换
			System.out.println(stu);//默认调用对象的toString()
		}
	}

}
