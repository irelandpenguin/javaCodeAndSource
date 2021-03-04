/*
 * 校验出生年月日是否合法。
 * 		要求：出生时间在1996.01.01到2017.12.12之间的。
 * 
 * 分析：
 * 		A:键盘录入出生年月日
 * 		B:定义出生年月日规则
 * 			1996.01.01
 * 			1997.10.03
 * 			1999.08.15
 * 			2000.11.11
 * 			2006.06.01
 * 			2007.10.31
 * 			2017.12.12
 * 		C:调用功能，判断即可
 * 		D:输出结果
 */
package com.yida_02;

import java.util.Scanner;

public class I_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入出生年月日(比如：1996.02.12)");
		String s = sc.nextLine();
		boolean b = checkBirthday(s);
		System.out.println(b ? "合法" : "不合法");
	}

	public static boolean checkBirthday(String s) {
		return s.matches("((199[6-9])|(200\\d)|(201[0-7]))\\.((0[1-9])|(1[012]))\\.((0[1-9])|([1-2]\\d)|(3[01]))");
	}
}
