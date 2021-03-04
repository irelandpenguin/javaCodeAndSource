package com.yidahulian_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ������������ⷽ����
 * BufferedWriter:
 * 		public void newLine():����ϵͳ���������з�
 * BufferedReader:
 * 		public String readLine()��һ�ζ�ȡһ������
 * 		�����������ݵ��ַ��������������κ�����ֹ��������ѵ�����ĩβ���򷵻� null
 * 
 * �ַ���������newLine()�� readLine()Ҳ���Ժ��д�ַ�����ʱ��ʹ�����ģ�
 */
public class BufferedLine03 {

	public static void main(String[] args) throws IOException {
		//test1();
		//test2();
		test3();// ���հ����
	}

	public static void test1() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("aa.txt"));

		for (int i = 1; i <= 10; i++) {
			bw.write("hello" + i);
			// ϵͳ����(ע�⣺�����ϵͳ��ָwindowsϵ�е�ϵͳ����macϵͳ���з���\r��linuxϵͳ�Ļ��оͲ���\n�����ԣ����ܶ�ƽ̨����)
			//bw.write("\r\n");

			// public void newLine():����ϵͳ���������з����ﵽƽ̨����
			bw.newLine();// �÷������Զ�����ϵͳ���������з����ﵽƽ̨����

			//bw.flush();// ˢ�»�����
		}

		bw.close();// �ͷ���Դ
	}

	public static void test2() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("bb.txt"));
		// public String readLine()��һ�ζ�ȡһ������
		// �����������ݵ��ַ����������������з�����ֹ��������ѵ�����ĩβ���򷵻� null

		// ��ȡ��һ������
		String s = br.readLine();
		//System.out.print(s);
		System.out.println(s);// ��ΪreadLine()����ÿ�ζ�ȡһ�У������������з������ԣ�Ҫ��println�������

		// ��ȡ�ڶ�������
		s = br.readLine();
		//System.out.print(s);
		System.out.println(s);

		// ��ȡ����������
		s = br.readLine();
		//System.out.print(s);
		System.out.println(s);

		// ��ȡ����������
		s = br.readLine();
		//System.out.print(s);
		System.out.println(s);

		// ��ȡ����������
		s = br.readLine();
		//System.out.print(s);
		System.out.println(s);
		
		// ��ȡ����������
		s = br.readLine();// �����ļ�ĩβʱ������null
		//System.out.print(s);
		System.out.println(s);

		br.close();// �ͷ���Դ
	}

	public static void test3() throws IOException {
		//BufferedReader br = new BufferedReader(new FileReader("bb.txt"));
		BufferedReader br = new BufferedReader(new FileReader("src\\com\\yidahulian_01\\BufferedLine03.java"));

		// public String readLine()��һ�ζ�ȡһ������
		// �����������ݵ��ַ��������������κ�����ֹ��������ѵ�����ĩβ���򷵻� null
		String s = null;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}

		br.close();// �ͷ���Դ
	}

}
