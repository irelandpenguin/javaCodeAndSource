/**
 * Vectorʵ����List�ӿڵ����й��ܷ�����
 * 
 * �������⣬VectorҲ���Լ����еĹ��ܷ�����
 * Vector�����й��ܣ�
 * 1����ӹ���
 * 		public void addElement(Object obj)		--	add()
 * 2����ȡ����
 * 		public Object elementAt(int index)		--  get()
 * 		public Enumeration elements()			--	Iterator iterator()
 * 		boolean hasMoreElements()				--  hasNext()
 * 		Object nextElement()					--  next()
 */
package com.yida_02.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class A_Vector {

	public static void main(String[] args) {
		// �������϶���
		Vector e = new Vector();

		// ����Ԫ�ض��󣬲����Ԫ��
		//e.add("hi");
		e.addElement("hello");
		e.addElement("world");
		e.addElement("java");

		// ����������
		//Iterator it = e.iterator();
		Enumeration el = e.elements();// ���ص���ʵ����Ķ���
		while (el.hasMoreElements()) {//it.hasNext()
			String s = (String) el.nextElement();//it.next()
			System.out.println(s);
		}

		System.out.println("------");

		// forѭ������
		for (int i = 0; i < e.size(); i++) {
			String s = (String) e.elementAt(i);//e.get(i)
			System.out.println(s);
		}
	}

}
