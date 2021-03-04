/*
 * 在当前工程里测试MyDateFormat里的日期与字符串转换方法。
 * 
 * 
 * 结下来，我想在别的工程里使用DateTool类，怎么做呢？
 * 		(1) 生成jar包，步骤：选中DateTool.java然后单击右键选择Export，在弹出框中选择
 * 			JAR file。然后在下一个弹出框中选择jar的存放路径，最后Finish。
 * 		(2) 生成doc说明文档，步骤：选中DateTool.java然后单击右键选择Export，在弹出框中选择
 * 			javadoc。然后在下一个弹出框中选择说明文档的存放路径，最后Finish。
 * 		(3) 复制已制作的jar包，然后粘贴到别的工程中,并选择Build Path -> Add to Build Path。
 * 		(4) 结下来就可以直接使用DateTool类里的方法了。
 */
package com.yida_03.datetool;

import java.text.ParseException;
import java.util.Date;

public class A_Test {

	public static void main(String[] args) throws ParseException {	
		// 日期转字符串
		Date d = new Date();
		String strDate = DateTool.dateToString(d, "yyyy-MM-dd HH时mm分ss秒");
		System.out.println(strDate);
		System.out.println("------");
		
		strDate = DateTool.dateToString(d, "yyyy年MM月dd日");
		System.out.println(strDate);
		System.out.println("------");
		
		strDate = DateTool.dateToString(d, "HH:mm:ss");
		System.out.println(strDate);
		System.out.println("------");
		
		// 字符串转日期
		String str = "2008年08月06日 12:06:30";
		Date d2 = DateTool.stringToDate(str, "yyyy年MM月dd日 HH:mm:ss");
		System.out.println(d2);
		System.out.println("------");
		
		str = "2008-08-06";
		d2 = DateTool.stringToDate(str, "yyyy-MM-dd");
		System.out.println(d2);
		System.out.println("------");
		
		str = "12时06分30秒";
		d2 = DateTool.stringToDate(str, "HH时mm分ss秒");
		System.out.println(d2);
		System.out.println("------");
	}

}
