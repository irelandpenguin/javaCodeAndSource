/*
 * ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
 * List�ص㣺������ظ��������������������ָ��ź�ȡ����һ�µġ�
 */
package com.yida_04.equals;

import java.util.ArrayList;
import java.util.Iterator;

public class A_Equals {

	public static void main(String[] args) {
		ArrayList lt = new ArrayList();
		lt.add("hello");
		lt.add("hello");
		lt.add("hello");
		lt.add("world");
		lt.add("java");
		lt.add("world");

		// ��ʽһ�����˼����ظ��ַ���
		//filter(lt);

		// ��ʽ�������˼����ظ��ַ���
		filter2(lt);
	}

	// ��ʽһ�����˼����ظ��ַ���
	public static void filter(ArrayList lt) {
		// ˼·������
		// A:�������϶���
		// B:��Ӷ���ַ���Ԫ��(����������ͬ��)
		// C:�����¼���
		// D:�����ɼ���,��ȡ�õ�ÿһ��Ԫ��
		// E:�����Ԫ�ص��¼���ȥ�ң�����û�С� ������ӣ� û�У�����ӡ�
		// F:�����¼���

		ArrayList newLt = new ArrayList();
		Iterator it = lt.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			if (newLt.contains(s) == false) {
				newLt.add(s);
			}
		}
		System.out.println(newLt);
	}

	// ��ʽ�������˼����ظ��ַ���
	public static void filter2(ArrayList lt) {
		// ˼·������
		// ��ѡ������˼�����룬���ǾͿ���ͨ������˼���������Ŀ
		// ��0���������κͺ���ıȽϣ��оͰѺ�ĸɵ�
		// ͬ����1����...
		for (int i = 0; i < lt.size()-1; i++) {
			for (int j = i+1; j < lt.size(); j++) {
				String s1 = (String) lt.get(i);
				String s2 = (String) lt.get(j);
				if (s1.equals(s2)) {
					lt.remove(j);
					j--;// ��Ҫ��ǰ��һλ����ֹ©��֮��
				}
			}
		}

		System.out.println(lt);
	}

}
