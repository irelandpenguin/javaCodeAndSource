/**
 * List���ϵ����б������ܣ�
 * �б������
 * 		ListIterator listIterator()��List�������еĵ�����
 */
package com.yida_02.ListMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.yida_01.List.Student;

public class B_List {

	public static void main(String[] args) {
		/*List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");

		//��һ�ֱ�����ʽ��size()��get()�������ʹ��
		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			System.out.println(s);
		}

		System.out.println("------");
		
		//�ڶ��ֱ�����ʽ��ͨ��listIterator()����
		//ListIterator listIterator()��List�������еĵ�����
		ListIterator it = list.listIterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			int idx  = it.nextIndex();//ע�⣺������������Ĭ�ϴ�1��ʼ��
			System.out.println(s+"---"+idx);
		}
		
		System.out.println("------");
		
		//�����ֱ�����ʽ��ͨ��iterator()����
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------");
		
		//�����ֱ�����ʽ��
		Object[] arr = list.toArray();
		for (int i = 0; i < arr.length; i++) {
			String s = (String)arr[i];
			System.out.println(s);
		}*/

		
		// �������϶���
		List lt = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("����", 25);
		Student s2 = new Student("����", 31);
		Student s3 = new Student("����", 23);

		// ��ѧ����ӵ�������
		lt.add(s1);
		lt.add(s2);
		lt.add(s3);

		// ��ʽһ��forѭ������
		for (int i = 0; i < lt.size(); i++) {
			Student stu = (Student) lt.get(i);
			System.out.println(stu.getName() + "---" + stu.getAge());
		}

		System.out.println("------");

		// ��ʽ��������������
		Iterator it = lt.iterator();
		while (it.hasNext()) {
			Student stu = (Student) it.next();
			System.out.println(stu);
		}
		
		//ͨ��listIterator()����
		//ͨ��toArray()����
		//�������ֱ����������д��
	}

}
