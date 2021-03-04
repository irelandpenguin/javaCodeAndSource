/*
 * Date方法
 * public long getTime():获取时间，以毫秒为单位
 * public void setTime(long time):设置时间
 * 
 * 如何得到一个毫秒值
 * 		(1).通过Date的getTime()获取;
 * 		(2).通过System.currentTimeMillis()获取;
 * 
 * 把一个毫秒值转换为Date
 * 		(1).通过Date的构造方法转换
 * 		(2).通过Date的setTime(long time)方法转换
 */
package com.yida_01.date;

import java.util.Date;

public class B_Date {

	public static void main(String[] args) {
		// 获取毫秒值
		// public long getTime():获取时间，以毫秒为单位
		Date d = new Date();
		System.out.println(d.getTime());
		System.out.println(System.currentTimeMillis());
		System.out.println("------");

		
		// 把一个毫秒值转换为Date
		// public void setTime(long time):设置时间
		Date d2 = new Date();
		long time = 1000 * 60 * 60;// 这里表示1小时，因为1小时=60分，1分=60秒，1秒=1000毫秒
		d2.setTime(time);
		System.out.println("d2:" + d2);// 结果根据中国在东八区来推算
		
		Date d3 = new Date(time);
		System.out.println("d3:" + d3);// 结果根据中国在东八区来推算
	}

}
