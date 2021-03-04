package com.yidahulian_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制图片
 * 
 * 分析：
 * 		复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则用字节流。
 * 		通过该原理，我们知道我们应该采用字节流。
 * 		而字节流有4种方式，所以做这个题目我们有4种方式。推荐掌握第4种。
 * 
 * 数据源：
 * 		c:\\yidahulian.jpg -- FileInputStream -- BufferedInputStream
 * 目的地：
 * 		c:\\宜达.jpg -- FileOutputStream -- BufferedOutputStream
 */
public class CopyImage02 {

	public static void main(String[] args) throws IOException {
		String origin = "c:\\yidahulian.jpg";
		String dest = "c:\\宜达.jpg";
		test1(origin, dest);// FileInputStream 一次读取一个字节
		//test2(origin, dest);// FileInputStream 一次读取一个字节数组
		//test3(origin, dest);// BufferedInputStream 一次读取一个字节
		//test4(origin, dest);// BufferedInputStream 一次读取一个字节数组
	}

	// FileInputStream 一次读取一个字节
	public static void test1(String origin, String dest) throws IOException {
		FileInputStream fis = new FileInputStream(origin);
		FileOutputStream fos = new FileOutputStream(dest);

		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		fos.close();
		fis.close();
	}

	// FileInputStream 一次读取一个字节数组
	public static void test2(String origin, String dest) throws IOException {
		FileInputStream fis = new FileInputStream(origin);
		FileOutputStream fos = new FileOutputStream(dest);

		byte[] chs = new byte[1024];
		int len = 0;
		while ((len = fis.read(chs)) != -1) {
			fos.write(chs, 0, len);
			fos.flush();//最好刷新一下
		}

		fos.close();
		fis.close();
	}

	// BufferedInputStream 一次读取一个字节
	public static void test3(String origin, String dest) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(origin));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);
		}

		bos.close();
		bis.close();
	}

	// BufferedInputStream 一次读取一个字节数组
	public static void test4(String origin, String dest) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(origin));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

		byte[] by = new byte[1024];
		int len = 0;
		while ((len = bis.read(by)) != -1) {
			bos.write(by, 0, len);
		}

		bos.close();
		bis.close();
	}

}
