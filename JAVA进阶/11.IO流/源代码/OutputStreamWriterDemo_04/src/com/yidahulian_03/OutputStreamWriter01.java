package com.yidahulian_03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter的方法：
 * public void write(int c):写一个字符
 * public void write(char[] cbuf):写一个字符数组
 * public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
 * public void write(String str):写一个字符串
 * public void write(String str,int off,int len):写一个字符串的一部分
 * 
 * 面试题：close()和flush()的区别?
 * A:close()关闭流对象，但是先刷新一次缓冲区。关闭之后，流对象不可以继续再使用了。
 * B:flush()仅仅刷新缓冲区,刷新之后，流对象还可以继续使用。
 */
public class OutputStreamWriter01 {

	public static void main(String[] args) throws IOException {
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}

	public static void test1() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("c.txt"));

		// public void write(int c):写一个字符
		//osw.write(97);// 写出数据
		osw.write('a');// 写出数据
		osw.write('联');

		//osw.flush();// 刷新数据(即把字符写出到文本文件中)
		osw.close();// 释放资源(该方法首先会刷新一次数据，保证字符写出到文本文件中。然后再释放资源)

		// 如果不刷新数据，也不释放资源。即注释刷新数据与释放资源代码，会有什么结果呢？
		// 会发生数据不能写入到文件中，因为文件中数据存储的基本单位是字节。

		// 如果close()代码打开，此行代码报异常java.io.IOException: Stream closed
		//osw.write('b');

		// 但如果close()代码注释，而打开flush()代码，此行代码将继续写出到文件
		//osw.write('b');
		//osw.flush();// 刷新数据(即把字符写出到文本文件中)
	}

	public static void test2() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d.txt"));

		// void write(char[] cbuf):写一个字符数组
		char[] arr = { 'h', 'e', 'l', 'l', 'o', ',', '宜', '达', '互', '联' };
		osw.write(arr);
		//osw.flush();// 此行代码可不写，因为close方法在释放资源前，也会刷新一次。但当一次写出的数据较多时(比如：1024个时)，最好也调用一下。
		osw.close();// 释放资源
	}

	public static void test3() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e.txt"));

		// public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
		char[] arr = { 'h', 'e', 'l', 'l', 'o', ',', '宜', '达', '互', '联' };
		osw.write(arr, 6, 4);

		//osw.flush();// 此行代码可不写，因为close方法在释放资源前，也会刷新一次。但当一次写出的数据较多时，最好也调用一下。
		osw.close();// 释放资源
	}

	public static void test4() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("f.txt"));

		// public void write(String str):写一个字符串
		// String s = "hello,宜达互联。爱java,就对了";
		String s = "hello,宜达互联。\r\n爱java,就对了!";
		osw.write(s);

		osw.flush();// 此行代码可不写，因为close方法在释放资源前，也会刷新一次。但当一次写出的数据较多时，最好也调用一下。
		osw.close();// 释放资源
	}

	public static void test5() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("g.txt"));

		// public void write(String str):写一个字符串
		// String s = "hello,宜达互联科。爱java,就对了";
		String s = "hello,宜达互联。\r\n爱java,就对了!";
		osw.write(s, 6, 12);

		//osw.flush();// 此行代码可不写，因为close方法在释放资源前，也会刷新一次。但当一次写出的数据较多时，最好也调用一下。
		osw.close();// 释放资源
	}

}
