/**
 * ���ͷ������ѷ��Ͷ����ڷ����� 
 * ע�⣺���ͷ����뷺�����޹أ���ʹ����ͨ�࣬�������Զ��巺�ͷ�����
 * ��ʽ��<T>����Ȩ�����η��󣬷�����������ǰ��
 * �ô���һ����������Ϊ���ͷ��������������Լ��������Ͷ�����÷��͡�
 */
package com.yida_04.GenericMethod;

public class GenericMethod {
	public <T> void show(T obj) {//��������Ϊ����
		System.out.println(obj);
	}
	
	public <T> T print(T obj) {//�����ͷ���ֵ����Ϊ����
		return obj;
	}
}
