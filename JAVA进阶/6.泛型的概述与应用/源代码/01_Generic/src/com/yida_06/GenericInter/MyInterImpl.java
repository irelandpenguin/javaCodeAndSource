package com.yida_06.GenericInter;

/**
 * 第一种情况：已经知道该接口是什么类型的了 
 * 一般用的不多。
 */
public class MyInterImpl implements MyInter<String> {

	@Override
	public String print(String msg) {
		return "打印消息："+msg;
	}
	
	@Override
	public void show(String msg) {
		System.out.println("显示信息："+msg);
	}

	@Override
	public int sum(int a, int b) {
		return a+b;
	}
	
	
}
