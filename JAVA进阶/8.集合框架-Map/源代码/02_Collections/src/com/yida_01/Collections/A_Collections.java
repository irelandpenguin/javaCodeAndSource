/*
 * Collections:�����Collection���Ͻ��в����Ĺ����࣬���Ǿ�̬������
 * 
 * �����⣺
 * Collection��Collections������?
 * Collection:�ǵ��м��ϵĶ���ӿڣ����ӽӿ�List��Set��
 * Collections:����Լ��ϲ����Ĺ����࣬�жԼ��Ͻ�������Ͷ��ֲ��ҵķ���
 * 
 * Ҫ֪���ķ���
 * public static <T> void sort(List<T> list)������ Ĭ�����������Ȼ����
 * public static <T> void sort(List<T> list, Comparator<? super T> c)���Ƚ�������
 * public static <T> int binarySearch(List<?> list,T key):���ֲ���
 * public static <T> T max(Collection<?> coll):���ֵ
 * public static <T> T min(Collection<?> coll):��Сֵ
 * public static void reverse(List<?> list):��ת����Ԫ��
 * public static void shuffle(List<?> list):����û�����Ԫ��
 */
package com.yida_01.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A_Collections {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("yida");
		list.add("hulian");
		System.out.println("ԭʼlist:" + list);
		System.out.println("------");

		// public static <T> void sort(List<T> list)������ Ĭ�����������Ȼ����
		//Collections.sort(list);
		//System.out.println("��Ȼ������list" + list);
		//System.out.println("------");

		
		// public static <T> void sort(List<T> list, Comparator<? super T>
		// c)���Ƚ�������
		/*Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);// ��С�������� o2.compareTo(o1);//�Ӵ�С����
			}
		});
		System.out.println("�Ƚ���������list" + list);
		System.out.println("------");*/
		 
		// public static <T> int binarySearch(List<?> list,T key):���ֲ���,�Ⱦ�����������Ҫ��������
		//int index = Collections.binarySearch(list, "world");
		//System.out.println("world����λ��Ϊ" + index);
		//index = Collections.binarySearch(list, "WORLD");
		//System.out.println("WORLD����λ��Ϊ" + index);
		//System.out.println("------");

		
		// public static <T> T max(Collection<?> coll):���ֵ
		//System.out.println("Max=" + Collections.max(list));
		// public static <T> T min(Collection<?> coll):��Сֵ
		//System.out.println("Min=" + Collections.min(list));
		//System.out.println("------");
		
		// public static void reverse(List<?> list):��ת����Ԫ��
		//Collections.reverse(list);
		//System.out.println("��ת���Ԫ��Ϊ" + list);
		//System.out.println("------");
		
		// public static void shuffle(List<?> list):����û�����Ԫ��
		//Collections.shuffle(list);
		//System.out.println("����û����Ԫ��Ϊ" + list);
	}

}
