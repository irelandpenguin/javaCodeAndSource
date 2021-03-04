package com.yidahulian_01;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节流读取中文并显示到控制台，可能出现的小问题：乱码。
 */
public class FileInputStreamDemo01 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");

		// 方式一：一次读一个字节
		 /*int by = 0;
		 while ((by = fis.read()) != -1) {
			 System.out.print((char) by);
		 }*/
		
		// 方式二：一次读一个字节数组
		byte[] by = new byte[7];
		int len = 0;
		while ((len = fis.read(by)) != -1) {
			System.out.print(new String(by, 0, len));
		}

		// 原因是字节数组为7时，刚好字节数组最后一个元素读的是汉字的一半,输出时就会有乱码。
		// 而字节数组为10时，刚好把汉字都装进去了，输出时刚好没有乱码，其实是假象。

		// 释放资源
		fis.close();
	}
}
