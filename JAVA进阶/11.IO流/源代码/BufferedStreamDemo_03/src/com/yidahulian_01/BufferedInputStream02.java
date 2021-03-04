package com.yidahulian_01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * �����ݣ�BufferedInputStream
 */
public class BufferedInputStream02 {

	public static void main(String[] args) throws IOException {
		test1();// ��ȡ�ļ���һ�ζ�һ���ֽ�
		//test2();// ��ȡ�ļ���һ�ζ�һ���ֽ�����
	}

	// ��ȡ�ļ���һ�ζ�һ���ֽ�
	public static void test1() throws IOException {
		// ������Ч�ֽڻ�������������
		// FileInputStream fis = new FileInputStream("a.txt");
		// BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));

		// ��ȡ����
		int by = 0;
		while ((by = bis.read()) != -1) {
			System.out.print((char) by);
		}

		// �ͷ���Դ
		bis.close();

		// ע�⣺����Ľ���У�Ӣ�Ķ�OK�������������롣ԭ����ʲô��
		// �������ǰ���Ѿ������˵ģ�ԭ�������Ϊһ������ռ2���ֽڣ�һ��ֻ��ȡ���ֵ�һ�벢ǿ��ת����char���µġ�
	}

	// ��ȡ�ļ���һ�ζ�һ���ֽ�����
	public static void test2() throws IOException {
		// ������Ч�ֽڻ�������������
		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\com\\yidahulian_01\\BufferedInputStream02.java"));

		// ��ȡ����
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = bis.read(by)) != -1) {
			System.out.print(new String(by, 0, len));
		}

		// �ͷ���Դ
		bis.close();

		// ˼���£�Ϊʲô��������Ķ���������ʾ���أ�
		// ��ʵ���Ǽ������1024��Сһ�㣬����102��������һ�ο��£���Ȼ�����롣
		// ԭ���Ǹպ��ֽ��������һ��Ԫ�ض����Ǻ��ֵ�һ��,���ʱ�ͻ������롣
		// ��ʹ��1024ÿ�ζ�ȡ�ĺܶ࣬�պðѺ��ֶ�װ��ȥ�ˣ���ӡʱ�պ�û�����룬����˵�Ǽ���
	}
}
