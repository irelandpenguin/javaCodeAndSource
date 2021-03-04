package com.yidahulian_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���󣺸���ָ��Ŀ¼�µ�ָ���ļ������޸ĺ�׺����
 * 
 * ָ�����ļ��ǣ�.java�ļ���
 * ָ���ĺ�׺���ǣ�.txt
 * ָ����Ŀ¼�ǣ�demo04
 * 
 * ����Դ��c:\\demo03\\hello.java
 * Ŀ�ĵأ�c:\\demo04\\hello.txt
 * 
 * ������
 * 		A:��װĿ¼
 * 		B:��ȡ��Ŀ¼�µ�java�ļ���File����
 * 		C:������File���飬�õ�ÿһ��File����
 * 		D:�Ѹ�File���и���
 * 		E:��Ŀ�ĵ�Ŀ¼�¸���
 * 
 * ���Ϊ.java���ļ����ַ��ļ������Ķ������ԣ�ʹ�ø�Ч�ַ����������ơ�
 */
public class CopyFolder02 {

	public static void main(String[] args) throws IOException {
		File originFile = new File("c:\\demo03");
		File destFile = new File("c:\\demo04");

		// ������Ŀ�ĵأ��ʹ���
		if (!destFile.exists()) {
			destFile.mkdir();
		}

		// ɸѡ���˳�.java�ļ�
		File[] arr = originFile.listFiles(new FileFilter() {

			@Override
			public boolean accept(File file) {
				boolean a = file.isFile();
				boolean b = file.getName().endsWith(".java");
				return a&&b;// a,b��Ϊ��ʱ���ű�ʾ��һ�����Ϊ.java�ļ�
			}
		});

		// ������File���飬�õ�ÿһ��File����
		for (File origin : arr) {
			File dest = new File(destFile, origin.getName());
			copyFile(origin, dest);
		}

		// ��Ŀ�ĵ�Ŀ¼����
		File[] arr2 = destFile.listFiles();
		for (File f : arr2) {
			String name = f.getName();
			String newName = name.replace(".java", ".txt");
			f.renameTo(new File(destFile, newName));
		}
		
		System.out.println("over~~");
	}

	// ��Ч�ַ������� �����ļ���һ�θ���һ��
	public static void copyFile(File origin, File dest) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(origin));
		BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

		String s = null;
		while ((s = br.readLine()) != null) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}

		// �ͷ���Դ
		bw.close();
		br.close();
	}
}
