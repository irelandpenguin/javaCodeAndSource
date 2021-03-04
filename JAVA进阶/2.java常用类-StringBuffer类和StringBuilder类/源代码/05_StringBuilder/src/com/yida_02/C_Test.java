/*
 * 判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 * 
 * 分析：
 * 		判断一个字符串是否是对称的字符串，我只需要把
 * 			第一个和最后一个比较
 * 			第二个和倒数第二个比较
 * 			...
 * 		比较的次数是长度除以2。
 */
package com.yida_02;

import java.util.Scanner;

public class C_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个字符串:");
		String s = sc.nextLine();
		System.out.println(isSame(s));
		System.out.println("------");
		System.out.println(isSame2(s));
	}

	public static boolean isSame(String str) {
		// 版本一
		// char[] ary = str.toCharArray();
		// for (int i = 0; i < ary.length / 2; i++) {
		// if (ary[i] != ary[ary.length - 1 - i]) {
		// return false;
		// }
		// }
		// return true;

		// 版本二
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSame2(String str) {
		return new StringBuilder(str).reverse().toString().equals(str);
	}
}
