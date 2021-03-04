/**
 * 这是日期和字符串相互转换的工具类
 * 
 * @author 钱老师
 * @version V1.0
 */
package com.yida_03.datetool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTool {
	// 私有构造，防止外界创建对象
	private DateTool() {
	}

	/**
	 * 日期转成字符串
	 * 
	 * @param date
	 *            要转换的日期
	 * @param format
	 *            转换的格式
	 * @return 返回转换后的日期字符串
	 */
	public static String dateToString(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	/**
	 * 字符串转换成日期
	 * 
	 * @param strDate
	 *            要转换的字符串
	 * @param format
	 *            转换的格式，注意：格式一定要与字符串样式匹配！
	 * @return 返回转换后的日期
	 * @throws ParseException 
	 */
	public static Date stringToDate(String strDate, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(strDate);
	}
}
