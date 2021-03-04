/**
 * Vector实现了List接口的所有功能方法。
 * 
 * 除此以外，Vector也有自己特有的功能方法。
 * Vector的特有功能：
 * 1：添加功能
 * 		public void addElement(Object obj)		--	add()
 * 2：获取功能
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
		// 创建集合对象
		Vector e = new Vector();

		// 创建元素对象，并添加元素
		//e.add("hi");
		e.addElement("hello");
		e.addElement("world");
		e.addElement("java");

		// 迭代器遍历
		//Iterator it = e.iterator();
		Enumeration el = e.elements();// 返回的是实现类的对象
		while (el.hasMoreElements()) {//it.hasNext()
			String s = (String) el.nextElement();//it.next()
			System.out.println(s);
		}

		System.out.println("------");

		// for循环遍历
		for (int i = 0; i < e.size(); i++) {
			String s = (String) e.elementAt(i);//e.get(i)
			System.out.println(s);
		}
	}

}
