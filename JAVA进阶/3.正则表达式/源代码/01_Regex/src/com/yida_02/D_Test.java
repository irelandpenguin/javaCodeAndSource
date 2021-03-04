/*
 * 校验年龄。
 * 		要求：只能是数字，只能在18~45之间。
 * 
 * 分析：
 * 		A：键盘输入年龄；
 * 		B: 定义用户名规则：
 * 			18
 * 			30	
 * 			40
 * 			23
 * 			45
 * 		C：正规表达式判断是否合法；
 * 		D：输出结果。
 */
package com.yida_02;

import java.util.Scanner;

public class D_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年龄：");
		String age = sc.nextLine();
		boolean b = checkAge(age);
		System.out.println(b ? "合法" : "不合法");
	}

	public static boolean checkAge(String age) {
		return age.matches("1[8-9]|[2-3]\\d|4[0-5]");
	}
}
