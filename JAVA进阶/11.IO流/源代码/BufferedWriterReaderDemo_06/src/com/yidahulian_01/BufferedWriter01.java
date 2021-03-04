package com.yidahulian_01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ���ٸ�ϰǰ��֪ʶ�㣺
 * 1. �ֽ���
 * 		FileInputStream:�ֽ���������������ȡ�ֽ��ļ��ġ����磺��Ƶ����Ƶ�ȡ�
 * 		FileOutputStream:�ֽ������������д���ֽ��ļ��ġ����磺д����Ƶ����Ƶ�ȡ�
 * 2. ��Ч�ֽ���
 * 		BufferedInputStream:��Ч�ֽ���������������ȡ�ֽ��ļ��ġ����磺��Ƶ����Ƶ�ȡ�
 * 		BufferedOutputStream:��Ч�ֽ������������д���ֽ��ļ��ġ����磺д����Ƶ����Ƶ�ȡ�
 * 3. ת����
 * 		InputStreamReader:����ת�������������ֽ���ת���ַ����ġ�
 * 		OutputStreamWriter:���ת�������������ַ���ת���ֽ����ġ�
 * 
 * 	   �ַ��� = �ֽ���+�����(GBK,UTF-8,Unicode,ISO-8859-1��)��
 * 
 * 4. �ַ���
 * 		FileReader:�ַ���������������ȡ�ַ��ļ��ġ����磺�ı��ļ���world�ĵ���java�ļ��ȡ�
 * 		FileWriter:�ַ������������д���ַ��ļ��ġ����磺�ı��ļ���world�ĵ���java�ļ��ȡ�
 * 5. ��Ч�ַ���
 * 		BufferedWriter:�ַ����������
 *		BufferedReader:�ַ�����������
 * 
 * �ַ���Ϊ�˸�Ч��д��Ҳ�ṩ�˶�Ӧ���ַ���������
 * BufferedWriter:�ַ����������
 * BufferedReader:�ַ�����������
 * 
 * BufferedWriter:�ַ����������
 * ���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ����ַ�������ַ����ĸ�Чд�롣 
 * ����ָ���������Ĵ�С�����߽���Ĭ�ϵĴ�С���ڴ��������£�Ĭ��ֵ���㹻���ˡ� 
 */
public class BufferedWriter01 {

	public static void main(String[] args) throws IOException {
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}

	public static void test1() throws IOException {
		// FileWriter fw = new FileWriter("a.txt");
		// BufferedWriter bw = new BufferedWriter(fw);
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

		// һ��дһ���ַ�
		bw.write(97);
		bw.write('b');
		bw.write('\r');
		bw.write('\n');
		bw.write('c');

		// bw.flush();// ˢ�»����������ַ������a.txt�ļ���
		bw.close();// �ͷ�����(�ͷ���Դǰ��������ˢ��һ�Σ��ѻ���������ַ������a.txt�ļ���)
	}

	public static void test2() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

		// һ��дһ���ַ�����
		char[] chs = { 'h', 'e', 'l', 'l', 'o', ',', '��', '��', '��', '��' };
		bw.write(chs);

		//bw.flush();// ˢ�»����������ַ������b.txt�ļ���
		bw.close();// �ͷ�����(�ͷ���Դǰ��������ˢ��һ�Σ��ѻ���������ַ������b.txt�ļ���)
	}

	public static void test3() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));

		// һ��дһ���ַ������һ����
		char[] chs = { 'h', 'e', 'l', 'l', 'o', ',', '��', '��', '��', '��' };
		bw.write(chs, 6, 4);

		bw.flush();// ˢ�»����������ַ������c.txt�ļ���
		bw.close();// �ͷ�����(�ͷ���Դǰ��������ˢ��һ�Σ��ѻ���������ַ������c.txt�ļ���)
	}

	public static void test4() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("d.txt"));

		// һ��дһ���ַ���
		String s = "hello,�˴ﻥ��";
		bw.write(s);
		String s2 = "\r\n���,Java��\r\n��ӭ����Java������!";
		bw.write(s2);

		bw.flush();// ˢ�»����������ַ������d.txt�ļ���
		bw.close();// �ͷ�����(�ͷ���Դǰ��������ˢ��һ�Σ��ѻ���������ַ������d.txt�ļ���)
	}

	public static void test5() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("e.txt"));

		// һ��дһ���ַ���
		String s = "hello,�˴ﻥ��";
		bw.write(s, 6, 2);

		//bw.flush();// ˢ�»����������ַ������e.txt�ļ���
		bw.close();// �ͷ�����(�ͷ���Դǰ��������ˢ��һ�Σ��ѻ���������ַ������e.txt�ļ���)
	}

}
