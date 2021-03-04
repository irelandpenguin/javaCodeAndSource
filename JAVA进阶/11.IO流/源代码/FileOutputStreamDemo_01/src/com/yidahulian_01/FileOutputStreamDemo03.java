package com.yidahulian_01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 如何实现数据的换行?
 * 		为什么现在没有换行呢?因为我们并没有写入换行符号。
 * 		如何实现呢?写入换行符号即可呗。
 * 
 * 		刚才我们看到了有写文本文件打开是可以的，通过windows自带的那个不行，为什么呢?
 * 		因为不同的系统，换行符号是不一样的?
 * 		windows:\r\n
 * 		linux:\n
 * 		Mac:\r
 * 		而一些常见的个高级记事本，是可以识别任意换行符号的。
 * 
 * 如何实现数据的追加写入?
 * 		用构造方法带第二个参数是true的情况即可
 */
public class FileOutputStreamDemo03 {
	public static void main(String[] args) throws IOException {
		//test1();//换行符的使用
		test2();// 此方法连续运行2次或多次，看结果有什么不同。
	}

	public static void test1() throws IOException {
		// 创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("bb.txt");

		// 写数据
		for (int i = 0; i < 10; i++) {
			fos.write(("java" + i).getBytes());
			//fos.write("\n".getBytes());//换行,使用这种换行符,eclipse和notepad++都能正常换行，但windows自带记事本就不行。
			fos.write("\r\n".getBytes());// windows里的换行符，此时windows的记事本也能换行了
		}

		// 释放资源
		fos.close();
	}

	public static void test2() throws IOException {
		// public FileOutputStream(String name) 每次从文件头写入
		/*FileOutputStream fos = new FileOutputStream("cc.txt");
		fos.write("hello,java".getBytes());
		fos.close();*/

		// public FileOutputStream(String name, boolean append) //true表示每次从文件尾写入，false表示每次从文件头写入。
		//FileOutputStream fos2 = new FileOutputStream("dd.txt", true);
		//public FileOutputStream(File file, boolean append) //true表示每次从文件尾写入，false表示每次从文件头写入。
		FileOutputStream fos2 = new FileOutputStream(new File("dd.txt"), true);
		fos2.write("hello,java".getBytes());
		fos2.close();
	}
}
