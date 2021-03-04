/*
 * Random:产生随机数的类
 * 
 * 构造方法：
 * 		public Random():没有给种子，用的是默认种子，是当前系统时间的毫秒值
 *		public Random(long seed):给出指定的种子
 *
 *		给定种子后，每次得到的随机数是相同的。
 *
 * 成员方法：
 * 		public int nextInt()：返回的是int范围内的随机数
 *		public int nextInt(int n):返回的是[0,n)范围的内随机数
 *		public double nextDouble():返回的是[0.0,1.0)范围的内随机浮点数
 *
 * 很多应用程序会发现 Math.random() 方法更易于使用。
 */
package com.yida_02.random;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();// 没有给种子，用的是默认种子，是当前系统时间的毫秒值
		//Random r = new Random(1000);// 给出指定的种子,这里的值可以随便给的。

		for (int i = 0; i < 10; i++) {
			//System.out.println(r.nextInt());// 返回的是int范围内的随机数
			System.out.println(r.nextInt(100));// 返回的是[0,n)范围的内随机数
			//System.out.println(r.nextDouble());//返回的是[0.0,1.0)范围的内随机浮点数
		}

		
		System.out.println("----------");

		// 以前学习的，这里复习下
		for (int i = 0; i < 10; i++) {
			int randomNum = (int) (Math.random() * 100 + 1);// 1~100之间(包括1和100)
			System.out.println(randomNum);
		}
	}
}
