/**
 * boolean addAll(Collection c):���һ�����ϵ�Ԫ��
 * boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ��
 * boolean containsAll(Collection c)���жϼ������Ƿ������һ���ϵ�����Ԫ��  
 * boolean retainAll(Collection c):���������ϵĽ���
 */
package com.yida_02.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class B_Collection {

	public static void main(String[] args) {
		// ��������1
		Collection c = new ArrayList();
		c.add("hi1");
		c.add("hi2");
		c.add("hi3");
		c.add("hi4");
		System.out.println("c:" + c);

		// ��������2
		Collection c2 = new ArrayList();
		c2.add("hi1");
		c2.add("hi2");
		c2.add("hi3");
		c2.add("hi4");
		c2.add("hi5");
		c2.add("hi6");
		c2.add("hi7");
		System.out.println("c2:" + c2);
		System.out.println("------");

		// boolean addAll(Collection c):���һ�����ϵ�Ԫ��
		// c.addAll(c2);
		// System.out.println("c:" + c);
		// System.out.println("------");

		// boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ��
		// c.removeAll(c2);// ע�Ͳ���c2��Ԫ�أ�������仯
		// System.out.println("c:" + c);
		// System.out.println("c2:" + c2);
		// System.out.println("------");

		// boolean containsAll(Collection c)���жϼ������Ƿ������һ���ϵ�����Ԫ��
		// System.out.println(c.containsAll(c2));// ע�Ͳ���c2��Ԫ�أ�������仯
		// System.out.println("------");

		// boolean retainAll(Collection c):���������ϵĽ���
		// ��������������A��B��
		// A��B�����������յĽ��������A�У�B���䡣
		// ����ֵ��ʾ����A�Ƿ������ı䡣
		// System.out.println(c.retainAll(c2));// ע�Ͳ���c2��Ԫ�أ�������仯
		// System.out.println("c:" + c);
		// System.out.println("c2:" + c2);
	}

}
