/**
 * List���ϵ����й��ܣ�
 * A:��ӹ���
 * 		void add(int index,Object element):��ָ��λ�����Ԫ��
 * 		boolean addAll(int index,  Collection c):����������Ԫ�ز��뵽ָ������λ��
 * B:��ȡ����
 * 		Object get(int index):��ȡָ��λ�õ�Ԫ��
 * C:��ѯ����
 * 		int indexOf(Object o):���ؼ����е�һ�γ��ֵ�ָ��Ԫ�ص�����
 * 		int lastIndexOf(Object o):���ؼ��������һ�γ��ֵ�ָ��Ԫ�ص�����
 * D:ɾ������
 * 		Object remove(int index)����������ɾ��Ԫ��,���ر�ɾ����Ԫ��
 * E:�޸Ĺ���
 * 		Object set(int index,Object element):���������޸�Ԫ�أ����ر����ε�Ԫ��
 * F:�б������
 * 		ListIterator listIterator()��List�������еĵ�����
 */
package com.yida_02.ListMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class A_List {

	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();

		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("hello");

		// void add(int index,Object element):��ָ��λ�����Ԫ��
		//list.add(1, "yida");
		//System.out.println(list);
		//list.add(10, "hulian");//�����쳣��IndexOutOfBoundsException
		//list.add(list.size(), "hulian");
		//System.out.println(list);
		
		/*Collection c = new ArrayList();
		c.add("��С��");
		c.add("�˳�");
		c.add("�º�");
		list.addAll(list.size(), c);
		System.out.println(list);*/

		// Object get(int index):��ȡָ��λ�õ�Ԫ��
		//System.out.println(list.get(0));
		//System.out.println(list.get(list.size()-1));
		//System.out.println(list.get(10));//�����쳣��IndexOutOfBoundsException

		// int indexOf(Object o):���ؼ����е�һ�γ��ֵ�ָ��Ԫ�ص�����
		// int lastIndexOf(Object o):���ؼ��������һ�γ��ֵ�ָ��Ԫ�ص�����
		//System.out.println(list.indexOf("world"));
		//System.out.println(list.lastIndexOf("hello"));
		//System.out.println(list.indexOf("yida"));// �Ҳ���������-1

		// Object remove(int index)����������ɾ��Ԫ��,���ر�ɾ����Ԫ��
		//System.out.println(list.remove(0));
		//System.out.println("list:" + list);
		//System.out.println(list.remove(10));//�����쳣��IndexOutOfBoundsException

		// Object set(int index,Object element):���������޸�Ԫ�أ����ر����ε�Ԫ��
		list.set(1, "javase");
		list.set(list.size()-1, "yidahulian");// �޸����һ������ס��������0��ʼ��
		System.out.println("list:" + list);
	}

}
