package com.yida_01.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 编译时异常和运行时异常的区别
 * 编译期异常：Java程序必须显示处理，否则程序就会发生错误，无法通过编译;
 * 运行期异常：一般不用做处理的，但因为我们个人代码不严谨导致的，要做下处理。
 * 
 * 异常中要了解的几个方法：
 * public String getMessage():异常的消息字符串		
 * public String toString():返回异常的简单信息描述
 * printStackTrace():获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。把信息输出在控制台。
 */
public class E_Exception {

	public static void main(String[] args) {
		String str = "2017-08-02 07:56:30";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//Date date = sdf.parse(str);// 此行代码，编译报错。因为有编译期间的可能异常未处理
		
		try {
			Date date2 = sdf.parse(str);
			System.out.println("解析后的日期为" + date2);
		} catch (ParseException e) {
			//System.out.println("日期解析异常了");
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();//推荐！！
			// 后续，可以跳转到某个指定网页(比如：error.html)，把异常信息显示给用户看。
		}

		System.out.println("OVER啦~~");
	}

}
