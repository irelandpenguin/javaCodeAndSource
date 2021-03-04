package com.yida_02.test;

public class Teacher {
	public void checkScore(Student stu) throws ScoreException {
		int stuScore = stu.getScore();
		if (stuScore < 0 || stuScore > 100) {
			//throw new ScoreException();// 抛出编译期间自定义的异常
			throw new ScoreException(stu.getName()+"的成绩"+stuScore+"分，有异常！正常成绩范围应在0-100之间!");
		} else {
			if (stuScore < 60) {
				System.out.println("成绩不及格");
			} else {
				System.out.println("成绩及格");
			}
		}
	}
}
