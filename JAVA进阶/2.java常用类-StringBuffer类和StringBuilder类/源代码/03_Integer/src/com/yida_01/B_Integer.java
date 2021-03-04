/*
 * Integer的构造方法：
 * public Integer(int value)
 * public Integer(String s)
 * 		注意：这个字符串必须是由数字字符组成！
 * 
 * 
 *  int类型和String类型的相互转换
 *  int --> String
 * 		String.valueOf(num) //推荐
 * 		Integer.toString(num) //推荐
 * 
 * String --> int
 * 		Integer.parseInt(s) //推荐
 */
package com.yida_01;

public class B_Integer {
	public static void main(String[] args) {
		// 方式一：
		Integer i = new Integer(100);
		System.out.println("i:" + i);

		// 方式二：
		Integer ii = new Integer("100");
		//Integer ii = new Integer("ab");//报错！NumberFormatException
		System.out.println("ii:" + ii);
		
		System.out.println("------");

		// int -> String
		// 方式1：
		String s1 = "" + 100;
		System.out.println("s1:" + s1);
		System.out.println("--------");
		
		// 方式2：
		String s2 = String.valueOf(100);//推荐使用
		System.out.println("s2:" + s2);
		System.out.println("--------");
		
		// 方式3：
		Integer it = new Integer(100);
		String s3 = it.toString();
		System.out.println("s3:" + s3);
		System.out.println("-------");

		// 方式4：
		String s4 = Integer.toString(100);//推荐使用
		System.out.println("s4:" + s4);
		System.out.println("-------");
	
		// ------------------------------

		// String -> int
		// 方式1：
		String str = "100";
		Integer it2 = new Integer(str);
		int num = it2.intValue();
		System.out.println("num:" + num);
		System.out.println("-------");

		// 方式二：
		int num2 = Integer.parseInt(str);//推荐使用
		System.out.println("num2:" + num2);
	}
}
