package com.yida_01.datetool;

import java.text.ParseException;
import java.util.Date;

import com.yida_03.datetool.DateTool;

/*
 * 导入jar包：复制jar包，然后粘贴到当前工程中,并选择Build Path -> Add to Build Path。
 * 
 * 使用MyDateFormat里的日期与字符串转换方法。
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		// 日期转字符串
		Date d = new Date();
		String strDate = DateTool.dateToString(d, "yyyy年MM月dd日 HH时mm分ss秒");
		System.out.println(strDate);
		System.out.println("------");

		// 字符串转日期
		String str = "2012年08月12日 17:30";
		Date d2 = DateTool.stringToDate(str, "yyyy年MM月dd日 HH:mm");
		System.out.println(d2);
	}

}
