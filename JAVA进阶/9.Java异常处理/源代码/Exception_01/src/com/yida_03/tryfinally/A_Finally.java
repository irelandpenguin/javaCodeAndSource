package com.yida_03.tryfinally;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * finally:被finally控制的语句体一定会执行
 * 注意：如果在执行到finally之前jvm退出了，就不能执行了。
 * 
 * A:格式
 * 		try...catch...finally...
 * B:用于释放资源，在IO流操作和数据库操作中会见到
 */
public class A_Finally {

	public static void main(String[] args) {
		//test();
		test2();
		System.out.println("OVER啦~~");
	}
	
	public static void test() {
		String str = "2017-08-08 12:12:50";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			System.out.println("释放资源，finally里的代码一定会执行！");
		}
	}

	public static void test2() {
		String str = "2017-08-08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(0);// 强制退出，此时，finally里的代码就不会再走了
		} finally {
			System.out.println("释放资源，finally里的代码一定会执行！");
		}
	}

}
