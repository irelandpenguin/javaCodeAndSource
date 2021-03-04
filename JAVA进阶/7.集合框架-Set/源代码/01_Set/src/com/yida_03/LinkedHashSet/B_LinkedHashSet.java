package com.yida_03.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class B_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Student> hs = new LinkedHashSet<Student>();

		// ����ѧ������
		Student stu1 = new Student("����", 26);
		Student stu2 = new Student("����", 33);
		Student stu3 = new Student("����", 28);
		Student stu4 = new Student("����", 21);
		Student stu5 = new Student("����", 25);
		Student stu6 = new Student("����", 26);
		Student stu7 = new Student("����", 28);
		Student stu8 = new Student("����", 25);

		// ���Ԫ��
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		hs.add(stu4);
		hs.add(stu5);
		hs.add(stu6);
		hs.add(stu7);
		hs.add(stu8);

		// ����for����
		for (Student stu : hs) {
			System.out.println(stu.getName() + "---" + stu.getAge());
		}

		System.out.println("------");

		// ����������
		Iterator<Student> it = hs.iterator();
		while (it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu.getName() + "---" + stu.getAge());
		}
	}

}
