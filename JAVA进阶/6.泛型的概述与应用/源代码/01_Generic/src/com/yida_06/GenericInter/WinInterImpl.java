package com.yida_06.GenericInter;

/**
 * 第二种情况：还不知道该接口是什么类型的。
 * 此时，要把该接口实现类定义成泛型类，泛型类型与接口泛型保持一致。
 * 这样，该接口实现类里的成员变量和成员方法就共享该泛型了。
 * 这种方式，更常见！
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
