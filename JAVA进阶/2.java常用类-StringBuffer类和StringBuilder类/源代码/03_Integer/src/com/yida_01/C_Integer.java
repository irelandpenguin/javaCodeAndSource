/*
 * JDK5的新特性
 * 自动装箱：把基本类型转换为包装类类型
 * 自动拆箱：把包装类类型转换为基本类型
 * 
 * 注意一个小问题：
 * 		在使用时，Integer x = null;代码就会出现NullPointerException。
 * 		建议先判断是否为null，然后再使用。
 */
package com.yida_01;

public class C_Integer {

	public static void main(String[] args) {
		Integer i = 100;// 自动装箱，底层使用Integer.valueOf(100);来转换成Integer对象
		i += 20;// 先自动拆箱，再自动装箱，底层使用i = Integer.valueOf(i.intValue() + 20);来处理的
		System.out.println("i:" + i);

		// 下面这段代码运行时闪退，why? 原因是NullPointerException空指针异常。
		Integer ii = null;
		//ii += 10;
		//System.out.println("ii:" + ii);
		
		// 解决方案
		if (ii != null) {
			ii += 10;
			System.out.println("ii:" + ii);
		}
	}

}
