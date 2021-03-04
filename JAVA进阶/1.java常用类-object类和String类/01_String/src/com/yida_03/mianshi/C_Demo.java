/*
 * 看程序，写结果。
 * 	注意：
 * 		字符串变量相加，是先开辟内存地址，然后再拼接字符串;
 * 		字符串常量相加，是先拼接字符串，然后到常量区里找有没有这个拼接后的字符串，如果有，则直接返回原来字符串常量，没有，就在常量区里创建字符串常量。
 */
package com.yida_03.mianshi;

public class C_Demo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s1 + s2);// ? 	false
		System.out.println(s3.equals((s1 + s2)));// ? 	true
		System.out.println(s3 == "hello" + "world");// ?   true
		System.out.println(s3.equals("hello" + "world"));// ? 	 true
	}

}
