package com.yida_04.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C_TreeMap {

	public static void main(String[] args) {
		TreeMap<Cat, String> tm = new TreeMap<Cat, String>();// 创建对象

		// 创建学生对象
		Cat stu1 = new Cat("邓超", 41);
		Cat stu2 = new Cat("黄小明", 32);
		Cat stu3 = new Cat("文章", 35);
		Cat stu4 = new Cat("周润发", 54);
		Cat stu5 = new Cat("邓朝", 42);
		Cat stu6 = new Cat("黄晓明", 33);
		Cat stu7 = new Cat("邓超", 41);

		// 添加到集合
		tm.put(stu1, "dengchao");
		tm.put(stu2, "huangxiaoming");
		tm.put(stu3, "wenzhang");
		tm.put(stu4, "zhouruifa");
		tm.put(stu5, "dengchao");
		tm.put(stu6, "huangxiaoming");
		tm.put(stu7, "dengchao");

		// 增强for遍历(键找值)
		Set<Cat> set = tm.keySet();
		for (Cat key : set) {
			String value = tm.get(key);// 注意：这里是字符串，不是学生
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}

		System.out.println("------");

		// 增强for遍历(键-值对对象找键和值)
		Set<Map.Entry<Cat, String>> entrys = tm.entrySet();
		for (Map.Entry<Cat, String> en : entrys) {
			Cat key = en.getKey();
			String value = en.getValue();
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}
	}

}
