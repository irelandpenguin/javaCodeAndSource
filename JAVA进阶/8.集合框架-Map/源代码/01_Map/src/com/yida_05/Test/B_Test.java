/*
 * ArrayList集合嵌套HashMap集合并遍历。
 *需求：
 *假设ArrayList集合的元素是HashMap,有3个。
 *每一个HashMap集合的键是数字对象，值是字符串。
 *
 *分析：
 *	HashMap<Integer, String> ： 键是年龄，值是姓名
 *	ArrayList<HashMap<Integer, String>> ：存储的是学生信息(姓名和年龄)
 */
package com.yida_05.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class B_Test {

	public static void main(String[] args) {
		ArrayList<HashMap<Integer, String>> list = new ArrayList<HashMap<Integer, String>>();

		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(24, "张三");
		hm1.put(30, "李四");
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		hm2.put(27, "王五");
		hm2.put(32, "赵六");
		HashMap<Integer, String> hm3 = new HashMap<Integer, String>();
		hm3.put(42, "邓超");
		hm3.put(35, "黄小明");

		list.add(hm1);
		list.add(hm2);
		list.add(hm3);

		// 增强for遍历
		for (HashMap<Integer, String> hm : list) {
			Set<Integer> set = hm.keySet();
			for (Integer key : set) {
				String value = hm.get(key);
				System.out.println(key + "---" + value);
			}
		}

		System.out.println("------");

		// 迭代器遍历
		Iterator<HashMap<Integer, String>> it = list.iterator();
		while (it.hasNext()) {
			HashMap<Integer, String> hm = it.next();
			Set<Integer> set = hm.keySet();
			for (Integer key : set) {
				String value = hm.get(key);
				System.out.println(key + "---" + value);
			}
		}
	}

}
