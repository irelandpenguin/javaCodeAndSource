package com.yida_02.test;

/**
 * 案例：老师通过网站公布学生的考试分数。
 * 测试自定义编译期间的异常
 */
public class TestDemo {

	public static void main(String[] args) {
		Student stu = new Student("张三", 10);
		Teacher tea = new Teacher();
		try {
			tea.checkScore(stu);
		} catch (ScoreException e) {
			e.printStackTrace();
		}

		System.out.println("OVER啦~~");
	}

}
