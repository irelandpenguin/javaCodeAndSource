package com.yidahulian_04;

/*
 * ����ģʽ����֤�����ڴ���ֻ��һ������
 * 
 * ��α�֤�����ڴ���ֻ��һ��������?
 * 		A���ѹ��췽��˽�л�
 * 		B:�ڳ�Աλ���Լ�����һ����̬����
 * 		C:ͨ��һ�������ķ����ṩ����
 */
public class StudentDemo {

	public static void main(String[] args) {
		Student stu1 = Student.getStudent();
		Student stu2 = Student.getStudent();
		if (stu1 == stu2) {
			System.out.println(stu1);
			System.out.println(stu2);
			System.out.println("ͬһ��ѧ������");
		}
	}

}
