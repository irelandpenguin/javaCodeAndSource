package com.yida_04.String;

import java.util.Scanner;

public class GuessNumber {
	public static void guess() {
		Scanner sc = new Scanner(System.in);
		System.out.println("开始游戏。");

		int randomNum = (int) (Math.random() * 100 + 1);
		//System.out.println("随机生成数为" + randomNum);

		while (true) {
			System.out.println("输入你想猜的数字(1~100)：");
			int num = sc.nextInt();
			if (num == randomNum) {
				System.out.println("恭喜你，猜对了!");
				break;
			} else if (num > randomNum) {
				System.out.println("猜大了");
			} else {
				System.out.println("猜小了");
			}
		}
	}
}
