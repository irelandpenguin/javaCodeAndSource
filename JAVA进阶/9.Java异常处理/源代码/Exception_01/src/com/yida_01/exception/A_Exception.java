package com.yida_01.exception;
/**
 * ������쳣��Throwable
 * 		�������⣺���ǲ�������������һ�㶼�Ǻ����صģ�����˵�ڴ������
 * 		��ͨ���⣺Exception
 * 			����������:��RuntimeException���쳣��������д���ģ���Ϊ�㲻��������Ͳ�ͨ����
 * 			����������:RuntimeException���쳣��һ�㲻����������Ϊ���ǵĴ��벻���Ͻ����µģ�Ҫ������
 * 
 * ���������������⣬����û�����κδ�������jvm����������Ĭ�ϵĴ���:
 * <1>.���쳣�����ƣ�ԭ�򼰳��ֵ��������Ϣ����ڿ���̨��
 * <2>.ͬʱ���������
 */
public class A_Exception {
	public static void main(String[] args) {
		int a = 8, b = 0;
		System.out.println(a / b);// ����ArithmeticException�㷨�쳣��ԭ����0����������
		System.out.println("over");
	}
}
