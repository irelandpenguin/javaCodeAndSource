/**
 * 比较器
 * 
 * TreeSet集合保证元素排序和唯一性
 * 唯一性：是根据比较的返回是否是0来决定。
 * 排序：
 * 		A:自然排序
 * 			让元素所属的类实现自然排序接口 Comparable
 * 		B:比较器排序
 * 			让集合的构造方法接收一个比较器接口的子类对象 Comparator
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

		// 增强for遍历
		for (String s : ts) {
			System.out.println(s);
		}

		System.out.println("------");

		// 迭代器遍历
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
