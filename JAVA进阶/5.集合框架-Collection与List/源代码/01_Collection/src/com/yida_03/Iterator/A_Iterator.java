/**
 * Iterator iterator():迭代器，集合的专用遍历方式
 * 		Object next():获取元素,并移动到下一个位置。
 * 		boolean hasNext():如果仍有元素可以迭代，则返回 true。
 */
package com.yida_03.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A_Iterator {

	public static void main(String[] args) {
		// 创建集合并添加元素
		Collection c = new ArrayList();
		c.add("hello");
		c.add("yida");
		String s = "java";
		c.add(s);

		// Iterator iterator():迭代器，集合的专用遍历方式
		Iterator it = c.iterator();// 实际返回实现接口的实现类对象

		// 通过迭代器获取集合内容,看迭代器使用图解
		//System.out.println(it.next());// hello
		//System.out.println(it.next());// yida
		//System.out.println(it.next());// java
		// System.out.println(it.next());// 报错，NoSuchElementException。因为只有3个元素

		// boolean hasNext():如果仍有元素可以迭代，则返回 true。
		//if (it.hasNext()) {
		//	System.out.println(it.next());
		//}
		
		// 最终代码
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
