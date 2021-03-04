/**
 * 泛型类：把泛型定义在类上
 * 格式：<T>紧跟类名之后。
 * 好处：一个类定义为泛型类，类里面的成员变量，成员方法返回类型以及方法参数都共享该泛型。
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
