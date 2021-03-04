package com.yida_05.GenericClassAndMethod;
/**
 * 泛型类与泛型方法共存。
 * 注意：<>尖括号里的泛型类型名不能相同，如果相同了就变成外界给定类型的了。
 */
public class GenericCM<T> {
	private T obj;
	
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public <A> void show(A obj) {//泛型方法(参数为泛型)
		System.out.println(obj);
	}
	
	public <E> E print(E obj) {//泛型方法(参数和返回类型均为泛型)
		return obj;
	}
}
