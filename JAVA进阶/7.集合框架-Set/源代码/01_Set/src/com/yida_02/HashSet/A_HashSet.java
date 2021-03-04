/**
 * HashSet:�洢�ַ���������
 * ���⣺Ϊʲô�洢�ַ���������ͬ��ֻ�洢��һ����?
 * ͨ���鿴add������Դ�룬����֪����������ײ����� ����������hashCode()��equals()��
 * add�����Ĳ��裺	
 * 		�ȿ�hashCode()ֵ�Ƿ���ͬ
 * 			��ͬ:������equals()����
 * 				����true��˵��Ԫ���ظ����Ͳ����
 * 				����false��˵��Ԫ�ز��ظ�������ӵ�����
 * 			��ͬ����ֱ�Ӱ�Ԫ����ӵ����ϡ�
 * �����û����д������������Ĭ��ʹ�õ�Object���hashCode()������equals()������һ����˵������ͬ��ԭ����hashCode()��ȡ��ֵ
 * ������ʵ���ڴ��ַ�ģ���������ڴ��ַ��������ͬ��
 * String����д��hashCode()��equals()���������ԣ����Ϳ��԰�������ͬ���ַ���ȥ����ֻ����һ����
 */
package com.yida_02.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class A_HashSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("yida");
		hs.add("hulian");
		hs.add("hulian");
		hs.add("java");

		// ��ǿfor����
		for (String str : hs) {
			System.out.println(str);
		}

		System.out.println("------");

		// ����������
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		// ��ͨfor���ܱ�����ԭ����HashSetû��get(int index)������ֻ��List���ϲ��еġ�
	}

}
