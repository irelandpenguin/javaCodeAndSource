/*
 * ���� ��"aababcabcdabcde",��ȡ�ַ�����ÿһ����ĸ���ֵĴ���Ҫ����:a(5)b(4)c(3)d(2)e(1)
 * 
 * ������
 * 		A:����һ���ַ���(���ԸĽ�Ϊ����¼��)
 * 		B:����һ��TreeMap����
 * 			��:Character
 * 			ֵ��Integer
 * 		C:���ַ���ת��Ϊ�ַ�����
 * 		D:�����ַ����飬�õ�ÿһ���ַ�
 * 		E:�øղŵõ����ַ���Ϊ����������ȥ��ֵ���������
 * 			false:˵���ü������ڣ��ͰѸ��ַ���Ϊ����1��Ϊֵ�洢
 * 			true:˵���ü����ڣ��Ͱ�ֵ��1��Ȼ�����´洢�ü���ֵ
 * 		F:�����ַ�������������
 * 		G:�������ϣ��õ�����ֵ�����а���Ҫ��ƴ��
 * 		H:���ַ���������ת��Ϊ�ַ������
 */
package com.yida_05.Test;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class A_Test {

	public static void main(String[] args) {
		// A:����һ���ַ���(���ԸĽ�Ϊ����¼��)
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String str = sc.nextLine();

		// B:����һ��TreeMap����
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		// C:���ַ���ת��Ϊ�ַ�����
		char[] arr = str.toCharArray();

		// D:�����ַ����飬�õ�ÿһ���ַ�
		for (char c : arr) {
			// E:�øղŵõ����ַ���Ϊ����������ȥ��ֵ���������
			// false:˵���ü������ڣ��ͰѸ��ַ���Ϊ����1��Ϊֵ�洢
			// true:˵���ü����ڣ��Ͱ�ֵ��1��Ȼ�����´洢�ü���ֵ
			boolean b = tm.containsKey(c);
			if (b == false) {
				tm.put(c, 1);// jdk5������-�Զ�װ��
			} else {
				Integer value = tm.get(c);
				value++;// jdk5������-�Զ����䣬Ȼ����װ��
				tm.put(c, value);
			}
		}

		// F:�����ַ�������������
		StringBuilder sb = new StringBuilder();

		// G:�������ϣ��õ�����ֵ�����а���Ҫ��ƴ��
		Set<Character> set = tm.keySet();
		for (Character key : set) {
			Integer value = tm.get(key);
			sb.append(key).append('(').append(value).append(')');
		}

		// H:���ַ���������ת��Ϊ�ַ������
		System.out.println(sb.toString());
	}

}
