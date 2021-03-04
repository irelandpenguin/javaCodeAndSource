/*
 * 校验用户名是否合法。
 * 		用户名只能是5~8位字母,数字或字母和数字的组合，第一个字符不能为0。
 * 
 * 分析:
 * 		A：键盘录入用户名；
 * 		B: 定义用户名规则：
 * 			hello
 * 			HELLO
 * 			12345678
 * 			well888
 * 			HEL666
 * 			helWEL55
 * 		C: 调用正规表达式判断即可；
 * 		D: 输出结果。
 * 
 */
package com.yida_02;

import java.util.Scanner;

public class B_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String s = sc.nextLine();
		boolean b = checkUser(s);
		System.out.println(b ? "合法" : "不合法");
	}

	public static boolean checkUser(String s) {
		return s.matches("[a-zA-Z1-9][a-zA-Z0-9]{4,7}");
	}

}
