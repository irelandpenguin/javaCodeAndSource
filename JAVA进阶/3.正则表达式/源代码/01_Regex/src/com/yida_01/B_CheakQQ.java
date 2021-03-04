package com.yida_01;

import java.util.Scanner;

public class B_CheakQQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入QQ号：");
		String qq = sc.nextLine();
		boolean validate = check(qq);
		System.out.println(qq + "是" + (validate ? "有效的!" : "无效的!"));
	}

	public static boolean check(String qq) {
		return qq.matches("[1-9][0-9]{4,14}");//用正规表达式来判断(接下来就学习正规表达式)
	}

}
