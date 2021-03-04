package com.yidahulian_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺰�c:\\�˴ﻥ��.jpg���ݸ��Ƶ���ǰ��ĿĿ¼�µ�yidahulian.jpg��
 * 
 * ����Դ��
 * 		c:\\�˴ﻥ��.jpg	--  ��ȡ����  --  FileInputStream
 * Ŀ�ĵأ�
 * 		yidahulian.jpg	--  д������  --  FileOutputStream
 */
public class CopyImageDemo02 {

	public static void main(String[] args) throws IOException {
		//test1();// ����ͼƬ��һ�ζ�һ���ֽڣ�дһ���ֽ�
		//test2();// ����ͼƬ��һ�ζ�һ���ֽ����飬дһ���ֽ�����
	}

	// ����ͼƬ��һ�ζ�һ���ֽڣ�дһ���ֽ�
	public static void test1() throws IOException {
		// �����ֽ�����������
		FileInputStream fis = new FileInputStream("c:\\�˴ﻥ��.jpg");

		// �����ֽ����������
		FileOutputStream fos = new FileOutputStream("yidahulian.jpg");

		// д������
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		// �ͷ���Դ
		fos.close();
		fis.close();
		
		System.out.println("ͼƬ���ƺ���~~~");
	}

	// ����ͼƬ��һ�ζ�һ���ֽ����飬дһ���ֽ�����
	public static void test2() throws IOException {
		// �����ֽ����������
		FileInputStream fis = new FileInputStream("c:\\yidahulian.jpg");

		// �����ֽ����������
		FileOutputStream fos = new FileOutputStream("�˴ﻥ��.jpg");

		// д������
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = fis.read(by)) != -1) {
			fos.write(by, 0, len);
		}

		// �ͷ���Դ
		fos.close();
		fis.close();
	}
}
