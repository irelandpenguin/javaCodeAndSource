package com.yidahulian_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 需求：把ArrayList集合中的字符串数据存储到文本文件
 * 
 * 分析：
 * 		通过题目的意思我们可以知道如下的一些内容，
 * 			ArrayList集合里存储的是字符串。
 * 			遍历ArrayList集合，把数据获取到。
 * 			然后存储到文本文件中。
 * 			文本文件说明使用字符流。
 * 
 * 数据源：
 * 		ArrayList<String> -- 遍历得到每一个字符串数据
 * 目的地：
 * 		a.txt -- FileWriter -- BufferedWriter
 */
public class ArrayListToFile01 {

	public static void main(String[] args) throws IOException {
		// 创建集合并添加元素
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("宜达互联");
		list.add("java");

		// 创建文件，然后把集合里的元素写入到文件中
		//test1(list, "a.txt");// 方式一：FileWriter写入
		test2(list, "b.txt");// 方式二： BufferedWriter写入(推荐！)
	}

	// 方式一： FileWriter写入
	public static void test1(ArrayList<String> list, String dest)
			throws IOException {
		FileWriter fw = new FileWriter(dest);
		for (String s : list) {
			fw.write(s);
			fw.write("\r\n");
		}
		fw.close();
	}

	// 方式二： BufferedWriter写入
	public static void test2(ArrayList<String> list, String dest)
			throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
		for (String s : list) {
			bw.write(s);
			bw.newLine();//这里的换行自动兼容不同平台
			bw.flush();
		}

		bw.close();
	}
}
