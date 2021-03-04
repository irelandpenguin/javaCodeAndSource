package com.yida_01.File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��ȡ���ܣ�
 * public String getAbsolutePath()����ȡ����·��
 * public String getPath():��ȡ���·��
 * public String getName():��ȡ����
 * public long length():��ȡ���ȡ��ֽ���
 * public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
 * 
 * public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е�����
 * public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
 */
public class G_File {
	public static void main(String[] args) {
		// test1();// ��ȡ����·���µ��ļ���Ϣ
		// test2();// ��ȡ���·���µ��ļ���Ϣ

		// test3();// ��ȡָ��Ŀ¼(����Ŀ¼)�µ������ļ������ļ��е�����
		// test4();// ��ȡָ��Ŀ¼(���Ŀ¼)�µ������ļ������ļ��е�����

		// test5();// ��ȡָ��Ŀ¼(����Ŀ¼)�µ������ļ������ļ��е�File����
		// test6();// ��ȡָ��Ŀ¼(���Ŀ¼)�µ������ļ������ļ��е�File����
	}

	// ��ȡ����·���µ��ļ���Ϣ
	public static void test1() {
		File file = new File("C:\\test\\a.txt");
		System.out.println("����·��Ϊ��" + file.getAbsolutePath());
		System.out.println("���·��Ϊ��" + file.getPath());
		System.out.println("�ļ����ƣ�" + file.getName());
		System.out.println("�ļ��ĳ���Ϊ��" + file.length());
		long time = file.lastModified();// ���ص��Ǻ���
		Date date = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		String strTime = sdf.format(date);
		System.out.println("�ļ����һ���޸�ʱ�䣺" + strTime);
	}

	// ��ȡ���·���µ��ļ���Ϣ
	public static void test2() {
		File file = new File("test\\b.txt");
		System.out.println("��Ŀ���ļ��ľ���·����" + file.getAbsolutePath());
		System.out.println("��Ŀ���ļ������·����" + file.getPath());
		System.out.println("��Ŀ���ļ����ƣ�" + file.getName());
		System.out.println("��Ŀ���ļ����ȣ�" + file.length());
		long time = file.lastModified();// ���غ���
		Date date = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strTime = sdf.format(date);
		System.out.println("��Ŀ���ļ����һ���޸�ʱ��Ϊ��" + strTime);
	}

	// ��ȡָ��Ŀ¼(����Ŀ¼)�µ������ļ������ļ��е�����
	public static void test3() {
		File file = new File("C:\\test");
		String[] arr = file.list();
		for (String name : arr) {
			System.out.println(name);
		}
	}

	// ��ȡָ��Ŀ¼(���Ŀ¼)�µ������ļ������ļ��е�����
	public static void test4() {
		File file = new File("yida");
		String[] arr = file.list();
		for (String name : arr) {
			System.out.println(name);
		}
	}

	// ��ȡָ��Ŀ¼(����Ŀ¼)�µ������ļ������ļ��е�File����
	public static void test5() {
		File file = new File("C:\\test");
		File[] arr = file.listFiles();
		for (File f : arr) {
			System.out.println(f.getAbsolutePath() + "---" + f.getName());
		}
	}

	// ��ȡָ��Ŀ¼(���Ŀ¼)�µ������ļ������ļ��е�File����
	public static void test6() {
		File file = new File("yida");
		File[] arr = file.listFiles();
		for (File f : arr) {
			System.out.println(f.getAbsolutePath() + "---" + f.getName());
		}
	}
}
