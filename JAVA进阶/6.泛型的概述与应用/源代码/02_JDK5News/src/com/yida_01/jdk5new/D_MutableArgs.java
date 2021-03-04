/**
 * �ɱ���������巽����ʱ��֪���ö�����ٸ�����
 * ��ʽ��
 * 		���η�  ����ֵ����  ������(�������͡� ������){
 * 
 * 		}
 * 
 * 		���磺public int sum(int... args) {}
 * 
 * 		ע�⣺
 * 			����ı�������ʵ��һ������
 * 			���һ�������пɱ�����������ж����������ô���ɱ�����϶��Ƿŵ����һλ��
 */
package com.yida_01.jdk5new;

public class D_MutableArgs {

	public static void main(String[] args) {
		// ��2�����ĺ�
		int a = 10, b = 20;
		int result = sum(a, b);
		System.out.println("result=" + result);
		/*
		 * 1���������ɷ���
		 * ���ｲ����ο��ٴ���������ѡ�� a+b; Ȼ�󵥻��Ҽ��ڵ����˵���ѡ��Refactor -> Extract Method...��
		 * Ȼ���ڵ������и�����������ѡ��public�����ȷ�����ɡ�
		 * 
		 * 2�����ٶ�λ���������Լ���Ա��������λ�á�
		 * 		1. ��궨λ����Ҫ��λ�ķ���������Ա����λ�ã�Ȼ��F3�����ݼ�;
		 * 		2. ��궨λ����Ҫ��λ�ķ���������Ա����λ��,Ȼ��ctrl��������һ��С�֣��ٵ���������;
		 * 		3. ��궨λ����Ҫ��λ�ķ���������Ա����λ��,�ڵ�����ʾ�������ǰ�� �����ɫ��Сͼ�꣬���ٽ��롣
		 */

		// ��3�����ĺ�
		int x = 12, y = 90;
		int result2 = sum(x, y, 10);
		System.out.println("result=" + result2);

		// ��4�����ĺ�
		int m = 0, n = 9;
		int result3 = sum(m, n, 10, 20);
		System.out.println("result=" + result3);

		// ������Ҫдһ����͵Ĺ��ܣ������Ǽ�����������أ���̫�����Ϊ�˽��������⣬Java���ṩ�ˣ��ɱ����.

		
		// ���һ�������пɱ�����������ж����������ô���ɱ�����϶�Ҫ�ŵ����һλ��
		hello(11, 22, 33, 44);
		
		System.out.println("------");
		
		//�������͵Ŀɱ����
		world("girl","boy","man","femail");
		
		System.out.println("------");
		
		Student s1 = new Student("��С��", 30);
		Student s2 = new Student("�˳�", 40);
		Student s3 = new Student("¹��", 25);
		java(100, "���г�Ա:", s1,s2,s3);
	}

	/*public static int sum(int a, int b) {
		return a+b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}*/

	public static int sum(int... args) {// �ɱ�����������args��ʵ�������飬�ɷ�����鿴��
		int s = 0;
		for (int num : args) {
			s += num;
		}
		return s;
	}

	// ���һ�������пɱ�����������ж����������ô���ɱ�����϶��Ƿŵ����һλ��
	public static void hello(int x, int y, int... args) {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		for(int s : args) {
			System.out.println(s);
		}
	}
	
	
	//�������͵Ŀɱ����
	public static void world(String... a) {
		for(String s : a) {
			System.out.println(s);
		}
	}
	
	public static void java(int x, String y,Student... b) {
		System.out.println("x="+x);
		System.out.println("y="+y);
		for(Student stu : b) {
			System.out.println(stu);
		}
	}
}
