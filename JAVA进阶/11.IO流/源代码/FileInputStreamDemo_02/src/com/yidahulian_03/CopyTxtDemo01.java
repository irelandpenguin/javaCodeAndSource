package com.yidahulian_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����ı��ļ���
 * 
 * ����Դ����������
 * aa.txt	--	��ȡ����	--	FileInputStream	
 * 
 * Ŀ�ĵأ�������ȥ
 * bb.txt	--	д����     	--	FileOutputStream
 */
public class CopyTxtDemo01 {

	public static void main(String[] args) throws IOException {
		//test1();// �����ı��ļ���һ�ζ�һ����дһ��
		//test2();// �����ı��ļ���һ�ζ�һ���ֽ����飬дһ���ֽ�����
		test3();// ���󣺰�c:\\aa.txt�����Ƶ�c:\\bb.txt
	}

	// �����ı��ļ���һ�ζ�һ����дһ��
	public static void test1() throws IOException {
		// �����ֽ�����������
		FileInputStream fis = new FileInputStream("aa.txt");
		// ע�⣺aa.txt��û������ֱ�����лᱨ�쳣��
		// java.io.FileNotFoundException: aa.txt (ϵͳ�Ҳ���ָ�����ļ���)
		// ���ԣ�Ҫ��ǰ�ֹ�����(����봴��)һ��aa.txt�ļ���

		// �����ֽ����������
		FileOutputStream fos = new FileOutputStream("bb.txt");
		// bb.txtû������Ϊɶ�����쳣�أ�
		// ԭ����ϵͳ�����ֽ������ʱ�����Զ��ȴ����ļ���Ȼ���ٴ���������������Ѵ��������������󶨸��ļ���
		// ������ǽ���IO����һ��֪ʶ��ʱ�����Ѿ������ˡ������ٸ�ϰ�¡�

		// д����(ÿ�ζ�һ����дһ��)
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		// �ͷ���Դ(���ͷ�˭��һ����)
		fos.close();
		fis.close();

		// С�᣺
		// ��һ�θ��Ƶ�����û�г����κ����⣬Ϊʲô��?
		// ��һ�����ǳ��������ԭ����������ÿ�λ�ȡ��һ���ֽ����ݣ��ͰѸ��ֽ�����ǿ��ת��Ϊ�ַ���Ȼ�����������̨���������롣
		// ������ÿ�ζ�һ���ֽ����飬�պö������ĵ�һ��ʱ�����������̨���������롣
		// ����һ����? ����ȷʵͨ��IO����ȡ���ݣ�д���ı��ļ������ȡһ���ֽڣ��Ҿ�д��һ���ֽڣ��ڼ�û�����κε�ת����ϵͳ�Զ�ת����
		// ϵͳ�Զ�ת�����򣺵���ȡ��ASCII��ֵΪ��ֵ����ֱ��д���ı��ļ�������ȡ��ASCII��ֵΪ��ֵ(˵���Ǻ��ֵ�һ��)Ҳд���ļ���
		// ���������´���д�ֽڵ��ļ�ʱ���������Զ��ϲ������ĺ�һ���ֽڣ�ת���ɺ��ֱ��档
	}

	// �����ı��ļ���һ�ζ�һ���ֽ����飬дһ���ֽ�����
	public static void test2() throws IOException {
		// �����ֽ�����������
		FileInputStream fis = new FileInputStream("aa.txt");

		// �����ֽ����������
		FileOutputStream fos = new FileOutputStream("bb.txt");

		byte[] by = new byte[1024];
		int len = 0;
		while ((len = fis.read(by)) != -1) {// һ�ζ�һ���ֽ�����
			fos.write(by, 0, len);// һ��дһ���ֽ����� 
		}

		// �ͷ���Դ
		fos.close();
		fis.close();

		// С�᣺
		// ��һ�θ��Ƶ�����û�г����κ����⣬Ϊʲô��?
		// ����ȷʵͨ��IO����ȡ���ݣ�д���ı��ļ������ȡһ���ֽ����飬�Ҿ�д��һ���ֽ����飬�ڼ�û�����κε�ת����ϵͳ�Զ�ת����
		// ϵͳ�Զ�ת�����򣺵���ȡ��ASCII��ֵΪ��ֵ����ֱ��д���ı��ļ�������ȡ��ASCII��ֵΪ��ֵ(˵���Ǻ��ֵ�һ��)Ҳд���ļ���
		// ���������´���д�ֽ����鵽�ļ�ʱ���������Զ��ϲ������ĺ�һ���ֽڣ�ת���ɺ��ֱ��档

		// �ܽ᣺˵���ˣ�������һ��дһ���ֽڣ�����һ��дһ���ֽ����飬������ļ��������κ��������⡣�����������̨�Ϳ��ܳ������롣
		// ��Ϊ������ļ�ʱϵͳ���Զ�ת�������������̨��ϵͳ��ת����
	}

	// ���󣺰�c:\\aa.txt�����Ƶ�c:\\bb.txt
	public static void test3() throws IOException {
		// �����ֽ�����������
		FileInputStream fis = new FileInputStream("C:\\aa.txt");

		// �����ֽ����������
		FileOutputStream fos = new FileOutputStream("c:\\bb.txt");

		// д������
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = fis.read(by)) != -1) {
			fos.write(by, 0, len);
		}

		// �ͷ���Դ
		fos.close();
		fis.close();
	}

}
