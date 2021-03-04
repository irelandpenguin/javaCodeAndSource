/*
 * 学习 正规表达式.txt里的知识点
 * 
 * 判断功能
 *		String类的public boolean matches(String regex)
 *		根据给定的正规表达式的匹配判断字符串。
 *
 * 需求：
 * 		校验手机号码是否有效?
 * 
 * 分析：
 * 		A:键盘录入手机号码
 * 		B:定义手机号码的规则
 * 			13436975980
 * 			13688886868
 * 			15866668888
 * 			15799321156
 * 			18912345678
 * 			18886867878
 * 			18638833883
 * 		C:调用功能，判断即可
 * 		D:输出结果
 */
package com.yida_02;

import java.util.Scanner;

public class A_Matches {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入手机号：");
		String s = sc.nextLine();
		boolean bl = checkTel(s);
		System.out.println(s + (bl ? "合法的" : "无效的"));
	}

	public static boolean checkTel(String s) {
		return s.matches("1[358][0-9]{9}");
	}

}
