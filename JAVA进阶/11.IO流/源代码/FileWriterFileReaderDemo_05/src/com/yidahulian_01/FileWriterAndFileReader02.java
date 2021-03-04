package com.yidahulian_01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 由于我们常见的操作都是使用本地默认编码GBK，所以，不用指定编码。
 * 而转换流的名称有点长，所以，Java就提供了其子类供我们使用。  
 * FileWriter 用于写入字符流。
 * FileReader 用于读取字符流。
 * 
 * 需求：把当前项目目录下的cc.txt内容复制到当前项目目录下的dd.txt中
 * 
 * 数据源：
 * 		cc.txt -- 读取数据  -- FileReader
 * 目的地：
 * 		dd.txt -- 写出数据 -- FileWriter
 */
public class FileWriterAndFileReader02 {

	public static void main(String[] args) throws IOException {
		//test1();// 一次读一个字符，写一个字符
		test2();// 一次读一个字符数组，写一个字符数组
	}

	// 一次读一个字符，写一个字符
	public static void test1() throws IOException {
		//FileReader fr = new FileReader("cc.txt");
		FileReader fr = new FileReader(new File("cc.txt"));
		//FileWriter fw = new FileWriter("dd.txt");
		FileWriter fw = new FileWriter(new File("dd.txt"));

		// 一次读一个字符，写一个字符
		int by = 0;
		while ((by = fr.read()) != -1) {
			fw.write(by);
		}

		fw.close();// 释放资源
		fr.close();// 释放资源
	}

	// 一次读一个字符数组，写一个字符数组
	public static void test2() throws IOException {
		FileReader fr = new FileReader("c:/CopyImage01.java");
		FileWriter fw = new FileWriter("c:\\复制图片.java");

		// 一次读一个字符数组，写一个字符数组
		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}

		fw.close();// 释放资源
		fr.close();// 释放资源
	}

}
