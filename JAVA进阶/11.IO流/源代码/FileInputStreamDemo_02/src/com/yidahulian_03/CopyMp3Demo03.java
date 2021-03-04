package com.yidahulian_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺰�C:\\�����嵥\\һ������_¬����.mp3 ���Ƶ���ǰ��ĿĿ¼�µ� һ������_¬����.mp3 �� 
 * ����Դ��
 * 		C:\\�����嵥\\һ������_¬����.mp3  --  ��ȡ����  --  FileInputStream
 * Ŀ�ĵأ�
 * 		һ������_¬����.mp3  --  д������  --  FileOutputStream
 */
public class CopyMp3Demo03 {

	public static void main(String[] args) throws IOException {
		//test1();// ����mp3��һ����һ���ֽڣ�дһ���ֽ�
		test2();// ����mp3��һ����һ���ֽ����飬дһ���ֽ�����
	}

	// ����mp3��һ����һ���ֽڣ�дһ���ֽ�
	public static void test1() throws IOException {
		// �����ֽ�����������
		FileInputStream fis = new FileInputStream("C:\\�����嵥\\һ������_¬����.mp3");

		// �����ֽ����������
		FileOutputStream fos = new FileOutputStream("һ������_¬����.mp3");

		// д������
		int by = 0;
		while ((by = fis.read()) != -1) {// һ�ζ�һ���ֽ�
			fos.write(by);// һ��дһ���ֽ�
		}

		// �ͷ���Դ
		fos.close();
		fis.close();
		
		System.out.println("mp3��������~~~");
	}

	// ����mp3��һ����һ���ֽ����飬дһ���ֽ�����
	public static void test2() throws IOException {
		// �����ֽ�����������
		FileInputStream fis = new FileInputStream("C:\\�����嵥\\�����ֵ�\\Сƻ��_�����ֵ�.mp3");

		// �����ֽ����������
		FileOutputStream fos = new FileOutputStream("Сƻ��_�����ֵ�.mp3");

		// д������
		int len = 0;
		byte[] by = new byte[1024];
		while ((len = fis.read(by)) != -1) {// һ�ζ�һ���ֽ�����
			fos.write(by, 0, len);// һ��дһ���ֽ�����
		}

		// �ͷ���Դ
		fos.close();
		fis.close();
		
		System.out.println("mp3��������~~~");
	}
}
