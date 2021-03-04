/**
 * 比较器
 * 
 * TreeSet集合保证元素排序和唯一性
 * 唯一性：是根据比较的返回是否是0来决定。
 * 排序：
 * 		A:自然排序
 * 			让元素所属的类实现自然排序接口 Comparable
 * 		B:比较器排序
 * 			让集合的构造方法接收一个比较器接口的子类对象 Comparator
 */
package com.yida_03.Comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class B_TreeSet {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// 主要排序
				int num = o1.getAge() - o2.getAge();
				// 次要排序，因为年龄相同，并不代表姓名相同
				int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
				return num2;
			}
		});

		Student stu1 = new Student("张三", 26);
		Student stu2 = new Student("李四", 22);
		Student stu3 = new Student("王五", 32);
		Student stu4 = new Student("张三", 26);
		Student stu5 = new Student("李四", 28);
		Student stu6 = new Student("王五", 32);

		ts.add(stu1);
		ts.add(stu2);
		ts.add(stu3);
		ts.add(stu4);
		ts.add(stu5);
		ts.add(stu6);

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
