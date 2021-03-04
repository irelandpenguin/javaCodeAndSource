/**
 * LinkedHashSet:底层数据结构由哈希表和链表组成。
 * 特点：有序且唯一。
 * 	哈希表保证元素的唯一性。
 * 	链表保证元素有序。(即：存储和取出是一致的)
 * 
 * LinkedHashSet继承HashSet所有方法。用法与HashSet一样。
 */
package com.yida_03.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class A_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("hello");
		lhs.add("world");
		lhs.add("java");
		lhs.add("yida");
		lhs.add("java");
		lhs.add("hello");
		lhs.add("world");

		// 增加for
		for (String s : lhs) {
			System.out.println(s);
		}

		System.out.println("------");

		// 迭代器遍历
		Iterator<String> it = lhs.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
