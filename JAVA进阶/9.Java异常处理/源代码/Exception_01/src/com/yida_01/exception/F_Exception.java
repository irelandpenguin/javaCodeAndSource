package com.yida_01.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 我们只对编译期间的异常进行处理的，不然程序编译都不通过的。
 * 对编译期间的异常处理有2种方式：
 * 		A:使用try...catch...捕获处理；
 * 		B:使用throws抛出。
 * throws格式：
 * 		throws 异常类名
 * 		注意：这个格式必须跟在方法的括号后面。
 * throws小结：
 * 		编译期异常抛出，将来调用者必须处理。
 * 		运行期异常抛出，将来调用者不用处理，交给JVM处理。
 */
public class F_Exception {

	public static void main(String[] args) {
		// 方式一：编译期间的异常处理（A:使用try...catch...捕获处理；）
		//test();

		// 方式二：抛出，将来由调用者处理。(这里的调用者指的是main方法，以后的调用者可能是别的对象方法等。)
		/*try {
			test2();
		} catch (ParseException e) {
			e.printStackTrace();
		}*/
		
		//test2();//如果调用者这样调用，调用者也只能 throws ParseException，抛出去。由JVM去捕获处理。
		
		//test3();
		
		//test4();//如果调用者这样调用test4()，调用者也只能 throws ParseException，抛出去。由JVM去捕获处理。

		System.out.println("OVER啦~~");
	}
	
	// 方式一： 编译期间的异常处理（A:使用try...catch...捕获处理；）
	public static void test() {
		String str = "2017-08-21 16:43:56";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	// 方式二：抛出，将来由调用者处理。
	public static void test2() throws ParseException {
		String str = "2017年08月02日 16时43分";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		Date date = sdf.parse(str);
		System.out.println(date);
	}
	
	/*public static void test3() {
		try {
			test2();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}*/
	
	public static void test4() throws ParseException {
		test2();
	}
}
