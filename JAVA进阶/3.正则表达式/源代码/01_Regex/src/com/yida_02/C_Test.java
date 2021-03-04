/*
 * 校验密码。
 * 		只能是6位数字，0不能开头。
 * 
 * 分析：
 * 		A:键盘录入数字；
 * 			111111
 * 			123456
 * 			123321
 * 			111222
 * 			888408
 * 			502666
 * 		B：利用正规表达式，判断合法性；
 * 		C:输入结果。
 */
package com.yida_02;

import java.util.Scanner;

public class C_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入密码：");
		String s = sc.nextLine();
		boolean b = s.matches("[1-9]\\d{5}");
		System.out.println(b ? "合法" : "不合法");
	}

}
