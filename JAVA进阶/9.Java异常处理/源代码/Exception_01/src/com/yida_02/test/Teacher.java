package com.yida_02.test;

public class Teacher {
	public void checkScore(Student stu) throws ScoreException {
		int stuScore = stu.getScore();
		if (stuScore < 0 || stuScore > 100) {
			//throw new ScoreException();// �׳������ڼ��Զ�����쳣
			throw new ScoreException(stu.getName()+"�ĳɼ�"+stuScore+"�֣����쳣�������ɼ���ΧӦ��0-100֮��!");
		} else {
			if (stuScore < 60) {
				System.out.println("�ɼ�������");
			} else {
				System.out.println("�ɼ�����");
			}
		}
	}
}
