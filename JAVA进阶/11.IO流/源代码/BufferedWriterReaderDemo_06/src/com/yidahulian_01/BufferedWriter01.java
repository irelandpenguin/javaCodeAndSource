package com.yidahulian_01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 快速复习前面知识点：
 * 1. 字节流
 * 		FileInputStream:字节输入流，用来读取字节文件的。比如：音频，视频等。
 * 		FileOutputStream:字节输出流，用来写入字节文件的。比如：写入音频，视频等。
 * 2. 高效字节流
 * 		BufferedInputStream:高效字节输入流，用来读取字节文件的。比如：音频，视频等。
 * 		BufferedOutputStream:高效字节输出流，用来写入字节文件的。比如：写入音频，视频等。
 * 3. 转换流
 * 		InputStreamReader:输入转换流，用来把字节流转成字符流的。
 * 		OutputStreamWriter:输出转换流，用来把字符流转成字节流的。
 * 
 * 	   字符流 = 字节流+编码表(GBK,UTF-8,Unicode,ISO-8859-1等)。
 * 
 * 4. 字符流
 * 		FileReader:字符输入流，用来读取字符文件的。比如：文本文件，world文档，java文件等。
 * 		FileWriter:字符输出流，用来写入字符文件的。比如：文本文件，world文档，java文件等。
 * 5. 高效字符流
 * 		BufferedWriter:字符缓冲输出流
 *		BufferedReader:字符缓冲输入流
 * 
 * 字符流为了高效读写，也提供了对应的字符缓冲流。
 * BufferedWriter:字符缓冲输出流
 * BufferedReader:字符缓冲输入流
 * 
 * BufferedWriter:字符缓冲输出流
 * 将文本写入字符输出流，缓冲各个字符，从而提供单个字符、字符数组和字符串的高效写入。 
 * 可以指定缓冲区的大小，或者接受默认的大小。在大多数情况下，默认值就足够大了。 
 */
public class BufferedWriter01 {

	public static void main(String[] args) throws IOException {
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}

	public static void test1() throws IOException {
		// FileWriter fw = new FileWriter("a.txt");
		// BufferedWriter bw = new BufferedWriter(fw);
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

		// 一次写一个字符
		bw.write(97);
		bw.write('b');
		bw.write('\r');
		bw.write('\n');
		bw.write('c');

		// bw.flush();// 刷新缓冲区，把字符输出到a.txt文件中
		bw.close();// 释放资资(释放资源前，会优先刷新一次，把缓冲区里的字符输出到a.txt文件中)
	}

	public static void test2() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

		// 一次写一个字符数组
		char[] chs = { 'h', 'e', 'l', 'l', 'o', ',', '宜', '达', '互', '联' };
		bw.write(chs);

		//bw.flush();// 刷新缓冲区，把字符输出到b.txt文件中
		bw.close();// 释放资资(释放资源前，会优先刷新一次，把缓冲区里的字符输出到b.txt文件中)
	}

	public static void test3() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));

		// 一次写一个字符数组的一部分
		char[] chs = { 'h', 'e', 'l', 'l', 'o', ',', '宜', '达', '互', '联' };
		bw.write(chs, 6, 4);

		bw.flush();// 刷新缓冲区，把字符输出到c.txt文件中
		bw.close();// 释放资资(释放资源前，会优先刷新一次，把缓冲区里的字符输出到c.txt文件中)
	}

	public static void test4() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("d.txt"));

		// 一次写一个字符串
		String s = "hello,宜达互联";
		bw.write(s);
		String s2 = "\r\n你好,Java。\r\n欢迎进入Java的世界!";
		bw.write(s2);

		bw.flush();// 刷新缓冲区，把字符输出到d.txt文件中
		bw.close();// 释放资资(释放资源前，会优先刷新一次，把缓冲区里的字符输出到d.txt文件中)
	}

	public static void test5() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("e.txt"));

		// 一次写一个字符串
		String s = "hello,宜达互联";
		bw.write(s, 6, 2);

		//bw.flush();// 刷新缓冲区，把字符输出到e.txt文件中
		bw.close();// 释放资资(释放资源前，会优先刷新一次，把缓冲区里的字符输出到e.txt文件中)
	}

}
