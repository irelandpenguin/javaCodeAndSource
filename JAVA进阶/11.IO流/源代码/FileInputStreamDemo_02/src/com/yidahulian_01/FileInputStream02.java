package com.yidahulian_01;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 一次读取一个字节数组：int read(byte[] b)
 * 返回值其实是实际读取的字节个数。
 */
public class FileInputStream02 {
	public static void main(String[] args) throws IOException {
		//test1();// 一次读取一个字节数组
		//test2();// 每次打印len个长度，防止出现多余字符
		test3();// 最终版代码
	}

	public static void test1() throws IOException {
		// 创建字节输入流对象
		FileInputStream fis = new FileInputStream("b.txt");

		// 一次读取一个字节数组：int read(byte[] b) 返回值其实是实际读取的字节个数。
		byte[] by = new byte[5];// 创建一个字节数组，可容纳5个字节
		int len = fis.read(by);
		System.out.println(len + "---" + new String(by));
		// 第一次下印结果为：
		// 5---hello

		// 第二次读取
		len = fis.read(by);
		System.out.println(len + "---" + new String(by));
		// 第二次打印结果为：
		// 5---
		// wor

		// 第三次读取
		len = fis.read(by);
		System.out.println(len + "---" + new String(by));
		// 第三次打印结果为：
		// 5---ld
		// j

		// 第四次读取
		len = fis.read(by);
		System.out.println(len + "---" + new String(by));
		// 第四次打印结果为：
		// 4---ar
		// j

		// 第五次读取
		len = fis.read(by);
		System.out.println(len + "---" + new String(by));
		// 第五次打印结果为：
		// -1---ar
		// j

		// 从第五次打印结果能够推断出，当读到文件末尾时，len的值为-1

		// 释放资源
		fis.close();

		// 为什么会出现这样的结果呢？
	}

	// 改进一版
	public static void test2() throws IOException {
		// 创建字节输入流对象
		FileInputStream fis = new FileInputStream("b.txt");

		// 一次读取一个字节数组：int read(byte[] b) 返回值其实是实际读取的字节个数。
		byte[] by = new byte[5];// 创建一个字节数组，可容纳5个字节
		int len = fis.read(by);
		//System.out.println(new String(by, 0, len));
		// 第一次下印结果为：
		// hello
		System.out.print(new String(by, 0, len));// 去掉换行

		// 第二次读取
		len = fis.read(by);
		//System.out.println(new String(by, 0, len));
		// 第二次打印结果为：
		// wor
		System.out.print(new String(by, 0, len));// 去掉换行

		// 第三次读取
		len = fis.read(by);
		//System.out.println(new String(by, 0, len));
		// 第三次打印结果为：
		// ld
		// j
		System.out.print(new String(by, 0, len));// 去掉换行

		// 第四次读取
		len = fis.read(by);
		//System.out.println(new String(by, 0, len));
		// 第四次打印结果为：
		// ar
		System.out.print(new String(by, 0, len));// 去掉换行

		// 第五次读取
		len = fis.read(by);
		if (len == -1) {// -1表示读到文件末尾
			System.out.println("读到文件末尾了，此时len的值为-1");
		}

		// 释放资源
		fis.close();
	}

	// 最终版代码
	// 数组的长度一般是1024或者1024的整数倍
	// 1kb = 1024b  1M = 1024kb  1G = 1024M
	public static void test3() throws IOException {
		//FileInputStream fis = new FileInputStream("b.txt");
		FileInputStream fis = new FileInputStream("src\\com\\yidahulian_01\\FileInputStream01.java");
		byte[] by = new byte[102];
		int len = 0;
		while ((len = fis.read(by)) != -1) {//读取，赋值，判断 集成到一行代码
			System.out.print(new String(by, 0, len));
		}
		fis.close();// 释放资源

		// 思考下：为什么这里的中文都能正常显示了呢？
		// 其实这是假象，你把1024改小一点，比如102。再运行一次看下，仍然有乱码。
		// 原因是刚好字节数组最后一个元素读的是汉字的一半,输出时就会有乱码。
		// 而使用1024每次读取的很多，刚好把汉字都装进去了，打印时刚好没有乱码，所以说是假象。
	}
}
