/*
 * HashMap:�ǻ��ڹ�ϣ���Map�ӿ�ʵ�֡�
 * �ص�:�洢�����-ֵ�ԣ���Ψһ��ֵ���ظ���
 * ��ϣ���������������֤����Ψһ�Եġ�
 * 
 * HashMap<String,String>
 * ����String ѧ��
 * ֵ��String ����
 * 
 * HashMap<Integer,String>
 * ����Integer ѧ��
 * ֵ��String ����
 */
package com.yida_02.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A_HashMap {

	public static void main(String[] args) {
		test1();// ��:String, ֵ:String
		System.out.println("------");
		test2();// ��:Integer, ֵ:String
	}

	public static void test1() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("201701", "��С��");
		hm.put("201702", "�˳�");
		hm.put("201703", "����");

		// ��ǿfor����(����ֵ)
		Set<String> set = hm.keySet();
		for (String key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}
		//
		// System.out.println("------");
		//
		// // ��ǿfor����(��-ֵ�Զ����Ҽ���ֵ)
		// Set<Map.Entry<String, String>> entrys = hm.entrySet();
		// for (Map.Entry<String, String> en : entrys) {
		// String key = en.getKey();
		// String value = en.getValue();
		// System.out.println(key + "---" + value);
		// }

		//show(hm);// ���ͷ�����ӡ���
	}

	public static void test2() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(201704, "��ӱ");
		hm.put(201705, "����");
		hm.put(201706, "�����P");

		// ��ǿfor����(����ֵ)
		Set<Integer> set = hm.keySet();
		for (Integer key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}

		System.out.println("------");
		//
		// // ��ǿfor����(��-ֵ�Զ����Ҽ���ֵ)
		// Set<Map.Entry<Integer, String>> entrys = hm.entrySet();
		// for (Map.Entry<Integer, String> en : entrys) {
		// Integer key = en.getKey();
		// String value = en.getValue();
		// System.out.println(key + "---" + value);
		// }

		//show(hm);// ���ͷ�����ӡ���
	}

	public static <K, V> void show(HashMap<K, V> hm) {
		// ��ǿfor����(����ֵ)
		Set<K> set = hm.keySet();
		for (K key : set) {
			V value = hm.get(key);
			System.out.println(key + "---" + value);
		}

		System.out.println("------");

		// ��ǿfor����(��-ֵ�Զ����Ҽ���ֵ)
		Set<Map.Entry<K, V>> entrys = hm.entrySet();
		for (Map.Entry<K, V> en : entrys) {
			K key = en.getKey();
			V value = en.getValue();
			System.out.println(key + "---" + value);
		}
	}

}
