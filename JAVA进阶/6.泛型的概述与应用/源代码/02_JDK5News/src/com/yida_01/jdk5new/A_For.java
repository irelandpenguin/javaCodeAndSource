/**
 * JDK5的新特性：自动拆装箱,泛型,增强for,静态导入,可变参数,枚举(用的少，后面讲)
 * 
 * 增强for:是for循环的一种。
 * 
 * 格式：
 * 		for(元素数据类型  变量 : 数组或集合) {
 *			使用变量即可，该变量就是元素
 *   	}
 *   
 * 好处：简化了数组和集合的遍历。
 * 
 * 弊端： 增强for的目标不能为null。
 * 如何解决呢?对增强for的目标先进行不为null的判断，然后在使用。
 */
package com.yida_01.jdk5new;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class A_For {

	public static void main(String[] args) {
		//test1();// 普通数组
		//test2();// ArrayList集合
		//test3();// Vector集合
		//test4();// LinkedList集合

		// 弊端： 增强for的目标不能为null，否则遍历时，会报NullPointerException异常。
		// 如何解决呢?对增强for的目标先进行不为null的判断，然后在使用。
		//show(null);

		// 增强for其实是用来 替代 迭代器的
		ArrayList<Integer> lit = new ArrayList<Integer>();
		lit.add(100);
		lit.add(90);
		lit.add(80);
		for (Integer i : lit) {
			if (i.equals(90)) {
				//lit.add(70);// 运行报错，ConcurrentModificationException并发修改异常。Java反编译，看源码分析。
			}
		}
		System.out.println(lit);

		// 最后，反编译当前java源文件生成ForDemo.class字节码文件，查看增强for的实现原理。
	}

	public static void test1() {

		System.out.println("---普通数组---");

		int[] arr = { 1, 2, 3, 4, 5 };

		// 普通的for循环
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("------");

		// 增强for
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void test2() {
		System.out.println("---ArrayList集合---");

		// 定义一个集合
		ArrayList<String> lit = new ArrayList<String>();
		lit.add("hello");
		lit.add("yidahulian");
		lit.add("java");

		// 迭代器遍历
		Iterator<String> it = lit.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("------");

		// 普通for循环遍历
		for (int k = 0; k < lit.size(); k++) {
			String s = lit.get(k);
			System.out.println(s);
		}
		System.out.println("------");

		// 增强for遍历
		for (String str : lit) {
			System.out.println(str);
		}
	}

	public static void test3() {
		System.out.println("---Vector集合---");

		// 定义一个集合
		Vector<String> lit = new Vector<String>();
		lit.add("hello");
		lit.add("yidahulian");
		lit.add("java");

		// 迭代器遍历
		Iterator<String> it = lit.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("------");

		// 普通for循环遍历
		for (int k = 0; k < lit.size(); k++) {
			String s = lit.get(k);
			System.out.println(s);
		}
		System.out.println("------");

		// 增强for遍历
		for (String str : lit) {
			System.out.println(str);
		}
	}

	public static void test4() {
		System.out.println("---LinkedList集合---");

		// 定义一个集合
		LinkedList<String> lit = new LinkedList<String>();
		lit.add("hello");
		lit.add("yidahulian");
		lit.add("java");

		// 迭代器遍历
		Iterator<String> it = lit.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("------");

		// 普通for循环遍历
		for (int k = 0; k < lit.size(); k++) {
			String s = lit.get(k);
			System.out.println(s);
		}
		System.out.println("------");

		// 增强for遍历
		for (String str : lit) {
			System.out.println(str);
		}
	}

	// 显示集合内容
	public static void show(List<String> list) {
		// 弊端： 增强for的目标不能为null，否则遍历时，会报NullPointerException异常。
		// 如何解决呢？对增强for的目标先进行不为null的判断，然后在使用。
		if (list != null) {// 这里加个条件判断
			for (String str : list) {
				System.out.println(str);
			}
		}
	}
}
