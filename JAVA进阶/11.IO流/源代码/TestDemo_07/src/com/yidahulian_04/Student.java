package com.yidahulian_04;

public class Student {
	private String name;// ����
	private int chineseGrade;// ���ĳɼ�
	private int mathGrade;// ��ѧ�ɼ�
	private int englishGrade;// Ӣ��ɼ�

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

	// ��ȡ�ܷ�
	public int totalGrade() {
		return chineseGrade + mathGrade + englishGrade;
	}
}
