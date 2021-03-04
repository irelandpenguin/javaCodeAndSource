/**
 * LinkedList实现了List接口的所有功能方法。
 * 
 * 除此以外，LinkedList也有自己特有的功能方法。
 * LinkedList的特有功能：
 * 		A:添加功能
 * 			public void addFirst(Object e):元素插入列表的开头
 * 			public void addLast(Object e):元素插入列表的末尾
 * 		B:获取功能
 * 			public Object getFirst():获取第一个元素
 * 			public Obejct getLast():获取最后一个元素
 * 		C:删除功能
 * 			public Object removeFirst():移除并返回列表的第一个元素
 * 			public Object removeLast():移除并返回列表的最后一个元素
 * 		D:压栈与弹栈
 * 			public void push(Object e):压栈，元素插入列表的开头
 * 			public Object pop():弹栈，移除并返回列表的第一个元素
 */
package com.yida_03.LinkedList;

import java.util.LinkedList;

public class A_LinkedList {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.add("hello");
		link.add("world");
		link.add("java");
		System.out.println(link);
		System.out.println("------");

		// public void addFirst(Object e):元素插入列表的开头
		// public void addLast(Object e):元素插入列表的末尾
		link.addFirst("yida");
		link.addLast("hulian");
		System.out.println(link);
		System.out.println("------");
		
		// public Object getFirst():获取第一个元素
		// public Obejct getLast():获取最后一个元素
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		System.out.println("------");
		
		// public Object removeFirst():移除并返回列表的第一个元素
		System.out.println(link.removeFirst());
		System.out.println(link);
		System.out.println("------");
		
		// public Object removeLast():移除并返回列表的最后一个元素
		System.out.println(link.removeLast());
		System.out.println(link);
		System.out.println("------");
		
		// public void push(Object e):压栈，元素插入列表的开头
		link.push("javase");
		System.out.println(link);
		System.out.println("------");
		
		// public Object pop():弹栈，移除并返回列表的第一个元素
		System.out.println(link.pop());
		System.out.println(link);
		System.out.println("------");
		
		
		// 链表的特点：先进后出 (利用了push()和pop()这两个方法来实现)
		// push()可以用addFirst()替代，pop()可以用removeFirst()来替代			
		// 举例：
		LinkedList lt = new LinkedList();
		lt.push("yida1");//可以用addFirst()替代
		lt.push("yida2");
		lt.push("yida3");

		while (lt.isEmpty() == false) {
			String str = (String) lt.pop(); //可以用removeFirst()来替代		
			System.out.println(str);
		}
	}

}
