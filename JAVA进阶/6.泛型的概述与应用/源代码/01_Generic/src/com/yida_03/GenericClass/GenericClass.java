/**
 * �����ࣺ�ѷ��Ͷ���������
 * ��ʽ��<T>��������֮��
 * �ô���һ���ඨ��Ϊ�����࣬������ĳ�Ա��������Ա�������������Լ���������������÷��͡�
 */
package com.yida_03.GenericClass;

public class GenericClass<T> {
	private T obj;
	
	String name;
	int age;
	
	public GenericClass() {}

	public GenericClass(T obj, String name, int age) {
		super();
		this.obj = obj;
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "GenericClass [obj=" + obj + ", name=" + name + ", age=" + age
				+ "]";
	}
}
