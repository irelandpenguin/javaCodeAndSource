/*
 * TreeMap:�ǻ��ں������Map�ӿڵ�ʵ�֡�
 * �ص㣺�洢�����-ֵ�ԣ���Ψһ��ֵ���ظ���
 * �������֤�ļ��������Ψһ��
 * ������ײ��ǲ�����Ȼ����compareTo()�����ͱȽ�������compare()��������֤��Ψһ�Ժ�����
 * 
 * TreeMap<Integer,String>
 * ����Integer
 * ֵ��String
 */
package com.yida_04.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class A_TreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();// ��������

		// ��Ӽ�-ֵ��
		tm.put(10, "hello");// jdk5������-�Զ�װ��
		tm.put(2, "world");
		tm.put(13, "java");
		tm.put(40, "yida");
		tm.put(10, "HELLO");
		tm.put(2, "WORLD");
		System.out.println(tm);// ���Ϊ{2=WORLD, 10=HELLO, 13=java, 40=yida}
		System.out.println("------");

		// ��ǿfor����(����ֵ)
		Set<Integer> set = tm.keySet();
		for (Integer key : set) {
			String value = tm.get(key);
			System.out.println(key + "---" + value);
		}

		System.out.println("------");

		// ��ǿfor����(��-ֵ�Զ����Ҽ���ֵ)
		Set<Map.Entry<Integer, String>> entrys = tm.entrySet();
		for (Map.Entry<Integer, String> en : entrys) {
			Integer key = en.getKey();
			String value = en.getValue();
			System.out.println(key + "---" + value);
		}
	}

}
