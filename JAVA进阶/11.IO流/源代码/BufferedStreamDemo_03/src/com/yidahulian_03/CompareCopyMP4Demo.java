package com.yidahulian_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ԱȻ������������Ч�ֽڻ�������ȡ����Ч�ʡ�����˭����?
 * 
 * ������������һ�ζ�һ���ֽڣ�дһ���ֽڡ�����ʱ:42717����
 * ������������һ�ζ�һ���ֽ����飬дһ���ֽ����顣����ʱ:92����
 * ��Ч�ֽڻ�������һ�ζ�һ���ֽڣ�дһ���ֽڡ�����ʱ:737����
 * ��Ч�ֽڻ�������һ�ζ�һ���ֽ����飬дһ���ֽ����顣����ʱ:46����
 * 
 * ͨ���Ƚϣ���Ч�ֽڻ����������ģ�
 */
public class CompareCopyMP4Demo {

	public static void main(String[] args) throws IOException {
		// �����ֽ������������ֽ����������
		FileInputStream fis = new FileInputStream("��Ƭ��Ƶ.MP4");
		FileOutputStream fos = new FileOutputStream("c:\\�˴ﻥ��.MP4");
		
		long begin = System.currentTimeMillis();// ��ʼʱ��
		//test1(fis, fos);// ������������һ�ζ�һ���ֽڣ�дһ���ֽ�
		//test2(fis, fos);// ������������һ�ζ�һ���ֽ����飬дһ���ֽ�����
		//test3(fis, fos);// ��Ч�ֽڻ�������һ�ζ�һ���ֽڣ�дһ���ֽ�
		test4(fis, fos);// ��Ч�ֽڻ�������һ�ζ�һ���ֽ����飬дһ���ֽ�����
		long end = System.currentTimeMillis();// ����ʱ��
		System.out.println("����ʱ:" + (end - begin) + "����");

		// �ͷ���Դ
		fos.close();
		fis.close();
	}

	// ������������һ�ζ�һ���ֽڣ�дһ���ֽ�
	public static void test1(FileInputStream fis, FileOutputStream fos)
			throws IOException {
		// д������
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}
	}

	// ������������һ�ζ�һ���ֽ����飬дһ���ֽ�����
	public static void test2(FileInputStream fis, FileOutputStream fos)
			throws IOException {
		// д������
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = fis.read(by)) != -1) {
			fos.write(by, 0, len);
		}
	}

	// ��Ч�ֽڻ�������һ�ζ�һ���ֽڣ�дһ���ֽ�
	public static void test3(FileInputStream fis, FileOutputStream fos)
			throws IOException {
		// ������Ч�ֽڻ�������������
		BufferedInputStream bis = new BufferedInputStream(fis);
		// ������Ч�ֽڻ������������
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		// д������
		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);
		}

		// �ͷ���Դ
		bos.close();
		bis.close();
	}

	// ��Ч�ֽڻ�������һ�ζ�һ���ֽ����飬дһ���ֽ�����
	public static void test4(FileInputStream fis, FileOutputStream fos)
			throws IOException {
		// ������Ч�ֽڻ�������������
		BufferedInputStream bis = new BufferedInputStream(fis);
		// ������Ч�ֽڻ������������
		BufferedOutputStream bos = new BufferedOutputStream(fos);

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
