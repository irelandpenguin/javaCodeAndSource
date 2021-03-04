package com.yida_01.exception;
/**
 * �����Լ���δ����쳣��?
 * A:try...catch...finally
 * B:throws �׳�
 * 
 * try...catch...finally�Ĵ����ʽ��
 * 		try {
 * 			���ܳ�������Ĵ���;
 * 		}catch(�쳣�� ����) {
 * 			�������Ĵ���;
 * 		} finally {
 * 			�ͷ���Դ;
 * 		}
 * 
 * �����Ƚ����ı��θ�ʽ��
 * 		try {
 * 			���ܳ�������Ĵ���;
 * 		}catch(�쳣�� ����) {
 * 			�������Ĵ���;
 * 		}
 * 
 * ��finally�����ո�ʽ�ŵ����潲��
 * 
 * ע�⣺
 * 		A:try����Ĵ���Խ��Խ�ã�
 * 			��Ϊ����Խ�࣬���ܲ������쳣��Խ�࣬JVM�ͻῪ�ٸ�����Դ�����쳣���ķ��ڴ��cpu��Խ�ࡣ
 * 		B:catch������������ݣ�������һ���򵥵���ʾ�С�
 */
public class B_Exception {

	public static void main(String[] args) {
		int a = 8, b = 0;
		/*try {
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("��������쳣�ˣ���Ҫ����.");
		}*/
		
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("ע���ˣ���������Ϊ0����");
		}
		
		// try...catch...�ĺô�����������Ĵ��벻��ֹ������ִ�к���Ĵ��롣

		System.out.println("over");
	}

}
