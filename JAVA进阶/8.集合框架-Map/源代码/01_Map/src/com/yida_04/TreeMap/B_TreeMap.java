package com.yida_04.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class B_TreeMap {

	public static void main(String[] args) {
		TreeMap<String, Student> tm = new TreeMap<String, Student>();// ��������

		// ����ѧ������
		Student stu1 = new Student("�˳�", 41);
		Student stu2 = new Student("��С��", 32);
		Student stu3 = new Student("����", 35);
		Student stu4 = new Student("����", 54);
		Student stu5 = new Student("�˳�", 42);
		Student stu6 = new Student("������", 33);

		// ��ӵ�����
		tm.put("dengchao", stu1);
		tm.put("huangxiaoming", stu2);
		tm.put("wenzhang", stu3);
		tm.put("zhouruifa", stu4);
		tm.put("dengchao", stu5);
		tm.put("huangxiaoming", stu6);

		// ��ǿfor����(����ֵ)
		Set<String> set = tm.keySet();
		for (String key : set) {
			Student value = tm.get(key);// ע�⣺������ѧ���������ַ���
			System.out.println(key + "---" + value.getName() + "---" + value.getAge());
		}

		System.out.println("------");

		// ��ǿfor����(��-ֵ�Զ����Ҽ���ֵ)
		Set<Map.Entry<String, Student>> entrys = tm.entrySet();
		for (Map.Entry<String, Student> en : entrys) {
			String key = en.getKey();
			Student value = en.getValue();
			System.out.println(key + "---" + value.getName() + "---" + value.getAge());
		}
	}

}
