package com.yida_03.tryfinally;
/**
 * �����⣺
 * 1:final,finally��finalize������
 * final�����յ���˼�����������࣬��Ա��������Ա����
 * 		�����࣬�಻�ܱ��̳�
 * 		���α����������ǳ���
 * 		���η������������ܱ���д
 * finally�����쳣�����һ���֣������ͷ���Դ��
 * 		һ����˵������϶���ִ�У������������ִ�У�������ִ�е�finally֮ǰjvm�˳���
 * finalize����Object���һ��������������������
 * 
 * 2:���catch������return��䣬����finally����Ĵ��뻹��ִ����?
 *   ����ᣬ��������returnǰ������return��
 * 	   ��ִ�С���returnǰ��׼ȷ��˵��Ӧ������return�м�ִ�С�
 * 
 * 3:try...catch...finally�ĸ�ʽ����
 * 		A:try...catch...finally
 * 		B:try...catch
 * 		C:try...catch...catch...
 * 		D:try...catch...catch...finally
 * 		E:try...finally
 * 			����������Ŀǰ��Ϊ���ͷ���Դ��
 */
public class B_Finally {

	public static void main(String[] args) {
		int s = test();
		System.out.println(s);
	}
	
	public static int test() {
		int a = 10;
		try {
			System.out.println(a / 0);
			a = 20;
		} catch (ArithmeticException e) {
			a = 30;
			return a;
			/*
			 * return a�ڳ���ִ�е���һ����ʱ�����ﲻ��return a����return 30;�������·�����γ��ˡ�
			 * �����أ������ֺ��滹��finally�����Լ���ִ��finally�����ݣ�a=40 �ٴλص���ǰ�ķ���·����������return
			 * 30;
			 */
		} finally {
			a = 40;
			//return a;// ����������ؽ��������40�ˡ�
		}

		return a;
	}

	public static void test2() {
		try {
			System.out.println(10 / 0);// ���ﱨ�쳣
		} finally {
			System.out.println("�ͷ���Դ");
		}
	}

	public static void test3() {
		int a = 8, b = 0;
		int[] arr = { 12, 1, 23 };
		try {
			System.out.println(a / b);// ���ﱨ�쳣
			System.out.println(arr[3]);// ���ﱨ�쳣
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("��������Խ��");
		} finally {
			System.out.println("�ͷ���Դ");
		}
	}

}
