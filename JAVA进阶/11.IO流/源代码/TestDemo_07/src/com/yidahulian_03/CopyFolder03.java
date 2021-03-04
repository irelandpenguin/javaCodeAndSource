package com.yidahulian_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺸��ƶ���ļ���
 * 
 * ����Դ��C:\\�����嵥
 * Ŀ�ĵأ�C:\\��ϲ��������
 * 
 * ������
 * 		A:��װ����ԴFile
 * 		B:��װĿ�ĵ�File
 * 		C:�жϸ�Ŀ�ĵ��ļ����Ƿ���ڣ��������򴴽�
 * 		D:��ȡ������ԴFile�����µ������ļ�File�����Լ����ļ���File����
 * 		E:�����õ�ÿһ��File��������
 * 		F:�ж�File�������ļ��л����ļ�
 * 			a:���ļ���
 * 				�ص�C
 * 			b:���ļ�
 * 				�͸���(�ֽ���)
 */
public class CopyFolder03 {

	public static void main(String[] args) throws IOException {
		// A:��װ����ԴFile
		File originFolder = new File("C:\\�����嵥");
		// B:��װĿ�ĵ�File
		File destFolder = new File("C:\\��ϲ��������");
		copyFolders(originFolder, destFolder);// ���ƶ���ļ���
		
		System.out.println("over~~~");
	}

	// ���ƶ���ļ���
	public static void copyFolders(File originFolder, File destFolder) throws IOException {
		// C:�жϸ�Ŀ�ĵ��ļ����Ƿ���ڣ��������򴴽�
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}

		// D:��ȡ������ԴFile�����µ������ļ�File�����Լ����ļ���File����
		File[] arr = originFolder.listFiles();

		// E:�����õ�ÿһ��File����
		for (File origin : arr) {
			// F:�ж�File�������ļ��л����ļ�
			if (origin.isDirectory()) {// a:���ļ���
				String dirName = origin.getName();// ��ȡ�ļ�������
				File dest = new File(destFolder, dirName);// ����Ŀ�����ļ��ж���
				copyFolders(origin, dest);// �ݹ���ã��ص�C
			} else {// b:���ļ�
				// �͸���(�ֽ���)
				String fileName = origin.getName();// ��ȡ�ļ�����
				File destFile = new File(destFolder, fileName);// ����Ŀ���ļ�����
				copyFile(origin, destFile);// �����ļ�
			}
		}
	}

	// �����ļ�
	public static void copyFile(File originFile, File destFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

		byte[] by = new byte[1024];
		int len = 0;
		while ((len = bis.read(by)) != -1) {
			bos.write(by, 0, len);
		}

		bos.close();
		bis.close();
	}
}
