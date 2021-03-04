package com.yidahulian_01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �������ǳ����Ĳ�������ʹ�ñ���Ĭ�ϱ���GBK�����ԣ�����ָ�����롣
 * ��ת�����������е㳤�����ԣ�Java���ṩ�������๩����ʹ�á�  
 * FileWriter ����д���ַ�����
 * FileReader ���ڶ�ȡ�ַ�����
 * 
 * ���󣺰ѵ�ǰ��ĿĿ¼�µ�cc.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�dd.txt��
 * 
 * ����Դ��
 * 		cc.txt -- ��ȡ����  -- FileReader
 * Ŀ�ĵأ�
 * 		dd.txt -- д������ -- FileWriter
 */
public class FileWriterAndFileReader02 {

	public static void main(String[] args) throws IOException {
		//test1();// һ�ζ�һ���ַ���дһ���ַ�
		test2();// һ�ζ�һ���ַ����飬дһ���ַ�����
	}

	// һ�ζ�һ���ַ���дһ���ַ�
	public static void test1() throws IOException {
		//FileReader fr = new FileReader("cc.txt");
		FileReader fr = new FileReader(new File("cc.txt"));
		//FileWriter fw = new FileWriter("dd.txt");
		FileWriter fw = new FileWriter(new File("dd.txt"));

		// һ�ζ�һ���ַ���дһ���ַ�
		int by = 0;
		while ((by = fr.read()) != -1) {
			fw.write(by);
		}

		fw.close();// �ͷ���Դ
		fr.close();// �ͷ���Դ
	}

	// һ�ζ�һ���ַ����飬дһ���ַ�����
	public static void test2() throws IOException {
		FileReader fr = new FileReader("c:/CopyImage01.java");
		FileWriter fw = new FileWriter("c:\\����ͼƬ.java");

		// һ�ζ�һ���ַ����飬дһ���ַ�����
		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}

		fw.close();// �ͷ���Դ
		fr.close();// �ͷ���Դ
	}

}
