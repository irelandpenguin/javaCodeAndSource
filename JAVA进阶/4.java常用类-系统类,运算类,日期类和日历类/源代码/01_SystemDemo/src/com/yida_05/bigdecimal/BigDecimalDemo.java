/*
 * 看程序写结果：
 * 	结果和我们想的不一样，因为float类型的数据存储和整型不一样导致的。 它们大部分的时候，都是带有有效数字位。
 * 
 * 由于在运算的时候，float类型和double很容易丢失精度。
 * 所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
 * 
 * BigDecimal类：
 * 		不可变的、任意精度的有符号十进制数，可以解决数据丢失问题。
 * 
 * 
 * 构造方法：
 * 		public BigDecimal(String val)
 * 
 * 方法：
 * 		public BigDecimal add(BigDecimal augend)
 * 		public BigDecimal subtract(BigDecimal subtrahend)
 * 		public BigDecimal multiply(BigDecimal multiplicand)
 *		public BigDecimal divide(BigDecimal divisor)
 * 		public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):商，保留几位小数，如何取舍
 */
package com.yida_05.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		//看程序写结果：
		System.out.println(0.09 + 0.01);// 自认为是0.10，最终为0.09999999999999999
		System.out.println(1.0 - 0.32);// 自认为是0.68，最终为0.6799999999999999
		System.out.println(1.015 * 100);// 自认为101.5，最终为101.49999999999999
		System.out.println(1.301 / 100);// 自认为0.01301，最终为0.013009999999999999
		
		
		System.out.println(1.0 - 0.12);// 自认为0.88，最终为0.88

		System.out.println("------");
		
		// 改用BigDecimal处理
		resolve("0.09", "0.01", "+");
		resolve("1.0", "0.32", "-");
		resolve("1.015", "100", "*");
		resolve("1.301", "100", "/");
		resolve("999999999999999999999999.09", "33333333333333333333333333333333.01", "+");

		System.out.println("------");
		
		/*
		 * public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode) 
		 * 参数：divisor 商， scale 保留几位小数， roundingMode 如何取舍，默认都用BigDecimal.ROUND_HALF_UP
		 */
		resolve("1.351", "100", "/");
		BigDecimal bd1 = new BigDecimal("1.351");
		BigDecimal bd2 = new BigDecimal("100");
		System.out.println("divide:"+ bd1.divide(bd2, 3, BigDecimal.ROUND_HALF_UP));//类似于“四舍五入”
		System.out.println("divide:"+ bd1.divide(bd2, 8, BigDecimal.ROUND_HALF_UP));
		
	}

	// 大数据处理浮点数运算
	public static void resolve(String s1, String s2, String flag) {
		BigDecimal bd1 = new BigDecimal(s1);
		BigDecimal bd2 = new BigDecimal(s2);
		BigDecimal result = null;

		if (flag.equals("+")) {
			result = bd1.add(bd2);
		} else if (flag.equals("-")) {
			result = bd1.subtract(bd2);
		} else if (flag.equals("*")) {
			result = bd1.multiply(bd2);
		} else if (flag.equals("/")) {
			result = bd1.divide(bd2);
		}

		if (result != null) {
			System.out.println("result:" + result);
		}
	}

}
