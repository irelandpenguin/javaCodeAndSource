/*
 * Scanner:用于接收键盘录入数据。
 * 		A:导包
 * 		B:创建对象
 * 		C:调用方法
 */
package com.yida_01.Scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// 打开API帮助文档，学习Scanner的其它用法。
		Scanner sc = new Scanner(System.in);// 创建键盘录入对象
		
		System.out.println("请输入一个字符串：");
		String str = sc.nextLine();
		System.out.println("你输入的字符串为" + str);

		/*System.out.println("请输入一个整数：");
		int num = sc.nextInt();
		System.out.println("你输入的整数为" + num);*/

		/*System.out.println("请输入一个浮点数：");
		double dou = sc.nextDouble();
		System.out.println("你输入的浮点数为" + dou)*/;

		/*System.out.println("请输入一个布尔值：");
		boolean bl = sc.nextBoolean();
		System.out.println("你输入的布尔值为" + bl);*/
	}

}
