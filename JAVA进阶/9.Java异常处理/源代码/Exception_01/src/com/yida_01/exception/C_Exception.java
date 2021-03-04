package com.yida_01.exception;
/**
 * A:һ���쳣�Ĵ���
 * B:�����쳣�Ĵ���
 * 		a:���ÿ���쳣��дһ��try...catch
 * 		b:дһ��try�����catch
 * 			try{
 * 				...
 * 			} catch(�쳣���� ������) {
 * 				...
 * 			} catch(�쳣���� ������) {
 * 				...
 * 			}
 * 			...
 * 
 * 			ע�⣺
 * 				1:һ��try����������⣬�ͻ��������������׳�ȥ��Ȼ���catch������������ƥ�䣬
 * 				 �����ƥ��ľ�ִ��catch����Ĵ���Ȼ�����try...catch����ִ�к�������;
 * 				2:����ȷ�ľ�����ȷ����Ҫ�ô��������;
 * 				3:ƽ����ϵ���쳣˭ǰ˭������ν������������Ӹ���ϵ��������������档
 */
public class C_Exception {

	public static void main(String[] args) {
		//test1();//ֻ��һ���쳣�����
		//test2();//��3���쳣�����(a:���ÿ���쳣��дһ��try...catch)
		test3();// ��3���쳣�����(b:дһ��try�����catch)
	}
	
	// ֻ��һ���쳣�����
	public static void test1() {
		int a = 8, b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
		}

		System.out.println("over");
	}

	// ��2���쳣�����(a:���ÿ���쳣��дһ��try...catch)
	public static void test2() {
		int a = 8, b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
		}

		int[] arr = { 12, 20, 2 };
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("��������Խ����");
		}
		
		String s = "hello";
		try {
			System.out.println(s.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("�ַ�������Խ����");
		}

		System.out.println("over");
	}

	// ��2���쳣�����(b:дһ��try�����catch)
	public static void test3() {
		int a = 8, b = 0;
		int[] arr = { 21, 2, 32 };
		String s = "hello";
		try {//ע�⣺һ��try���catch�����쳣����ʱ�����try���ж����쳣���룬��ֻ�ܲ����һ�γ��ֵ��쳣�������쳣���ٲ���
			System.out.println(a / b);
			System.out.println(arr[3]);
			System.out.println(s.charAt(10));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���������Խ����");
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("�ַ�������Խ����");
		} catch (Exception e) {
			System.out.println("������쳣�ˣ���Ҫ���Ǵ���");
		}

		System.out.println("over");
	}

}
