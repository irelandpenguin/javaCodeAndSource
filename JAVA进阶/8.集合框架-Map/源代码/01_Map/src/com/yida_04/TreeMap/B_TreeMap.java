package com.yida_04.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class B_TreeMap {

	public static void main(String[] args) {
		TreeMap<String, Student> tm = new TreeMap<String, Student>();// 创建对象

		// 创建学生对象
		Student stu1 = new Student("邓超", 41);
		Student stu2 = new Student("黄小明", 32);
		Student stu3 = new Student("文章", 35);
		Student stu4 = new Student("周润发", 54);
		Student stu5 = new Student("邓朝", 42);
		Student stu6 = new Student("黄晓明", 33);

		// 添加到集合
		tm.put("dengchao", stu1);
		tm.put("huangxiaoming", stu2);
		tm.put("wenzhang", stu3);
		tm.put("zhouruifa", stu4);
		tm.put("dengchao", stu5);
		tm.put("huangxiaoming", stu6);

		// 增强for遍历(键找值)
		Set<String> set = tm.keySet();
		for (String key : set) {
			Student value = tm.get(key);// 注意：这里是学生，不是字符串
			System.out.println(key + "---" + value.getName() + "---" + value.getAge());
		}

		System.out.println("------");

		// 增强for遍历(键-值对对象找键和值)
		Set<Map.Entry<String, Student>> entrys = tm.entrySet();
		for (Map.Entry<String, Student> en : entrys) {
			String key = en.getKey();
			Student value = en.getValue();
			System.out.println(key + "---" + value.getName() + "---" + value.getAge());
		}
	}

}
