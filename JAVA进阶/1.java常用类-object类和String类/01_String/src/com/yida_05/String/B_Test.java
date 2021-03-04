/*
 * 需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 * 举例：
 * 		"Hello123World"
 * 结果：
 * 		大写字符：2个
 * 		小写字符：8个
 * 		数字字符：3个
 */
package com.yida_05.String;

public class B_Test {

	public static void main(String[] args) {
		String s = "Hello123World";
		int count1 = 0;// 大写字母字符个数
		int count2 = 0;// 小写字母字符个数
		int count3 = 0;// 数字字符个数
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >= 'A' && c <= 'Z') {// 判断大写字母
				count1++;
			} else if (c >= 'a' && c <= 'z') {// 判断小写字母
				count2++;
			} else if (c >= '0' && c <= '9') {// 判断数字
				count3++;
			}
		}

		System.out.println("大写字母字符个数为" + count1 + "\n" + "小写字母字符个数为" + count2
				+ "\n" + "数字字符个数为" + count3);
	}

}
