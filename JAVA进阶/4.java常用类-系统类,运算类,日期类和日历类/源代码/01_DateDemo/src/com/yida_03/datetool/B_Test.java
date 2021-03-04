/*
 * 算一下你来到这个世界多少天?
 * 
 * 分析：
 * 		A:键盘录入你的出生的年月日
 * 		B:把该字符串转换为一个日期
 * 		C:通过该日期得到一个毫秒值
 * 		D:获取当前时间的毫秒值
 * 		E:用D-C得到一个毫秒值
 * 		F:把E的毫秒值转换为年
 * 			/1000/60/60/24
 */
package com.yida_03.datetool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class B_Test {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的出生年，月，日(比如：2008.12.08)");
		String str = sc.nextLine();
		long day = days(str, "yyyy.MM.dd");
		System.out.println("你来到这个世界" + day + "天了");
	}

	public static long days(String strDate, String format)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(strDate);
		long originTimer = date.getTime();// 出生日期对应的时间(毫秒)
		long currentTimer = System.currentTimeMillis();// 当前系统时间(毫秒)
		long existTimer = currentTimer - originTimer;// 已存在的时间(毫秒)
		long num = existTimer/1000/60/60/24;// 获取天数
		return num;
	}

}
