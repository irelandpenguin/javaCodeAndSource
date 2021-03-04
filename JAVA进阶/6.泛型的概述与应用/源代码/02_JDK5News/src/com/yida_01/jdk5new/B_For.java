/**
 * ����ArrayList�洢�Զ�����󲢱�����Ҫ����뷺�ͣ�������ǿfor������
 * A:����������
 * B:��ͨfor����
 * C:��ǿfor����
 * 
 * LinkedList,Vector,Colleciton,List�ȴ洢����Ҫ���������ѿκ���ϰ��
 * 
 * ��ǿfor�����������������
 */
package com.yida_01.jdk5new;

import java.util.ArrayList;
import java.util.Iterator;

public class B_For {

	public static void main(String[] args) {
		ArrayList<Student> lt = new ArrayList<Student>();
		Student stu1 = new Student("����", 30);
		Student stu2 = new Student("����", 23);
		Student stu3 = new Student("����", 28);
		Student stu4 = new Student("����", 25);
		lt.add(stu1);
		lt.add(stu2);
		lt.add(stu3);
		lt.add(stu4);

		// ����������
		System.out.println("---����������---");
		Iterator<Student> it = lt.iterator();
		while (it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu);
		}

		
		// ��ͨfor����
		System.out.println("---��ͨfor����---");
		for (int i = 0; i < lt.size(); i++) {
			Student stu = lt.get(i);
			System.out.println(stu.toString());
		}
		
		// ��ǿfor����
		System.out.println("---��ǿfor����---");
		for (Student stu : lt) {
			System.out.println(stu.toString());
		}
	}

}
