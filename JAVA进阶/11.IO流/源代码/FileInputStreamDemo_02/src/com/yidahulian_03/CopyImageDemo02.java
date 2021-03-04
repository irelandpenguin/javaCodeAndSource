package com.yidahulian_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把c:\\宜达互联.jpg内容复制到当前项目目录下的yidahulian.jpg中
 * 
 * 数据源：
 * 		c:\\宜达互联.jpg	--  读取数据  --  FileInputStream
 * 目的地：
 * 		yidahulian.jpg	--  写出数据  --  FileOutputStream
 */
public class CopyImageDemo02 {

	public static void main(String[] args) throws IOException {
		//test1();// 复制图片，一次读一个字节，写一个字节
		//test2();// 复制图片，一次读一个字节数组，写一个字节数组
	}

	// 复制图片，一次读一个字节，写一个字节
	public static void test1() throws IOException {
		// 创建字节输入流对象
		FileInputStream fis = new FileInputStream("c:\\宜达互联.jpg");

		// 创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("yidahulian.jpg");

		// 写出数据
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		// 释放资源
		fos.close();
		fis.close();
		
		System.out.println("图片复制好啦~~~");
	}

	// 复制图片，一次读一个字节数组，写一个字节数组
	public static void test2() throws IOException {
		// 创建字节流输入对象
		FileInputStream fis = new FileInputStream("c:\\yidahulian.jpg");

		// 创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("宜达互联.jpg");

		// 写出数据
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = fis.read(by)) != -1) {
			fos.write(by, 0, len);
		}

		// 释放资源
		fos.close();
		fis.close();
	}
}
