package com.yidahulian_04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件
 * 
 * 分析：
 * 		A:创建学生类
 * 		B:创建集合对象
 * 			TreeSet<Student>
 * 		C:键盘录入学生信息存储到集合
 * 		D:遍历集合，把数据写到文本文件
 */
public class StudentDemo {

	public static void main(String[] args) throws IOException {
		// 创建集合对象，并按总分从高到低排序
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// 主要条件：总分从高到低
				int sum = o2.totalGrade() - o1.totalGrade();

				// 次要条件1：如果总分相同，比较姓名
				int sum1 = sum == 0 ? o1.getName().compareTo(o2.getName()) : sum;

				// 次要条件2：如果姓名相同，比较语文成绩
				int sum2 = sum1 == 0 ? o1.getChineseGrade() - o2.getChineseGrade() : sum1;

				// 次要条件3：如果语文成绩相同，比较数学成绩
				int sum3 = sum2 == 0 ? o1.getMathGrade() - o2.getMathGrade() : sum2;

				// 次要条件4：如果数据成绩相同，比较英语成绩
				int sum4 = sum3 == 0 ? o1.getEnglishGrade() - o2.getEnglishGrade() : sum3;

				return sum4;
			}
		});

		// 键盘录入学生信息存储到集合
		for (int i = 1; i <= 5; i++) {
			// 键盘录入学生信息
			Scanner sc = new Scanner(System.in);
			System.out.println("开始输入第" + i + "个学生信息");
			System.out.println("姓名：");
			String name = sc.nextLine();
			System.out.println("语文成绩：");
			int chineseGrade = sc.nextInt();
			System.out.println("数学成绩：");
			int mathGrade = sc.nextInt();
			System.out.println("英语成绩：");
			int englishGrade = sc.nextInt();

			// 封装学生信息
			Student stu = new Student(name, chineseGrade, mathGrade, englishGrade);

			// 学生信息添加到集合
			ts.add(stu);
		}

		// 创建文件，一次写入一行
		BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
		bw.write("姓名\t语文成绩\t数学成绩\t英语成绩");
		bw.newLine();// 换行

		// 遍历学生信息，并保存到文件
		StringBuilder sb = new StringBuilder();
		for (Student s : ts) {
			sb.delete(0, sb.length());//清空可变字符串
			sb.append(s.getName()).append("\t").append(s.getChineseGrade())
					.append("\t").append(s.getMathGrade()).append("\t")
					.append(s.getEnglishGrade());// 拼接学生信息
			bw.write(sb.toString());// 写入
			bw.newLine();// 换行
			bw.flush();// 刷新
		}

		bw.close();// 释放资源
		System.out.println("学生信息存储完毕");
	}

}
