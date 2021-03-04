/**
 * ���ϵ�������
 * 		����ѧϰ��������������ԣ�������������Զ������������ͨ���������ֵģ�Ϊ�˷���Զ��������в��������Ǿͱ��������������д洢��
 * 		��Ҫ��洢������󣬾Ͳ�����һ�������ı�������Ӧ����һ���������͵ı�����������Ŀǰ��ѧ����֪ʶ���棬����Щ���������͵���?
 * 		�����StringBuffer��������?StringBuffer�Ľ����һ���ַ�������һ���������ǵ�Ҫ����������ֻ��ѡ�����飬����Ƕ������顣
 * 		�����������ֲ�����Ӧ�仯��������Ϊ����ĳ����ǹ̶��ģ����ʱ��Ϊ����Ӧ�仯������Java���ṩ�˼����๩����ʹ�á�
 * 
 * ����ͼ��ϵ�����?
 * 		A:��������
 * 			����ĳ��ȹ̶�
 * 			���ϳ��ȿɱ�
 * 		B:���ݲ�ͬ
 * 			����洢����ͬһ�����͵�Ԫ��
 * 			�����Ͽ��Դ洢��ͬ���͵�Ԫ��
 * 		C:Ԫ�ص�������������	
 * 			������Դ洢�����������ͣ�Ҳ���Դ洢������������
 * 			����ֻ�ܴ洢��������
 * 
 * ��˵�������Ǵ洢���Ԫ�أ������أ��洢���Ԫ������Ҳ���в�ͬ����ģ�����˵�����Ԫ���в�������ͬ��Ԫ�أ�
 * �ٱ��磬���Ԫ�ذ���ĳ�ֹ���������Բ�ͬ������Java���ṩ�˲�ͬ�ļ����ࡣ
 * ��ͬ�ļ��������й������ݵģ����ǰ���Щ�������ݲ��ϵ�������ȡ�����վ��γ��˼��ϵļ̳���ϵ�ṹ��
 * �ο����ϵļ̳���ϵͼ��
 * 
 * ���ݽṹ�����ݵĴ洢��ʽ��
 * 
 * Collection:�Ǽ��ϵĶ���ӿڣ���������ϵ�п��ظ��洢Ԫ�صģ���ֻ��Ψһ�洢Ԫ�صģ��ж�Ԫ������ģ�����������Ԫ�صġ�(����������Ľ���)
 * 
 * Collection�Ĺ��ܸ�����
 * 1����ӹ���
 * 		boolean add(Object obj):���һ��Ԫ��
 * 		boolean addAll(Collection c):���һ�����ϵ�Ԫ��
 * 2:ɾ������
 * 		void clear():�Ƴ�����Ԫ��
 * 		boolean remove(Object o):�Ƴ�һ��Ԫ��
 * 		boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ�� 
 * 3:�жϹ���
 * 		boolean contains(Object o)���жϼ������Ƿ����ָ����Ԫ��
 * 		boolean containsAll(Collection c)���жϼ������Ƿ������һ���ϵ�����Ԫ�� 
 * 		boolean isEmpty()���жϼ����Ƿ�Ϊ��
 * 4:���ȹ���
 * 		int size():Ԫ�صĸ���
 * 		�����⣺������û��length()������?�ַ�����û��length()������?������û��length()������?
 * 5:��������
 * 		boolean retainAll(Collection c):���������ϵĽ���
 * 6���Ѽ���ת��Ϊ����
 * 		Object[] toArray()
 * 7:��ȡ����
 * 		Iterator<E> iterator()(�ص�)
 */
package com.yida_02.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class A_Collection {

	public static void main(String[] args) {
		// �Ȳ��Բ���All�ķ���
		// Collection c = new Collection();// �����ӿڲ���ʵ����
		Collection c = new ArrayList();

		// boolean add(Object obj):���һ��Ԫ��
		c.add("hello");
		c.add("yida");
		c.add("java");
		System.out.println(c);
		System.out.println("------");

		// void clear():�Ƴ�����Ԫ��
		// c.clear();
		// System.out.println(c);
		// System.out.println("------");

		// boolean remove(Object o):�Ƴ�һ��Ԫ��
		// c.remove("yida");
		// System.out.println(c);
		// c.remove("hulian");// ���������û���Ƴ�Ԫ�أ��÷���ʲôҲ����
		// System.out.println("------");

		// boolean contains(Object o)���жϼ������Ƿ����ָ����Ԫ��
		 System.out.println(c.contains("yida"));
		 System.out.println(c.contains("javase"));
		 System.out.println("------");

		// boolean isEmpty()���жϼ����Ƿ�Ϊ��
		// System.out.println(c.isEmpty());
		// c.clear();
		// System.out.println(c.isEmpty());
		// System.out.println("------");

		// int size():Ԫ�صĸ���
		 System.out.println(c.size());
		// �����⣺������û��length()������?�ַ�����û��length()������?������û��length()������?
		// �𰸣�����û��length()������ֻ��length���ԣ��ַ�����length()����������û��length()������ֻ��size()������

		// Object[] toArray():�Ѽ���ת��Ϊ����
		 Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			String s = (String) arr[i];
			System.out.println(s + " " + s.length());
		}
	}

}
