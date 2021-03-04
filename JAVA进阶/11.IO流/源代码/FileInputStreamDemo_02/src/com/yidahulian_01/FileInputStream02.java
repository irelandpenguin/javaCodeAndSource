package com.yidahulian_01;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * һ�ζ�ȡһ���ֽ����飺int read(byte[] b)
 * ����ֵ��ʵ��ʵ�ʶ�ȡ���ֽڸ�����
 */
public class FileInputStream02 {
	public static void main(String[] args) throws IOException {
		//test1();// һ�ζ�ȡһ���ֽ�����
		//test2();// ÿ�δ�ӡlen�����ȣ���ֹ���ֶ����ַ�
		test3();// ���հ����
	}

	public static void test1() throws IOException {
		// �����ֽ�����������
		FileInputStream fis = new FileInputStream("b.txt");

		// һ�ζ�ȡһ���ֽ����飺int read(byte[] b) ����ֵ��ʵ��ʵ�ʶ�ȡ���ֽڸ�����
		byte[] by = new byte[5];// ����һ���ֽ����飬������5���ֽ�
		int len = fis.read(by);
		System.out.println(len + "---" + new String(by));
		// ��һ����ӡ���Ϊ��
		// 5---hello

		// �ڶ��ζ�ȡ
		len = fis.read(by);
		System.out.println(len + "---" + new String(by));
		// �ڶ��δ�ӡ���Ϊ��
		// 5---
		// wor

		// �����ζ�ȡ
		len = fis.read(by);
		System.out.println(len + "---" + new String(by));
		// �����δ�ӡ���Ϊ��
		// 5---ld
		// j

		// ���Ĵζ�ȡ
		len = fis.read(by);
		System.out.println(len + "---" + new String(by));
		// ���Ĵδ�ӡ���Ϊ��
		// 4---ar
		// j

		// ����ζ�ȡ
		len = fis.read(by);
		System.out.println(len + "---" + new String(by));
		// ����δ�ӡ���Ϊ��
		// -1---ar
		// j

		// �ӵ���δ�ӡ����ܹ��ƶϳ����������ļ�ĩβʱ��len��ֵΪ-1

		// �ͷ���Դ
		fis.close();

		// Ϊʲô����������Ľ���أ�
	}

	// �Ľ�һ��
	public static void test2() throws IOException {
		// �����ֽ�����������
		FileInputStream fis = new FileInputStream("b.txt");

		// һ�ζ�ȡһ���ֽ����飺int read(byte[] b) ����ֵ��ʵ��ʵ�ʶ�ȡ���ֽڸ�����
		byte[] by = new byte[5];// ����һ���ֽ����飬������5���ֽ�
		int len = fis.read(by);
		//System.out.println(new String(by, 0, len));
		// ��һ����ӡ���Ϊ��
		// hello
		System.out.print(new String(by, 0, len));// ȥ������

		// �ڶ��ζ�ȡ
		len = fis.read(by);
		//System.out.println(new String(by, 0, len));
		// �ڶ��δ�ӡ���Ϊ��
		// wor
		System.out.print(new String(by, 0, len));// ȥ������

		// �����ζ�ȡ
		len = fis.read(by);
		//System.out.println(new String(by, 0, len));
		// �����δ�ӡ���Ϊ��
		// ld
		// j
		System.out.print(new String(by, 0, len));// ȥ������

		// ���Ĵζ�ȡ
		len = fis.read(by);
		//System.out.println(new String(by, 0, len));
		// ���Ĵδ�ӡ���Ϊ��
		// ar
		System.out.print(new String(by, 0, len));// ȥ������

		// ����ζ�ȡ
		len = fis.read(by);
		if (len == -1) {// -1��ʾ�����ļ�ĩβ
			System.out.println("�����ļ�ĩβ�ˣ���ʱlen��ֵΪ-1");
		}

		// �ͷ���Դ
		fis.close();
	}

	// ���հ����
	// ����ĳ���һ����1024����1024��������
	// 1kb = 1024b  1M = 1024kb  1G = 1024M
	public static void test3() throws IOException {
		//FileInputStream fis = new FileInputStream("b.txt");
		FileInputStream fis = new FileInputStream("src\\com\\yidahulian_01\\FileInputStream01.java");
		byte[] by = new byte[102];
		int len = 0;
		while ((len = fis.read(by)) != -1) {//��ȡ����ֵ���ж� ���ɵ�һ�д���
			System.out.print(new String(by, 0, len));
		}
		fis.close();// �ͷ���Դ

		// ˼���£�Ϊʲô��������Ķ���������ʾ���أ�
		// ��ʵ���Ǽ������1024��Сһ�㣬����102��������һ�ο��£���Ȼ�����롣
		// ԭ���Ǹպ��ֽ��������һ��Ԫ�ض����Ǻ��ֵ�һ��,���ʱ�ͻ������롣
		// ��ʹ��1024ÿ�ζ�ȡ�ĺܶ࣬�պðѺ��ֶ�װ��ȥ�ˣ���ӡʱ�պ�û�����룬����˵�Ǽ���
	}
}
