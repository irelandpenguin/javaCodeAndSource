/**
 * TreeSet存储自定义对象并保证排序和唯一。
 * 
 * A:怎么排序?
 * 		自然排序，按照年龄从小到大排序
 * B:元素什么情况算唯一?
 * 		成员变量值都相同即为同一个元素
 */
package com.yida_01.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class B_TreeSet {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>();// 自然排序
		Student stu1 = new Student("张三", 26);
		Student stu2 = new Student("李四", 22);
		Student stu3 = new Student("王五", 32);
		Student stu4 = new Student("张三", 26);
		Student stu5 = new Student("李四成", 28);
		Student stu6 = new Student("李四", 28);
		Student stu7 = new Student("王五", 32);

		ts.add(stu1);
		ts.add(stu2);
		ts.add(stu3);
		ts.add(stu4);
		ts.add(stu5);
		ts.add(stu6);
		ts.add(stu7);

		// 增强for遍历
		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}

		System.out.println("------");

		// 迭代器遍历
		Iterator<Student> it = ts.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}

}
