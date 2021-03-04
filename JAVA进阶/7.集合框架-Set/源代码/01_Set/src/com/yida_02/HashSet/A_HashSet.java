/**
 * HashSet:存储字符串并遍历
 * 问题：为什么存储字符串内容相同的只存储了一个呢?
 * 通过查看add方法的源码，我们知道这个方法底层依赖 两个方法：hashCode()和equals()。
 * add方法的步骤：	
 * 		先看hashCode()值是否相同
 * 			相同:继续走equals()方法
 * 				返回true：说明元素重复，就不添加
 * 				返回false：说明元素不重复，就添加到集合
 * 			不同：就直接把元素添加到集合。
 * 如果类没有重写这两个方法，默认使用的Object里的hashCode()方法和equals()方法，一般来说不会相同，原因是hashCode()获取的值
 * 是依赖实际内存地址的，而对象的内存地址都不会相同。
 * String类重写了hashCode()和equals()方法，所以，它就可以把内容相同的字符串去掉。只留下一个。
 */
package com.yida_02.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class A_HashSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("yida");
		hs.add("hulian");
		hs.add("hulian");
		hs.add("java");

		// 增强for遍历
		for (String str : hs) {
			System.out.println(str);
		}

		System.out.println("------");

		// 迭代器遍历
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		// 普通for不能遍历，原因是HashSet没有get(int index)方法。只有List集合才有的。
	}

}
