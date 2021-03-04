package com.yidahulian_01;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节输入流操作步骤：
 * A:创建字节输入流对象
 * B:调用read()方法读取数据，并把数据显示在控制台
 * C:释放资源
 * 
 * 读取数据的方式：
 * A:int read():一次读取一个字节
 * B:int read(byte[] b):一次读取一个字节数组
 */
public class FileInputStream01 {

	public static void main(String[] args) throws IOException {
		//test1();
		test2();
	}

	public static void test1() throws IOException {
		// 创建字节输入流对象
		// FileInputStream(String name)
		// InputStream fis = new FileInputStream("a.txt");// 多态
		FileInputStream fis = new FileInputStream("a.txt");// a.txt里的内容为abc

		// 第一次读取
		 /*int by = fis.read();
		 System.out.println(by);// 97
		 System.out.println((char) by);// a
		
		 // 第二次读取
		 by = fis.read();
		 System.out.println(by);// 98
		 System.out.println((char) by);// b
		
		 // 第三次读取
		 by = fis.read();
		 System.out.println(by);// 99
		 System.out.println((char) by);// c
		
		 // 第四次读取
		 by = fis.read();
		 System.out.println(by);// -1
		
		 // 第五次读取
		 by = fis.read();
		 System.out.println(by);// -1
		  */
		
		// 通过测试，我们知道如果你读取的数据是-1，就说明已经读取到文件的末尾了
		// 用循环改进
		/* int by = fis.read();
		 while (by != -1) {
			 System.out.print((char) by);// print表示打印，但不换行
			 by = fis.read();
		 }*/

		// 最终版
		int by = 0;
		while ((by = fis.read()) != -1) {// 读取，赋值，判断。一行代码搞定
			System.out.print((char) by);
		}

		fis.close();// 释放资源
	}

	public static void test2() throws IOException {
		// 这次我们读一个大点的文件，看下效果如何？

		// 创建字节输入流对象
		//FileInputStream fis = new FileInputStream(new File("src/com/yidahulian_01/FileInputStream01.java"));
		FileInputStream fis = new FileInputStream("C:\\歌曲清单\\一生所爱_卢冠昔.mp3");
		int by = 0;
		while ((by = fis.read()) != -1) {
			System.out.print((char) by);
		}
		fis.close();// 释放资源

		// 最后我们发现，除了中文有问题以外，其它都正确。
		// 那中文为什么有问题呢？
		// 原因是一个中文占两个字节，但fis.read()一次只读一个字节，当读到中文时，实际上只读了一半，所以，就变成乱码了。
		// 后面，我们会针对中文字符有专门的处理方式。
	}
}
