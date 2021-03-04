package com.yidahulian_01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * �ֽ�������������裺
 * A:�����ֽ����������
 * B:����write()����
 * C:�ͷ���Դ(һ��Ҫ�ͷţ�����)
 * 
 * public void write(int b):дһ���ֽ�
 * public void write(byte[] b):дһ���ֽ�����
 * public void write(byte[] b,int off,int len):дһ���ֽ������һ����
 */
public class FileOutputStreamDemo02 {

	public static void main(String[] args) throws IOException {
		// �����ֽ����������
		OutputStream fos = new FileOutputStream("aa.txt");//��̬
		//FileOutputStream fos = new FileOutputStream("aa.txt");

		// public void write(int b):дһ���ֽ�
		//fos.write('9');
		//fos.write('7');
		//fos.write(97);// 97��Ӧ��ASCII��Ϊ�ַ�a
		//fos.write('A');
		//fos.write('b');
		//fos.write(57);// 9��ASCII��Ϊ57
		//fos.write(55);// 7��ASCII��Ϊ55
		//fos.write('��');// ���־Ͳ��У���Ϊһ������ռ2���ֽڣ���write����һ��ֻ��дһ���ֽ�

		// public void write(byte[] b):дһ���ֽ�����
		//byte[] bys = { 97, 98, 99, 100, 101 };
		byte[] bys = { 'A', 'B', 'C', 'D', 'E' };
		//fos.write(bys);

		// public void write(byte[] b,int off,int len):дһ���ֽ������һ����
		fos.write(bys, 2, 3);

		fos.close();// �ͷ���Դ
	}

}
