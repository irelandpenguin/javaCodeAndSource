/*
 * 校验qq号码.
 * 		1:要求必须是5-15位数字
 * 		2:0不能开头
 * 
 * 分析：
 * 		A:键盘录入一个QQ号码
 * 		B:写一个功能实现校验
 * 		C:调用功能，输出结果。
 */
package com.yida_01;

import java.util.Scanner;

public class A_CheckQQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入QQ号：");
		String qq = sc.nextLine();
		boolean validate = check(qq);
		System.out.println(qq + "是" + (validate ? "有效的!" : "无效的!"));
	}

	public static boolean check(String qq) {
		boolean val = false;
		char[] arr = qq.toCharArray();
		if (arr[0] != '0') {
			if (arr.length >= 5 && arr.length <= 15) {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] >= '0' && arr[i] <= '9') {
						val = true;
					} else {
						val = false;
						break;
					}
				}
			}
		}
		return val;
	}

}
