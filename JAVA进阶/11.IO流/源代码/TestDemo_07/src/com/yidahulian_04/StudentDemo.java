package com.yidahulian_04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ��ʹ����ı��ļ�
 * 
 * ������
 * 		A:����ѧ����
 * 		B:�������϶���
 * 			TreeSet<Student>
 * 		C:����¼��ѧ����Ϣ�洢������
 * 		D:�������ϣ�������д���ı��ļ�
 */
public class StudentDemo {

	public static void main(String[] args) throws IOException {
		// �������϶��󣬲����ִܷӸߵ�������
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// ��Ҫ�������ִܷӸߵ���
				int sum = o2.totalGrade() - o1.totalGrade();

				// ��Ҫ����1������ܷ���ͬ���Ƚ�����
				int sum1 = sum == 0 ? o1.getName().compareTo(o2.getName()) : sum;

				// ��Ҫ����2�����������ͬ���Ƚ����ĳɼ�
				int sum2 = sum1 == 0 ? o1.getChineseGrade() - o2.getChineseGrade() : sum1;

				// ��Ҫ����3��������ĳɼ���ͬ���Ƚ���ѧ�ɼ�
				int sum3 = sum2 == 0 ? o1.getMathGrade() - o2.getMathGrade() : sum2;

				// ��Ҫ����4��������ݳɼ���ͬ���Ƚ�Ӣ��ɼ�
				int sum4 = sum3 == 0 ? o1.getEnglishGrade() - o2.getEnglishGrade() : sum3;

				return sum4;
			}
		});

		// ����¼��ѧ����Ϣ�洢������
		for (int i = 1; i <= 5; i++) {
			// ����¼��ѧ����Ϣ
			Scanner sc = new Scanner(System.in);
			System.out.println("��ʼ�����" + i + "��ѧ����Ϣ");
			System.out.println("������");
			String name = sc.nextLine();
			System.out.println("���ĳɼ���");
			int chineseGrade = sc.nextInt();
			System.out.println("��ѧ�ɼ���");
			int mathGrade = sc.nextInt();
			System.out.println("Ӣ��ɼ���");
			int englishGrade = sc.nextInt();

			// ��װѧ����Ϣ
			Student stu = new Student(name, chineseGrade, mathGrade, englishGrade);

			// ѧ����Ϣ��ӵ�����
			ts.add(stu);
		}

		// �����ļ���һ��д��һ��
		BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
		bw.write("����\t���ĳɼ�\t��ѧ�ɼ�\tӢ��ɼ�");
		bw.newLine();// ����

		// ����ѧ����Ϣ�������浽�ļ�
		StringBuilder sb = new StringBuilder();
		for (Student s : ts) {
			sb.delete(0, sb.length());//��տɱ��ַ���
			sb.append(s.getName()).append("\t").append(s.getChineseGrade())
					.append("\t").append(s.getMathGrade()).append("\t")
					.append(s.getEnglishGrade());// ƴ��ѧ����Ϣ
			bw.write(sb.toString());// д��
			bw.newLine();// ����
			bw.flush();// ˢ��
		}

		bw.close();// �ͷ���Դ
		System.out.println("ѧ����Ϣ�洢���");
	}

}
