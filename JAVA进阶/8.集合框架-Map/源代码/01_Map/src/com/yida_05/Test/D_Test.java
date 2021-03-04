/*
 * HashMap集合嵌套HashMap集合并遍历。
 * 需求：
 *	假设HashMap集合的元素是HashMap,有3个。
 *
 * 分析：
 *	HashMap<Integer, String> ：键是学号，比如：201701。值是姓名，比如：张三。
 *	HashMap<String, HashMap<Integer, String>> ： 键是班级名称，比如：基础班。值为学生信息，比如：张三，201701
 */
package com.yida_05.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D_Test {

	public static void main(String[] args) {
		HashMap<String, HashMap<Integer, String>> hm = new HashMap<String, HashMap<Integer, String>>();

		HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
		hmap1.put(201701, "张三");
		hmap1.put(201702, "李四");

		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		hmap2.put(201703, "王五");
		hmap2.put(201704, "赵六");

		HashMap<Integer, String> hmap3 = new HashMap<Integer, String>();
		hmap3.put(201705, "黄小明");
		hmap3.put(201706, "邓超");

		hm.put("基础班", hmap1);
		hm.put("周末班", hmap2);
		hm.put("就业班", hmap3);

		// 增强for遍历(键找值)
		Set<String> set = hm.keySet();
		for (String key : set) {
			System.out.println(key);
			HashMap<Integer, String> value = hm.get(key);
			Set<Integer> set2 = value.keySet();
			for (Integer key2 : set2) {
				String value2 = value.get(key2);
				System.out.println("\t" + key2 + "\t" + value2);
			}
		}

		System.out.println("------");

		// 增强for遍历(键-值对对象找键和值)
		Set<Map.Entry<String, HashMap<Integer, String>>> entrys = hm.entrySet();
		for (Map.Entry<String, HashMap<Integer, String>> en : entrys) {
			String key = en.getKey();
			System.out.println(key);
			HashMap<Integer, String> value = en.getValue();
			Set<Map.Entry<Integer, String>> entrys2 = value.entrySet();
			for (Map.Entry<Integer, String> en2 : entrys2) {
				Integer key2 = en2.getKey();
				String value2 = en2.getValue();
				System.out.println("\t" + key2 + "\t" + value2);
			}
		}
	}

}
