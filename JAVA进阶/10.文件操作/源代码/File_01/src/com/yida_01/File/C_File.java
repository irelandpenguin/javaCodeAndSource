package com.yida_01.File;

import java.io.File;
import java.io.IOException;

/**
 * ɾ������:public boolean delete()
 * 
 * ע�⣺ A:����㴴���ļ������ļ�������д�̷�·������ô��Ĭ���ڵ�ǰ��Ŀ·���¡� B:Java�е�ɾ�����߻���վ��һ��Ҫʮ��С�ģ�����
 * C:Ҫɾ��һ���ļ��У���ע����ļ����ڲ��ܰ����ļ������ļ��У�
 */
public class C_File {
	public static void main(String[] args) {
		// test1();// ��c�̴���һ��hello.txt�ļ�
		// test2();// һ��С�ģ�������д�̷��ˡ��������ļ�������ȥ�ˣ�
		// test3();// ��c�̴���һ���ļ���
		// test4();// һ��С�ģ�������д�̷��ˡ����������������ȥ�ˣ�

		// ɾ�����ܣ���Ҫɾ��c�����hello.txt����ļ�
		// File file = new File("c:\\hello.txt");
		// boolean isOK = file.delete();
		// if (isOK) {
		// System.out.println("�ļ�ɾ���ɹ�");
		// } else {
		// System.out.println("�ļ�ɾ��ʧ��");
		// }

		// ɾ�����ܣ���Ҫɾ����Ŀ���hello.txt����ļ�
		// File file = new File("hello.txt");
		// boolean isOK = file.delete();
		// if (isOK) {
		// System.out.println("�ļ�ɾ���ɹ�");
		// } else {
		// System.out.println("�ļ�ɾ��ʧ��");
		// }

		// ɾ�����ܣ���ҪC�����ɾ��ccc����ļ���

		// File file = new File("c:\\aaa\\bbb\\ccc");
		// boolean isOK = file.delete();
		// if (isOK) {
		// System.out.println("�ļ���ɾ���ɹ�");
		// } else {
		// System.out.println("�ļ���ɾ��ʧ��");
		// }

		// ɾ�����ܣ���Ҫɾ��C�����aaa����ļ���
		// File file = new File("C:\\aaa");
		// boolean isOK = file.delete();// ������ɾ����ʧ�ܣ���Ϊaaa�ļ����ﻹ����bbb�ļ��С�
		// if (isOK) {
		// System.out.println("�ļ���ɾ���ɹ�");
		// } else {
		// System.out.println("�ļ���ɾ��ʧ��");
		// }

		// Ҫ��ɾ��aaa�ļ��У�������ɾ��bbb�ļ��У���ɾ��aaa�ļ���
		// File file = new File("c:\\aaa\\bbb");
		// System.out.println("delete:" + file.delete());
		// file = new File("c:\\aaa");
		// System.out.println("delete:" + file.delete());

		// ɾ�����ܣ���Ҫɾ����Ŀ���aaa����ļ���
		// File file = new File("aaa\\bbb\\ccc");// ��ɾccc�ļ���
		// System.out.println("delete:" + file.delete());
		// file = new File("aaa\\bbb");// ��ɾbbb�ļ���
		// System.out.println("delete:" + file.delete());
		// file = new File("aaa");// ���ɾaaa�ļ���
		// System.out.println("delete:" + file.delete());
	}

	// ��c�̴���һ��hello.txt�ļ�
	public static void test1() {
		File file = new File("c:\\hello.txt");
		try {
			boolean isOK = file.createNewFile();
			if (isOK) {
				System.out.println("�ļ������ɹ�");
			} else {
				System.out.println("�ļ�����ʧ��");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// һ��С�ģ�������д�̷��ˡ��������ļ�������ȥ�ˣ�
	public static void test2() {
		File file = new File("hello.txt");
		try {
			boolean isOK = file.createNewFile();
			if (isOK) {
				System.out.println("�ļ������ɹ�");
			} else {
				System.out.println("�ļ�����ʧ��");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// С�᣺����㴴���ļ������ļ�������д�̷�·������ô��Ĭ���ڵ�ǰ��Ŀ·���¡�
	}

	// ��c�̴���һ���ļ���
	public static void test3() {
		File file = new File("c:\\aaa\\bbb\\ccc");
		boolean isOK = file.mkdirs();
		if (isOK) {
			System.out.println("�ļ��д����ɹ�");
		} else {
			System.out.println("�ļ��д���ʧ��");
		}
	}

	// һ��С�ģ�������д�̷��ˡ����������������ȥ�ˣ�
	public static void test4() {
		File file = new File("aaa\\bbb\\ccc");
		boolean isOK = file.mkdirs();
		if (isOK) {
			System.out.println("�ļ��д����ɹ�");
		} else {
			System.out.println("�ļ��д���ʧ��");
		}

		// С�᣺����㴴���ļ������ļ�������д�̷�·������ô��Ĭ���ڵ�ǰ��Ŀ·���¡�
	}
}
