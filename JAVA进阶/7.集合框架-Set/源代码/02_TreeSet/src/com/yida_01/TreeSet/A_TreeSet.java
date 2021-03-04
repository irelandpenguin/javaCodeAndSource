/**
 * TreeSet：能够对元素按照某种规则进行排序。
 * 排序有两种方式
 * A:自然排序
 * B:比较器排序
 * 
 * TreeSet集合的特点：排序和唯一
 * 
 * 通过观察TreeSet的add()方法，我们知道最终要看TreeMap的put()方法。
 */
package com.yida_01.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class A_TreeSet {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();// 自然排序
		ts.add("hello");
		ts.add("world");
		ts.add("java");
		ts.add("java");
		ts.add("yida");
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
