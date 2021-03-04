/**
 * LinkedHashSet:�ײ����ݽṹ�ɹ�ϣ���������ɡ�
 * �ص㣺������Ψһ��
 * 	��ϣ��֤Ԫ�ص�Ψһ�ԡ�
 * 	����֤Ԫ������(�����洢��ȡ����һ�µ�)
 * 
 * LinkedHashSet�̳�HashSet���з������÷���HashSetһ����
 */
package com.yida_03.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class A_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("hello");
		lhs.add("world");
		lhs.add("java");
		lhs.add("yida");
		lhs.add("java");
		lhs.add("hello");
		lhs.add("world");

		// ����for
		for (String s : lhs) {
			System.out.println(s);
		}

		System.out.println("------");

		// ����������
		Iterator<String> it = lhs.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
