/**
 * TreeSet���ܹ���Ԫ�ذ���ĳ�ֹ����������
 * ���������ַ�ʽ
 * A:��Ȼ����
 * B:�Ƚ�������
 * 
 * TreeSet���ϵ��ص㣺�����Ψһ
 * 
 * ͨ���۲�TreeSet��add()����������֪������Ҫ��TreeMap��put()������
 */
package com.yida_01.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class A_TreeSet {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();// ��Ȼ����
		ts.add("hello");
		ts.add("world");
		ts.add("java");
		ts.add("java");
		ts.add("yida");
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
