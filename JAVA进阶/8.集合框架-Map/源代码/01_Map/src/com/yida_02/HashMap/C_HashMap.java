/*
 * HashMap<Teacher,String>
 * 键：Teacher
 * 		要求：如果两个对象的成员变量值都相同，则为同一个对象。
 * 		要达到此要求，Teacher必须重写hashCode()和equals()方法。
 * 值：String
 */
package com.yida_02.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C_HashMap {

	public static void main(String[] args) {
		HashMap<Teacher, String> hm = new HashMap<Teacher, String>();// 创建集合

		// 创建学生对象
		Teacher stu1 = new Teacher("邓超", 41);
		Teacher stu2 = new Teacher("黄小明", 32);
		Teacher stu3 = new Teacher("文章", 35);
		Teacher stu4 = new Teacher("周润发", 54);
		Teacher stu5 = new Teacher("邓超", 41);
		Teacher stu6 = new Teacher("黄小明", 32);

		// 添加到集合
		hm.put(stu1, "201710");
		hm.put(stu2, "201711");
		hm.put(stu3, "201712");
		hm.put(stu4, "201713");
		hm.put(stu5, "201714");
		hm.put(stu6, "201715");

		// 增强for遍历(键找值)
		Set<Teacher> set = hm.keySet();
		for (Teacher key : set) {
			String value = hm.get(key);// 注意：这里是字符串，不是学生
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}

		System.out.println("------");

		// 增强for遍历(键-值对对象找键和值)
		Set<Map.Entry<Teacher, String>> entrys = hm.entrySet();
		for (Map.Entry<Teacher, String> en : entrys) {
			Teacher key = en.getKey();
			String value = en.getValue();
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}
	}

}
