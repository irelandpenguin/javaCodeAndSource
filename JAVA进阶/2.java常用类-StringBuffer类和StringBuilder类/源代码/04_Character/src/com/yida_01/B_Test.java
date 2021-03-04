/*
 * 键盘录入一个字符串，统计字符串中大写字母字符，小写字母字符，
 * 数字字符出现的次数。(不考虑其他字符)
 */
package com.yida_01;

import java.util.Scanner;

public class B_Test {

	public static void main(String[] args) {
		int count1 = 0;// 统计小写字符
		int count2 = 0;// 统计大写字符
		int count3 = 0;// 统计数字字符

		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个字符串：");
		String s = sc.nextLine();

		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (Character.isLowerCase(arr[i])) {
				count1++;
			} else if (Character.isUpperCase(arr[i])) {
				count2++;
			} else if (Character.isDigit(arr[i])) {
				count3++;
			}
		}

		System.out.println("小写字符有" + count1 + "个\n大写字符有" + count2 + "个\n数字字符有"
				+ count3 + "个");
	}

}
