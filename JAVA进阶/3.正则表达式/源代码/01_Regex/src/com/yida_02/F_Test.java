/*
 * 校验出生月份是否合法。
 * 		要求：出生月份应在1到12之间。
 * 
 * 分析：
 * 		A:键盘录入出生月份
 * 		B:定义出生月份规则
 * 			1
 * 			2
 * 			3
 * 			10
 * 			11
 * 			12
 * 		C:调用功能，判断即可
 * 		D:输出结果
 */
package com.yida_02;

import java.util.Scanner;

public class F_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入出生月份：");
		String s = sc.nextLine();
		boolean b = checkMonth(s);
		System.out.println(b ? "合法" : "不合法");
	}

	public static boolean checkMonth(String month) {
		return month.matches("[1-9]|1[0-2]");
	}

}
