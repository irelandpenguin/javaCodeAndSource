package com.yidahulian_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ���󣺰ѵ�ǰ��ĿĿ¼�µ�aa.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�bb.txt��
 * 
 * ����Դ��
 * 		aa.txt -- ��ȡ���� -- �ַ�ת���� -- InputStreamReader
 * Ŀ�ĵأ�
 * 		bb.txt -- д������ -- �ַ�ת���� -- OutputStreamWriter
 */
public class CopyFileDemo01 {
	public static void main(String[] args) throws IOException {
		//test1();// һ�ζ�һ���ַ���дһ���ַ�
		//test2();// һ�ζ�һ���ַ����飬дһ���ַ�����
		//test3();//��mp4�����ֲ����ԡ���Ϊmp4���ֽ�����ʹ���ַ�����ȡʱ���ļ������������ţ�
	}

	// һ�ζ�һ���ַ���дһ���ַ�
	public static void test1() throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("aa.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("bb.txt"));

		// һ�ζ�һ���ַ���дһ���ַ�
		int by = 0;
		while ((by = isr.read()) != -1) {
			osw.write(by);
		}

		osw.close();// �ͷ���Դ
		isr.close();// �ͷ���Դ
	}

	// һ�ζ�һ���ַ����飬дһ���ַ�����
	public static void test2() throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("aaa.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("bbb.txt"));

		// һ�ζ�һ���ַ����飬дһ���ַ�����
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			osw.write(chs, 0, len);
			osw.flush();
		}

		osw.close();// �ͷ���Դ
		isr.close();// �ͷ���Դ
	}
	
	//��mp4�����ֲ����ԡ���Ϊmp4���ֽ�����ʹ���ַ�����ȡʱ���ļ������������ţ�
	public static void test3() throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("c:\\��Ƭ��Ƶ.MP4"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("movies.MP4"));
		
		// һ�ζ�һ���ַ����飬дһ���ַ�����
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			osw.write(chs, 0, len);
			osw.flush();
		}
		
		osw.close();// �ͷ���Դ
		isr.close();// �ͷ���Դ
	}
	
	
}
