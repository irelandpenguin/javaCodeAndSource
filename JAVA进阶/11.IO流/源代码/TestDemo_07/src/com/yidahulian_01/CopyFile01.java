package com.yidahulian_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �����ı��ļ�
 * 
 * ������
 * 		�������ݣ��������֪���ü��±��򿪲��ܹ������������ַ������������ֽ�����
 * 		ͨ����ԭ������֪������Ӧ�ò����ַ���������һЩ��
 * 		���ַ�����5�ַ�ʽ�������������Ŀ������5�ַ�ʽ���Ƽ����յ�5�֡�
 * ����Դ��
 * 		c:\\CopyImage01.java  -- -- FileReader -- BufferdReader
 * Ŀ�ĵأ�
 * 		c:\\CopyMyImage.java -- FileWriter -- BufferedWriter
 */
public class CopyFile01 {

	public static void main(String[] args) throws IOException {
		//test1();// FileReader һ�ζ�һ���ַ�
		//test2();// FileReader һ�ζ�һ���ַ�����
		//test3();// BufferdReader һ�ζ�һ���ַ�
		//test4();// BufferdReader һ�ζ�һ���ַ�����
		test5();// BufferdReader һ�ζ�һ��
	}

	// FileReader һ�ζ�һ���ַ�
	public static void test1() throws IOException {
		FileReader fr = new FileReader("c:\\CopyImage01.java");
		FileWriter fw = new FileWriter("c:\\CopyMyImage.java");
		int by = 0;
		while ((by = fr.read()) != -1) {
			fw.write(by);
		}

		fw.close();
		fr.close();
	}

	// FileReader һ�ζ�һ���ַ�����
	public static void test2() throws IOException {
		FileReader fr = new FileReader("c:\\CopyImage01.java");
		FileWriter fw = new FileWriter("c:\\CopyMyImage.java");

		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
			fw.flush();// һ��д����ַ������ˢ��һ��
		}

		fw.close();
		fr.close();

	}

	// BufferdReader һ�ζ�һ���ַ�
	public static void test3() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:\\CopyImage01.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\CopyMyImage.java"));

		int by = 0;
		while ((by = br.read()) != -1) {
			bw.write(by);
		}

		bw.close();
		br.close();
	}

	// BufferdReader һ�ζ�һ���ַ�����
	public static void test4() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:\\CopyImage01.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\CopyMyImage.java"));

		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
			bw.flush();// һ��д������ַ�ʱ�����ˢ��һ��
		}

		bw.close();
		br.close();
	}

	// BufferdReader һ�ζ�һ��
	public static void test5() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:\\CopyImage01.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\CopyMyImage.java"));

		String s = null;
		while ((s = br.readLine()) != null) {
			bw.write(s);
			bw.newLine();// ��һ��
			bw.flush(); // һ��д������ַ�ʱ�����ˢ��һ��
		}

		bw.close();
		br.close();
	}
}
