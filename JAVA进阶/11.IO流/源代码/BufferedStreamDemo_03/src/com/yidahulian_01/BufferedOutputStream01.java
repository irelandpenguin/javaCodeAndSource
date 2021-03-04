package com.yidahulian_01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 通过定义数组的方式确实比以前一次读取一个字节的方式快很多，所以，看来有一个缓冲区还是非常好的。
 * 既然是这样的话，那么，java开始在设计的时候，它也考虑到了这个问题，就专门提供了带缓冲区的字节类。
 * 
 * 这种类被称为：字节缓冲区类(高效字节类)
 * 写数据：BufferedOutputStream 高效缓冲输入流
 * 读数据：BufferedInputStream 高效缓冲输出流
 * 
 * 构造方法可以指定缓冲区的大小，但是我们一般用不上，因为默认缓冲区大小就足够了。
 * 
 * 为什么不传递一个具体的文件或者文件路径，而是传递一个OutputStream对象呢?
 * 原因很简单，字节缓冲区流仅仅提供缓冲区，为高效而设计的。但是真正的读写操作还得靠基本的流对象实现。
 */
public class BufferedOutputStream01 {

	public static void main(String[] args) throws IOException {
		test1();// 创建高效字节缓冲流对象
	}

	public static void test1() throws IOException {
		// 创建高效字节缓冲输出流对象
		// FileOutputStream fis = new FileOutputStream("a.txt");
		// BufferedOutputStream bos = new BufferedOutputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a.txt"));

		// 写出数据
		bos.write("hello, 宜达互联".getBytes());

		// 刷新缓冲区(一般当一次写出很多字节时，我们才调用此刷新方法。)
		//bos.flush();

		// 释放资源(释放资源时也会刷新一次缓冲区，所以，如果写出字节很少时，就不用显示调用flush()方法，当关闭高效字节缓冲流时，也会自动刷新一次)
		bos.close();
	}
}
