/*
 * String与StringBuilder的相互转换
 */
package com.yida_01;

public class G_StringBuilder {
	public static void main(String[] args) {
		// String -> StringBuilder
		// StringBuilder sb = "hello";//错！不能把字符串直接赋值给StringBuilder

		// 方式一：通过构造方法
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("sb:" + sb);

		// 方式二：通过append()方法
		StringBuilder sb2 = new StringBuilder();
		sb2.append("world");
		System.out.println("sb2:" + sb2);
		System.out.println("------");

		// StringBuilder -> String
		// 方式一：通过构造方法
		String s = new String(sb);
		System.out.println("s:" + s);

		// 方式二：通过toString()方法
		String s2 = sb2.toString();
		System.out.println("s2:" + s2);

		// 方式三：通过valueOf()方法
		String s3 = String.valueOf(sb2);
		System.out.println("s3:" + s3);
	}
}
