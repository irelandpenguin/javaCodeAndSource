package com.yida_05.GenericClassAndMethod;
/**
 * �������뷺�ͷ������档
 * ע�⣺<>��������ķ���������������ͬ�������ͬ�˾ͱ�����������͵��ˡ�
 */
public class GenericCM<T> {
	private T obj;
	
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public <A> void show(A obj) {//���ͷ���(����Ϊ����)
		System.out.println(obj);
	}
	
	public <E> E print(E obj) {//���ͷ���(�����ͷ������;�Ϊ����)
		return obj;
	}
}
