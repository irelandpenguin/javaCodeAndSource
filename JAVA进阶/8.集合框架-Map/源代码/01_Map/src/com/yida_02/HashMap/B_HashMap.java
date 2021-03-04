/*
 * HashMap<String,Student>
 * ����String	 ѧ��
 * ֵ��Student ѧ������
 */
package com.yida_02.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class B_HashMap {

	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<String, Student>();// ��������

		// ����ѧ������
		Student stu1 = new Student("�˳�", 41);
		Student stu2 = new Student("��С��", 32);
		Student stu3 = new Student("����", 35);
		Student stu4 = new Student("����", 54);

		// ��ӵ�����
		hm.put("201710", stu1);
		hm.put("201711", stu2);
		hm.put("201712", stu3);
		hm.put("201713", stu4);

		// ��ǿfor����(����ֵ)
		Set<String> set = hm.keySet();
		for (String key : set) {
			Student value = hm.get(key);// ע�⣺������ѧ���������ַ���
			System.out.println(key + "---" + value.getName() + "---" + value.getAge());
		}

		System.out.println("------");

		// ��ǿfor����(��-ֵ�Զ����Ҽ���ֵ)
		Set<Map.Entry<String, Student>> entrys = hm.entrySet();
		for (Map.Entry<String, Student> en : entrys) {
			String key = en.getKey();
			Student value = en.getValue();
			System.out.println(key + "---" + value.getName() + "---" + value.getAge());
		}

		// show(hm);// ���ͷ�����ӡ���
	}

	public static <K, V> void show(HashMap<K, V> hm) {
		// ��ǿfor����(����ֵ)
		Set<K> set = hm.keySet();
		for (K key : set) {
			V value = hm.get(key);// ע�⣺������ѧ���������ַ���
			Student stu = (Student) value;
			System.out.println(key + "---" + stu.getName() + "---" + stu.getAge());
		}

		System.out.println("------");

		// ��ǿfor����(��-ֵ�Զ����Ҽ���ֵ)
		Set<Map.Entry<K, V>> entrys = hm.entrySet();
		for (Map.Entry<K, V> en : entrys) {
			K key = en.getKey();
			V value = en.getValue();
			Student stu = (Student) value;
			System.out.println(key + "---" + stu.getName() + "---" + stu.getAge());
		}
	}

}
