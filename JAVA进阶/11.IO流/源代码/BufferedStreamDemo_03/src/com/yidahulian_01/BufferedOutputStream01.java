package com.yidahulian_01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ͨ����������ķ�ʽȷʵ����ǰһ�ζ�ȡһ���ֽڵķ�ʽ��ܶ࣬���ԣ�������һ�����������Ƿǳ��õġ�
 * ��Ȼ�������Ļ�����ô��java��ʼ����Ƶ�ʱ����Ҳ���ǵ���������⣬��ר���ṩ�˴����������ֽ��ࡣ
 * 
 * �����౻��Ϊ���ֽڻ�������(��Ч�ֽ���)
 * д���ݣ�BufferedOutputStream ��Ч����������
 * �����ݣ�BufferedInputStream ��Ч���������
 * 
 * ���췽������ָ���������Ĵ�С����������һ���ò��ϣ���ΪĬ�ϻ�������С���㹻�ˡ�
 * 
 * Ϊʲô������һ��������ļ������ļ�·�������Ǵ���һ��OutputStream������?
 * ԭ��ܼ򵥣��ֽڻ������������ṩ��������Ϊ��Ч����Ƶġ����������Ķ�д�������ÿ�������������ʵ�֡�
 */
public class BufferedOutputStream01 {

	public static void main(String[] args) throws IOException {
		test1();// ������Ч�ֽڻ���������
	}

	public static void test1() throws IOException {
		// ������Ч�ֽڻ������������
		// FileOutputStream fis = new FileOutputStream("a.txt");
		// BufferedOutputStream bos = new BufferedOutputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a.txt"));

		// д������
		bos.write("hello, �˴ﻥ��".getBytes());

		// ˢ�»�����(һ�㵱һ��д���ܶ��ֽ�ʱ�����ǲŵ��ô�ˢ�·�����)
		//bos.flush();

		// �ͷ���Դ(�ͷ���ԴʱҲ��ˢ��һ�λ����������ԣ����д���ֽں���ʱ���Ͳ�����ʾ����flush()���������رո�Ч�ֽڻ�����ʱ��Ҳ���Զ�ˢ��һ��)
		bos.close();
	}
}
