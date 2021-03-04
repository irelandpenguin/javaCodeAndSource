/*
 * 模拟登录,给三次机会,并提示还有几次。
 * 如果登录成功，启动猜数字小游戏。
 */
package com.yida_04.String;

import java.util.Scanner;

public class C_Test {

	public static void main(String[] args) {
		String userName = "admin";
		String userPwd = "admin";

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {// 只有三次登录机会
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String pwd = sc.nextLine();

			// 判断用户名和密码是否正确
			if (userName.equals(name) && userPwd.equals(pwd)) {
				System.out.println("恭喜你，登录成功!");
				GuessNumber.guess();// 开始猜数字小游戏
				break;
			} else {
				int count = 2 - i;
				if (count > 0) {
					System.out.println("你还有" + count + "次登录机会");
				} else {
					System.out.println("当天登录机会已用完，请联系管理员!");
				}
			}
		}
	}

}
