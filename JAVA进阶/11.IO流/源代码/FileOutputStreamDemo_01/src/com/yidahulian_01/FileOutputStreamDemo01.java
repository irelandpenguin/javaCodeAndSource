package com.yidahulian_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IO���ķ��ࣺ
 * 		����
 * 			������	��ȡ����
 * 			�����	 д������
 * 		�������ͣ�
 * 			�ֽ���
 * 				�ֽ�������	��ȡ����	InputStream
 * 				�ֽ������	д������	OutputStream
 * 			�ַ���
 * 				�ַ�������	��ȡ����	Reader
 * 				�ַ������	д������	Writer
 * 
 * 		ע�⣺һ��������̽��IO����ʱ�����û����ȷ˵�������ַ�����˵��Ĭ��������ǰ��������������ֵġ�
 * 
 * ������Ҫ��һ���ı��ļ�������һ�仰��"hello,io"
 * 
 * ������
 * 		A:�����������ǲ����ַ��������������أ��ַ��������ֽ���֮��ų��ֵģ����ԣ��������Ƚ����ֽ�����β�����
 * 		B:��������Ҫ���ļ���дһ�仰����������Ҫ�����ֽ��������
 * 
 * ͨ������ķ���������֪��Ҫʹ�ã�OutputStream
 * ����ͨ���鿴API�����Ƿ��ָ���������һ�������࣬����ʵ������
 * ���ԣ�����Ҫ��һ����������ࡣ
 * ������Ҫ�ҵ�������ʲô���ֵ���?���ʱ�򣬺ܼ򵥣����ǻ���һ�£������ǲ���Ҫ���ļ���д������
 * �ļ����ĸ����ʣ�File
 * Ȼ���õ����ֽ�����������������ǣ�FileOutputStream
 * ע�⣺ÿ�ֻ�������඼���Ը�������Ϊ��׺����
 * 		XxxOutputStream
 * 		XxxInputStream
 * 		XxxReader
 * 		XxxWriter
 * �鿴FileOutputStream�Ĺ��췽����
 * 		FileOutputStream(File file) 
 *		FileOutputStream(String name)
 *
 * �ֽ�������������裺
 * 		A:�����ֽ����������
 * 		B:д����
 * 		C:�ͷ���Դ
 */
public class FileOutputStreamDemo01 {

	public static void main(String[] args) throws IOException {
		test1();
		//test2();
		//test3();
	}

	// ��׼��(��̫�鷳�ˣ�ÿдһ����������Ҫ���try...catch)
	public static void test1() {
		// FileOutputStream(File file)
		File file = new File("C:\\aa.txt");
		
		//�����ļ����������
		FileOutputStream fos = null;
		
		try {
			//A:�����ֽ����������
			//�ļ���������췽�����ܣ�1.����һ���ļ�;2.������������ļ�;3.����һ���ļ����������
			fos = new FileOutputStream(file);
			try {
				//B:д����
				fos.write("hello,io".getBytes());//getBytes()��String��ķ����������ǰ��ַ���ת���ֽ�����
				System.out.println("д����");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			//C:�ͷ���Դ
			try {
				if (fos != null) {
					//close()�����Ĺ��ܣ�1.�ر�������;2.�ͷ�ϵͳ��Դ��
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// �򻯰�
	public static void test2() throws IOException {
		// FileOutputStream(File file)
		//�����ļ����������
		File file = new File("b.txt");
		FileOutputStream fos = new FileOutputStream(file);
		// д����
		fos.write("hello,io".getBytes());

		// �ͷ���Դ
		fos.close();
	}

	public static void test3() throws IOException {
		FileOutputStream fos = new FileOutputStream("c.txt");
		fos.write("hello,io".getBytes());
		//fos.write("java".getBytes());
		fos.close();

		// java.io.IOException: Stream Closed
		//fos.write("java".getBytes());
	}
}
