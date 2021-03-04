package com.yida_04.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C_TreeMap {

	public static void main(String[] args) {
		TreeMap<Cat, String> tm = new TreeMap<Cat, String>();// ��������

		// ����ѧ������
		Cat stu1 = new Cat("�˳�", 41);
		Cat stu2 = new Cat("��С��", 32);
		Cat stu3 = new Cat("����", 35);
		Cat stu4 = new Cat("����", 54);
		Cat stu5 = new Cat("�˳�", 42);
		Cat stu6 = new Cat("������", 33);
		Cat stu7 = new Cat("�˳�", 41);

		// ��ӵ�����
		tm.put(stu1, "dengchao");
		tm.put(stu2, "huangxiaoming");
		tm.put(stu3, "wenzhang");
		tm.put(stu4, "zhouruifa");
		tm.put(stu5, "dengchao");
		tm.put(stu6, "huangxiaoming");
		tm.put(stu7, "dengchao");

		// ��ǿfor����(����ֵ)
		Set<Cat> set = tm.keySet();
		for (Cat key : set) {
			String value = tm.get(key);// ע�⣺�������ַ���������ѧ��
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}

		System.out.println("------");

		// ��ǿfor����(��-ֵ�Զ����Ҽ���ֵ)
		Set<Map.Entry<Cat, String>> entrys = tm.entrySet();
		for (Map.Entry<Cat, String> en : entrys) {
			Cat key = en.getKey();
			String value = en.getValue();
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}
	}

}
