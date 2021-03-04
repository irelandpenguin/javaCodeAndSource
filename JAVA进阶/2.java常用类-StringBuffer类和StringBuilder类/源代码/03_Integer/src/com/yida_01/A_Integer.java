/*
 * 需求1：我要求大家把100这个数据的二进制，八进制，十六进制计算出来
 * 需求2：我要求大家判断一个数据是否在int范围内的。
 * 		首先你要知道int的范围是多大?
 * 
 * 为了对基本数据类型进行更方便的操作，Java就针对每一种基本数据类型提供了对应的类类型。
 * byte 			Byte
 * short			Short
 * int				Integer
 * long				Long
 * float			Float
 * double			Double
 * char				Character
 * boolean			Boolean
 * 
 * 提供这些类的目的就是用于基本数据类型与字符串之间的转换。
 * 
 * 其他进制与十进制的转换
 * 		进制的范围：2-36。即十进制可转成2-36之间的任意进制。同理，2-36之间的任意进制也能转成十进制。
 */
package com.yida_01;

public class A_Integer {

	public static void main(String[] args) {
		// 打印100的二进制
		System.out.println("100的二进制为" + Integer.toBinaryString(100));
		
		// 打印100的八进制
		System.out.println("100的八进制为" + Integer.toOctalString(100));
		
		// 打印100的十六进制
		System.out.println("100的十六进制为" + Integer.toHexString(100));
		
		// 打印int的最小值，最大取值范围
		System.out.println("int的取值范围" + Integer.MIN_VALUE + "~"
				+ Integer.MAX_VALUE);
		System.out.println("------");
		
		// 十进制到其他进制
		// public static String toString(int i,int radix)
		String str = Integer.toString(100, 5);// 十进制100转成五进制
		System.out.println("十进制100转五进制为" + str);
		System.out.println("------");
		
		// 其他进制到十进制
		// public static int parseInt(String s,int radix)
		int num = Integer.parseInt(str, 5);// 五进制转十进制
		System.out.println("五进制" + str + "转十进制为" + num);

		// 进制的范围：2-36。即十进制可转成2-36之间的任意进制。同理，2-36之间的任意进制也能转成十进制。
		 
		System.out.println("------");
		int num2 = 1000;
		System.out.println(Integer.toString(num2));
		
	}

}
