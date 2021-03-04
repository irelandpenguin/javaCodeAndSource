/*
 * DateForamt类
 * 		可以进行日期与字符串的互相转换。即可以把日期格式化成字符串，也可以把字符串解析日期。
 * 
 * 		方法：
 * 			public final String format(Date date) 日期转换字符串
 * 			public Date parse(String source) 字符串转成日期
 * 
 * 但由于它是抽象类，所以应使用它的子类SimpleDateFormat。
 * 
 * SimpleDateFormat类
 * 		构造方法：
 * 			SimpleDateFormat():默认模式
 * 			SimpleDateFormat(String pattern):给定的模式
 * 			这个给定的模式字符串该如何写呢?
 * 			通过查看API，我们就找到了对应的模式
 * 				年 y
 * 				月 M	
 * 				日 d
 * 				时 H (24小进制) 时h (12小时进制)
 * 				分 m
 * 				秒 s
 * 
 * 			例如：2014年12月12日 12:12:12 可表示为 yyyy年MM月dd日 HH:mm:ss
 */
package com.yida_02.simpledateformat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A_DateFormat {

	public static void main(String[] args) throws ParseException {
		// 日期格式化成字符串
		Date d = new Date();
		DateFormat sdf = new SimpleDateFormat();// 默认模式
		String str = sdf.format(d);
		System.out.println(str);
		System.out.println("------");
		
		/*
		 * FULL 完整显示
		 * LONG 长度显示
		 * MEDIUM 中度显示
		 * SHORT 简短显示
		 */
		//getDateTimeInstance(int dateStyle, int timeStyle, Locale aLocale) 
        //获取日期/时间格式器，该格式器具有给定语言环境的给定格式化风格。
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM);
		str = df.format(d);
		System.out.println(str);
		
		System.out.println("-------");
		
		// 格式化成只有年，月，日的字符串
		sdf = new SimpleDateFormat("yyyy/MM/dd");
		str = sdf.format(new Date());
		System.out.println(str);
		System.out.println("------");
		
		// 格式化成只有时，分，秒的字符串
		sdf = new SimpleDateFormat("HH:mm:ss");
		str = sdf.format(d);
		System.out.println(str);
		System.out.println("------");
		
		// 格式化成只有月，日，时，分的字符串
		sdf = new SimpleDateFormat("MM月dd日 HH:mm");
		str = sdf.format(d);
		System.out.println(str);
		System.out.println("------");
		
		// 格式化成只有年，月，日，时，分的字符串，样式改下
		sdf = new SimpleDateFormat("yyyy年MM月dd号 HH时mm分");
		str = sdf.format(d);
		System.out.println(str);
		System.out.println("------");
		
		// 字符串解析为日期
		// 注意：格式必须和给定的字符串格式匹配
		String strTime = "2018-12-08 12:26:30";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d2 = sdf2.parse(strTime);
		System.out.println(d2);
		System.out.println("------");
		
		// 注意：格式必须和给定的字符串格式匹配
		strTime = "2016年11月08日 11时16分";
		sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
		d2 = sdf2.parse(strTime);
		System.out.println(d2);
	}

}
