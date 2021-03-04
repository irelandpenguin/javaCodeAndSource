/**
 * 请用LinkedList模拟栈数据结构的集合。
 * 题目的意思是：
 *	 你自己定义一个集合类，在这个集合类内部使用LinkedList模拟。
 */
package com.yida_05.Test;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// 要做出这个题目，我们要先知道栈的特点：先进后出。
		// 举个例子，如下：
		LinkedList lt = new LinkedList();
		// 压栈
		lt.push("a");
		lt.push("b");
		lt.push("c");
		// 弹栈
		while (!lt.isEmpty()) {
			System.out.println(lt.pop());
		}
		// 结果为：c b a

		System.out.println("------");

		
		StackList sl = new StackList();
		// 压栈
		sl.add("hello");
		sl.add("world");
		sl.add("java");
		// 弹栈
		while (!sl.isEmpty()) {
			System.out.println(sl.get());
		}
		
	}

}
