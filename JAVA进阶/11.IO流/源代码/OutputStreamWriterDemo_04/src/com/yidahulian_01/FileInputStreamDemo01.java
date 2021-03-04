package com.yidahulian_01;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * �ֽ�����ȡ���Ĳ���ʾ������̨�����ܳ��ֵ�С���⣺���롣
 */
public class FileInputStreamDemo01 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");

		// ��ʽһ��һ�ζ�һ���ֽ�
		 /*int by = 0;
		 while ((by = fis.read()) != -1) {
			 System.out.print((char) by);
		 }*/
		
		// ��ʽ����һ�ζ�һ���ֽ�����
		byte[] by = new byte[7];
		int len = 0;
		while ((len = fis.read(by)) != -1) {
			System.out.print(new String(by, 0, len));
		}

		// ԭ�����ֽ�����Ϊ7ʱ���պ��ֽ��������һ��Ԫ�ض����Ǻ��ֵ�һ��,���ʱ�ͻ������롣
		// ���ֽ�����Ϊ10ʱ���պðѺ��ֶ�װ��ȥ�ˣ����ʱ�պ�û�����룬��ʵ�Ǽ���

		// �ͷ���Դ
		fis.close();
	}
}
