package com.yidahulian_02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺰ѵ�ǰ��Ŀ��� ��Ƭ��Ƶ.MP4 ���Ƶ� C:\\�˴���Ƶ.MP4��
 * 
 * ������
 * 	����Դ����Ƭ��Ƶ.MP4 -- �ֽ������� -- BufferedInputStream
 *  Ŀ�ĵأ�C:\\�˴���Ƶ.MP4 --  �ֽ������ -- BufferedOutputStream
 */
public class CopyMP4Demo02 {

	public static void main(String[] args) throws IOException {
		//test1();// //������Ƶ��һ�ζ�һ���ֽڣ�дһ���ֽ�
		test2();// ������Ƶ��һ�ζ�һ���ֽ����飬дһ���ֽ�����
	}

	// ������Ƶ��һ�ζ�һ���ֽڣ�дһ���ֽ�
	public static void test1() throws IOException {
		// ������Ч�ֽڻ�������������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("��Ƭ��Ƶ.MP4"));
		// ������Ч�ֽڻ������������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\�˴���Ƶ.MP4"));

		// д������
		int by = 0;
		while ((by = bis.read()) != -1) {// һ�ζ�һ���ֽ�
			bos.write(by);// һ��дһ���ֽ�
		}

		// �ͷ���Դ
		bos.close();
		bis.close();
		
		System.out.println("��Ƶ��������~~~");
	}

	// ������Ƶ��һ�ζ�һ���ֽ����飬дһ���ֽ�����
	public static void test2() throws IOException {
		// ������Ч����������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("��Ƭ��Ƶ.MP4"));
		// ������Ч���������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\�˴���Ƶ.MP4"));

		// д������
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = bis.read(by)) != -1) {
			bos.write(by, 0, len);
		}

		// �ͷ���Դ
		bos.close();
		bis.close();
		
		System.out.println("��Ƶ��������~~~");
	}

}
