/*
 * HashMap集合嵌套ArrayList集合并遍历。
 *需求：
 *假设HashMap集合的元素是ArrayList,有3个。
 *每一个ArrayList集合存储的都是字符串。
 *
 *分析：
 *	ArrayList<String> : 存储角色姓名，比如：吕布。
 *	HashMap<String, ArrayList<String>> ：键是电视剧名称，比如：三国演义。值是角色姓名列表集合。
 */
package com.yida_05.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C_Test {

	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("吕布");
		list1.add("周瑜");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("令狐冲");
		list2.add("林平之");

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("郭靖");
		list3.add("杨过");

		hm.put("三国演义", list1);
		hm.put("笑傲江湖", list2);
		hm.put("神雕侠侣", list3);

		// 增强for遍历(键找值)
		Set<String> set = hm.keySet();
		for (String key : set) {
			System.out.println(key);
			ArrayList<String> value = hm.get(key);
			for (String s : value) {
				System.out.println("\t" + s);
			}
		}

		System.out.println("------");

		// 增强for遍历(键-值对对象找键和值)
		Set<Map.Entry<String, ArrayList<String>>> entrys = hm.entrySet();
		for (Map.Entry<String, ArrayList<String>> en : entrys) {
			String key = en.getKey();
			System.out.println(key);
			ArrayList<String> value = en.getValue();
			for (String s : value) {
				System.out.println("\t" + s);
			}
		}
	}

}
