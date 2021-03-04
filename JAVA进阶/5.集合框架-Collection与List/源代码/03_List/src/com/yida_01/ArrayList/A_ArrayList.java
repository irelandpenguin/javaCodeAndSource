/**
 * List的子类特点：
 * 		ArrayList:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程不安全，效率高
 * 		Vector:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程安全，效率低
 * 		LinkedList:
 * 			 底层数据结构是链表，查询慢，增删快
 * 			线程不安全，效率高
 * 
 * ArrayList实现了List接口的所有功能方法。
 *  
 * 案例：
 * 		使用ArrayList存储字符串或者存储自定义对象并遍历。
 */
package com.yida_01.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class A_ArrayList {

	public static void main(String[] args) {
		// 创建集合对象
		ArrayList array = new ArrayList();

		// 创建元素对象，并添加元素
		array.add("hello");
		array.add("world");
		array.add("java");

		// 迭代器遍历
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

		System.out.println("------");

		// for循环遍历
		for (int x = 0; x < array.size(); x++) {
			String s = (String) array.get(x);
			System.out.println(s);
		}
	}

}
