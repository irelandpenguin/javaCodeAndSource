/*
 * Date:表示特定的瞬间，精确到毫秒。 
 * 
 * 构造方法：
 * 		Date():根据当前的默认毫秒值创建日期对象，注意：这里的默认毫秒值是指当前系统时间的毫秒值
 * 		Date(long date)：根据给定的毫秒值创建日期对象
 */
package com.yida_01.date;

import java.util.Date;

public class A_Date {

	public static void main(String[] args) {
		// Date():根据当前的默认毫秒值创建日期对象
		Date d = new Date();
		System.out.println("d1:" + d);
		System.out.println("------");
		
		// Date(long date)：根据给定的毫秒值创建日期对象
		Date d2 = new Date(0);// 标准基准时间， 即 1970 年 1 月 1 日 00:00:00GMT
		System.out.println("d2:" + d2);// 因为中国在东八区，根据世界格林治时间推算，应比标准基准时间多八小时
		System.out.println("------");
		
		long time = System.currentTimeMillis();// 获取当前系统时间(毫秒)
		Date d3 = new Date(time);
		System.out.println("d3:" + d3);
		System.out.println("------");
		
		//long time2 = 1000 * 60 * 60;// 这里表示1小时，因为1小时=60分，1分=60秒，1秒=1000毫秒
		//long time2 = 1000 * 60;// 这里表示1分
		long time2 = 1000;// 这里表示1秒
		Date d4 = new Date(time2);
		System.out.println("d4:" + d4);
	}

}
