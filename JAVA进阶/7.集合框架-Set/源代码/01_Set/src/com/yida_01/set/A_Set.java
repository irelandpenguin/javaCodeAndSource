/**
 * Collection
 * 		|--List
 * 			����(�洢��ȡ��˳��һ��),���ظ�
 * 		|--Set
 * 			����(�洢��ȡ��˳��һ��),Ψһ
 * 
 * Set�̳���Collection������з�����
 * 
 * HashSet����Set�ӿڵ�ʵ���ࡣ������֤set�ĵ���˳�򣬵�������֤Ψһ��
 */
package com.yida_01.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A_Set {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();// �ӿڲ���ʵ�������ýӿ�ʵ����ʵ����
		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("yida");
		set.add("hulian");
		set.add("world");
		set.add("java");
		set.add("hello");
		set.add("�˴�");

		// ��ǿfor����
		for (String s : set) {
			System.out.println(s);
		}

		System.out.println("------");
		
		// ����������
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		// ��ͨfor�����Ͳ��У�Ϊʲô��
		//��Ϊ��ͨfor������List���������еģ�����set����û��get(int index)������
		//for(int i = 0; i < set.size(); i++) {
			//String s = set.get(i);
		//}
		
	}

}
