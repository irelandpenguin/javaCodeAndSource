package com.yidahulian_02;

import java.util.Arrays;

/*
 * ����������ʶ��ʲôʱ��ð������ֽ�ת��Ϊһ��������?
 * �ڼ������,���ĵĴ洢�������ֽڣ�
 * 		��һ���ֽڿ϶��Ǹ�����
 * 		�ڶ����ֽڳ������Ǹ���������������������ûӰ�졣
 */
public class StringDemo {

	public static void main(String[] args) {
		//String s = "abcde12*&@(){}[]";//[97, 98, 99, 100, 101, 49, 50, 42, 38, 64, 40, 41, 123, 125, 91, 93]
		String s = "�˴ﻥ��";// [-46, -53, -76, -17, -69, -91, -63, -86]

		byte[] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));
		System.out.println(new String(bys));

		// ͨ����ӡ����������ƶϳ���
		// ��ĸ���������Ŷ�Ӧ��ASCII���Ϊ������
		// ���ĵ�һ���ֽڶ�Ӧ��ASCII��һ���Ǹ������ڶ����ֽڶ�Ӧ��ASCII��һ��ҲΪ������Ҳ����Ϊ������
		// ���ԣ�������ڴ����ֽ�ʱ���Զ��жϣ�ASCII��Ϊ�����ģ�ֱ�������ASCII���Ǹ����ģ��ͻ��Զ��ϲ���һ���ֽڡ��ͱ���˺��֡�
	}

}
