package com.yida_01.exception;
/**
 * JDK7������һ���µ��쳣��������
 * 		try{
 * 
 * 		}catch(�쳣��1 | �쳣��2 | ...  ���� ) {
 * 			...
 * 		}
 * 
 * 		ע�⣺���������Ȼ��࣬����Ҳ�����á�
 * 			A:����ʽ��һ�µġ�(ʵ�ʿ����У��ö�ʱ����ܾ������ͬ���͵����⣬����ͬһ������)
 *			B:����쳣�������ƽ����ϵ��
 */
public class D_Exception {

	public static void main(String[] args) {
		int a = 8, b = 0;
		int[] arr = { 2, 21, 3 };
		String s = "hello";
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
			System.out.println(s.charAt(5));
		} catch (ArithmeticException|ArrayIndexOutOfBoundsException|StringIndexOutOfBoundsException e) {
			System.out.println("��д�ĳ�������쳣�ˣ���Ҫ����ҵĴ�����������");
		}

		System.out.println("over");
	}

}
