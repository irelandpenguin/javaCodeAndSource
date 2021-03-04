package com.yidahulian_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 编码，解码
 * ASCII, GB2312, GBK, GB18030, UTF-8, Unicode, UTF-16, BIG-5, ISO-8859-1等
 * 
 * 查看String的API文档说明：
 * public String(byte[] bytes):使用默认字符集(GBK)对字节数组进行解码，返回字符串
 * public String(byte[] bytes,String charsetName):使用指定字符集对字节数组进行解码，返回字符串
 * public byte[] getBytes():使用默认字符集(GBK)对字符串进行编码，返回字节数组
 * public byte[] getBytes(String charsetName):使用指定的字符集对字符串进行编码，返回字节数组
 * 
 * 编码:把看得懂的变成看不懂的
 * String --> byte[]
 * 
 * 解码:把看不懂的变成看得懂的
 * byte[] --> String
 * 
 * 编码，解码问题简单，只要保证编码与解码的格式是一致的。
 */
public class StringDemo02 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//String s = "你好";
		String s = "你好,hello";

		// String -> byte[]
		byte[] by = s.getBytes();// 使用默认字符集(GBK)对字节数组进行解码，返回字符串
		//System.out.println("默认编码(GBK):" + Arrays.toString(by));
		
		// 打印结果：默认编码(GBK):[-60, -29, -70, -61]
		String result = new String(by);// 使用默认字符集(GBK)对字节数组进行解码，返回字符串
		//System.out.println("默认解码(GBK)结果为：" + result);
		by = s.getBytes("GBK");// 使用指定的字符集对字符串进行编码，返回字节数组
		System.out.println("GBK:" + Arrays.toString(by));// 打印结果：GBK:[-60, -29, -70, -61]
		result = new String(by, "GBK");// 使用指定字符集对字节数组进行解码，返回字符串
		System.out.println("GBK解码结果为：" + result);
		/*
		by = s.getBytes("GB2312");
		System.out.println("GB2312:" + Arrays.toString(by));// 打印结果：GB2312:[-60, -29, -70, -61]
		result = new String(by, "GB2312");// 使用指定字符集对字节数组进行解码，返回字符串
		System.out.println("GB2312解码结果为：" + result);
		
		
		by = s.getBytes("GB18030");
		System.out.println("GB18030:" + Arrays.toString(by));// 打印结果：GB18030:[-60, -29, -70, -61]
		result = new String(by, "GB18030");// 使用指定字符集对字节数组进行解码，返回字符串
		System.out.println("GB18030解码结果为：" + result);
		
		
		by = s.getBytes("UTF-8");
		System.out.println("UTF-8:" + Arrays.toString(by));// 打印结果：UTF-8:[-28, -67, -96, -27, -91, -67]
		result = new String(by, "UTF-8");// 使用指定字符集对字节数组进行解码，返回字符串
		System.out.println("UTF-8解码结果为：" + result);
		
		
		by = s.getBytes("UTF-16");
		System.out.println("UTF-16:" + Arrays.toString(by));// 打印结果：UTF-16:[-2, -1, 79, 96, 89, 125]
		result = new String(by, "UTF-16");// 使用指定字符集对字节数组进行解码，返回字符串
		System.out.println("UTF-16解码结果为：" + result);

		
		by = s.getBytes("Unicode");
		System.out.println("Unicode:" + Arrays.toString(by));// 打印结果：Unicode:[-2, -1, 79, 96, 89, 125]
		result = new String(by, "Unicode");// 使用指定字符集对字节数组进行解码，返回字符串
		System.out.println("Unicode解码结果为：" + result);

		
		by = s.getBytes("BIG5");
		System.out.println("BIG5(大五码):" + Arrays.toString(by));// 打印结果：BIG5:[-89, 65, -90, 110]
		result = new String(by, "BIG5");// 使用指定字符集对字节数组进行解码，返回字符串
		System.out.println("BIG5解码结果为：" + result);
		 */
		// 小结：
		// 编码，解码问题简单，只要保证编码与解码的格式是一致的。
		// 如果解码与编码不一致呢？比如：用GBK编码，用UTF-8解码。会输出什么？ 自己验证一下。
	}

}
