package com.yidahulian_04;

/*
 * ��������ѧ����
 */
public class Student {
	// ���췽��˽�л�����ֹ��紴������
	private Student() {
	}

	// �ڳ�Աλ�ô���һ����̬��Ա������private���Σ��������ֱ�ӵ���
	private static Student stu = new Student();

	// ����һ�������������ṩ����
	public static Student getStudent() {
		return stu;
	}
}
