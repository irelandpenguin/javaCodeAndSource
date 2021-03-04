package com.yida_01.File;

import java.io.File;

/**
 * �жϹ���:
 * public boolean isDirectory():�ж��Ƿ���Ŀ¼
 * public boolean isFile():�ж��Ƿ����ļ�
 * public boolean exists():�ж��Ƿ����
 * public boolean canRead():�ж��Ƿ�ɶ�
 * public boolean canWrite():�ж��Ƿ��д
 * public boolean isHidden():�ж��Ƿ�����
 */
public class F_File {
	public static void main(String[] args) {
		// public boolean isDirectory():�ж��Ƿ���Ŀ¼
		File file = new File("C:\\test");
		System.out.println("�Ƿ�Ϊ�ļ���:" + file.isDirectory());
		file = new File("hello");
		System.out.println("����Ŀ���Ƿ�Ϊ�ļ��У�" + file.isDirectory());

		// public boolean isFile():�ж��Ƿ����ļ�
		File file2 = new File("C:\\test\\photo4.jpg");
		System.out.println("�Ƿ�Ϊ�ļ�:" + file2.isFile());
		file2 = new File("photo1.jpg");
		System.out.println("����Ŀ���Ƿ�Ϊ�ļ���" + file2.isFile());

		// public boolean exists():�ж��Ƿ����
		File file3 = new File("C:\\test");
		System.out.println("�ļ����Ƿ����:" + file3.exists());
		file3 = new File("C:\\test\\photo4.jpg");
		System.out.println("�ļ��Ƿ����:" + file3.exists());
		file3 = new File("hello");
		System.out.println("����Ŀ���ļ����Ƿ����:" + file3.exists());
		file3 = new File("photo1.jpg");
		System.out.println("����Ŀ���ļ��Ƿ����:" + file3.exists());

		// public boolean canRead():�ж��Ƿ�ɶ�
		// public boolean canWrite():�ж��Ƿ��д
		File file5 = new File("C:\\test");
		System.out.println("�ļ����Ƿ�ɶ���" + file5.canRead());
		System.out.println("�ļ����Ƿ��д��" + file5.canWrite());
		file5 = new File("C:\\test\\photo4.jpg");
		System.out.println("�ļ��Ƿ�ɶ���" + file5.canRead());
		System.out.println("�ļ��Ƿ��д��" + file5.canWrite());

		// public boolean isHidden():�ж��Ƿ�����
		File file6 = new File("C:\\test");
		System.out.println("�ļ����Ƿ����أ�" + file6.isHidden());
		file6 = new File("C:\\test\\photo4.jpg");
		System.out.println("�ļ��Ƿ����أ�" + file6.isHidden());
	}
}
