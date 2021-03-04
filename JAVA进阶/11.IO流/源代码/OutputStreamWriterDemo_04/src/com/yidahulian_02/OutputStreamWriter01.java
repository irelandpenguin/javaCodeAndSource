package com.yidahulian_02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * ת����(���ܣ�ʵ���ֽ������ַ�����ת��)
 * 	��2�֣�
 * 		OutputStreamWriter���ܣ��ַ���ת���ֽ���;
 * 		InputStreamReader���ܣ��ֽ���ת���ַ���;
 * OutputStreamWriter(OutputStream out):����Ĭ�ϱ�����ַ�������ת��Ϊ�ֽ�������ƣ����ת����
 * OutputStreamWriter(OutputStream out,String charsetName):����ָ��������ַ�������ת��Ϊ�ֽ���
 * 
 * �ַ��� = �ֽ��� +�����
 */
public class OutputStreamWriter01 {

	public static void main(String[] args) throws IOException {
		//test1();// ����Ĭ�ϱ�����ַ�������ת��Ϊ�ֽ���
		test2();// ����ָ��������ַ�������ת��Ϊ�ֽ���
	}

	// ����Ĭ�ϱ�����ֽ�������ת��Ϊ�ַ���
	public static void test1() throws IOException {
		// FileOutputStream fos = new FileOutputStream("a.txt");
		// OutputStreamWriter osw = new OutputStreamWriter(fos);
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));//����Ĭ�ϱ���(GBK)���ַ�������ת��Ϊ�ֽ���
		osw.write("hello,�˴ﻥ��");// д����
		osw.close();// �ͷ���Դ
	}

	// ����ָ��������ֽ�������ת��Ϊ�ַ���
	public static void test2() throws IOException {
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"), "GBK");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"), "UTF-8");// ָ��UTF-8
		osw.write("hello,�˴ﻥ��");// д����
		osw.close();// �ͷ���Դ

		// �ֱ��� notepad++�����±���eclipse�򿪿������
	}
}
