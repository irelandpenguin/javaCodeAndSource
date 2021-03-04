package com.yidahulian_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符缓冲流的特殊方法：
 * BufferedWriter:
 * 		public void newLine():根据系统来决定换行符
 * BufferedReader:
 * 		public String readLine()：一次读取一行数据
 * 		包含该行内容的字符串，但不包含任何行终止符，如果已到达流末尾，则返回 null
 * 
 * 字符缓冲流的newLine()和 readLine()也是以后读写字符数据时，使用最多的！
 */
public class BufferedLine03 {

	public static void main(String[] args) throws IOException {
		//test1();
		//test2();
		test3();// 最终版代码
	}

	public static void test1() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("aa.txt"));

		for (int i = 1; i <= 10; i++) {
			bw.write("hello" + i);
			// 系统换行(注意：这里的系统是指windows系列的系统。但mac系统换行符是\r，linux系统的换行就不是\n，所以，不能对平台兼容)
			//bw.write("\r\n");

			// public void newLine():根据系统来决定换行符，达到平台兼容
			bw.newLine();// 该方法会自动根据系统来决定换行符，达到平台兼容

			//bw.flush();// 刷新缓冲区
		}

		bw.close();// 释放资源
	}

	public static void test2() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("bb.txt"));
		// public String readLine()：一次读取一行数据
		// 包含该行内容的字符串，但不包含换行符和终止符，如果已到达流末尾，则返回 null

		// 读取第一行内容
		String s = br.readLine();
		//System.out.print(s);
		System.out.println(s);// 因为readLine()方法每次读取一行，但不包含换行符。所以，要用println进行输出

		// 读取第二行内容
		s = br.readLine();
		//System.out.print(s);
		System.out.println(s);

		// 读取第三行内容
		s = br.readLine();
		//System.out.print(s);
		System.out.println(s);

		// 读取第四行内容
		s = br.readLine();
		//System.out.print(s);
		System.out.println(s);

		// 读取第五行内容
		s = br.readLine();
		//System.out.print(s);
		System.out.println(s);
		
		// 读取第六行内容
		s = br.readLine();// 读到文件末尾时，返回null
		//System.out.print(s);
		System.out.println(s);

		br.close();// 释放资源
	}

	public static void test3() throws IOException {
		//BufferedReader br = new BufferedReader(new FileReader("bb.txt"));
		BufferedReader br = new BufferedReader(new FileReader("src\\com\\yidahulian_01\\BufferedLine03.java"));

		// public String readLine()：一次读取一行数据
		// 包含该行内容的字符串，但不包含任何行终止符，如果已到达流末尾，则返回 null
		String s = null;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}

		br.close();// 释放资源
	}

}
