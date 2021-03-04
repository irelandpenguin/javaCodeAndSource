package com.yidahulian_01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���ʵ�����ݵĻ���?
 * 		Ϊʲô����û�л�����?��Ϊ���ǲ�û��д�뻻�з��š�
 * 		���ʵ����?д�뻻�з��ż����¡�
 * 
 * 		�ղ����ǿ�������д�ı��ļ����ǿ��Եģ�ͨ��windows�Դ����Ǹ����У�Ϊʲô��?
 * 		��Ϊ��ͬ��ϵͳ�����з����ǲ�һ����?
 * 		windows:\r\n
 * 		linux:\n
 * 		Mac:\r
 * 		��һЩ�����ĸ��߼����±����ǿ���ʶ�����⻻�з��ŵġ�
 * 
 * ���ʵ�����ݵ�׷��д��?
 * 		�ù��췽�����ڶ���������true���������
 */
public class FileOutputStreamDemo03 {
	public static void main(String[] args) throws IOException {
		//test1();//���з���ʹ��
		test2();// �˷�����������2�λ��Σ��������ʲô��ͬ��
	}

	public static void test1() throws IOException {
		// �����ֽ����������
		FileOutputStream fos = new FileOutputStream("bb.txt");

		// д����
		for (int i = 0; i < 10; i++) {
			fos.write(("java" + i).getBytes());
			//fos.write("\n".getBytes());//����,ʹ�����ֻ��з�,eclipse��notepad++�����������У���windows�Դ����±��Ͳ��С�
			fos.write("\r\n".getBytes());// windows��Ļ��з�����ʱwindows�ļ��±�Ҳ�ܻ�����
		}

		// �ͷ���Դ
		fos.close();
	}

	public static void test2() throws IOException {
		// public FileOutputStream(String name) ÿ�δ��ļ�ͷд��
		/*FileOutputStream fos = new FileOutputStream("cc.txt");
		fos.write("hello,java".getBytes());
		fos.close();*/

		// public FileOutputStream(String name, boolean append) //true��ʾÿ�δ��ļ�βд�룬false��ʾÿ�δ��ļ�ͷд�롣
		//FileOutputStream fos2 = new FileOutputStream("dd.txt", true);
		//public FileOutputStream(File file, boolean append) //true��ʾÿ�δ��ļ�βд�룬false��ʾÿ�δ��ļ�ͷд�롣
		FileOutputStream fos2 = new FileOutputStream(new File("dd.txt"), true);
		fos2.write("hello,java".getBytes());
		fos2.close();
	}
}
