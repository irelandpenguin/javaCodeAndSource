package com.yidahulian_01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 读数据：BufferedInputStream
 */
public class BufferedInputStream02 {

	public static void main(String[] args) throws IOException {
		test1();// 读取文件，一次读一个字节
		//test2();// 读取文件，一次读一个字节数组
	}

	// 读取文件，一次读一个字节
	public static void test1() throws IOException {
		// 创建高效字节缓冲输入流对象
		// FileInputStream fis = new FileInputStream("a.txt");
		// BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));

		// 读取数据
		int by = 0;
		while ((by = bis.read()) != -1) {
			System.out.print((char) by);
		}

		// 释放资源
		bis.close();

		// 注意：输出的结果中，英文都OK，但中文有乱码。原因是什么？
		// 这个我们前面已经讲过了的，原因就是因为一个汉字占2个字节，一次只读取汉字的一半并强制转换成char导致的。
	}

	// 读取文件，一次读一个字节数组
	public static void test2() throws IOException {
		// 创建高效字节缓冲输入流对象
		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\com\\yidahulian_01\\BufferedInputStream02.java"));

		// 读取数据
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = bis.read(by)) != -1) {
			System.out.print(new String(by, 0, len));
		}

		// 释放资源
		bis.close();

		// 思考下：为什么这里的中文都能正常显示了呢？
		// 其实这是假象，你把1024改小一点，比如102。再运行一次看下，仍然有乱码。
		// 原因是刚好字节数组最后一个元素读的是汉字的一半,输出时就会有乱码。
		// 而使用1024每次读取的很多，刚好把汉字都装进去了，打印时刚好没有乱码，所以说是假象。
	}
}
