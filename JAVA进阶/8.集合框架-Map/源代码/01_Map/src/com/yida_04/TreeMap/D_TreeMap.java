package com.yida_04.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class D_TreeMap {

	public static void main(String[] args) {
		// ��������
		TreeMap<Dog, String> tm = new TreeMap<Dog, String>(new Comparator<Dog>() {
					@Override
					public int compare(Dog o1, Dog o2) {
						// ��Ҫ������������Ӵ�С������
						int num = o2.getAge() - o1.getAge();// �Ӵ�С����
						// ��Ҫ������������ͬ����������������ͬ
						int num2 = num == 0 ? o2.getName().compareTo(
								o1.getName()) : num;
						return num2;
					}
				});

		// ����ѧ������
		Dog stu1 = new Dog("�˳�", 41);
		Dog stu2 = new Dog("��С��", 32);
		Dog stu3 = new Dog("����", 35);
		Dog stu4 = new Dog("����", 54);
		Dog stu5 = new Dog("�˳�", 42);
		Dog stu6 = new Dog("������", 33);
		Dog stu7 = new Dog("�˳�", 41);

		// ��ӵ�����
		tm.put(stu1, "dengchao");
		tm.put(stu2, "huangxiaoming");
		tm.put(stu3, "wenzhang");
		tm.put(stu4, "zhouruifa");
		tm.put(stu5, "dengchao");
		tm.put(stu6, "huangxiaoming");
		tm.put(stu7, "dengchao");

		// ��ǿfor����(����ֵ)
		Set<Dog> set = tm.keySet();
		for (Dog key : set) {
			String value = tm.get(key);// ע�⣺�������ַ���������ѧ��
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}

		System.out.println("------");

		// ��ǿfor����(��-ֵ�Զ����Ҽ���ֵ)
		Set<Map.Entry<Dog, String>> entrys = tm.entrySet();
		for (Map.Entry<Dog, String> en : entrys) {
			Dog key = en.getKey();
			String value = en.getValue();
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}
	}

}
