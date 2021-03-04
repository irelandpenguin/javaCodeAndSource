/**
 * ���󣺴洢�Զ�����󣬲���֤Ԫ�ص�Ψһ�ԡ�Ҫ�������������ĳ�Ա����ֵ����ͬ����Ĭ��Ϊͬһ��Ԫ�ء�
 */
package com.yida_02.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class B_HashSet {

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();

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
		hs.add(null);

		// ����for����
		for (Student stu : hs) {
			if (stu != null) {
				System.out.println(stu.getName() + "---" + stu.getAge());
			}
		}

		System.out.println("------");

		// ����������
		Iterator<Student> it = hs.iterator();
		while (it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu);
		}

		/*
		 * ���֣�Ŀǰ�Ľ���ǲ���������ģ���Ϊ����֪��HashSet�ײ���������hashCode()��equals()������
		 * ������������������ѧ������û����д�����ԣ�Ĭ��ʹ�õ���Object��ģ�Object���hashCode()��
		 * ����ȡ�Ĺ�ϣֵĬ��������ʵ�ʶ�����ڴ��ַ����������ڴ��ַĬ���ǲ���ͬ�ġ�
		 * 
		 * �����������ѧ�������Զ�����hashCode()��equals()�������ɡ�
		 */
	}

}
