package com.yida_01.File;

import java.io.File;

/**
 * ����������:public boolean renameTo(File dest)
 * 		���·������ͬ�����Ǹ�����
 * 		���·������ͬ�����Ǹ��������С�
 * 
 * ���
 * ����·��:·�����̷���ʼ�ģ����磺c:\\aa\\bb\\a.txt
 * ���·����·�������̷���ʼ�ģ����磺aa\\bb\\a.txt
 */
public class D_File {

	public static void main(String[] args) {
		// test1();// �����������Ŀ��� photo1.jpg ����Ϊ �˴ﻥ��.jpg
		// test2();// �����������Ŀ����� photo2.jpg ����Ϊyida.jpg
		// test3();// ���������c�����photo1.jpg����Ϊ �˴ﻥ��.jpg
		// test4();// ���������c��testĿ¼���photo2.jpg����Ϊ yida.jpg
		// test5();// ���������c��testĿ¼���photo3.jpg����Ϊyidahulian.jpg�����е�C�̸�Ŀ¼��
		// test6();// ���������c��testĿ¼���hello�ļ��м��е�c�̸�Ŀ¼��
	}

	// �����������Ŀ��� photo1.jpg ����Ϊ �˴ﻥ��.jpg
	public static void test1() {
		File file = new File("photo1.jpg");
		File desFile = new File("�˴ﻥ��.jpg");
		boolean isOK = file.renameTo(desFile);
		if (isOK) {
			System.out.println("�����ɹ�");
		} else {
			System.out.println("����ʧ��");
		}
	}

	// �����������Ŀ����� photo2.jpg ����Ϊyida.jpg
	public static void test2() {
		File file = new File("src\\com\\yida_01\\File\\photo2.jpg");
		File desFile = new File("src\\com\\yida_01\\yidahulian.jpg");
		boolean isOK = file.renameTo(desFile);
		if (isOK) {
			System.out.println("�����ɹ�");
		} else {
			System.out.println("����ʧ��");
		}
	}

	// ���������c�����photo1.jpg����Ϊ �˴ﻥ��.jpg
	public static void test3() {
		File file = new File("c:\\photo1.jpg");
		File desFile = new File("c:\\�˴ﻥ��.jpg");
		boolean isOK = file.renameTo(desFile);
		if (isOK) {
			System.out.println("�����ɹ�");
		} else {
			System.out.println("����ʧ��");
		}
	}

	// ���������C��testĿ¼���photo2.jpg����Ϊ yida.jpg
	public static void test4() {
		File file = new File("C:\\test\\photo2.jpg");
		File desFile = new File("C:\\test\\yida.jpg");
		boolean isOK = file.renameTo(desFile);
		if (isOK) {
			System.out.println("�����ɹ�");
		} else {
			System.out.println("����ʧ��");
		}
	}

	// ���������C��testĿ¼���photo3.jpg����Ϊyidahulian.jpg�����е�C�̸�Ŀ¼��
	public static void test5() {
		File file = new File("C:\\test\\photo3.jpg");
		File desFile = new File("C:\\yidahulian.jpg");
		boolean isOK = file.renameTo(desFile);
		if (isOK) {
			System.out.println("�����ɹ�");
		} else {
			System.out.println("����ʧ��");
		}
	}

	// ���������C��testĿ¼���hello�ļ��м��е�C�̸�Ŀ¼��
	public static void test6() {
		File file = new File("C:\\test\\hello");
		File desFile = new File("C:\\hello");
		boolean isOK = file.renameTo(desFile);
		if (isOK) {
			System.out.println("�ļ��м��гɹ�");
		} else {
			System.out.println("�ļ��м���ʧ��");
		}
	}
}
