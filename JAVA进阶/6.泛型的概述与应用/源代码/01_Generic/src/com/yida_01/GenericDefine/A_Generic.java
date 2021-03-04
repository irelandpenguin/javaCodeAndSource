/**
 * ѧϰ����֮ǰ�����ǻع��£�ArrayList�洢�ַ���������
 * 
 * ���ͣ���һ�ְ�������ȷ�Ĺ����Ƴٵ�����������ߵ��÷�����ʱ���ȥ��ȷ���������͡�
 * Ҳ��Ϊ���������ͣ��������͵�������һ�����ݡ�
 * ��ʽ��
 * 		<��������>
 * 		ע�⣺�˴�����������ֻ�����������͡�
 * �ô���
 * 		A:������ʱ�ڵ�������ǰ���˱����ڼ�
 * 		B:������ǿ������ת��
 * 		C:�Ż��˳�����ƣ�����˻�ɫ����
 */
package com.yida_01.GenericDefine;

import java.util.ArrayList;
import java.util.Iterator;

public class A_Generic {

	public static void main(String[] args) {
		// �������϶���
		ArrayList list = new ArrayList();

		// �����϶������Ԫ��
		list.add("hello");
		list.add("yida");
		list.add("java");
		System.out.println(list);

		// �ٸ��������һ��Integer���͵Ķ���
		list.add(new Integer(100));// ��ʽһ�����
		list.add(20);// ��ʽ������ӡ������Զ�װ�书��
		list.add(Integer.valueOf(30));// ��ʽ�������
		System.out.println(list);

		// ����һ�������Integer���͵Ķ�����ٴα������ϡ��ᱨ�� ClassCastException��Ϊʲô�أ�
		// ��ΪInteger����Ĭ��ת��String�����ˣ���������ת���쳣��

		
		// �������϶���
		/*Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();// ǿ��ת��
			System.out.println(s);
		}*/
		
		
		//System.out.println("------");

		// Ҳ����forѭ���������϶���
		/*for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);// ǿ��ת��
			System.out.println(s);
		}*/

		
		// ����һ�£�����֮ǰѧϰ������
		/*String[] arr = new String[3];
		arr[0] = "hello";
		arr[1] = "yida";
		arr[2] = 10;*///����������ֵ���Ǵ���ģ���Ϊ�����Ѿ�ָ����String���͵��ˡ�
		
		System.out.println("---�����Ƿ��͵����ã�������һ��---");

		// ���ڣ������´���һ�����ϣ�Ҳģ����������ָ������
		ArrayList<String> lt = new ArrayList<String>();
		lt.add("hello");
		lt.add("yida");
		lt.add("java");
		//lt.add(new Integer(100));//����������ֵ���Ǵ���ģ���Ϊ�����Ѿ�ָ����String���͵��ˡ�

		// ��������
		Iterator<String> irt = lt.iterator();
		while (irt.hasNext()) {
			String str = irt.next();// ������ǿ��ת����
			System.out.println(str);
		}
		
		System.out.println("------");

		// Ҳ����forѭ����������
		for (int i = 0; i < lt.size(); i++) {
			String str = lt.get(i);// ������ǿ��ת����
			System.out.println(str);
		}
	}

}
