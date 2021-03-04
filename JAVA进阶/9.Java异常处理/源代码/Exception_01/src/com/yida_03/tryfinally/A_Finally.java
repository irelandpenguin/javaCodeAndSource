package com.yida_03.tryfinally;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * finally:��finally���Ƶ������һ����ִ��
 * ע�⣺�����ִ�е�finally֮ǰjvm�˳��ˣ��Ͳ���ִ���ˡ�
 * 
 * A:��ʽ
 * 		try...catch...finally...
 * B:�����ͷ���Դ����IO�����������ݿ�����л����
 */
public class A_Finally {

	public static void main(String[] args) {
		//test();
		test2();
		System.out.println("OVER��~~");
	}
	
	public static void test() {
		String str = "2017-08-08 12:12:50";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			System.out.println("�ͷ���Դ��finally��Ĵ���һ����ִ�У�");
		}
	}

	public static void test2() {
		String str = "2017-08-08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(0);// ǿ���˳�����ʱ��finally��Ĵ���Ͳ���������
		} finally {
			System.out.println("�ͷ���Դ��finally��Ĵ���һ����ִ�У�");
		}
	}

}
