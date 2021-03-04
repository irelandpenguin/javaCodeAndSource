/*
 * LinkedHashMap:��Map�ӿڵĹ�ϣ��������б�ʵ�֣����п�Ԥ֪�ĵ���˳��
 * �ص㣺�洢�����-ֵ�ԣ���Ψһ��ֵ���ظ���
 * �ɹ�ϣ��֤����Ψһ��
 * ������֤��������(�����������ָ �洢��ȡ����˳��һ�£�����������)
 */
package com.yida_03.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A_LinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(100, "hello");
		lhm.put(101, "world");
		lhm.put(102, "java");
		lhm.put(103, "yidahulian");

		// ��ǿfor����(����ֵ)
		Set<Integer> set = lhm.keySet();
		for (Integer key : set) {
			String value = lhm.get(key);
			System.out.println(key + "---" + value);
		}

		System.out.println("------");

		// ��ǿfor����(��-ֵ�Զ����Ҽ���ֵ)
		Set<Map.Entry<Integer, String>> entrys = lhm.entrySet();
		for (Map.Entry<Integer, String> en : entrys) {
			Integer key = en.getKey();
			String value = en.getValue();
			System.out.println(key + "---" + value);
		}
	}

}
