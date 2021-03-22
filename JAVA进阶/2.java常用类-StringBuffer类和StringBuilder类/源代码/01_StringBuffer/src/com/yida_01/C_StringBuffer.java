/*
 * StringBuffer的删除功能
 * public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
 * public StringBuffer delete(int start,int end):删除从指定位置开始指定位置结束的内容，并返回本身
 */
package com.yida_01;

public class C_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("yida");//链式编程
		System.out.println("sb:" + sb);
		System.out.println("------");

		// public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
		//System.out.println(sb.length()); 
		sb.deleteCharAt(2);
		//System.out.println(sb.length()); 
		System.out.println("sb:" + sb);

		// public StringBuffer delete(int start,int end):删除从指定位置开始到指定位置结束的内容，并返回本身
		sb.delete(5, 10);
		//System.out.println(sb.length());
		System.out.println("sb:" + sb);

		sb.delete(0, sb.length());
		System.out.println("sb:" + sb);
		//System.out.println(sb.length()); 
	}

}
