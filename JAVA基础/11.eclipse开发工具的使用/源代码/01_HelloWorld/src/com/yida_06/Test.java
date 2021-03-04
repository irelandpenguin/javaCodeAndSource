package com.yida_06;

/**
 * 一个即有继承又有接口实现的完整类的讲解
 * 
 * @author Administrator
 * 
 */
public class Test {

	public static void main(String[] args) {
		Son son = new Son("王五");// 带参构造
		son.study();
		son.play();
		son.song();
		son.dance();
	}

}
