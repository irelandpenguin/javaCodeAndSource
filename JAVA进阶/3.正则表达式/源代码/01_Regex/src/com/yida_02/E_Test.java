/*
 * 校验出生年份是否合法。
 * 		要求：出生年份在1990年到2017年之间的。
 * 
 * 分析：
 * 		A:键盘录入出生年份
 * 		B:定义出生年份规则
 * 			1990
 * 			1991
 * 			1992
 * 			2000
 * 			2001
 * 			2010
 * 			2017
 * 		C:调用功能，判断即可
 * 		D:输出结果
 */
package com.yida_02;

import java.util.Scanner;

public class E_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入出生年份：");
		String s = sc.nextLine();
		boolean b = checkYear(s);
		System.out.println(b ? "合法" : "不合法");
	}

	public static boolean checkYear(String year) {
		return year.matches("199\\d|200\\d|201[0-7]");
	}

}
