/**
 * ���⣺����һ�����ϣ������ж�������û��"world"���Ԫ�أ�����У��Ҿ����һ��"javaee"Ԫ�أ���д����ʵ�֡�
 */
package com.yida_03.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A_Iterator {

	public static void main(String[] args) {
		List lt = new ArrayList();
		lt.add("hello");
		lt.add("world");
		lt.add("java");
		
		//��һ�ַ�ʽ����ͨforʵ��
		/*for (int i = 0; i < lt.size(); i++) {
			String s = (String)lt.get(i);
			if (s.equals("world")) {
				lt.add("javase");
			}
		}
		System.out.println(lt);*/
		
		//�ڶ��ַ�ʽ����ͨfor+toArray()��ʵ��
		/*Object[] arr = lt.toArray();
		for (int i = 0; i < arr.length; i++) {
			String s = (String)arr[i];
			if (s.equals("world")) {
				lt.add("javase");
			}
		}
		System.out.println(lt);*/
		
		
		// ����������
		
		//ʹ��iterator���� �����޸��쳣 ����;    ConcurrentModificationException;  �ص�
		//�������Ǽ��ϵ�ר�ñ��� �����µ�Ԫ�����ø������ݵ��³����ص�
			
		/*Iterator it = lt.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			if (s.equals("world")) {
				lt.add("javase");// ���б���ConcurrentModificationException,�����޸��쳣
				// ������ԭ�򣺵������������ڼ��϶����ڵģ����жϳɹ��󣬼��ϵ����������Ԫ�أ���������ȴ��֪�������Ծͱ����ˡ�
				// ��ʵ��������������ǣ�����������Ԫ�ص�ʱ��ͨ�������ǲ����޸�Ԫ�صġ�
			}
		}*/

		// ��ν����?
		// A:����������Ԫ�أ����������Ԫ�ء�����ӵ�Ԫ���Ǹ��ڸղŵ�����Ԫ�غ���ġ�
		// B:���ϱ���Ԫ�أ��������Ԫ��(��ͨfor)������ӵ�Ԫ���������ӵġ�

		// ��ʽһ������������Ԫ�أ����������Ԫ��
		// ��Iterator������û��add()��ӹ��ܷ�������������ʹ�����ӽӿ�ListIterator
		ListIterator itr = lt.listIterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			if (s.equals("world")) {
				itr.add("javase");//���������Ԫ�أ��Ͳ��ᱨ�쳣��
			}
		}
		System.out.println(lt);

		System.out.println("------");

		// ��ʽ2�����ϱ���Ԫ�أ������޸�Ԫ��(��ͨfor)
		/*for (int i = 0; i < lt.size(); i++) {
			String s = (String) lt.get(i);
			if (s.equals("world")) {
				lt.add("javase");
			}
		}
		System.out.println(lt);*/
	}

}
