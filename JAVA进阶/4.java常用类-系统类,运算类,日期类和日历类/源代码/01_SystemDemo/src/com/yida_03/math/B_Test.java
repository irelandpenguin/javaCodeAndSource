/*
 * 面试题：请设计一个方法，可以实现获取任意范围内的随机数。
 * 
 * 分析：
 * 		A:键盘录入两个数据。
 * 			int strat;
 * 			int end;
 * 		B:想办法获取在start到end之间的随机数
 * 			我写一个功能实现这个效果，得到一个随机数。(int)
 * 		C:输出这个随机数
 */
package com.yida_03.math;

import java.util.Random;
import java.util.Scanner;

public class B_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始数：");
		int start = sc.nextInt();
		System.out.println("请输入结束数：");
		int end = sc.nextInt();
		//int num = randNum(start, end);
		int num = randNum2(start, end);
		System.out.println(start + "~" + end + "之间的随机数为" + num);
	}
	
	//start=45, end=95
	public static int randNum(int start, int end) {
		//int num = (int)(Math.random()*100+1);//这是获取1~100的随机数  Math.random()*100+1: 0.0~100.0 + 1 = 1.0~100.0
		// 如何获取start~end的随机数呢？
		//int num = (int) (Math.random() * end+start);//这样貌似不可以  Math.random() * end+start：0.0~95.0 + 45.0 = 45.0 ~ 140.0
		int num = (int) (Math.random() * (end-start+1) + start);//Math.random() * (end-start+1) : 0.0~51.0 + 45 = 45.0 ~ 95.0
		return num;
	}
	
	//start=45, end=95
	public static int randNum2(int start, int end) {
		Random r = new Random();
		int num = r.nextInt((end-start+1))+start;
		return num;
	}

}
