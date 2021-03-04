package com.yidahulian_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺸��Ƶ����ļ���
 * 
 * ����Դ��C:\\demo01
 * Ŀ�ĵأ�C:\\demo02
 * 
 * ������
 * 		A:��װĿ¼
 * 		B:��ȡ��Ŀ¼�µ������ļ���File����
 * 		C:������File���飬�õ�ÿһ��File����
 * 		D:�Ѹ�File���и���
 * 
 * �ļ�����࣬����ͼƬ�������ı��ļ������ԣ�Ӧ���ø�Ч�ֽڻ��������ơ�
 */
public class CopyFolder01 {

	public static void main(String[] args) throws IOException {
		File originFile = new File("C:\\demo01");// ����Դ
		File destFile = new File("C:\\demo02");// Ŀ�ĵ�

		// Ŀ�ĵز����ڣ��ʹ���
		if (!destFile.exists()) {
			destFile.mkdir();
		}

		// ��ȡ����Դ��������ļ�
		File[] arr = originFile.listFiles();
		for (File origin : arr) {
			String name = origin.getName();// ��ȡ�ļ�����
			File dest = new File(destFile, name);// ����Ŀ���ļ�����
			copyFile(origin, dest);
		}
		
		System.out.println("��������~~~");
	}

	// ��Ч�ֽڻ����� �����ļ���һ�θ���һ���ֽ�����
	public static void copyFile(File origin, File dest) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(origin));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

		byte[] by = new byte[1024];
		int len = 0;
		while ((len = bis.read(by)) != -1) {
			bos.write(by, 0, len);
		}

		// �ͷ���Դ
		bos.close();
		bis.close();
	}
}
