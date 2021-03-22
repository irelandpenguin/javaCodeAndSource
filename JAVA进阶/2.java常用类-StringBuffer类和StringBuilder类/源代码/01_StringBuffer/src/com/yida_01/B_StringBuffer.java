/*
 * StringBuffer的添加功能：
 * public StringBuffer append(String str):可以把任意类型数据添加到可变字符串里面,并返回可变字符串本身
 * 
 * public StringBuffer insert(int offset,String str):在指定位置把任意类型的数据插入到可变字符串里面,并返回可变字符串本身
 */
package com.yida_01;

public class B_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();// 创建可变字符串对象

		// public StringBuffer append(String
		// str):可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
		StringBuffer sb2 = sb.append("yida");
		System.out.println("sb:" + sb);// yida
		System.out.println("sb2:" + sb2);// yida
		System.out.println(sb == sb2);// sb2的地址与sb一样，sb2就是sb
		System.out.println("------");

		
		// 继续添加不同类型的数据
		sb.append("hello");
		sb.append(true);
		sb.append(100);
		sb.append('A');
		sb.append(3.14f);
		sb.append(4.26);
		sb.append(88888888);
		System.out.println("sb:" + sb);
		System.out.println("------");
		 
		// 把字符数组添加到字符串缓冲区中
		// sb.append(str)
		char[] ary = { 'a', 'B', '0', 'X' };
		sb.append(ary);
		System.out.println("sb:" + sb);
		System.out.println("------");
		sb.append(ary, 1, 2);
		System.out.println("sb:" + sb);
		//System.out.println("------");
		
		// 链式编程(链式编程的前提：每个.前面都必须是一个对象才可以！)
		StringBuffer ssb = new StringBuffer();
		ssb.append("你好").append("yidahulian").append(true).append(100).append(3.14);
		System.out.println("ssb:" + ssb);
		
		// public StringBuffer insert(int offset,String
		// str):在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
		StringBuffer buffer = new StringBuffer("hello");
		buffer.insert(5, "world");
		System.out.println("buffer:" + buffer);
		System.out.println("------");
		
		// 继续插入不同类型数据
		buffer.insert(0, true);
		buffer.insert(1, 'A');
		buffer.insert(2, 3.14);
		buffer.insert(buffer.length(), 100);
		System.out.println("buffer:" + buffer);
		System.out.println("------");
		
		// 把字符数组插入到字符串缓冲区对象中
		char[] chs = { 'a', 'b', 'c', 'd' };
		buffer.insert(0, chs);
		System.out.println("buffer:" + buffer);
		System.out.println("------");
		buffer.insert(buffer.length(), chs, 1, 2);
		System.out.println("buffer:" + buffer);
	}
}
