/*
 * Calendar:它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等日历字段之间的转换提供了一些方法，
 * 并为操作日历字段（例如获得下星期的日期）提供了一些方法。
 * 
 * public int get(int field):返回给定日历字段的值。
 * 日历类中的每个日历字段都是静态的成员变量，并且是int类型。
 */
package com.yida_01.calendar;

import java.util.Calendar;

public class A_Calendar {

	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();// 子类对象，其中日历字段已由当前日期和时间初始化
		int year = rightNow.get(Calendar.YEAR);// 获取年
		int month = rightNow.get(Calendar.MONTH);// 获取月(注意：月份比实际月份少1)
		int date = rightNow.get(Calendar.DAY_OF_MONTH);// 获取日
		System.out.println(year + "年" + (month + 1) + "月" + date + "日");
		System.out.println("------");
		
		int hour = rightNow.get(Calendar.HOUR);// 获取小时
		int minute = rightNow.get(Calendar.MINUTE);// 获取分钟
		int second = rightNow.get(Calendar.SECOND);// 获取秒
		System.out.println(hour + "时" + minute + "分" + second + "秒");
	}

}
