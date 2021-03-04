/**
 * �Ƚ���
 * 
 * TreeSet���ϱ�֤Ԫ�������Ψһ��
 * Ψһ�ԣ��Ǹ��ݱȽϵķ����Ƿ���0��������
 * ����
 * 		A:��Ȼ����
 * 			��Ԫ����������ʵ����Ȼ����ӿ� Comparable
 * 		B:�Ƚ�������
 * 			�ü��ϵĹ��췽������һ���Ƚ����ӿڵ�������� Comparator
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
				// ��Ҫ����
				int num = o1.getAge() - o2.getAge();
				// ��Ҫ������Ϊ������ͬ����������������ͬ
				int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
				return num2;
			}
		});

		Student stu1 = new Student("����", 26);
		Student stu2 = new Student("����", 22);
		Student stu3 = new Student("����", 32);
		Student stu4 = new Student("����", 26);
		Student stu5 = new Student("����", 28);
		Student stu6 = new Student("����", 32);

		ts.add(stu1);
		ts.add(stu2);
		ts.add(stu3);
		ts.add(stu4);
		ts.add(stu5);
		ts.add(stu6);

		// ��ǿfor����
		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}

		System.out.println("------");

		// ����������
		Iterator<Student> it = ts.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}

}
