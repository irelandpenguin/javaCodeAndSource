package com.yidahulian_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * ������һ���ı��ļ��д洢�˼�������������дһ������ʵ�������ȡһ���˵����֡�
 * 
 * ������
 * 		A:���ı��ļ��е����ݴ洢��������
 * 		B:�������һ������
 * 		C:���ݸ�������ȡһ��ֵ
 */
public class SrandGetName03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("name.txt"));
		ArrayList<String> list = new ArrayList<String>();
		String s = null;
		while ((s = br.readLine()) != null) {
			list.add(s);
		}
		br.close();

		// ����һ�������
		int count = list.size();
		Random r = new Random();
		int index = r.nextInt(count);//0~count֮�����������������count

		// ����������ȡ����
		System.out.println(list.get(index));
	}

}
