package com.yidahulian_01;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * �ֽ��������������裺
 * A:�����ֽ�����������
 * B:����read()������ȡ���ݣ�����������ʾ�ڿ���̨
 * C:�ͷ���Դ
 * 
 * ��ȡ���ݵķ�ʽ��
 * A:int read():һ�ζ�ȡһ���ֽ�
 * B:int read(byte[] b):һ�ζ�ȡһ���ֽ�����
 */
public class FileInputStream01 {

	public static void main(String[] args) throws IOException {
		//test1();
		test2();
	}

	public static void test1() throws IOException {
		// �����ֽ�����������
		// FileInputStream(String name)
		// InputStream fis = new FileInputStream("a.txt");// ��̬
		FileInputStream fis = new FileInputStream("a.txt");// a.txt�������Ϊabc

		// ��һ�ζ�ȡ
		 /*int by = fis.read();
		 System.out.println(by);// 97
		 System.out.println((char) by);// a
		
		 // �ڶ��ζ�ȡ
		 by = fis.read();
		 System.out.println(by);// 98
		 System.out.println((char) by);// b
		
		 // �����ζ�ȡ
		 by = fis.read();
		 System.out.println(by);// 99
		 System.out.println((char) by);// c
		
		 // ���Ĵζ�ȡ
		 by = fis.read();
		 System.out.println(by);// -1
		
		 // ����ζ�ȡ
		 by = fis.read();
		 System.out.println(by);// -1
		  */
		
		// ͨ�����ԣ�����֪��������ȡ��������-1����˵���Ѿ���ȡ���ļ���ĩβ��
		// ��ѭ���Ľ�
		/* int by = fis.read();
		 while (by != -1) {
			 System.out.print((char) by);// print��ʾ��ӡ����������
			 by = fis.read();
		 }*/

		// ���հ�
		int by = 0;
		while ((by = fis.read()) != -1) {// ��ȡ����ֵ���жϡ�һ�д���㶨
			System.out.print((char) by);
		}

		fis.close();// �ͷ���Դ
	}

	public static void test2() throws IOException {
		// ������Ƕ�һ�������ļ�������Ч����Σ�

		// �����ֽ�����������
		//FileInputStream fis = new FileInputStream(new File("src/com/yidahulian_01/FileInputStream01.java"));
		FileInputStream fis = new FileInputStream("C:\\�����嵥\\һ������_¬����.mp3");
		int by = 0;
		while ((by = fis.read()) != -1) {
			System.out.print((char) by);
		}
		fis.close();// �ͷ���Դ

		// ������Ƿ��֣������������������⣬��������ȷ��
		// ������Ϊʲô�������أ�
		// ԭ����һ������ռ�����ֽڣ���fis.read()һ��ֻ��һ���ֽڣ�����������ʱ��ʵ����ֻ����һ�룬���ԣ��ͱ�������ˡ�
		// ���棬���ǻ���������ַ���ר�ŵĴ���ʽ��
	}
}
