/*
 * 校验出生日是否合法。
 * 		要求：出生日应在1到31之间，这里不考虑其它因素(平年，瑞年)。
 * 
 * 分析：
 * 		A:键盘录入出生日
 * 		B:定义出生日规则
 * 			1
 * 			2
 * 			3
 * 			10
 * 			19
 * 			20
 * 			29
 * 			30
 * 			31
 * 		C:调用功能，判断即可
 * 		D:输出结果
 */
package com.yida_02;

import java.util.Scanner;

public class G_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入出生日：");
		String s = sc.nextLine();
		boolean b = checkDay(s);
		System.out.println(b ? "合法" : "不合法");
	}

	public static boolean checkDay(String day) {
		return day.matches("[1-9]|[12]\\d|3[01]");
	}
}
