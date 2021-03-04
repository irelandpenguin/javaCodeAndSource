package com.yida_02.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * �ж�C��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ����ơ�
 * 	ʵ�ַ�ʽһ:�Ȼ�ȡ���еģ�Ȼ�������ʱ�������жϣ�����������������������Ѿ�ʵ���ˡ�
 *	ʵ�ַ�ʽ��:��ȡ��ʱ����Ѿ��������������ˣ�Ȼ��������ɡ�
 * 
 * Ҫ��ʵ�����Ч�����ͱ���ѧϰһ���ӿڣ��ļ����ƹ�����
 * 	public String[] list(FilenameFilter filter)
 * 	public File[] listFiles(FilenameFilter filter)
 */
public class B_Test {
	public static void main(String[] args) {
		test();
		//test2();
	}

	public static void test() {
		File file = new File("C:\\");
		String[] arr = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// System.out.println(dir + "---" + name);
				File f = new File(dir, name);
				boolean b = f.isFile() && f.getName().endsWith(".jpg");
				return b;
			}
		});
		for (String s : arr) {
			System.out.println(s);
		}
	}

	public static void test2() {
		File file = new File("C:\\");
		File[] arr = file.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".jpg");
			}
		});
		for (File f : arr) {
			System.out.println(f.getName());
		}
	}
}
