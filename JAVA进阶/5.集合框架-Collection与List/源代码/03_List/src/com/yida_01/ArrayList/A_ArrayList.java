/**
 * List�������ص㣺
 * 		ArrayList:
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 * 			�̲߳���ȫ��Ч�ʸ�
 * 		Vector:
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 * 			�̰߳�ȫ��Ч�ʵ�
 * 		LinkedList:
 * 			 �ײ����ݽṹ��������ѯ������ɾ��
 * 			�̲߳���ȫ��Ч�ʸ�
 * 
 * ArrayListʵ����List�ӿڵ����й��ܷ�����
 *  
 * ������
 * 		ʹ��ArrayList�洢�ַ������ߴ洢�Զ�����󲢱�����
 */
package com.yida_01.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class A_ArrayList {

	public static void main(String[] args) {
		// �������϶���
		ArrayList array = new ArrayList();

		// ����Ԫ�ض��󣬲����Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");

		// ����������
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

		System.out.println("------");

		// forѭ������
		for (int x = 0; x < array.size(); x++) {
			String s = (String) array.get(x);
			System.out.println(s);
		}
	}

}
