package com.yida_01.StudentArray;
/**
 * ����5��ѧ����������5��ѧ������Ϣ�洢�������У����������飬��ȡ�õ�ÿһ��ѧ����Ϣ��
 *		 ѧ����Student
 *		 ��Ա������name,age
 *		 ���췽�����޲�,����
 *		 ��Ա������getXxx()/setXxx()
 *		 ��δ洢ѧ��������?
 * ������
 * 		A:����ѧ���ࡣ
 * 		B:����ѧ������(��������)��
 * 		C:����5��ѧ�����󣬲���ֵ��
 * 		D:��C�����Ԫ�أ��ŵ������С�
 * 		E:����ѧ�����顣
 */
public class Test {

	public static void main(String[] args) {
		//��̬����
		/*int[] a = new int[2];
		char[] b = new char[10];
		double[] c = new double[10];
		String[] d = new String[10];*/
		
		//��̬����
		/*int[] aa = {12, 21, 3, 45};
		char[] bb = new char[]{'a','b','c'};
		double[] cc = {3.13, 2.0,4.5};
		String[] dd = {"hello","world","yida"};*/
				
		Student[] arr = new Student[5];// ����ѧ������

		// ����5��ѧ������
		Student stu1 = new Student("����", 24);
		Student stu2 = new Student("����", 21);
		Student stu3 = new Student("����", 32);
		Student stu4 = new Student("����", 29);
		Student stu5 = new Student("����", 26);

		// ��ѧ��������ӵ�������ȥ
		arr[0] = stu1;
		arr[1] = stu2;
		arr[2] = stu3;
		arr[3] = stu4;
		arr[4] = stu5;

		// ��ӡ����Ԫ��
		for (int i = 0; i < arr.length; i++) {
			Student s = arr[i];
			System.out.println(s);
		}
	}

}
