package com.yidahulian_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ���󣺰ѵ�ǰ��ĿĿ¼�µ�aa.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�bb.txt��
 * 
 * ����Դ��
 * 		aa.txt -- ��ȡ���� -- �ַ�ת���� -- InputStreamReader -- FileReader -- BufferedReader
 * Ŀ�ĵأ�
 * 		bb.txt -- д������ -- �ַ�ת���� -- OutputStreamWriter -- FileWriter -- BufferedWriter 
 */
public class CopyFile01 {

	public static void main(String[] args) throws IOException {
		test1("aa.txt", "bb.txt");// һ��дһ���ַ�
		//test2("aa.txt", "bb.txt");// һ��дһ���ַ�����
	}

	// һ��дһ���ַ�
	public static void test1(String origin, String dest) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(origin));
		BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

		int by = 0;
		while ((by = br.read()) != -1) {
			bw.write(by);
		}

		// �ͷ���Դ
		bw.close();
		br.close();
	}

	// һ��дһ���ַ�����
	public static void test2(String origin, String dest) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(origin));
		BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
			bw.flush();// ˢ��(ÿ��д����ַ�ʱ�����ˢ��һ�¡�һ��дһ���ַ����Ͳ���ˢ��)
		}

		// �ͷ���Դ
		bw.close();
		br.close();
	}
}
