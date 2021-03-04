package com.yidahulian_02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把当前项目里的yidahulian.jpg复制到c:\\宜达.jpg中。
 * 
 * 分析：
 * 	数据源：yidahulian.jpg -- 字节输入流 -- BufferedInputStream
 *  目的地：宜达.jpg --  字节输出流 -- BufferedOutputStream
 */

public class CopyImageDemo01 {

	public static void main(String[] args) throws IOException {
		//test1();// //复制图片，一次读一个字节，写一个字节
		test2();// 复制图片，一次读一个字节数组，写一个字节数组
	}

	// 复制图片，一次读一个字节，写一个字节
	public static void test1() throws IOException {
		/*// 创建高效字节缓冲输入流对象
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("yidahulian.jpg"));
		// 创建高效字节缓冲输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\宜达.jpg"));*/
		
		// 创建高效字节缓冲输入流对象
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\com\\yidahulian_02\\CopyImageDemo01.java"));
		// 创建高效字节缓冲输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\CopyImageDemo01.java"));

		// 写出数据
		int by = 0;
		while ((by = bis.read()) != -1) {// 一次读一个字节
			bos.write(by);// 一次写一个字节
		}

		// 释放资源
		bos.close();
		bis.close();
	}

	// 复制图片，一次读一个字节数组，写一个字节数组
	public static void test2() throws IOException {
		/*// 创建高效输入流对象
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("yidahulian.jpg"));
		// 创建高效输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\hello.jpg"));*/
		
		// 创建高效字节缓冲输入流对象
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\com\\yidahulian_02\\CopyImageDemo01.java"));
		// 创建高效字节缓冲输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\CopyImage01.java"));

		// 写出数据
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = bis.read(by)) != -1) {
			bos.write(by, 0, len);
		}

		// 释放资源
		bos.close();
		bis.close();
	}

}
