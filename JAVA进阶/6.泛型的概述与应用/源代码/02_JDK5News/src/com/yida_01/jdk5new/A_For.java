/**
 * JDK5�������ԣ��Զ���װ��,����,��ǿfor,��̬����,�ɱ����,ö��(�õ��٣����潲)
 * 
 * ��ǿfor:��forѭ����һ�֡�
 * 
 * ��ʽ��
 * 		for(Ԫ����������  ���� : ����򼯺�) {
 *			ʹ�ñ������ɣ��ñ�������Ԫ��
 *   	}
 *   
 * �ô�����������ͼ��ϵı�����
 * 
 * �׶ˣ� ��ǿfor��Ŀ�겻��Ϊnull��
 * ��ν����?����ǿfor��Ŀ���Ƚ��в�Ϊnull���жϣ�Ȼ����ʹ�á�
 */
package com.yida_01.jdk5new;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class A_For {

	public static void main(String[] args) {
		//test1();// ��ͨ����
		//test2();// ArrayList����
		//test3();// Vector����
		//test4();// LinkedList����

		// �׶ˣ� ��ǿfor��Ŀ�겻��Ϊnull���������ʱ���ᱨNullPointerException�쳣��
		// ��ν����?����ǿfor��Ŀ���Ƚ��в�Ϊnull���жϣ�Ȼ����ʹ�á�
		//show(null);

		// ��ǿfor��ʵ������ ��� ��������
		ArrayList<Integer> lit = new ArrayList<Integer>();
		lit.add(100);
		lit.add(90);
		lit.add(80);
		for (Integer i : lit) {
			if (i.equals(90)) {
				//lit.add(70);// ���б���ConcurrentModificationException�����޸��쳣��Java�����룬��Դ�������
			}
		}
		System.out.println(lit);

		// ��󣬷����뵱ǰjavaԴ�ļ�����ForDemo.class�ֽ����ļ����鿴��ǿfor��ʵ��ԭ��
	}

	public static void test1() {

		System.out.println("---��ͨ����---");

		int[] arr = { 1, 2, 3, 4, 5 };

		// ��ͨ��forѭ��
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("------");

		// ��ǿfor
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void test2() {
		System.out.println("---ArrayList����---");

		// ����һ������
		ArrayList<String> lit = new ArrayList<String>();
		lit.add("hello");
		lit.add("yidahulian");
		lit.add("java");

		// ����������
		Iterator<String> it = lit.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("------");

		// ��ͨforѭ������
		for (int k = 0; k < lit.size(); k++) {
			String s = lit.get(k);
			System.out.println(s);
		}
		System.out.println("------");

		// ��ǿfor����
		for (String str : lit) {
			System.out.println(str);
		}
	}

	public static void test3() {
		System.out.println("---Vector����---");

		// ����һ������
		Vector<String> lit = new Vector<String>();
		lit.add("hello");
		lit.add("yidahulian");
		lit.add("java");

		// ����������
		Iterator<String> it = lit.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("------");

		// ��ͨforѭ������
		for (int k = 0; k < lit.size(); k++) {
			String s = lit.get(k);
			System.out.println(s);
		}
		System.out.println("------");

		// ��ǿfor����
		for (String str : lit) {
			System.out.println(str);
		}
	}

	public static void test4() {
		System.out.println("---LinkedList����---");

		// ����һ������
		LinkedList<String> lit = new LinkedList<String>();
		lit.add("hello");
		lit.add("yidahulian");
		lit.add("java");

		// ����������
		Iterator<String> it = lit.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("------");

		// ��ͨforѭ������
		for (int k = 0; k < lit.size(); k++) {
			String s = lit.get(k);
			System.out.println(s);
		}
		System.out.println("------");

		// ��ǿfor����
		for (String str : lit) {
			System.out.println(str);
		}
	}

	// ��ʾ��������
	public static void show(List<String> list) {
		// �׶ˣ� ��ǿfor��Ŀ�겻��Ϊnull���������ʱ���ᱨNullPointerException�쳣��
		// ��ν���أ�����ǿfor��Ŀ���Ƚ��в�Ϊnull���жϣ�Ȼ����ʹ�á�
		if (list != null) {// ����Ӹ������ж�
			for (String str : list) {
				System.out.println(str);
			}
		}
	}
}
