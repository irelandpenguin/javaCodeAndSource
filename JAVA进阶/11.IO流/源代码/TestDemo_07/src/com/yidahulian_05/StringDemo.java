package com.yidahulian_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * 已知s.txt文件中有这样的一个字符串："hcexfgijkamdnoqrzstuvwybpl"
 * 请编写程序读取数据内容，把数据从小到大排序后写入ss.txt中。
 * 
 * 分析：
 * 		A:把s.txt这个文件给做出来
 * 		B:读取该文件的内容，存储到一个字符串中
 * 		C:把字符串转换为字符数组
 * 		D:对字符数组进行排序
 * 		E:把排序后的字符数组转换为字符串
 * 		F:把字符串再次写入ss.txt中
 */
public class StringDemo {

	public static void main(String[] args) throws IOException {
		// 读取该文件的内容，存储到一个字符串中
		BufferedReader br = new BufferedReader(new FileReader("s.txt"));
		String str = br.readLine();
		br.close();// 释放资源

		// 把字符串转换为字符数组
		char[] arr = str.toCharArray();

		// 对字符数组进行排序
		Arrays.sort(arr);//从小到大排序

		// 把排序后的字符数组转换为字符串
		String newStr = new String(arr);

		// 把字符串再次写入ss.txt中
		BufferedWriter bw = new BufferedWriter(new FileWriter("ss.txt"));
		bw.write(newStr);
		bw.flush();// 刷新
		bw.close();// 释放资源
	}

}
