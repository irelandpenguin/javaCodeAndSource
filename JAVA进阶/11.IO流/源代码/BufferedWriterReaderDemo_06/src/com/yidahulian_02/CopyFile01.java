package com.yidahulian_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 需求：把当前项目目录下的aa.txt内容复制到当前项目目录下的bb.txt中
 * 
 * 数据源：
 * 		aa.txt -- 读取数据 -- 字符转换流 -- InputStreamReader -- FileReader -- BufferedReader
 * 目的地：
 * 		bb.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter -- FileWriter -- BufferedWriter 
 */
public class CopyFile01 {

	public static void main(String[] args) throws IOException {
		test1("aa.txt", "bb.txt");// 一次写一个字符
		//test2("aa.txt", "bb.txt");// 一次写一个字符数组
	}

	// 一次写一个字符
	public static void test1(String origin, String dest) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(origin));
		BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

		int by = 0;
		while ((by = br.read()) != -1) {
			bw.write(by);
		}

		// 释放资源
		bw.close();
		br.close();
	}

	// 一次写一个字符数组
	public static void test2(String origin, String dest) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(origin));
		BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
			bw.flush();// 刷新(每次写多个字符时，最好刷新一下。一次写一个字符，就不用刷了)
		}

		// 释放资源
		bw.close();
		br.close();
	}
}
