/*
 * BigInteger:可以让超过Integer范围内的数据进行运算
 * 
 * 构造方法：
 * BigInteger(String val) 
 * 
 * 方法：
 * public BigInteger add(BigInteger val):加
 * public BigInteger subtract(BigInteger val):减
 * public BigInteger multiply(BigInteger val):乘
 * public BigInteger divide(BigInteger val):除
 * public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组
 * public BigInteger max(BigInteger val):最大值
 * public BigInteger min(BigInteger val):最小值
 */
package com.yida_04.biginteger;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
		// 这几个测试，是为了简单超过int范围内，Integer就不能再表示，所以就更谈不上计算了。
		Integer i = new Integer(100);
		System.out.println(i);
		System.out.println(Integer.MAX_VALUE);// 整型的最大范围值
		Integer i2 = new Integer("2147483647"); 
		System.out.println(i2);
		//Integer i3 = new Integer("2147483648");// 报错 NumberFormatException
		//System.out.println(i3);

		System.out.println("------");
		
		// 接下来，通过大整数来创建对象
		BigInteger bi = new BigInteger("214748364821474836482147483648214748364821474836482147483648");// 大数据
		System.out.println("bi:" + bi);

		System.out.println("------");
		
		// public BigInteger add(BigInteger val) 大数据 相加
		BigInteger b1 = new BigInteger("1000000000000000000000000");
		BigInteger b2 = new BigInteger("2000000000000000000000001");
		BigInteger result = b1.add(b2);
		System.out.println("result:" + result);
		System.out.println("------");
		
		// public BigInteger subtract(BigInteger val) 大数据 相减
		result = b1.subtract(b2);
		System.out.println("result:" + result);
		System.out.println("------");
		
		// public BigInteger multiply(BigInteger val) 大数据 相乘
		result = b1.multiply(b2);
		System.out.println("result:" + result);
		System.out.println("------");
		
		// public BigInteger divide(BigInteger val) 大数据 相除，得到的是商
		result = b2.divide(b1);
		System.out.println("result:" + result);
		System.out.println("------");
		
		// public BigInteger[] divideAndRemainder(BigInteger val)大数据
		// 相除，返回商和余数的数组
		BigInteger[] arr = b2.divideAndRemainder(b1);
		System.out.println("商:" + arr[0] + "，余数:" + arr[1]);
		
		// public BigInteger max(BigInteger val):最大值
		result = b1.max(b2);
		System.out.println("最大值为" + result);
		
		// public BigInteger min(BigInteger val):最小值
		result = b1.min(b2);
		System.out.println("最小值为" + result);
	}

}
