package com.yida_06.GenericInter;
/**
 * ���ͽӿڣ��ѷ��Ͷ����ڽӿ��ϡ�
 */
public interface MyInter<T> {
	public abstract void show(T msg);
	public abstract T print(T msg);
	
	public abstract int sum(int a, int b);
}
