/**
 * ��������Щ�ط�ʹ����?
 * 		��API������࣬�ӿڣ���������������<E>��˵��ʹ���˷��͡�һ����˵�����ڼ�����ʹ�á�
 * 
 */
package com.yida_01.GenericDefine;

import java.util.ArrayList;
import java.util.Iterator;

public class B_Generic {

	public static void main(String[] args) {
		// ���÷���+������Ӻͱ����ַ�������
		//genericTest1();

		// ���÷���+�������Integer���ֶ���
		//genericTest2();

		// ���÷���+�������ѧ������
		genericTest3();
	}

	public static void genericTest1() {
		ArrayList<String> list = new ArrayList<String>();
		// ArrayList<String> list = new ArrayList<>();// JDK7�������ԣ������ƶϡ���������ʹ�á�
		list.add("hello");
		list.add("world");
		list.add("java");

		// ����������
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("-------");

		// forѭ������
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
	}

	public static void genericTest2() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// ArrayList<Integer> list = new ArrayList<>();// JDK7�������ԣ������ƶϡ���������ʹ�á�
		list.add(new Integer(100));
		list.add(10);// ����jdk5�������ԣ�װ�书��
		list.add(Integer.valueOf(20));

		// ����������
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}

		System.out.println("------");

		// forѭ������
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void genericTest3() {
		/*
		 * ���󣺴洢�Զ�����󲢱�����
		 * A:����ѧ���� B:�������϶��� C:����Ԫ�ض��� D:��Ԫ����ӵ����� E:��������
		 */

		ArrayList<Student> list = new ArrayList<Student>();
		// ArrayList<Student> list = new ArrayList<>();// JDK7�������ԣ������ƶϡ���������ʹ�á�
		Student stu1 = new Student("����", 26);
		Student stu2 = new Student("����", 30);
		Student stu3 = new Student("����", 28);
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);

		// ����������
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu);
		}

		System.out.println("------");

		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			System.out.println(stu);
		}
	}
}
