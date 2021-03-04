/*
 * StringBuilder的删除功能
 * public StringBuilder deleteCharAt(int index):删除指定位置的字符，并返回本身
 * public StringBuilder delete(int start,int end):删除从指定位置开始指定位置结束的内容，并返回本身
 */
package com.yida_01;

public class C_StringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello").append("world").append("yida");
		System.out.println("sb:" + sb);
		System.out.println("------");

		 //public StringBuilder deleteCharAt(int index):删除指定位置的字符，并返回本身
		// sb.deleteCharAt(2);
		// System.out.println("sb:" + sb);

		// public StringBuilder delete(int start,int
		// end):删除从指定位置开始指定位置结束的内容，并返回本身
		// sb.delete(5, 10);
		// System.out.println("sb:" + sb);

		// sb.delete(0, sb.length());
		// System.out.println("sb:" + sb);
	}
}
