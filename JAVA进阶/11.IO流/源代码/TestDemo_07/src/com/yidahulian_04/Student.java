package com.yidahulian_04;

public class Student {
	private String name;// 姓名
	private int chineseGrade;// 语文成绩
	private int mathGrade;// 数学成绩
	private int englishGrade;// 英语成绩

	public Student() {
		super();
	}

	public Student(String name, int chineseGrade, int mathGrade, int englishGrade) {
		super();
		this.name = name;
		this.chineseGrade = chineseGrade;
		this.mathGrade = mathGrade;
		this.englishGrade = englishGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChineseGrade() {
		return chineseGrade;
	}

	public void setChineseGrade(int chineseGrade) {
		this.chineseGrade = chineseGrade;
	}

	public int getMathGrade() {
		return mathGrade;
	}

	public void setMathGrade(int mathGrade) {
		this.mathGrade = mathGrade;
	}

	public int getEnglishGrade() {
		return englishGrade;
	}

	public void setEnglishGrade(int englishGrade) {
		this.englishGrade = englishGrade;
	}

	// 获取总分
	public int totalGrade() {
		return chineseGrade + mathGrade + englishGrade;
	}
}
