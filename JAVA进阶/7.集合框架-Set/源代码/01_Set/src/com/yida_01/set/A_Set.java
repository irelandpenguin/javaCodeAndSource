/**
 * Collection
 * 		|--List
 * 			有序(存储和取出顺序一致),可重复
 * 		|--Set
 * 			无序(存储和取出顺序不一致),唯一
 * 
 * Set继承了Collection里的所有方法。
 * 
 * HashSet：是Set接口的实现类。它不保证set的迭代顺序，但是它保证唯一。
 */
package com.yida_01.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A_Set {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();// 接口不能实例化，用接口实现类实例化
		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("yida");
		set.add("hulian");
		set.add("world");
		set.add("java");
		set.add("hello");
		set.add("宜达");

		// 增强for遍历
		for (String s : set) {
			System.out.println(s);
		}

		System.out.println("------");
		
		// 迭代器遍历
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		// 普通for遍历就不行，为什么？
		//因为普通for遍历是List集合所特有的，而且set集合没有get(int index)方法。
		//for(int i = 0; i < set.size(); i++) {
			//String s = set.get(i);
		//}
		
	}

}
