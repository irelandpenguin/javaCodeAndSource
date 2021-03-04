package com.yidahulian_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * ���룬����
 * ASCII, GB2312, GBK, GB18030, UTF-8, Unicode, UTF-16, BIG-5, ISO-8859-1��
 * 
 * �鿴String��API�ĵ�˵����
 * public String(byte[] bytes):ʹ��Ĭ���ַ���(GBK)���ֽ�������н��룬�����ַ���
 * public String(byte[] bytes,String charsetName):ʹ��ָ���ַ������ֽ�������н��룬�����ַ���
 * public byte[] getBytes():ʹ��Ĭ���ַ���(GBK)���ַ������б��룬�����ֽ�����
 * public byte[] getBytes(String charsetName):ʹ��ָ�����ַ������ַ������б��룬�����ֽ�����
 * 
 * ����:�ѿ��ö��ı�ɿ�������
 * String --> byte[]
 * 
 * ����:�ѿ������ı�ɿ��ö���
 * byte[] --> String
 * 
 * ���룬��������򵥣�ֻҪ��֤���������ĸ�ʽ��һ�µġ�
 */
public class StringDemo02 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//String s = "���";
		String s = "���,hello";

		// String -> byte[]
		byte[] by = s.getBytes();// ʹ��Ĭ���ַ���(GBK)���ֽ�������н��룬�����ַ���
		//System.out.println("Ĭ�ϱ���(GBK):" + Arrays.toString(by));
		
		// ��ӡ�����Ĭ�ϱ���(GBK):[-60, -29, -70, -61]
		String result = new String(by);// ʹ��Ĭ���ַ���(GBK)���ֽ�������н��룬�����ַ���
		//System.out.println("Ĭ�Ͻ���(GBK)���Ϊ��" + result);
		by = s.getBytes("GBK");// ʹ��ָ�����ַ������ַ������б��룬�����ֽ�����
		System.out.println("GBK:" + Arrays.toString(by));// ��ӡ�����GBK:[-60, -29, -70, -61]
		result = new String(by, "GBK");// ʹ��ָ���ַ������ֽ�������н��룬�����ַ���
		System.out.println("GBK������Ϊ��" + result);
		/*
		by = s.getBytes("GB2312");
		System.out.println("GB2312:" + Arrays.toString(by));// ��ӡ�����GB2312:[-60, -29, -70, -61]
		result = new String(by, "GB2312");// ʹ��ָ���ַ������ֽ�������н��룬�����ַ���
		System.out.println("GB2312������Ϊ��" + result);
		
		
		by = s.getBytes("GB18030");
		System.out.println("GB18030:" + Arrays.toString(by));// ��ӡ�����GB18030:[-60, -29, -70, -61]
		result = new String(by, "GB18030");// ʹ��ָ���ַ������ֽ�������н��룬�����ַ���
		System.out.println("GB18030������Ϊ��" + result);
		
		
		by = s.getBytes("UTF-8");
		System.out.println("UTF-8:" + Arrays.toString(by));// ��ӡ�����UTF-8:[-28, -67, -96, -27, -91, -67]
		result = new String(by, "UTF-8");// ʹ��ָ���ַ������ֽ�������н��룬�����ַ���
		System.out.println("UTF-8������Ϊ��" + result);
		
		
		by = s.getBytes("UTF-16");
		System.out.println("UTF-16:" + Arrays.toString(by));// ��ӡ�����UTF-16:[-2, -1, 79, 96, 89, 125]
		result = new String(by, "UTF-16");// ʹ��ָ���ַ������ֽ�������н��룬�����ַ���
		System.out.println("UTF-16������Ϊ��" + result);

		
		by = s.getBytes("Unicode");
		System.out.println("Unicode:" + Arrays.toString(by));// ��ӡ�����Unicode:[-2, -1, 79, 96, 89, 125]
		result = new String(by, "Unicode");// ʹ��ָ���ַ������ֽ�������н��룬�����ַ���
		System.out.println("Unicode������Ϊ��" + result);

		
		by = s.getBytes("BIG5");
		System.out.println("BIG5(������):" + Arrays.toString(by));// ��ӡ�����BIG5:[-89, 65, -90, 110]
		result = new String(by, "BIG5");// ʹ��ָ���ַ������ֽ�������н��룬�����ַ���
		System.out.println("BIG5������Ϊ��" + result);
		 */
		// С�᣺
		// ���룬��������򵥣�ֻҪ��֤���������ĸ�ʽ��һ�µġ�
		// �����������벻һ���أ����磺��GBK���룬��UTF-8���롣�����ʲô�� �Լ���֤һ�¡�
	}

}
