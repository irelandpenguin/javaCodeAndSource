/*
 * HashMap:是基于哈希表的Map接口实现。
 * 特点:存储无序键-值对，键唯一，值可重复。
 * 哈希表的作用是用来保证键的唯一性的。
 * 
 * HashMap<String,String>
 * 键：String 学号
 * 值：String 姓名
 * 
 * HashMap<Integer,String>
 * 键：Integer 学号
 * 值：String 姓名
 */
package com.yida_02.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A_HashMap {

	public static void main(String[] args) {
		test1();// 键:String, 值:String
		System.out.println("------");
		test2();// 键:Integer, 值:String
	}

	public static void test1() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("201701", "黄小明");
		hm.put("201702", "邓超");
		hm.put("201703", "文章");

		// 增强for遍历(键找值)
		Set<String> set = hm.keySet();
		for (String key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}
		//
		// System.out.println("------");
		//
		// // 增强for遍历(键-值对对象找键和值)
		// Set<Map.Entry<String, String>> entrys = hm.entrySet();
		// for (Map.Entry<String, String> en : entrys) {
		// String key = en.getKey();
		// String value = en.getValue();
		// System.out.println(key + "---" + value);
		// }

		//show(hm);// 泛型方法打印结果
	}

	public static void test2() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(201704, "杨颖");
		hm.put(201705, "孙丽");
		hm.put(201706, "马伊琍");

		// 增强for遍历(键找值)
		Set<Integer> set = hm.keySet();
		for (Integer key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}

		System.out.println("------");
		//
		// // 增强for遍历(键-值对对象找键和值)
		// Set<Map.Entry<Integer, String>> entrys = hm.entrySet();
		// for (Map.Entry<Integer, String> en : entrys) {
		// Integer key = en.getKey();
		// String value = en.getValue();
		// System.out.println(key + "---" + value);
		// }

		//show(hm);// 泛型方法打印结果
	}

	public static <K, V> void show(HashMap<K, V> hm) {
		// 增强for遍历(键找值)
		Set<K> set = hm.keySet();
		for (K key : set) {
			V value = hm.get(key);
			System.out.println(key + "---" + value);
		}

		System.out.println("------");

		// 增强for遍历(键-值对对象找键和值)
		Set<Map.Entry<K, V>> entrys = hm.entrySet();
		for (Map.Entry<K, V> en : entrys) {
			K key = en.getKey();
			V value = en.getValue();
			System.out.println(key + "---" + value);
		}
	}

}
