package com.yida_01.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ֻ�Ա����ڼ���쳣���д���ģ���Ȼ������붼��ͨ���ġ�
 * �Ա����ڼ���쳣������2�ַ�ʽ��
 * 		A:ʹ��try...catch...������
 * 		B:ʹ��throws�׳���
 * throws��ʽ��
 * 		throws �쳣����
 * 		ע�⣺�����ʽ������ڷ��������ź��档
 * throwsС�᣺
 * 		�������쳣�׳������������߱��봦��
 * 		�������쳣�׳������������߲��ô�������JVM����
 */
public class F_Exception {

	public static void main(String[] args) {
		// ��ʽһ�������ڼ���쳣����A:ʹ��try...catch...��������
		//test();

		// ��ʽ�����׳��������ɵ����ߴ���(����ĵ�����ָ����main�������Ժ�ĵ����߿����Ǳ�Ķ��󷽷��ȡ�)
		/*try {
			test2();
		} catch (ParseException e) {
			e.printStackTrace();
		}*/
		
		//test2();//����������������ã�������Ҳֻ�� throws ParseException���׳�ȥ����JVMȥ������
		
		//test3();
		
		//test4();//�����������������test4()��������Ҳֻ�� throws ParseException���׳�ȥ����JVMȥ������

		System.out.println("OVER��~~");
	}
	
	// ��ʽһ�� �����ڼ���쳣����A:ʹ��try...catch...��������
	public static void test() {
		String str = "2017-08-21 16:43:56";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	// ��ʽ�����׳��������ɵ����ߴ���
	public static void test2() throws ParseException {
		String str = "2017��08��02�� 16ʱ43��";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		Date date = sdf.parse(str);
		System.out.println(date);
	}
	
	/*public static void test3() {
		try {
			test2();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}*/
	
	public static void test4() throws ParseException {
		test2();
	}
}
