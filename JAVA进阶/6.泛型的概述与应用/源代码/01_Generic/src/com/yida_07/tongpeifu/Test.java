/**
 * ���͸߼�(ͨ���)
 * ?�������������ͣ���Object����
 * ? extends E�������޶���E��������
 * ? super E�������޶���E���丸��
 */
package com.yida_07.tongpeifu;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		// ���������ȷд��ʱ��ǰ�����һ��
		Collection<Object> c1 = new ArrayList<Object>();
		//Collection<Object> c2 = new ArrayList<Animal>();//����Object�ĳ�Animal����
		//Collection<Object> c3 = new ArrayList<Dog>();//����Object�ĳ�Dog����
		//Collection<Object> c4 = new ArrayList<Cat>();//����Object�ĳ�Cat����

		// ?�������������ͣ���Object����
		//���ã�������ʾ�������͵ķ�����
		Collection<?> c5 = new ArrayList<Object>();
		Collection<?> c6 = new ArrayList<Animal>();
		Collection<?> c7 = new ArrayList<Dog>();
		Collection<?> c8 = new ArrayList<Cat>();
		System.out.println(c5+":"+c6+":"+c7+":"+c8);

		// ? extends E�������޶���E��������
		//���ã�������ʾE��������
		//Collection<? extends Animal> c9 = new ArrayList<Object>();//����
		Collection<? extends Animal> c10 = new ArrayList<Animal>();
		Collection<? extends Animal> c11 = new ArrayList<Dog>();
		Collection<? extends Animal> c12 = new ArrayList<Cat>();

		// ? super E�������޶���E���丸��
		//���ã�������ʾE���丸��
		Collection<? super Animal> c13 = new ArrayList<Object>();
		Collection<? super Animal> c14 = new ArrayList<Animal>();
		//Collection<? super Animal> c15 = new ArrayList<Dog>();//����
		//Collection<? super Animal> c16 = new ArrayList<Cat>();//����
		 
		
		// ���ͨ��API���鿴��ArrayList�Ĺ��췽������ͨ��������������ι���ġ�
	}

}
