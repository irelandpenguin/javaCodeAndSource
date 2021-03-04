package com.yidahulian_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 输入转换流：字节流转换成字符流
 * InputStreamReader(InputStream is):用默认的编码读取数据(注意：在读取数据时，会根据默认编码进行解码)
 * InputStreamReader(InputStream is,String charsetName):用指定的编码读取数据(注意：在读取数据时，会根据给定编码进行解码)
 */
public class InputStreamReader02 {

	public static void main(String[] args) throws IOException {
		test1();// 用默认的编码读取数据
		//test2();
		//test3();//用指定的编码读取数据
	}

	// 用默认的编码读取数据
	public static void test1() throws IOException {
		// InputStreamReader(InputStream is):用默认的编码读取数据
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));

		// 读数据,一次读一个字符(而不是字节，因为已经通过转换流把字节转成字符，这点要搞清楚！)
		int by = 0;
		while ((by = isr.read()) != -1) {
			System.out.print((char) by);
		}

		// 释放资源
		isr.close();

		// 小结：
		// 为什么这次一次读一个也不会出乱码了呢？
		// 因为在OutputStreamWriter01.java文件中，使用平台默认编码(GBK)把字符流编码成字节流写到a.txt中了
		// 紧接着，使用InputStreamReader读取a.txt时，会默认使用平台默认编码(GBK)把字节流解码成字符流了。
		// 所以，一个一个的读照样没有问题。
		// 字母，汉字，标点符号都是字符，通过转换流每次读的也都是字符。所以，汉字也能正确读出来了。
	}
	
	//字节读取，仍然会有乱码
	public static void test2() throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");//字节输入流
		int by = 0;
		while((by=fis.read()) != -1) {
			System.out.print((char)by);
		}
		fis.close();
	}

	//指定编码格式读取
	public static void test3() {
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream("b.txt"), "UTF-8");//使用指定的编码格式进行解码
			int by = 0;
			while((by=isr.read()) != -1) {
				System.out.print((char)by);
			}
			isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
