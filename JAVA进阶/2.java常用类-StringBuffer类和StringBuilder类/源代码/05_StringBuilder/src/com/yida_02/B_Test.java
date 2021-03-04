/*
 * 练习题2：字符串反转。
 */
package com.yida_02;

import java.util.Scanner;

public class B_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个字符串");
		String s = sc.nextLine();
		String result = reverseString(s);
		System.out.println(result);
		System.out.println("------");

		result = reverseString2(s);
		System.out.println(result);
	}

	//方式一：用String做拼接
	public static String reverseString(String s) {
		// 版本一
		String str = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			str += s.charAt(i);
		}
		return str;

		// 版本二
		// String str = "";
		// char[] ary = s.toCharArray();
		// for (int k = ary.length - 1; k >= 0; k--) {
		// str += ary[k];
		// }
		// return str;

		// 版本三
		// String str = "";
		// for (int j = s.length() - 1; j >= 0; j--) {
		// str += s.substring(j, j + 1);
		// }
		// return str;
	}

	//方式二：用StringBuilder的reverse()功能
	public static String reverseString2(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
}
