package com.yida_06.GenericInter;
/**
 * 泛型接口：把泛型定义在接口上。
 */
public interface MyInter<T> {
	public abstract void show(T msg);
	public abstract T print(T msg);
	
	public abstract int sum(int a, int b);
}
