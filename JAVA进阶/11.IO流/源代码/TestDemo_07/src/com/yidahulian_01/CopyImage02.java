package com.yidahulian_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����ͼƬ
 * 
 * ������
 * 		�������ݣ��������֪���ü��±��򿪲��ܹ������������ַ������������ֽ�����
 * 		ͨ����ԭ������֪������Ӧ�ò����ֽ�����
 * 		���ֽ�����4�ַ�ʽ�������������Ŀ������4�ַ�ʽ���Ƽ����յ�4�֡�
 * 
 * ����Դ��
 * 		c:\\yidahulian.jpg -- FileInputStream -- BufferedInputStream
 * Ŀ�ĵأ�
 * 		c:\\�˴�.jpg -- FileOutputStream -- BufferedOutputStream
 */
public class CopyImage02 {

	public static void main(String[] args) throws IOException {
		String origin = "c:\\yidahulian.jpg";
		String dest = "c:\\�˴�.jpg";
		test1(origin, dest);// FileInputStream һ�ζ�ȡһ���ֽ�
		//test2(origin, dest);// FileInputStream һ�ζ�ȡһ���ֽ�����
		//test3(origin, dest);// BufferedInputStream һ�ζ�ȡһ���ֽ�
		//test4(origin, dest);// BufferedInputStream һ�ζ�ȡһ���ֽ�����
	}

	// FileInputStream һ�ζ�ȡһ���ֽ�
	public static void test1(String origin, String dest) throws IOException {
		FileInputStream fis = new FileInputStream(origin);
		FileOutputStream fos = new FileOutputStream(dest);

		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		fos.close();
		fis.close();
	}

	// FileInputStream һ�ζ�ȡһ���ֽ�����
	public static void test2(String origin, String dest) throws IOException {
		FileInputStream fis = new FileInputStream(origin);
		FileOutputStream fos = new FileOutputStream(dest);

		byte[] chs = new byte[1024];
		int len = 0;
		while ((len = fis.read(chs)) != -1) {
			fos.write(chs, 0, len);
			fos.flush();//���ˢ��һ��
		}

		fos.close();
		fis.close();
	}

	// BufferedInputStream һ�ζ�ȡһ���ֽ�
	public static void test3(String origin, String dest) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(origin));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);
		}

		bos.close();
		bis.close();
	}

	// BufferedInputStream һ�ζ�ȡһ���ֽ�����
	public static void test4(String origin, String dest) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(origin));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

		byte[] by = new byte[1024];
		int len = 0;
		while ((len = bis.read(by)) != -1) {
			bos.write(by, 0, len);
		}

		bos.close();
		bis.close();
	}

}
