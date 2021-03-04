package com.yidahulian_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ����ת�������ֽ���ת�����ַ���
 * InputStreamReader(InputStream is):��Ĭ�ϵı����ȡ����(ע�⣺�ڶ�ȡ����ʱ�������Ĭ�ϱ�����н���)
 * InputStreamReader(InputStream is,String charsetName):��ָ���ı����ȡ����(ע�⣺�ڶ�ȡ����ʱ������ݸ���������н���)
 */
public class InputStreamReader02 {

	public static void main(String[] args) throws IOException {
		test1();// ��Ĭ�ϵı����ȡ����
		//test2();
		//test3();//��ָ���ı����ȡ����
	}

	// ��Ĭ�ϵı����ȡ����
	public static void test1() throws IOException {
		// InputStreamReader(InputStream is):��Ĭ�ϵı����ȡ����
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));

		// ������,һ�ζ�һ���ַ�(�������ֽڣ���Ϊ�Ѿ�ͨ��ת�������ֽ�ת���ַ������Ҫ�������)
		int by = 0;
		while ((by = isr.read()) != -1) {
			System.out.print((char) by);
		}

		// �ͷ���Դ
		isr.close();

		// С�᣺
		// Ϊʲô���һ�ζ�һ��Ҳ������������أ�
		// ��Ϊ��OutputStreamWriter01.java�ļ��У�ʹ��ƽ̨Ĭ�ϱ���(GBK)���ַ���������ֽ���д��a.txt����
		// �����ţ�ʹ��InputStreamReader��ȡa.txtʱ����Ĭ��ʹ��ƽ̨Ĭ�ϱ���(GBK)���ֽ���������ַ����ˡ�
		// ���ԣ�һ��һ���Ķ�����û�����⡣
		// ��ĸ�����֣������Ŷ����ַ���ͨ��ת����ÿ�ζ���Ҳ�����ַ������ԣ�����Ҳ����ȷ�������ˡ�
	}
	
	//�ֽڶ�ȡ����Ȼ��������
	public static void test2() throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");//�ֽ�������
		int by = 0;
		while((by=fis.read()) != -1) {
			System.out.print((char)by);
		}
		fis.close();
	}

	//ָ�������ʽ��ȡ
	public static void test3() {
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream("b.txt"), "UTF-8");//ʹ��ָ���ı����ʽ���н���
			int by = 0;
			while((by=isr.read()) != -1) {
				System.out.print((char)by);
			}
			isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
