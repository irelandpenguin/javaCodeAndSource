package com.yidahulian_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * ��֪s.txt�ļ�����������һ���ַ�����"hcexfgijkamdnoqrzstuvwybpl"
 * ���д�����ȡ�������ݣ������ݴ�С���������д��ss.txt�С�
 * 
 * ������
 * 		A:��s.txt����ļ���������
 * 		B:��ȡ���ļ������ݣ��洢��һ���ַ�����
 * 		C:���ַ���ת��Ϊ�ַ�����
 * 		D:���ַ������������
 * 		E:���������ַ�����ת��Ϊ�ַ���
 * 		F:���ַ����ٴ�д��ss.txt��
 */
public class StringDemo {

	public static void main(String[] args) throws IOException {
		// ��ȡ���ļ������ݣ��洢��һ���ַ�����
		BufferedReader br = new BufferedReader(new FileReader("s.txt"));
		String str = br.readLine();
		br.close();// �ͷ���Դ

		// ���ַ���ת��Ϊ�ַ�����
		char[] arr = str.toCharArray();

		// ���ַ������������
		Arrays.sort(arr);//��С��������

		// ���������ַ�����ת��Ϊ�ַ���
		String newStr = new String(arr);

		// ���ַ����ٴ�д��ss.txt��
		BufferedWriter bw = new BufferedWriter(new FileWriter("ss.txt"));
		bw.write(newStr);
		bw.flush();// ˢ��
		bw.close();// �ͷ���Դ
	}

}
