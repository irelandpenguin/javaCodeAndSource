package com.yida_06.GenericInter;

/**
 * �ڶ������������֪���ýӿ���ʲô���͵ġ�
 * ��ʱ��Ҫ�Ѹýӿ�ʵ���ඨ��ɷ����࣬����������ӿڷ��ͱ���һ�¡�
 * �������ýӿ�ʵ������ĳ�Ա�����ͳ�Ա�����͹���÷����ˡ�
 * ���ַ�ʽ����������
 */
public class WinInterImpl<T> implements MyInter<T> {

	@Override
	public void show(T msg) {
		System.out.println(msg);
	}

	@Override
	public T print(T msg) {
		return msg;
	}

	@Override
	public int sum(int a, int b) {
		return a+b;
	}
}
