/*
 * StringBuilder的截取功能:注意返回值类型不再是StringBuilder本身了
 * public String substring(int start)
 * public String substring(int start,int end)
 */
package com.yida_01;

public class E_StringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("helloworldjava");
		System.out.println("sb:" + sb);
		System.out.println("------");

		// public String substring(int start)
		String s = sb.substring(10);
		System.out.println("s:" + s);
		System.out.println("sb:" + sb);
		System.out.println("------");

		// public String substring(int start,int end)
		String s2 = sb.substring(5, 10);
		System.out.println("s2:" + s2);
		System.out.println("sb:" + sb);
		System.out.println("------");

		String s3 = sb.substring(0, sb.length());
		System.out.println("s3:" + s3);
		System.out.println("sb:" + sb);
	}
}
