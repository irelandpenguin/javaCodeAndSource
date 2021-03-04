package com.yidahulian_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader
 * 从字符输入流中读取文本，缓冲各个字符，从而实现字符、字符数组、字符串和行的高效读取。 
 * 可以指定缓冲区的大小，或者可使用默认的大小。大多数情况下，默认值就足够大了。 
 * 
 * BufferedReader(Reader in)
 */
public class BufferedReader02 {

	public static void main(String[] args) throws IOException {
		//test1();// 一次读一个字符
		test2();// 一次读一个字符数组
	}

	// 一次读一个字符
	public static void test1() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:/复制图片.java"));

		int by = 0;
		while ((by = br.read()) != -1) {
			System.out.print((char) by);
		}

		br.close();// 释放资源
	}

	// 一次读一个字符数组
	public static void test2() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:\\复制图片.java"));

		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}

		// 释放资源
		br.close();
	}

}
