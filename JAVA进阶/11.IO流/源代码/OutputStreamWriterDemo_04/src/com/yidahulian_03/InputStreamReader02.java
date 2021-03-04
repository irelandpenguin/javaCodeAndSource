package com.yidahulian_03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader的方法：
 * int read():一次读取一个字符
 * int read(char[] chs):一次读取一个字符数组
 */
public class InputStreamReader02 {

	public static void main(String[] args) throws IOException {
		//test1();
		test2();
	}

	public static void test1() throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\com\\yidahulian_03\\InputStreamReader02.java"));

		// int read():一次读取一个字符
		int by = 0;
		while ((by = isr.read()) != -1) {
			System.out.print((char) by);
		}

		// 释放资源
		isr.close();
	}

	public static void test2() throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("C:/CopyImageDemo01.java"));

		// int read(char[] chs):一次读取一个字符数组
		int len = 0;
		char[] chs = new char[1024];
		while ((len = isr.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}

		// 释放资源
		isr.close();
	}

}
