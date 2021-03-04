/**
	���ȿ� ���ݽṹ֮��������� ͼ�⣬�����ڴ�����������������ݴ洢��
	֪�������������ӵ��ڴ����ݴ洢�ص��Ժ������ٿ�List�����ص�ͱȽ������ˡ�
	List:(�����⣺List�������ص�)
	ArrayList:
		�ײ����ݽṹ�����飬��ѯ�죬��ɾ����
		�̲߳���ȫ��Ч�ʸߡ�
	Vector:
		�ײ����ݽṹ�����飬��ѯ�죬��ɾ����
		�̰߳�ȫ��Ч�ʵ͡�
	LinkedList:
		�ײ����ݽṹ��������ѯ������ɾ�졣
		�̲߳���ȫ��Ч�ʸߡ�
		
	List���������ӣ����ǵ���ʹ��˭��?
		������(���)��
		Ҫ��ȫ��?
			Ҫ��Vector(��ʹҪ��ȫ��Ҳ��������ˣ������������)
			��Ҫ��ArrayList����LinkedList
			��ѯ�ࣺArrayList
			��ɾ�ࣺLinkedList
			
	�����ʲô������������ArrayList��
	
	
	����List���ϴ洢�ַ�����������
	List���ϵ��ص㣺����(�洢��ȡ����Ԫ��һ��)���洢Ԫ�ؿ����ظ�����ƣ�������ظ���
 */
package com.yida_01.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A_List {
	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();

		// �����ַ���������ַ���
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("java");

		// ��������
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

		System.out.println("------");
		
		Object[] arr = list.toArray();
		for(int i = 0; i < arr.length; i++) {
			String s = (String)arr[i];
			System.out.println(s);
		}

		
		// �������϶���
		List list2 = new ArrayList();

		// ����ѧ������
		Student stu1 = new Student("����", 23);
		Student stu2 = new Student("����", 33);
		Student stu3 = new Student("����", 26);
		Student stu4 = new Student("����", 28);
		Student stu5 = new Student("����", 25);

		// ��ѧ��������ӵ�������
		list2.add(stu1);
		list2.add(stu2);
		list2.add(stu3);
		list2.add(stu4);
		list2.add(stu5);

		// ��������
		Iterator it2 = list2.iterator();
		while (it2.hasNext()) {
			Student s = (Student) it2.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
