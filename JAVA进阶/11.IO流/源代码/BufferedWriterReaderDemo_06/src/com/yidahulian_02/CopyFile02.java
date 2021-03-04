package com.yidahulian_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 需求：把当前项目目录下的aa.txt内容复制到当前项目目录下的bb.txt中。要求：每次读一行，写一行。
 * 
 * 数据源：
 * 		aa.txt -- 读取数据 -- 字符转换流 -- BufferedReader
 * 目的地：
 * 		bb.txt -- 写出数据 -- 字符转换流 -- BufferedWriter 
 */
public class CopyFile02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("aa.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("bb.txt"));

		String s = null;
		while ((s = br.readLine()) != null) {
			bw.write(s);
			bw.newLine();// 换行，因为readLine()每次读取一行内容，但不包含行尾的换行符。所以，这里要添加换行且兼容多平台
			bw.flush();// 刷新，一行数据也有很多字符，所以，最好刷新一下。
		}

		// 释放资源
		bw.close();
		br.close();
	}
}
