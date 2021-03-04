/*
 *  Map集合的功能概述：
 * 		void putAll(Map<? extends K,? extends V> m)：把一个集合的内容添加到另一个集合中
 * 		boolean equals(Object o)：判断两个集合是否相等
 * 		Set<Map.Entry<K,V>> entrySet():获取map实体对象
 */
package com.yida_01.map;

import java.util.HashMap;
import java.util.Map;

public class B_Map {

	public static void main(String[] args) {
		// 创建一个集合
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "张三");
		map.put("2", "李四");
		map.put("3", "王五");
		map.put("4", "赵六");
		System.out.println(map);
		System.out.println("------");

		// 再创建一个集合
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("1", "张三疯");
		map2.put("5", "刘七");
		map2.put("6", "周八");
		System.out.println(map2);
		System.out.println("------");

		// void putAll(Map<? extends K,? extends V> m)：把一个集合的内容添加到另一个集合中
		map.putAll(map2);// 把集合map2的所有键-值对添加到集合map里
		System.out.println(map);

		// boolean equals(Object o)：判断两个集合是否相等
		// System.out.println(map.equals(map2));
		// map2.clear();
		// map2.putAll(map);
		// System.out.println(map.equals(map2));

		// Set<Map.Entry<K,V>> entrySet():获取map实体对象

		// 遍历集合所有元素
		// 方式一：键找值
		// Set<String> set = map.keySet();
		// for (String key : set) {
		// String value = map.get(key);
		// System.out.println(key + "---" + value);
		// }
		//
		// System.out.println("------");

		// 方式二：键-值对对象找键和值
		// Set<Map.Entry<K,V>> entrySet():获取map实体对象
		// Set<Map.Entry<String, String>> entrys = map.entrySet();
		// for (Map.Entry<String, String> en : entrys) {
		// String key = en.getKey();
		// String value = en.getValue();
		// System.out.println(key + "---" + value);
		// }
	}

}
