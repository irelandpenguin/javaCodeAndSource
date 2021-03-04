/**
 * Iterator iterator():�����������ϵ�ר�ñ�����ʽ
 * 		Object next():��ȡԪ��,���ƶ�����һ��λ�á�
 * 		boolean hasNext():�������Ԫ�ؿ��Ե������򷵻� true��
 */
package com.yida_03.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A_Iterator {

	public static void main(String[] args) {
		// �������ϲ����Ԫ��
		Collection c = new ArrayList();
		c.add("hello");
		c.add("yida");
		String s = "java";
		c.add(s);

		// Iterator iterator():�����������ϵ�ר�ñ�����ʽ
		Iterator it = c.iterator();// ʵ�ʷ���ʵ�ֽӿڵ�ʵ�������

		// ͨ����������ȡ��������,��������ʹ��ͼ��
		//System.out.println(it.next());// hello
		//System.out.println(it.next());// yida
		//System.out.println(it.next());// java
		// System.out.println(it.next());// ����NoSuchElementException����Ϊֻ��3��Ԫ��

		// boolean hasNext():�������Ԫ�ؿ��Ե������򷵻� true��
		//if (it.hasNext()) {
		//	System.out.println(it.next());
		//}
		
		// ���մ���
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
