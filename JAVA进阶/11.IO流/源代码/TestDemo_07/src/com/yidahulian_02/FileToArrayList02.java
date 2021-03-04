package com.yidahulian_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ���󣺴��ı��ļ��ж�ȡ����(ÿһ��Ϊһ���ַ�������)�������У�����������
 * 
 * ������
 * 		ͨ����Ŀ����˼���ǿ���֪�����µ�һЩ���ݣ�
 * 			����Դ��һ���ı��ļ���
 * 			Ŀ�ĵ���һ�����ϡ�
 * 			����Ԫ�����ַ�����
 * 
 * ����Դ��
 * 		b.txt -- BufferedReader
 * Ŀ�ĵأ�
 * 		ArrayList<String>
 */
public class FileToArrayList02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		ArrayList<String> list = new ArrayList<String>();
		
		String s = null;
		while ((s = br.readLine()) != null) {
			list.add(s);
		}
		
		br.close();

		// ��������
		for (String str : list) {
			System.out.println(str);
		}
	}

}
