/*
 * HashMap<String,Student>
 * 键：String	 学号
 * 值：Student 学生对象
 */
package com.yida_02.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class B_HashMap {

	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<String, Student>();// 创建集合

		// 创建学生对象
		Student stu1 = new Student("邓超", 41);
		Student stu2 = new Student("黄小明", 32);
		Student stu3 = new Student("文章", 35);
		Student stu4 = new Student("周润发", 54);

		// 添加到集合
		hm.put("201710", stu1);
		hm.put("201711", stu2);
		hm.put("201712", stu3);
		hm.put("201713", stu4);

		// 增强for遍历(键找值)
		Set<String> set = hm.keySet();
		for (String key : set) {
			Student value = hm.get(key);// 注意：这里是学生，不是字符串
			System.out.println(key + "---" + value.getName() + "---" + value.getAge());
		}

		System.out.println("------");

		// 增强for遍历(键-值对对象找键和值)
		Set<Map.Entry<String, Student>> entrys = hm.entrySet();
		for (Map.Entry<String, Student> en : entrys) {
			String key = en.getKey();
			Student value = en.getValue();
			System.out.println(key + "---" + value.getName() + "---" + value.getAge());
		}

		// show(hm);// 泛型方法打印结果
	}

	public static <K, V> void show(HashMap<K, V> hm) {
		// 增强for遍历(键找值)
		Set<K> set = hm.keySet();
		for (K key : set) {
			V value = hm.get(key);// 注意：这里是学生，不是字符串
			Student stu = (Student) value;
			System.out.println(key + "---" + stu.getName() + "---" + stu.getAge());
		}

		System.out.println("------");

		// 增强for遍历(键-值对对象找键和值)
		Set<Map.Entry<K, V>> entrys = hm.entrySet();
		for (Map.Entry<K, V> en : entrys) {
			K key = en.getKey();
			V value = en.getValue();
			Student stu = (Student) value;
			System.out.println(key + "---" + stu.getName() + "---" + stu.getAge());
		}
	}

}
