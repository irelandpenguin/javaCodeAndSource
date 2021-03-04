/*
 * LinkedHashMap:是Map接口的哈希表和链接列表实现，具有可预知的迭代顺序。
 * 特点：存储有序键-值对，键唯一，值可重复。
 * 由哈希表保证键的唯一性
 * 由链表保证键的有序(这里的有序是指 存储和取出的顺序一致，并不是排序。)
 */
package com.yida_03.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A_LinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(100, "hello");
		lhm.put(101, "world");
		lhm.put(102, "java");
		lhm.put(103, "yidahulian");

		// 增强for遍历(键找值)
		Set<Integer> set = lhm.keySet();
		for (Integer key : set) {
			String value = lhm.get(key);
			System.out.println(key + "---" + value);
		}

		System.out.println("------");

		// 增强for遍历(键-值对对象找键和值)
		Set<Map.Entry<Integer, String>> entrys = lhm.entrySet();
		for (Map.Entry<Integer, String> en : entrys) {
			Integer key = en.getKey();
			String value = en.getValue();
			System.out.println(key + "---" + value);
		}
	}

}
