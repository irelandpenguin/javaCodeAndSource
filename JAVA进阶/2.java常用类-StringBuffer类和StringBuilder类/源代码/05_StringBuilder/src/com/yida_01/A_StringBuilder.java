/*
 * 线程安全(多线程讲解)
 * 安全 -- 同步 -- 数据是安全的  (举例：阿姨卖盒饭，先收钱再给盒饭。)  -- StringBuffer
 * 不安全 -- 不同步 -- 效率高一些 (举例：阿姨摆摊卖盒饭，拿盒饭的同时把钱主动放到盒饭位置处。) -- StringBuilder
 * 
 * StringBuilder:
 * 		线程不安全的可变字符串。
 * 
 * StringBuilder和String的区别?
 * 前者长度和内容可变，后者不可变。
 * 如果使用前者做字符串的拼接，不会浪费太多的资源。
 * 
 * StringBuilder的构造方法：
 * 		public StringBuilder():无参构造方法
 *		public StringBuilder(int capacity):指定容量的字符串缓冲区对象
 *		public StringBuilder(String str):指定字符串内容的字符串缓冲区对象
 *
 * StringBuilder的方法：
 *		public int capacity()：返回当前容量。	理论值
 *		public int length():返回长度（字符数）。 实际值
 */
package com.yida_01;

public class A_StringBuilder {

	public static void main(String[] args) {
		// public StringBuilder():无参构造方法
		StringBuilder sb = new StringBuilder();// 默认有16个字节，看API文档和源码
		System.out.println("sb:" + sb);// 默认调用sb.toString()方法，有没有重载呢？
		System.out.println("sb.capacity:" + sb.capacity());// 16
		System.out.println("sb.length:" + sb.length());// 0
		System.out.println("------");

		// public StringBuilder(int capacity):指定容量的字符串缓冲区对象
		StringBuilder sb2 = new StringBuilder(30);// 看源码
		System.out.println("sb2:" + sb2);
		System.out.println("sb2.capaty:" + sb2.capacity());// 30
		System.out.println("sb2.length:" + sb2.length());// 0
		System.out.println("------");

		// public StringBuilder(String str):指定字符串内容的字符串缓冲区对象
		StringBuilder sb3 = new StringBuilder("yida");// 看源码
		System.out.println("sb3:" + sb3);
		System.out.println("sb3.capaty:" + sb3.capacity());// 20
		System.out.println("sb3.length:" + sb3.length());// 4
	}

}
