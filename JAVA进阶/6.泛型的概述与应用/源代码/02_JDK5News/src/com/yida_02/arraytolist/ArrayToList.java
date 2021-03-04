/**
 * ���������黥ת
 * 
 * ����ת����
 * 	 ʹ��ArrayList���toArray()����
 * 
 * ����ת����
 * ʹ�ù�����Arrays���һ������
 * public static <T> List<T> asList(T... a):������ת�ɼ���
 * 
 * ע�����
 * 		��Ȼ���԰�����ת�ɼ��ϣ����Ǽ��ϵĳ��Ȳ��ܸı䡣
 */
package com.yida_02.arraytolist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		// ����ת����
		ArrayList<String> lit = new ArrayList<String>();
		lit.add("hello");
		lit.add("world");
		Object[] arr = lit.toArray();

		for (Object obj : arr) {
			String str = (String) obj;
			System.out.println(str);
		}
		
		System.out.println("-----");
		
		String[] arr2 = new String[lit.size()];
		lit.toArray(arr2);
		for(String s : arr2) {
			System.out.println(s);
		}

		
		System.out.println("------");

		// ����ת����
		String[] arr3 = { "���", "hello", "java" };
		List<String> list = Arrays.asList(arr3);

		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("------");

		// ��Ȼ���԰�����ת�ɼ��ϣ����Ǽ��ϵĳ��Ȳ��ܸı䡣
		//list.add("�˴ﻥ��");// ���б���UnsupportedOperationException
		// list.remove(1);// ���б���UnsupportedOperationException
		list.set(1, "�˴ﻥ��");// ������ȷ����Ϊ���ϵĳ���û�ı�
		System.out.println(list);
		
		System.out.println("------");
		
		List<String> list2 = Arrays.asList("hello","world","yida");
		for (String s2 : list2) {
			System.out.println(s2);
		}
	}

}
