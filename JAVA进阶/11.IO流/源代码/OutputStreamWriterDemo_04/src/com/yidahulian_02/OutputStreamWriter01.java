package com.yidahulian_02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 转换流(功能：实现字节流与字符流的转换)
 * 	分2种：
 * 		OutputStreamWriter功能：字符流转成字节流;
 * 		InputStreamReader功能：字节流转成字符流;
 * OutputStreamWriter(OutputStream out):根据默认编码把字符流数据转换为字节流，简称：输出转换流
 * OutputStreamWriter(OutputStream out,String charsetName):根据指定编码把字符流数据转换为字节流
 * 
 * 字符流 = 字节流 +编码表。
 */
public class OutputStreamWriter01 {

	public static void main(String[] args) throws IOException {
		//test1();// 根据默认编码把字符流数据转换为字节流
		test2();// 根据指定编码把字符流数据转换为字节流
	}

	// 根据默认编码把字节流数据转换为字符流
	public static void test1() throws IOException {
		// FileOutputStream fos = new FileOutputStream("a.txt");
		// OutputStreamWriter osw = new OutputStreamWriter(fos);
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));//根据默认编码(GBK)把字符流数据转换为字节流
		osw.write("hello,宜达互联");// 写数据
		osw.close();// 释放资源
	}

	// 根据指定编码把字节流数据转换为字符流
	public static void test2() throws IOException {
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"), "GBK");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"), "UTF-8");// 指定UTF-8
		osw.write("hello,宜达互联");// 写数据
		osw.close();// 释放资源

		// 分别用 notepad++，记事本，eclipse打开看结果。
	}
}
