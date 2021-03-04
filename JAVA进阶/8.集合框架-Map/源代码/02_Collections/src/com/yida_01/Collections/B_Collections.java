/*
 * Collections可以针对ArrayList存储基本类型的元素排序，那它存储自定义对象时，可不可以排序呢?
 */
package com.yida_01.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class B_Collections {

	public static void main(String[] args) {
		//test1();// 自然排序
		//System.out.println("------");
		test2();// 比较器排序
	}

	// 自然排序
	public static void test1() {
		List<Student> lt = new ArrayList<Student>();
		Student s1 = new Student("张三", 23);
		Student s2 = new Student("李四", 25);
		Student s3 = new Student("王五", 21);
		Student s4 = new Student("赵六", 33);
		Student s5 = new Student("刘七", 26);
		lt.add(s1);
		lt.add(s2);
		lt.add(s3);
		lt.add(s4);
		lt.add(s5);

		Collections.sort(lt);

		// 增强for遍历
		for (Student stu : lt) {
			System.out.println(stu.getName() + "---" + stu.getAge());
		}
	}

	// 比较器排序
	public static void test2() {
		List<Teacher> lt = new ArrayList<Teacher>();
		Teacher t1 = new Teacher("张三三", 23);
		Teacher t2 = new Teacher("李四四", 25);
		Teacher t3 = new Teacher("王五五", 21);
		Teacher t4 = new Teacher("赵六六", 33);
		Teacher t5 = new Teacher("刘七七", 26);
		lt.add(t1);
		lt.add(t2);
		lt.add(t3);
		lt.add(t4);
		lt.add(t5);

		Collections.sort(lt, new Comparator<Teacher>() {// 比较器排序
					@Override
					public int compare(Teacher o1, Teacher o2) {
						// 主要条件，按老师的年龄从小到大排序
						int num = o1.getAge() - o2.getAge();
						// 次要条件，年龄相同，并不代表姓名相同，还需要用姓名区分
						int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
						return num2;
					}
				});

		// 增强for遍历
		for (Teacher tea : lt) {
			System.out.println(tea.getName() + "---" + tea.getAge());
		}
	}

}
