package com.yidahulian_02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺰ѵ�ǰ��Ŀ���yidahulian.jpg���Ƶ�c:\\�˴�.jpg�С�
 * 
 * ������
 * 	����Դ��yidahulian.jpg -- �ֽ������� -- BufferedInputStream
 *  Ŀ�ĵأ��˴�.jpg --  �ֽ������ -- BufferedOutputStream
 */

public class CopyImageDemo01 {

	public static void main(String[] args) throws IOException {
		//test1();// //����ͼƬ��һ�ζ�һ���ֽڣ�дһ���ֽ�
		test2();// ����ͼƬ��һ�ζ�һ���ֽ����飬дһ���ֽ�����
	}

	// ����ͼƬ��һ�ζ�һ���ֽڣ�дһ���ֽ�
	public static void test1() throws IOException {
		/*// ������Ч�ֽڻ�������������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("yidahulian.jpg"));
		// ������Ч�ֽڻ������������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\�˴�.jpg"));*/
		
		// ������Ч�ֽڻ�������������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\com\\yidahulian_02\\CopyImageDemo01.java"));
		// ������Ч�ֽڻ������������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\CopyImageDemo01.java"));

		// д������
		int by = 0;
		while ((by = bis.read()) != -1) {// һ�ζ�һ���ֽ�
			bos.write(by);// һ��дһ���ֽ�
		}

		// �ͷ���Դ
		bos.close();
		bis.close();
	}

	// ����ͼƬ��һ�ζ�һ���ֽ����飬дһ���ֽ�����
	public static void test2() throws IOException {
		/*// ������Ч����������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("yidahulian.jpg"));
		// ������Ч���������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\hello.jpg"));*/
		
		// ������Ч�ֽڻ�������������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\com\\yidahulian_02\\CopyImageDemo01.java"));
		// ������Ч�ֽڻ������������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\CopyImage01.java"));

		// д������
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = bis.read(by)) != -1) {
			bos.write(by, 0, len);
		}

		// �ͷ���Դ
		bos.close();
		bis.close();
	}

}
