/*
 * HashMap����Ƕ����HashMap���ϣ�Ȼ����HashMap����Ƕ��ArrayList����������
 * ����
 *  ����HashMap���ϵ�Ԫ������HashMap,��3����ÿ����HashMap���ϵ�Ԫ����ArrayList,��2����
 *
 * ������
 * 	ArrayList<Student> ��װ����ѧ�����󣬱��磺������24��
 *	HashMap<String, ArrayList<Student>> �����ǰ༶�ţ����磺��һ1�ࡣֵ��һ��ѧ������
 *	HashMap<String, HashMap<String, ArrayList<Student>>> �� �����꼶�ţ����磺��һ�꼶��ֵ�Ǹ��꼶��Ӧ�����а࣬���磺��һ1�࣬��һ2��ȡ�
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
		// ��ѧ����ӵ�list
		ArrayList<Student> list1 = new ArrayList<Student>();
		Student s1_1 = new Student("����", 22);
		Student s1_2 = new Student("����", 27);
		list1.add(s1_1);
		list1.add(s1_2);

		ArrayList<Student> list2 = new ArrayList<Student>();
		Student s2_1 = new Student("����", 28);
		Student s2_2 = new Student("����", 32);
		list2.add(s2_1);
		list2.add(s2_2);

		ArrayList<Student> list3 = new ArrayList<Student>();
		Student s3_1 = new Student("�˳�", 42);
		Student s3_2 = new Student("��С��", 35);
		list3.add(s3_1);
		list3.add(s3_2);

		ArrayList<Student> list4 = new ArrayList<Student>();
		Student s4_1 = new Student("¹��", 24);
		Student s4_2 = new Student("�º�", 36);
		list4.add(s4_1);
		list4.add(s4_2);

		ArrayList<Student> list5 = new ArrayList<Student>();
		Student s5_1 = new Student("����", 42);
		Student s5_2 = new Student("�����P", 38);
		list5.add(s5_1);
		list5.add(s5_2);

		ArrayList<Student> list6 = new ArrayList<Student>();
		Student s6_1 = new Student("��ӱ", 26);
		Student s6_2 = new Student("�ܽ���", 40);
		list6.add(s6_1);
		list6.add(s6_2);

		// ��list��ӵ�����
		LinkedHashMap<String, ArrayList<Student>> hmap1 = new LinkedHashMap<String, ArrayList<Student>>();
		hmap1.put("��һ1��", list1);
		hmap1.put("��һ2��", list2);

		LinkedHashMap<String, ArrayList<Student>> hmap2 = new LinkedHashMap<String, ArrayList<Student>>();
		hmap2.put("�߶�1��", list3);
		hmap2.put("�߶�2��", list4);

		LinkedHashMap<String, ArrayList<Student>> hmap3 = new LinkedHashMap<String, ArrayList<Student>>();
		hmap3.put("����1��", list5);
		hmap3.put("����2��", list6);

		// ��hashmap��ӵ����hashmap������
		LinkedHashMap<String, LinkedHashMap<String, ArrayList<Student>>> bigHM = new LinkedHashMap<String, LinkedHashMap<String, ArrayList<Student>>>();
		bigHM.put("��һ�꼶", hmap1);
		bigHM.put("�߶��꼶", hmap2);
		bigHM.put("�����꼶", hmap3);

		// ��ǿfor����(����ֵ)
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
		// ��ѧ����ӵ�list
		ArrayList<Student> list1 = new ArrayList<Student>();
		Student s1_1 = new Student("����", 22);
		Student s1_2 = new Student("����", 27);
		list1.add(s1_1);
		list1.add(s1_2);

		ArrayList<Student> list2 = new ArrayList<Student>();
		Student s2_1 = new Student("����", 28);
		Student s2_2 = new Student("����", 32);
		list2.add(s2_1);
		list2.add(s2_2);

		ArrayList<Student> list3 = new ArrayList<Student>();
		Student s3_1 = new Student("�˳�", 42);
		Student s3_2 = new Student("��С��", 35);
		list3.add(s3_1);
		list3.add(s3_2);

		ArrayList<Student> list4 = new ArrayList<Student>();
		Student s4_1 = new Student("¹��", 24);
		Student s4_2 = new Student("�º�", 36);
		list4.add(s4_1);
		list4.add(s4_2);

		ArrayList<Student> list5 = new ArrayList<Student>();
		Student s5_1 = new Student("����", 42);
		Student s5_2 = new Student("�����P", 38);
		list5.add(s5_1);
		list5.add(s5_2);

		ArrayList<Student> list6 = new ArrayList<Student>();
		Student s6_1 = new Student("��ӱ", 26);
		Student s6_2 = new Student("�ܽ���", 40);
		list6.add(s6_1);
		list6.add(s6_2);

		// ��list��ӵ�����
		HashMap<String, ArrayList<Student>> hmap1 = new HashMap<String, ArrayList<Student>>();
		hmap1.put("��һ1��", list1);
		hmap1.put("��һ2��", list2);

		HashMap<String, ArrayList<Student>> hmap2 = new HashMap<String, ArrayList<Student>>();
		hmap2.put("�߶�1��", list3);
		hmap2.put("�߶�2��", list4);

		HashMap<String, ArrayList<Student>> hmap3 = new HashMap<String, ArrayList<Student>>();
		hmap3.put("����1��", list5);
		hmap3.put("����2��", list6);

		// ��hashmap��ӵ����hashmap������
		HashMap<String, HashMap<String, ArrayList<Student>>> bigHM = new HashMap<String, HashMap<String, ArrayList<Student>>>();
		bigHM.put("��һ�꼶", hmap1);
		bigHM.put("�߶��꼶", hmap2);
		bigHM.put("�����꼶", hmap3);

		// ��ǿfor����(����ֵ)
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
