package com.yida_02.Test;

import java.io.File;

/**
 * ���󣺰�C:\�����嵥  �ļ�����ĸ�����Ϊ������_����.mp3,�Ҳ��ı�ԭ����Ŀ¼��
 * 		���磺����_[����ѽ����]_����Ѷ.mp3    ��Ϊ    ����_����Ѷ.mp3
 * 
 * ˼·��
 * 		A:��װ����Ŀ¼
 * 		B:��ȡ��Ŀ¼�������ļ���File����
 * 		C:������File���飬�õ�ÿһ��File����
 * 		D:ƴ��һ���µ����ƣ�Ȼ�����������ɡ�
 */
public class C_Test {
	public static void main(String[] args) {
		File file = new File("C:\\�����嵥");
		File[] arr = file.listFiles();
		for (File f : arr) {
			if (f.isFile()) {// ���ļ��ģ����޸�
				String name = f.getName();
				if (name.endsWith(".mp3") || name.endsWith(".MP3")) {// �ж��Ƿ���mp3�ļ�
					// ����_[����ѽ����]_����Ѷ.mp3
					String[] strAry = name.split("_");
					String newName = strAry[0] + "_" + strAry[strAry.length - 1];
					File desFile = new File(file, newName);
					boolean b = f.renameTo(desFile);
					if (b == true) {
						System.out.println(name + "--" + "�������ɹ�");
					}
				}
			}
		}
	}
}
