/*
 * 判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"、"cbaddabc"是对称字符串
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
		//System.out.println("------");
		System.out.println(isSame2(s));
	}

	public static boolean isSame(String str) {
		/*
		 "cbaddabc" -> {'c','b','a','d','d','a','b','c'}
		 ary[0]   ary[7]
		 ary[1]	  ary[6]
		 ary[2]   ary[5]
		 ary[3]   ary[4]
		 
		 ary[i]   ary[ary.length-1-i]
		 */
		
		// 版本一
		/* char[] ary = str.toCharArray();
		 for (int i = 0; i < ary.length / 2; i++) {
			 if (ary[i] != ary[ary.length - 1 - i]) {
				 return false;
			 }
		 }
		 return true;*/

		// 版本二
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSame2(String str) {
		//源字符串 "cbaddabc"
		//反转后     "cbaddabc"
		
		//源字符串  "mbc"
		//反转后      "cbm"
		
		/*StringBuffer sb = new StringBuffer(str);
		sb.reverse();//反转
		String newStr = sb.toString();
		return newStr.equals(str);*/
	
		return new StringBuffer(str).reverse().toString().equals(str);//链式编程
	}

}
