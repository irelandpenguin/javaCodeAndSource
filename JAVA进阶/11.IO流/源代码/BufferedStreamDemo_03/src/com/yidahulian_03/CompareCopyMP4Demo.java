package com.yidahulian_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 对比基本输入流与高效字节缓冲流读取数据效率。看看谁更快?
 * 
 * 基本输入流，一次读一个字节，写一个字节。共耗时:42717毫秒
 * 基本输入流，一次读一个字节数组，写一个字节数组。共耗时:92毫秒
 * 高效字节缓冲流，一次读一个字节，写一个字节。共耗时:737毫秒
 * 高效字节缓冲流，一次读一个字节数组，写一个字节数组。共耗时:46毫秒
 * 
 * 通过比较：高效字节缓冲流是最快的！
 */
public class CompareCopyMP4Demo {

	public static void main(String[] args) throws IOException {
		// 创建字节输入流对象，字节输出流对象
		FileInputStream fis = new FileInputStream("大片视频.MP4");
		FileOutputStream fos = new FileOutputStream("c:\\宜达互联.MP4");
		
		long begin = System.currentTimeMillis();// 开始时间
		//test1(fis, fos);// 基本输入流，一次读一个字节，写一个字节
		//test2(fis, fos);// 基本输入流，一次读一个字节数组，写一个字节数组
		//test3(fis, fos);// 高效字节缓冲流，一次读一个字节，写一个字节
		test4(fis, fos);// 高效字节缓冲流，一次读一个字节数组，写一个字节数组
		long end = System.currentTimeMillis();// 结束时间
		System.out.println("共耗时:" + (end - begin) + "毫秒");

		// 释放资源
		fos.close();
		fis.close();
	}

	// 基本输入流，一次读一个字节，写一个字节
	public static void test1(FileInputStream fis, FileOutputStream fos)
			throws IOException {
		// 写出数据
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}
	}

	// 基本输入流，一次读一个字节数组，写一个字节数组
	public static void test2(FileInputStream fis, FileOutputStream fos)
			throws IOException {
		// 写出数据
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = fis.read(by)) != -1) {
			fos.write(by, 0, len);
		}
	}

	// 高效字节缓冲流，一次读一个字节，写一个字节
	public static void test3(FileInputStream fis, FileOutputStream fos)
			throws IOException {
		// 创建高效字节缓冲输入流对象
		BufferedInputStream bis = new BufferedInputStream(fis);
		// 创建高效字节缓冲输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		// 写出数据
		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);
		}

		// 释放资源
		bos.close();
		bis.close();
	}

	// 高效字节缓冲流，一次读一个字节数组，写一个字节数组
	public static void test4(FileInputStream fis, FileOutputStream fos)
			throws IOException {
		// 创建高效字节缓冲输入流对象
		BufferedInputStream bis = new BufferedInputStream(fis);
		// 创建高效字节缓冲输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(fos);

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
