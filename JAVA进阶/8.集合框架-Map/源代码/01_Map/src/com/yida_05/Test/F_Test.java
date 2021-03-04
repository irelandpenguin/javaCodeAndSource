/*
 * HashMap集合嵌套子HashMap集合，然后子HashMap里再嵌套ArrayList，最后遍历。
 * 需求：
 *  假设HashMap集合的元素是子HashMap,有3个。每个子HashMap集合的元素是ArrayList,有2个。
 *
 * 分析：
 * 	ArrayList<Student> ：装的是学生对象，比如：张三，24。
 *	HashMap<String, ArrayList<Student>> ：键是班级号，比如：高一1班。值是一组学生对象
 *	HashMap<String, HashMap<String, ArrayList<Student>>> ： 键是年级号，比如：高一年级。值是该年级对应的所有班，比如：高一1班，高一2班等。
 */
package com.yida_05.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class F_Test {

	public static void main(String[] args) {
		//test1();//HashMap+HashMap+ArrayList
		test2();//LinkedHashMap+LinkedHashMap+ArrayList
	}

	public static void test2() {
		// 把学生添加到list
		ArrayList<Student> list1 = new ArrayList<Student>();
		Student s1_1 = new Student("张三", 22);
		Student s1_2 = new Student("李四", 27);
		list1.add(s1_1);
		list1.add(s1_2);

		ArrayList<Student> list2 = new ArrayList<Student>();
		Student s2_1 = new Student("王五", 28);
		Student s2_2 = new Student("赵六", 32);
		list2.add(s2_1);
		list2.add(s2_2);

		ArrayList<Student> list3 = new ArrayList<Student>();
		Student s3_1 = new Student("邓超", 42);
		Student s3_2 = new Student("黄小明", 35);
		list3.add(s3_1);
		list3.add(s3_2);

		ArrayList<Student> list4 = new ArrayList<Student>();
		Student s4_1 = new Student("鹿晗", 24);
		Student s4_2 = new Student("陈赫", 36);
		list4.add(s4_1);
		list4.add(s4_2);

		ArrayList<Student> list5 = new ArrayList<Student>();
		Student s5_1 = new Student("孙丽", 42);
		Student s5_2 = new Student("马伊琍", 38);
		list5.add(s5_1);
		list5.add(s5_2);

		ArrayList<Student> list6 = new ArrayList<Student>();
		Student s6_1 = new Student("杨颖", 26);
		Student s6_2 = new Student("周杰伦", 40);
		list6.add(s6_1);
		list6.add(s6_2);

		// 把list添加到集合
		LinkedHashMap<String, ArrayList<Student>> hmap1 = new LinkedHashMap<String, ArrayList<Student>>();
		hmap1.put("高一1班", list1);
		hmap1.put("高一2班", list2);

		LinkedHashMap<String, ArrayList<Student>> hmap2 = new LinkedHashMap<String, ArrayList<Student>>();
		hmap2.put("高二1班", list3);
		hmap2.put("高二2班", list4);

		LinkedHashMap<String, ArrayList<Student>> hmap3 = new LinkedHashMap<String, ArrayList<Student>>();
		hmap3.put("高三1班", list5);
		hmap3.put("高三2班", list6);

		// 把hashmap添加到大的hashmap集合里
		LinkedHashMap<String, LinkedHashMap<String, ArrayList<Student>>> bigHM = new LinkedHashMap<String, LinkedHashMap<String, ArrayList<Student>>>();
		bigHM.put("高一年级", hmap1);
		bigHM.put("高二年级", hmap2);
		bigHM.put("高三年级", hmap3);

		// 增强for遍历(键找值)
		Set<String> set = bigHM.keySet();
		for (String key : set) {
			System.out.println(key);
			HashMap<String, ArrayList<Student>> value = bigHM.get(key);
			Set<String> set2 = value.keySet();
			for (String key2 : set2) {
				System.out.println("\t" + key2);
				ArrayList<Student> value2 = value.get(key2);
				for (Student stu : value2) {
					System.out.println("\t\t" + stu.getName() + "\t" + stu.getAge());
				}
			}
		}
	}

	public static void test1() {
		// 把学生添加到list
		ArrayList<Student> list1 = new ArrayList<Student>();
		Student s1_1 = new Student("张三", 22);
		Student s1_2 = new Student("李四", 27);
		list1.add(s1_1);
		list1.add(s1_2);

		ArrayList<Student> list2 = new ArrayList<Student>();
		Student s2_1 = new Student("王五", 28);
		Student s2_2 = new Student("赵六", 32);
		list2.add(s2_1);
		list2.add(s2_2);

		ArrayList<Student> list3 = new ArrayList<Student>();
		Student s3_1 = new Student("邓超", 42);
		Student s3_2 = new Student("黄小明", 35);
		list3.add(s3_1);
		list3.add(s3_2);

		ArrayList<Student> list4 = new ArrayList<Student>();
		Student s4_1 = new Student("鹿晗", 24);
		Student s4_2 = new Student("陈赫", 36);
		list4.add(s4_1);
		list4.add(s4_2);

		ArrayList<Student> list5 = new ArrayList<Student>();
		Student s5_1 = new Student("孙丽", 42);
		Student s5_2 = new Student("马伊琍", 38);
		list5.add(s5_1);
		list5.add(s5_2);

		ArrayList<Student> list6 = new ArrayList<Student>();
		Student s6_1 = new Student("杨颖", 26);
		Student s6_2 = new Student("周杰伦", 40);
		list6.add(s6_1);
		list6.add(s6_2);

		// 把list添加到集合
		HashMap<String, ArrayList<Student>> hmap1 = new HashMap<String, ArrayList<Student>>();
		hmap1.put("高一1班", list1);
		hmap1.put("高一2班", list2);

		HashMap<String, ArrayList<Student>> hmap2 = new HashMap<String, ArrayList<Student>>();
		hmap2.put("高二1班", list3);
		hmap2.put("高二2班", list4);

		HashMap<String, ArrayList<Student>> hmap3 = new HashMap<String, ArrayList<Student>>();
		hmap3.put("高三1班", list5);
		hmap3.put("高三2班", list6);

		// 把hashmap添加到大的hashmap集合里
		HashMap<String, HashMap<String, ArrayList<Student>>> bigHM = new HashMap<String, HashMap<String, ArrayList<Student>>>();
		bigHM.put("高一年级", hmap1);
		bigHM.put("高二年级", hmap2);
		bigHM.put("高三年级", hmap3);

		// 增强for遍历(键找值)
		Set<String> set = bigHM.keySet();
		for (String key : set) {
			System.out.println(key);
			HashMap<String, ArrayList<Student>> value = bigHM.get(key);
			Set<String> set2 = value.keySet();
			for (String key2 : set2) {
				System.out.println("\t" + key2);
				ArrayList<Student> value2 = value.get(key2);
				for (Student stu : value2) {
					System.out.println("\t\t" + stu.getName() + "\t" + stu.getAge());
				}
			}
		}
	}

}
