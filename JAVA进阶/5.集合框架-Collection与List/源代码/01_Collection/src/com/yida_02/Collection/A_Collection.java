/**
 * 集合的由来：
 * 		我们学习的是面向对象语言，而面向对象语言对事物的描述是通过对象体现的，为了方便对多个对象进行操作，我们就必须把这多个对象进行存储。
 * 		而要想存储多个对象，就不能是一个基本的变量，而应该是一个容器类型的变量，在我们目前所学过的知识里面，有哪些是容器类型的呢?
 * 		数组和StringBuffer。但是呢?StringBuffer的结果是一个字符串，不一定满足我们的要求，所以我们只能选择数组，这就是对象数组。
 * 		而对象数组又不能适应变化的需求，因为数组的长度是固定的，这个时候，为了适应变化的需求，Java就提供了集合类供我们使用。
 * 
 * 数组和集合的区别?
 * 		A:长度区别
 * 			数组的长度固定
 * 			集合长度可变
 * 		B:内容不同
 * 			数组存储的是同一种类型的元素
 * 			而集合可以存储不同类型的元素
 * 		C:元素的数据类型问题	
 * 			数组可以存储基本数据类型，也可以存储引用数据类型
 * 			集合只能存储引用类型
 * 
 * 刚说过集合是存储多个元素，但是呢，存储多个元素我们也是有不同需求的：比如说，多个元素中不能有相同的元素，
 * 再比如，多个元素按照某种规则排序。针对不同的需求，Java就提供了不同的集合类。
 * 不同的集合类是有共性内容的，我们把这些共性内容不断的向上提取，最终就形成了集合的继承体系结构。
 * 参看集合的继承体系图。
 * 
 * 数据结构：数据的存储方式。
 * 
 * Collection:是集合的顶层接口，它的子体系有可重复存储元素的，有只能唯一存储元素的，有对元素排序的，还有无序存放元素的。(后面会慢慢的讲解)
 * 
 * Collection的功能概述：
 * 1：添加功能
 * 		boolean add(Object obj):添加一个元素
 * 		boolean addAll(Collection c):添加一个集合的元素
 * 2:删除功能
 * 		void clear():移除所有元素
 * 		boolean remove(Object o):移除一个元素
 * 		boolean removeAll(Collection c):移除一个集合的元素 
 * 3:判断功能
 * 		boolean contains(Object o)：判断集合中是否包含指定的元素
 * 		boolean containsAll(Collection c)：判断集合中是否包含另一集合的所有元素 
 * 		boolean isEmpty()：判断集合是否为空
 * 4:长度功能
 * 		int size():元素的个数
 * 		面试题：数组有没有length()方法呢?字符串有没有length()方法呢?集合有没有length()方法呢?
 * 5:交集功能
 * 		boolean retainAll(Collection c):返回两集合的交集
 * 6：把集合转换为数组
 * 		Object[] toArray()
 * 7:获取功能
 * 		Iterator<E> iterator()(重点)
 */
package com.yida_02.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class A_Collection {

	public static void main(String[] args) {
		// 先测试不带All的方法
		// Collection c = new Collection();// 报错，接口不能实例化
		Collection c = new ArrayList();

		// boolean add(Object obj):添加一个元素
		c.add("hello");
		c.add("yida");
		c.add("java");
		System.out.println(c);
		System.out.println("------");

		// void clear():移除所有元素
		// c.clear();
		// System.out.println(c);
		// System.out.println("------");

		// boolean remove(Object o):移除一个元素
		// c.remove("yida");
		// System.out.println(c);
		// c.remove("hulian");// 集合中如果没有移除元素，该方法什么也不做
		// System.out.println("------");

		// boolean contains(Object o)：判断集合中是否包含指定的元素
		 System.out.println(c.contains("yida"));
		 System.out.println(c.contains("javase"));
		 System.out.println("------");

		// boolean isEmpty()：判断集合是否为空
		// System.out.println(c.isEmpty());
		// c.clear();
		// System.out.println(c.isEmpty());
		// System.out.println("------");

		// int size():元素的个数
		 System.out.println(c.size());
		// 面试题：数组有没有length()方法呢?字符串有没有length()方法呢?集合有没有length()方法呢?
		// 答案：数组没有length()方法，只有length属性；字符串有length()方法；集合没有length()方法，只有size()方法。

		// Object[] toArray():把集合转换为数组
		 Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			String s = (String) arr[i];
			System.out.println(s + " " + s.length());
		}
	}

}
