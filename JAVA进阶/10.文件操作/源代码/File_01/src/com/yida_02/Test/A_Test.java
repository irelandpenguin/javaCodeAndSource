package com.yida_02.Test;

import java.io.File;

/**
 * �ж�C��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
 * 
 * ������
 * 		A:��װC��Ŀ¼
 * 		B:��ȡ��Ŀ¼�������ļ������ļ��е�File����
 * 		C:������File���飬�õ�ÿһ��File����Ȼ���ж�
 * 		D:�Ƿ����ļ�
 * 			�ǣ������ж��Ƿ���.jpg��β
 * 				�ǣ���������ļ�����
 * 				�񣺲�������
 * 			�񣺲�������
 */
public class A_Test {
	public static void main(String[] args) {
		File file = new File("C:\\");
		File[] arr = file.listFiles();
		for (File f : arr) {
			if (f.isFile()) {
				String name = f.getName();
				if (name.endsWith(".jpg")) {
					System.out.println(name);
				}
			}
		}
	}
}
