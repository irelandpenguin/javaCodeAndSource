package com.yidahulian_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader
 * ���ַ��������ж�ȡ�ı�����������ַ����Ӷ�ʵ���ַ����ַ����顢�ַ������еĸ�Ч��ȡ�� 
 * ����ָ���������Ĵ�С�����߿�ʹ��Ĭ�ϵĴ�С�����������£�Ĭ��ֵ���㹻���ˡ� 
 * 
 * BufferedReader(Reader in)
 */
public class BufferedReader02 {

	public static void main(String[] args) throws IOException {
		//test1();// һ�ζ�һ���ַ�
		test2();// һ�ζ�һ���ַ�����
	}

	// һ�ζ�һ���ַ�
	public static void test1() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:/����ͼƬ.java"));

		int by = 0;
		while ((by = br.read()) != -1) {
			System.out.print((char) by);
		}

		br.close();// �ͷ���Դ
	}

	// һ�ζ�һ���ַ�����
	public static void test2() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:\\����ͼƬ.java"));

		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}

		// �ͷ���Դ
		br.close();
	}

}
