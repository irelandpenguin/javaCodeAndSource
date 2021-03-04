package com.yidahulian_03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter�ķ�����
 * public void write(int c):дһ���ַ�
 * public void write(char[] cbuf):дһ���ַ�����
 * public void write(char[] cbuf,int off,int len):дһ���ַ������һ����
 * public void write(String str):дһ���ַ���
 * public void write(String str,int off,int len):дһ���ַ�����һ����
 * 
 * �����⣺close()��flush()������?
 * A:close()�ر������󣬵�����ˢ��һ�λ��������ر�֮�������󲻿��Լ�����ʹ���ˡ�
 * B:flush()����ˢ�»�����,ˢ��֮�������󻹿��Լ���ʹ�á�
 */
public class OutputStreamWriter01 {

	public static void main(String[] args) throws IOException {
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}

	public static void test1() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("c.txt"));

		// public void write(int c):дһ���ַ�
		//osw.write(97);// д������
		osw.write('a');// д������
		osw.write('��');

		//osw.flush();// ˢ������(�����ַ�д�����ı��ļ���)
		osw.close();// �ͷ���Դ(�÷������Ȼ�ˢ��һ�����ݣ���֤�ַ�д�����ı��ļ��С�Ȼ�����ͷ���Դ)

		// �����ˢ�����ݣ�Ҳ���ͷ���Դ����ע��ˢ���������ͷ���Դ���룬����ʲô����أ�
		// �ᷢ�����ݲ���д�뵽�ļ��У���Ϊ�ļ������ݴ洢�Ļ�����λ���ֽڡ�

		// ���close()����򿪣����д��뱨�쳣java.io.IOException: Stream closed
		//osw.write('b');

		// �����close()����ע�ͣ�����flush()���룬���д��뽫����д�����ļ�
		//osw.write('b');
		//osw.flush();// ˢ������(�����ַ�д�����ı��ļ���)
	}

	public static void test2() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d.txt"));

		// void write(char[] cbuf):дһ���ַ�����
		char[] arr = { 'h', 'e', 'l', 'l', 'o', ',', '��', '��', '��', '��' };
		osw.write(arr);
		//osw.flush();// ���д���ɲ�д����Ϊclose�������ͷ���Դǰ��Ҳ��ˢ��һ�Ρ�����һ��д�������ݽ϶�ʱ(���磺1024��ʱ)�����Ҳ����һ�¡�
		osw.close();// �ͷ���Դ
	}

	public static void test3() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e.txt"));

		// public void write(char[] cbuf,int off,int len):дһ���ַ������һ����
		char[] arr = { 'h', 'e', 'l', 'l', 'o', ',', '��', '��', '��', '��' };
		osw.write(arr, 6, 4);

		//osw.flush();// ���д���ɲ�д����Ϊclose�������ͷ���Դǰ��Ҳ��ˢ��һ�Ρ�����һ��д�������ݽ϶�ʱ�����Ҳ����һ�¡�
		osw.close();// �ͷ���Դ
	}

	public static void test4() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("f.txt"));

		// public void write(String str):дһ���ַ���
		// String s = "hello,�˴ﻥ������java,�Ͷ���";
		String s = "hello,�˴ﻥ����\r\n��java,�Ͷ���!";
		osw.write(s);

		osw.flush();// ���д���ɲ�д����Ϊclose�������ͷ���Դǰ��Ҳ��ˢ��һ�Ρ�����һ��д�������ݽ϶�ʱ�����Ҳ����һ�¡�
		osw.close();// �ͷ���Դ
	}

	public static void test5() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("g.txt"));

		// public void write(String str):дһ���ַ���
		// String s = "hello,�˴ﻥ���ơ���java,�Ͷ���";
		String s = "hello,�˴ﻥ����\r\n��java,�Ͷ���!";
		osw.write(s, 6, 12);

		//osw.flush();// ���д���ɲ�д����Ϊclose�������ͷ���Դǰ��Ҳ��ˢ��һ�Ρ�����һ��д�������ݽ϶�ʱ�����Ҳ����һ�¡�
		osw.close();// �ͷ���Դ
	}

}
