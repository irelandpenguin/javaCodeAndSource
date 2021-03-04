/*
 * Math:用于数学运算的类。
 * 成员变量：
 * 		public static final double PI
 * 		public static final double E
 * 成员方法：
 * 		public static int abs(int a) 绝对值
 *		public static double ceil(double a) 向上取整
 *		public static double floor(double a) 向下取整
 *		public static int max(int a,int b) 最大值
 *		public static double min(int a, int b) 最小值
 *		public static double pow(double a,double b) a的b次幂
 *		public static double random() 随机数 [0.0,1.0)
 *		public static int round(float a) 四舍五入
 *		public static long round(double a)四舍五入
 *		public static double sqrt(double a) 正平方根
 */
package com.yida_03.math;

public class A_Math {

	public static void main(String[] args) {
		// public static final double PI
		System.out.println("PI:" + Math.PI);
		// public static final double E
		System.out.println("E：" + Math.E);
		System.out.println("------");
		
		
		// public static int abs(int a) 绝对值
		System.out.println("abs:" + Math.abs(10));
		System.out.println("abs:" + Math.abs(-10));
		System.out.println("------");
		
		// public static double ceil(double a) 向上取整
		System.out.println("ceil:" + Math.ceil(12.34));
		System.out.println("ceil:" + Math.ceil(12.56));
		System.out.println("------");
		
		// public static double floor(double a) 向下取整
		System.out.println("ceil:" + Math.floor(12.34));
		System.out.println("ceil:" + Math.floor(12.56));
		System.out.println("------");
		
		// public static int max(int a,int b) 最大值
		System.out.println("max:" + Math.max(100, 20));
		System.out.println("min:" + Math.min(100, 20));
		// 需求：我要获取三个数据中的最大值
		// 方法的嵌套调用
		System.out.println("11,20,3的最大值为" + Math.max(11,Math.max(20, 3)));
		System.out.println("------");
		
		// public static double pow(double a,double b) a的b次幂(实际上就是a的b次)
		System.out.println("pow:" + Math.pow(2, 3));// 2的3次幂
		System.out.println("------");
		
		// public static double random():随机数 [0.0,1.0)
		System.out.println("random:" + Math.random());
		// 获取一个1-100之间的随机数
		System.out.println("1-100之间的随机数：" + (int) (Math.random() * 100 + 1));
		System.out.println("------");
		
		// public static int round(float a) 四舍五入
		System.out.println("round:" + Math.round(3.54f));//参数为float，返回类型为int
		System.out.println("rint:" + Math.rint(3.46));//参数为double，返回类型为double
		System.out.println("------");
		
		// public static double sqrt(double a) 正平方根
		System.out.println("4的平方根为" + Math.sqrt(4));//2.0
		System.out.println("16的平方根为" + Math.sqrt(16));//4.0
	}

}
