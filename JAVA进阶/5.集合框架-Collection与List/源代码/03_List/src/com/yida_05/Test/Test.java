/**
 * ����LinkedListģ��ջ���ݽṹ�ļ��ϡ�
 * ��Ŀ����˼�ǣ�
 *	 ���Լ�����һ�������࣬������������ڲ�ʹ��LinkedListģ�⡣
 */
package com.yida_05.Test;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// Ҫ���������Ŀ������Ҫ��֪��ջ���ص㣺�Ƚ������
		// �ٸ����ӣ����£�
		LinkedList lt = new LinkedList();
		// ѹջ
		lt.push("a");
		lt.push("b");
		lt.push("c");
		// ��ջ
		while (!lt.isEmpty()) {
			System.out.println(lt.pop());
		}
		// ���Ϊ��c b a

		System.out.println("------");

		
		StackList sl = new StackList();
		// ѹջ
		sl.add("hello");
		sl.add("world");
		sl.add("java");
		// ��ջ
		while (!sl.isEmpty()) {
			System.out.println(sl.get());
		}
		
	}

}
