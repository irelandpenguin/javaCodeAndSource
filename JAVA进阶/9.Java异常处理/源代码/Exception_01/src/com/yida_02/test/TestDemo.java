package com.yida_02.test;

/**
 * ��������ʦͨ����վ����ѧ���Ŀ��Է�����
 * �����Զ�������ڼ���쳣
 */
public class TestDemo {

	public static void main(String[] args) {
		Student stu = new Student("����", 10);
		Teacher tea = new Teacher();
		try {
			tea.checkScore(stu);
		} catch (ScoreException e) {
			e.printStackTrace();
		}

		System.out.println("OVER��~~");
	}

}
