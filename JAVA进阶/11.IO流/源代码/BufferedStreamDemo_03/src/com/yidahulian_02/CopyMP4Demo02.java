package com.yidahulian_02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把当前项目里的 大片视频.MP4 复制到 C:\\宜达视频.MP4。
 * 
 * 分析：
 * 	数据源：大片视频.MP4 -- 字节输入流 -- BufferedInputStream
 *  目的地：C:\\宜达视频.MP4 --  字节输出流 -- BufferedOutputStream
 */
public class CopyMP4Demo02 {

	public static void main(String[] args) throws IOException {
		//test1();// //复制视频，一次读一个字节，写一个字节
		test2();// 复制视频，一次读一个字节数组，写一个字节数组
	}

	// 复制视频，一次读一个字节，写一个字节
	public static void test1() throws IOException {
		// 创建高效字节缓冲输入流对象
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("大片视频.MP4"));
		// 创建高效字节缓冲输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\宜达视频.MP4"));

		// 写出数据
		int by = 0;
		while ((by = bis.read()) != -1) {// 一次读一个字节
			bos.write(by);// 一次写一个字节
		}

		// 释放资源
		bos.close();
		bis.close();
		
		System.out.println("视频复制完了~~~");
	}

	// 复制视频，一次读一个字节数组，写一个字节数组
	public static void test2() throws IOException {
		// 创建高效输入流对象
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("大片视频.MP4"));
		// 创建高效输出流对象
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\宜达视频.MP4"));

		// 写出数据
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = bis.read(by)) != -1) {
			bos.write(by, 0, len);
		}

		// 释放资源
		bos.close();
		bis.close();
		
		System.out.println("视频复制完了~~~");
	}

}
