package com.yidahulian_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把C:\\歌曲清单\\一生所爱_卢冠昔.mp3 复制到当前项目目录下的 一生所爱_卢冠昔.mp3 中 
 * 数据源：
 * 		C:\\歌曲清单\\一生所爱_卢冠昔.mp3  --  读取数据  --  FileInputStream
 * 目的地：
 * 		一生所爱_卢冠昔.mp3  --  写出数据  --  FileOutputStream
 */
public class CopyMp3Demo03 {

	public static void main(String[] args) throws IOException {
		//test1();// 复制mp3，一个读一个字节，写一个字节
		test2();// 复制mp3，一个读一个字节数组，写一个字节数组
	}

	// 复制mp3，一个读一个字节，写一个字节
	public static void test1() throws IOException {
		// 创建字节输入流对象
		FileInputStream fis = new FileInputStream("C:\\歌曲清单\\一生所爱_卢冠昔.mp3");

		// 创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("一生所爱_卢冠昔.mp3");

		// 写出数据
		int by = 0;
		while ((by = fis.read()) != -1) {// 一次读一个字节
			fos.write(by);// 一次写一个字节
		}

		// 释放资源
		fos.close();
		fis.close();
		
		System.out.println("mp3复制完了~~~");
	}

	// 复制mp3，一个读一个字节数组，写一个字节数组
	public static void test2() throws IOException {
		// 创建字节输入流对象
		FileInputStream fis = new FileInputStream("C:\\歌曲清单\\筷子兄弟\\小苹果_筷子兄弟.mp3");

		// 创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("小苹果_筷子兄弟.mp3");

		// 写出数据
		int len = 0;
		byte[] by = new byte[1024];
		while ((len = fis.read(by)) != -1) {// 一次读一个字节数组
			fos.write(by, 0, len);// 一次写一个字节数组
		}

		// 释放资源
		fos.close();
		fis.close();
		
		System.out.println("mp3复制完了~~~");
	}
}
