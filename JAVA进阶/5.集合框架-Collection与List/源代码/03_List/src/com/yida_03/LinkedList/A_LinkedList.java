/**
 * LinkedListʵ����List�ӿڵ����й��ܷ�����
 * 
 * �������⣬LinkedListҲ���Լ����еĹ��ܷ�����
 * LinkedList�����й��ܣ�
 * 		A:��ӹ���
 * 			public void addFirst(Object e):Ԫ�ز����б�Ŀ�ͷ
 * 			public void addLast(Object e):Ԫ�ز����б��ĩβ
 * 		B:��ȡ����
 * 			public Object getFirst():��ȡ��һ��Ԫ��
 * 			public Obejct getLast():��ȡ���һ��Ԫ��
 * 		C:ɾ������
 * 			public Object removeFirst():�Ƴ��������б�ĵ�һ��Ԫ��
 * 			public Object removeLast():�Ƴ��������б�����һ��Ԫ��
 * 		D:ѹջ�뵯ջ
 * 			public void push(Object e):ѹջ��Ԫ�ز����б�Ŀ�ͷ  //��addFirst()һ������
 * 			public Object pop():��ջ���Ƴ��������б�ĵ�һ��Ԫ��//��remove()һ�����ܣ�
 */
package com.yida_03.LinkedList;

import java.util.LinkedList;

public class A_LinkedList {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.add("hello");
		link.add("world");
		link.add("java");
		System.out.println(link);
		System.out.println("------");

		// public void addFirst(Object e):Ԫ�ز����б�Ŀ�ͷ
		// public void addLast(Object e):Ԫ�ز����б��ĩβ
		link.addFirst("yida");
		link.addLast("hulian");
		System.out.println(link);
		System.out.println("------");
		
		// public Object getFirst():��ȡ��һ��Ԫ��
		// public Obejct getLast():��ȡ���һ��Ԫ��
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		System.out.println("------");
		
		// public Object removeFirst():�Ƴ��������б�ĵ�һ��Ԫ��
		System.out.println(link.removeFirst());
		System.out.println(link);
		System.out.println("------");
		
		// public Object removeLast():�Ƴ��������б�����һ��Ԫ��
		System.out.println(link.removeLast());
		System.out.println(link);
		System.out.println("------");
		
		// public void push(Object e):ѹջ��Ԫ�ز����б�Ŀ�ͷ
		link.push("javase");
		System.out.println(link);
		System.out.println("------");
		
		// public Object pop():��ջ���Ƴ��������б�ĵ�һ��Ԫ��
		System.out.println(link.pop());
		System.out.println(link);
		System.out.println("------");
		
		
		// ������ص㣺�Ƚ���� (������push()��pop()������������ʵ��)
		// push()������addFirst()�����pop()������removeFirst()�����			
		// ������
		LinkedList lt = new LinkedList();
		lt.push("yida1");//������addFirst()���
		lt.push("yida2");
		lt.push("yida3");

		while (lt.isEmpty() == false) {
			String str = (String) lt.pop(); //������removeFirst()�����		
			System.out.println(str);
		}
	}

}
