/*
 * TreeMap:是基于红黑树的Map接口的实现。
 * 特点：存储排序键-值对，键唯一，值可重复。
 * 红黑树保证的键的排序和唯一。
 * 红黑树底层是采用自然排序compareTo()方法和比较器排序compare()方法来保证键唯一性和排序。
 * 
 * TreeMap<Integer,String>
 * 键：Integer
 * 值：String
 */
package com.yida_04.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class A_TreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();// 创建集合

		// 添加键-值对
		tm.put(10, "hello");// jdk5新特性-自动装箱
		tm.put(2, "world");
		tm.put(13, "java");
		tm.put(40, "yida");
		tm.put(10, "HELLO");
		tm.put(2, "WORLD");
		System.out.println(tm);// 结果为{2=WORLD, 10=HELLO, 13=java, 40=yida}
		System.out.println("------");

		// 增强for遍历(键找值)
		Set<Integer> set = tm.keySet();
		for (Integer key : set) {
			String value = tm.get(key);
			System.out.println(key + "---" + value);
		}

		System.out.println("------");

		// 增强for遍历(键-值对对象找键和值)
		Set<Map.Entry<Integer, String>> entrys = tm.entrySet();
		for (Map.Entry<Integer, String> en : entrys) {
			Integer key = en.getKey();
			String value = en.getValue();
			System.out.println(key + "---" + value);
		}
	}

}
