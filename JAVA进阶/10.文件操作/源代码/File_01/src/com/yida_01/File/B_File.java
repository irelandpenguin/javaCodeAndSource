package com.yida_01.File;

import java.io.File;
import java.io.IOException;

/**
 *�������ܣ�
 *public boolean createNewFile():�����ļ���������ļ��Ѵ��ڣ��Ͳ�������
 *public boolean mkdir():���������ļ��У�������ļ����Ѵ��ڣ��Ͳ�������
 *public boolean mkdirs():����һ���ļ��У�������ļ��в����ڣ�������Զ���������
 *
 *ע�⣺�����ļ������ļ��У�������Ҫ�����ˣ�
 */
public class B_File {
	public static void main(String[] args) {
		// test1();// ������Ҫ��d��Ŀ¼�´���һ���ļ���yida
		// test2();// ����:��Ҫ��D��Ŀ¼�´���һ���ļ�a.txt
		// test3();// ������Ҫ��d��Ŀ¼test�´���һ���ļ�b.txt
		// test4();// ����:��Ҫ��d��Ŀ¼mytest�´���aaaĿ¼,Ȼ����aaaĿ¼�´���bbbĿ¼
		// test5();// mkdirs��ʹ��ע������
	}

	// ������Ҫ��C��Ŀ¼�´���һ���ļ���yida
	public static void test1() {
		File file = new File("c:\\yida");
		boolean isOK = file.mkdir();
		if (isOK) {
			System.out.println("�ļ��д����ɹ�");
		} else {
			System.out.println("�ļ��д���ʧ��");
		}
	}

	// ����:��Ҫ��C��Ŀ¼�´���һ���ļ�a.txt
	public static void test2() {
		File file = new File("C:\\a.txt");
		try {
			boolean isOK = file.createNewFile();
			if (isOK) {
				System.out.println("�ļ������ɹ�");
			} else {
				System.out.println("�ļ�����ʧ��");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ������Ҫ��C��Ŀ¼test�´���һ���ļ�b.txt
	public static void test3() {
		// ע�⣺Ҫ����ĳ��Ŀ¼�´����ļ�����Ŀ¼���ȱ������!
		/*File file = new File("C:\\test\\b.txt");
		try {
			boolean isOK = file.createNewFile();// ����java.io.IOException:ϵͳ�Ҳ���ָ����·����
			if (isOK) {
				System.out.println("�ļ������ɹ�");
			} else {
				System.out.println("�ļ�����ʧ��");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}*/

		// ��ȷ���������£�
		File file = new File("c:\\test");
		if (file.mkdir()) {
			File file2 = new File("c:\\test\\b.txt");
			// File file2 = new File("c:\\test", "b.txt");
			// File file2 = new File(file, "b.txt");
			try {
				boolean isOK = file2.createNewFile();
				if (isOK) {
					System.out.println("�ļ������ɹ�");
				} else {
					System.out.println("�ļ�����ʧ��");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// С�᣺��ָ��Ŀ¼�ﴴ���ļ�ʱ�����뱣֤�ļ��ĸ�Ŀ¼���ڣ�
	}

	// ����:��Ҫ��c��Ŀ¼mytest�´���aaaĿ¼,Ȼ����aaaĿ¼�´���bbbĿ¼
	public static void test4() {
		/*File file = new File("c:\\mytest\\aaa\\bbb");
		boolean isOK = file.mkdir();// ������������ʧ�ܵġ���Ϊ����Ŀ¼������
		if (isOK) {
			System.out.println("�����ɹ�");
		} else {
			System.out.println("����ʧ��");
		}*/

		// С�᣺�����༶Ŀ¼ʱ�����뱣֤����Ŀ¼���ڣ�
		
		// ����ʹ��mkdirs��һ���Դ����༶Ŀ¼��mkdirs���Զ����������ڵĸ���Ŀ¼��
		File file = new File("c:\\mytest\\aaa\\bbb");
		boolean isOK = file.mkdirs();
		if (isOK) {
			System.out.println("�ļ��д����ɹ�");
		} else {
			System.out.println("�ļ��д���ʧ��");
		}
	}

	// mkdirs��ʹ��ע������
	public static void test5() {
		File file = new File("c:\\aaa\\bbb\\ccc");
		boolean isOK = file.mkdirs();
		if (isOK) {
			System.out.println("�ļ��д����ɹ�");
		} else {
			System.out.println("�ļ��д���ʧ��");
		}

		// �����д���Ǵ���ģ���Ϊmkdirs�����ڴ�����Ŀ¼�ģ��������������ļ��ġ�
		/*File file2 = new File("d:\\aa\\hello.txt");
		isOK = file2.mkdirs();
		if (isOK) {
			System.out.println("�ļ������ɹ�");
		} else {
			System.out.println("�ļ�����ʧ��");
		}*/
		
		// С�᣺��Ҫ��Ϊ��׺Ϊ.txt, .mp3, .mp4�Ⱦ����ı��ļ������������ļ��С�����ν�������Ĳ�һ������ɮ!
	}
}
