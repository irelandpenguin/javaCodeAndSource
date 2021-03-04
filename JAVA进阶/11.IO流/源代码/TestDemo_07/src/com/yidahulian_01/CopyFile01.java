package com.yidahulian_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 复制文本文件
 * 
 * 分析：
 * 		复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则用字节流。
 * 		通过该原理，我们知道我们应该采用字符流更方便一些。
 * 		而字符流有5种方式，所以做这个题目我们有5种方式。推荐掌握第5种。
 * 数据源：
 * 		c:\\CopyImage01.java  -- -- FileReader -- BufferdReader
 * 目的地：
 * 		c:\\CopyMyImage.java -- FileWriter -- BufferedWriter
 */
public class CopyFile01 {

	public static void main(String[] args) throws IOException {
		//test1();// FileReader 一次读一个字符
		//test2();// FileReader 一次读一个字符数组
		//test3();// BufferdReader 一次读一个字符
		//test4();// BufferdReader 一次读一个字符数组
		test5();// BufferdReader 一次读一行
	}

	// FileReader 一次读一个字符
	public static void test1() throws IOException {
		FileReader fr = new FileReader("c:\\CopyImage01.java");
		FileWriter fw = new FileWriter("c:\\CopyMyImage.java");
		int by = 0;
		while ((by = fr.read()) != -1) {
			fw.write(by);
		}

		fw.close();
		fr.close();
	}

	// FileReader 一次读一个字符数组
	public static void test2() throws IOException {
		FileReader fr = new FileReader("c:\\CopyImage01.java");
		FileWriter fw = new FileWriter("c:\\CopyMyImage.java");

		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
			fw.flush();// 一次写多个字符，最好刷新一下
		}

		fw.close();
		fr.close();

	}

	// BufferdReader 一次读一个字符
	public static void test3() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:\\CopyImage01.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\CopyMyImage.java"));

		int by = 0;
		while ((by = br.read()) != -1) {
			bw.write(by);
		}

		bw.close();
		br.close();
	}

	// BufferdReader 一次读一个字符数组
	public static void test4() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:\\CopyImage01.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\CopyMyImage.java"));

		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
			bw.flush();// 一次写出多个字符时，最好刷新一下
		}

		bw.close();
		br.close();
	}

	// BufferdReader 一次读一行
	public static void test5() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:\\CopyImage01.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\CopyMyImage.java"));

		String s = null;
		while ((s = br.readLine()) != null) {
			bw.write(s);
			bw.newLine();// 换一行
			bw.flush(); // 一次写出多个字符时，最好刷新一下
		}

		bw.close();
		br.close();
	}
}
