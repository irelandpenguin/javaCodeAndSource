/*
 *  Map���ϵĹ��ܸ�����
 * 		void putAll(Map<? extends K,? extends V> m)����һ�����ϵ�������ӵ���һ��������
 * 		boolean equals(Object o)���ж����������Ƿ����
 * 		Set<Map.Entry<K,V>> entrySet():��ȡmapʵ�����
 */
package com.yida_01.map;

import java.util.HashMap;
import java.util.Map;

public class B_Map {

	public static void main(String[] args) {
		// ����һ������
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "����");
		map.put("2", "����");
		map.put("3", "����");
		map.put("4", "����");
		System.out.println(map);
		System.out.println("------");

		// �ٴ���һ������
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("1", "������");
		map2.put("5", "����");
		map2.put("6", "�ܰ�");
		System.out.println(map2);
		System.out.println("------");

		// void putAll(Map<? extends K,? extends V> m)����һ�����ϵ�������ӵ���һ��������
		map.putAll(map2);// �Ѽ���map2�����м�-ֵ����ӵ�����map��
		System.out.println(map);

		// boolean equals(Object o)���ж����������Ƿ����
		// System.out.println(map.equals(map2));
		// map2.clear();
		// map2.putAll(map);
		// System.out.println(map.equals(map2));

		// Set<Map.Entry<K,V>> entrySet():��ȡmapʵ�����

		// ������������Ԫ��
		// ��ʽһ������ֵ
		// Set<String> set = map.keySet();
		// for (String key : set) {
		// String value = map.get(key);
		// System.out.println(key + "---" + value);
		// }
		//
		// System.out.println("------");

		// ��ʽ������-ֵ�Զ����Ҽ���ֵ
		// Set<Map.Entry<K,V>> entrySet():��ȡmapʵ�����
		// Set<Map.Entry<String, String>> entrys = map.entrySet();
		// for (Map.Entry<String, String> en : entrys) {
		// String key = en.getKey();
		// String value = en.getValue();
		// System.out.println(key + "---" + value);
		// }
	}

}
