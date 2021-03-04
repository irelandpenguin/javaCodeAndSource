package com.yidahulian_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制文本文件。
 * 
 * 数据源：从哪里来
 * aa.txt	--	读取数据	--	FileInputStream	
 * 
 * 目的地：到哪里去
 * bb.txt	--	写数据     	--	FileOutputStream
 */
public class CopyTxtDemo01 {

	public static void main(String[] args) throws IOException {
		//test1();// 复制文本文件，一次读一个，写一个
		//test2();// 复制文本文件，一次读一个字节数组，写一个字节数组
		test3();// 需求：把c:\\aa.txt，复制到c:\\bb.txt
	}

	// 复制文本文件，一次读一个，写一个
	public static void test1() throws IOException {
		// 创建字节输入流对象
		FileInputStream fis = new FileInputStream("aa.txt");
		// 注意：aa.txt还没创建，直接运行会报异常。
		// java.io.FileNotFoundException: aa.txt (系统找不到指定的文件。)
		// 所以，要提前手工创建(或代码创建)一个aa.txt文件。

		// 创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("bb.txt");
		// bb.txt没创建，为啥不报异常呢？
		// 原因是系统创建字节输出流时，会自动先创建文件，然后再创建输出流对象，最后把创建的输出流对象绑定该文件。
		// 这个我们讲解IO流第一个知识点时，就已经讲过了。这里再复习下。

		// 写数据(每次读一个，写一个)
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		// 释放资源(先释放谁都一样的)
		fos.close();
		fis.close();

		// 小结：
		// 这一次复制的中文没有出现任何问题，为什么呢?
		// 上一次我们出现问题的原因在于我们每次获取到一个字节数据，就把该字节数据强制转换为字符，然后输出到控制台，出现乱码。
		// 或者是每次读一个字节数组，刚好读到中文的一半时，输出到控制台，出现乱码。
		// 而这一次呢? 我们确实通过IO流读取数据，写到文本文件，你读取一个字节，我就写入一个字节，期间没有做任何的转换。系统自动转换。
		// 系统自动转换规则：当读取的ASCII码值为正值，则直接写到文本文件；当读取的ASCII码值为负值(说明是汉字的一半)也写到文件，
		// 但紧接着下次再写字节到文件时，会优先自动合并负数的后一个字节，转换成汉字保存。
	}

	// 复制文本文件，一次读一个字节数组，写一个字节数组
	public static void test2() throws IOException {
		// 创建字节输入流对象
		FileInputStream fis = new FileInputStream("aa.txt");

		// 创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("bb.txt");

		byte[] by = new byte[1024];
		int len = 0;
		while ((len = fis.read(by)) != -1) {// 一次读一个字节数组
			fos.write(by, 0, len);// 一次写一个字节数组 
		}

		// 释放资源
		fos.close();
		fis.close();

		// 小结：
		// 这一次复制的中文没有出现任何问题，为什么呢?
		// 我们确实通过IO流读取数据，写到文本文件，你读取一个字节数组，我就写入一个字节数组，期间没有做任何的转换。系统自动转换。
		// 系统自动转换规则：当读取的ASCII码值为正值，则直接写到文本文件；当读取的ASCII码值为负值(说明是汉字的一半)也写到文件，
		// 但紧接着下次再写字节数组到文件时，会优先自动合并负数的后一个字节，转换成汉字保存。

		// 总结：说白了，不管是一次写一个字节，还是一次写一个字节数组，输出到文件不会有任何乱码问题。而输出到控制台就可能出现乱码。
		// 因为输出到文件时系统会自动转换；输出到控制台，系统不转换。
	}

	// 需求：把c:\\aa.txt，复制到c:\\bb.txt
	public static void test3() throws IOException {
		// 创建字节输入流对象
		FileInputStream fis = new FileInputStream("C:\\aa.txt");

		// 创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("c:\\bb.txt");

		// 写出数据
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = fis.read(by)) != -1) {
			fos.write(by, 0, len);
		}

		// 释放资源
		fos.close();
		fis.close();
	}

}
