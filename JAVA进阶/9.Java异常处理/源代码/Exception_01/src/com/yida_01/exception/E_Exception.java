package com.yida_01.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ʱ�쳣������ʱ�쳣������
 * �������쳣��Java���������ʾ�����������ͻᷢ�������޷�ͨ������;
 * �������쳣��һ�㲻��������ģ�����Ϊ���Ǹ��˴��벻�Ͻ����µģ�Ҫ���´���
 * 
 * �쳣��Ҫ�˽�ļ���������
 * public String getMessage():�쳣����Ϣ�ַ���		
 * public String toString():�����쳣�ļ���Ϣ����
 * printStackTrace():��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid������Ϣ����ڿ���̨��
 */
public class E_Exception {

	public static void main(String[] args) {
		String str = "2017-08-02 07:56:30";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//Date date = sdf.parse(str);// ���д��룬���뱨����Ϊ�б����ڼ�Ŀ����쳣δ����
		
		try {
			Date date2 = sdf.parse(str);
			System.out.println("�����������Ϊ" + date2);
		} catch (ParseException e) {
			//System.out.println("���ڽ����쳣��");
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();//�Ƽ�����
			// ������������ת��ĳ��ָ����ҳ(���磺error.html)�����쳣��Ϣ��ʾ���û�����
		}

		System.out.println("OVER��~~");
	}

}
