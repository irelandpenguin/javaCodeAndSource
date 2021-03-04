package com.yidahulian_01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 字节输出流操作步骤：
 * A:创建字节输出流对象
 * B:调用write()方法
 * C:释放资源(一定要释放！！！)
 * 
 * public void write(int b):写一个字节
 * public void write(byte[] b):写一个字节数组
 * public void write(byte[] b,int off,int len):写一个字节数组的一部分
 */
public class FileOutputStreamDemo02 {

	public static void main(String[] args) throws IOException {
		// 创建字节输出流对象
		OutputStream fos = new FileOutputStream("aa.txt");//多态
		//FileOutputStream fos = new FileOutputStream("aa.txt");

		// public void write(int b):写一个字节
		//fos.write('9');
		//fos.write('7');
		//fos.write(97);// 97对应的ASCII码为字符a
		//fos.write('A');
		//fos.write('b');
		//fos.write(57);// 9的ASCII码为57
		//fos.write(55);// 7的ASCII码为55
		//fos.write('林');// 汉字就不行，因为一个汉字占2个字节，而write方法一次只能写一个字节

		// public void write(byte[] b):写一个字节数组
		//byte[] bys = { 97, 98, 99, 100, 101 };
		byte[] bys = { 'A', 'B', 'C', 'D', 'E' };
		//fos.write(bys);

		// public void write(byte[] b,int off,int len):写一个字节数组的一部分
		fos.write(bys, 2, 3);

		fos.close();// 释放资源
	}

}
