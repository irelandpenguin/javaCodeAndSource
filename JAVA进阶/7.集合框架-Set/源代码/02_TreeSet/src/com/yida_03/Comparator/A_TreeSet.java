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

public class A_TreeSet {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		ts.add("hello");
		ts.add("world");
		ts.add("java");
		ts.add("yida");
		ts.add("world");
		ts.add("java");
		ts.add("hello");

		// ��ǿfor����
		for (String s : ts) {
			System.out.println(s);
		}

		System.out.println("------");

		// ����������
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
