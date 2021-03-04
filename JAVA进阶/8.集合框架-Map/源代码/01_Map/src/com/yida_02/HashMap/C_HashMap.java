/*
 * HashMap<Teacher,String>
 * ����Teacher
 * 		Ҫ�������������ĳ�Ա����ֵ����ͬ����Ϊͬһ������
 * 		Ҫ�ﵽ��Ҫ��Teacher������дhashCode()��equals()������
 * ֵ��String
 */
package com.yida_02.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C_HashMap {

	public static void main(String[] args) {
		HashMap<Teacher, String> hm = new HashMap<Teacher, String>();// ��������

		// ����ѧ������
		Teacher stu1 = new Teacher("�˳�", 41);
		Teacher stu2 = new Teacher("��С��", 32);
		Teacher stu3 = new Teacher("����", 35);
		Teacher stu4 = new Teacher("����", 54);
		Teacher stu5 = new Teacher("�˳�", 41);
		Teacher stu6 = new Teacher("��С��", 32);

		// ��ӵ�����
		hm.put(stu1, "201710");
		hm.put(stu2, "201711");
		hm.put(stu3, "201712");
		hm.put(stu4, "201713");
		hm.put(stu5, "201714");
		hm.put(stu6, "201715");

		// ��ǿfor����(����ֵ)
		Set<Teacher> set = hm.keySet();
		for (Teacher key : set) {
			String value = hm.get(key);// ע�⣺�������ַ���������ѧ��
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}

		System.out.println("------");

		// ��ǿfor����(��-ֵ�Զ����Ҽ���ֵ)
		Set<Map.Entry<Teacher, String>> entrys = hm.entrySet();
		for (Map.Entry<Teacher, String> en : entrys) {
			Teacher key = en.getKey();
			String value = en.getValue();
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}
	}

}
