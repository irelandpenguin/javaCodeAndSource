package com.yida_01.exception;
/**
 * �������쳣�׳������������߲��ô�������J(Java)V(Virtual)M(Machine)����
 * @author �˴ﻥ��-Mr Qain
 *
 */
public class F_Exception2 {

	public static void main(String[] args) {
		//test1();
		
		/*try {
			test1();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		//test2();
		
		/*try {
			test2();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("�ҵĳ�����Ҫ����");
		}*/
		
		System.out.println("over");
	}
	
	//����1���������쳣������RuntimeException���͵��쳣
	public static void test1() {
		int a=8,b=0;
		System.out.println(a/b);//���д��룬�п����ڳ�������ʱ������ArithmeticException�쳣
	}
	
	//����2���������쳣������RuntimeException���͵��쳣
	public static void test2() {
		//NullPointerException
		String s = null;
		System.out.println(s.concat("hello"));
	}
}
