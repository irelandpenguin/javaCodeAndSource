package com.yidahulian_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 需求：把当前项目目录下的aa.txt内容复制到当前项目目录下的bb.txt中
 * 
 * 数据源：
 * 		aa.txt -- 读取数据 -- 字符转换流 -- InputStreamReader
 * 目的地：
 * 		bb.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter
 */
public class CopyFileDemo01 {
	public static void main(String[] args) throws IOException {
		//test1();// 一次读一个字符，写一个字符
		//test2();// 一次读一个字符数组，写一个字符数组
		//test3();//读mp4，发现不可以。因为mp4是字节流，使用字符流读取时，文件不能正常播放！
	}

	// 一次读一个字符，写一个字符
	public static void test1() throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("aa.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("bb.txt"));

		// 一次读一个字符，写一个字符
		int by = 0;
		while ((by = isr.read()) != -1) {
			osw.write(by);
		}

		osw.close();// 释放资源
		isr.close();// 释放资源
	}

	// 一次读一个字符数组，写一个字符数组
	public static void test2() throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("aaa.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("bbb.txt"));

		// 一次读一个字符数组，写一个字符数组
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			osw.write(chs, 0, len);
			osw.flush();
		}

		osw.close();// 释放资源
		isr.close();// 释放资源
	}
	
	//读mp4，发现不可以。因为mp4是字节流，使用字符流读取时，文件不能正常播放！
	public static void test3() throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("c:\\大片视频.MP4"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("movies.MP4"));
		
		// 一次读一个字符数组，写一个字符数组
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			osw.write(chs, 0, len);
			osw.flush();
		}
		
		osw.close();// 释放资源
		isr.close();// 释放资源
	}
	
	
}
