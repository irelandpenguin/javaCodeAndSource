package com.yidahulian_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ���󣺰�ArrayList�����е��ַ������ݴ洢���ı��ļ�
 * 
 * ������
 * 		ͨ����Ŀ����˼���ǿ���֪�����µ�һЩ���ݣ�
 * 			ArrayList������洢�����ַ�����
 * 			����ArrayList���ϣ������ݻ�ȡ����
 * 			Ȼ��洢���ı��ļ��С�
 * 			�ı��ļ�˵��ʹ���ַ�����
 * 
 * ����Դ��
 * 		ArrayList<String> -- �����õ�ÿһ���ַ�������
 * Ŀ�ĵأ�
 * 		a.txt -- FileWriter -- BufferedWriter
 */
public class ArrayListToFile01 {

	public static void main(String[] args) throws IOException {
		// �������ϲ����Ԫ��
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("�˴ﻥ��");
		list.add("java");

		// �����ļ���Ȼ��Ѽ������Ԫ��д�뵽�ļ���
		//test1(list, "a.txt");// ��ʽһ��FileWriterд��
		test2(list, "b.txt");// ��ʽ���� BufferedWriterд��(�Ƽ���)
	}

	// ��ʽһ�� FileWriterд��
	public static void test1(ArrayList<String> list, String dest)
			throws IOException {
		FileWriter fw = new FileWriter(dest);
		for (String s : list) {
			fw.write(s);
			fw.write("\r\n");
		}
		fw.close();
	}

	// ��ʽ���� BufferedWriterд��
	public static void test2(ArrayList<String> list, String dest)
			throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
		for (String s : list) {
			bw.write(s);
			bw.newLine();//����Ļ����Զ����ݲ�ͬƽ̨
			bw.flush();
		}

		bw.close();
	}
}
