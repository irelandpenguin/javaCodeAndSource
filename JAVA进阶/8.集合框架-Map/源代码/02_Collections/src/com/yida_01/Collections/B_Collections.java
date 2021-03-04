/*
 * Collections�������ArrayList�洢�������͵�Ԫ�����������洢�Զ������ʱ���ɲ�����������?
 */
package com.yida_01.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class B_Collections {

	public static void main(String[] args) {
		//test1();// ��Ȼ����
		//System.out.println("------");
		test2();// �Ƚ�������
	}

	// ��Ȼ����
	public static void test1() {
		List<Student> lt = new ArrayList<Student>();
		Student s1 = new Student("����", 23);
		Student s2 = new Student("����", 25);
		Student s3 = new Student("����", 21);
		Student s4 = new Student("����", 33);
		Student s5 = new Student("����", 26);
		lt.add(s1);
		lt.add(s2);
		lt.add(s3);
		lt.add(s4);
		lt.add(s5);

		Collections.sort(lt);

		// ��ǿfor����
		for (Student stu : lt) {
			System.out.println(stu.getName() + "---" + stu.getAge());
		}
	}

	// �Ƚ�������
	public static void test2() {
		List<Teacher> lt = new ArrayList<Teacher>();
		Teacher t1 = new Teacher("������", 23);
		Teacher t2 = new Teacher("������", 25);
		Teacher t3 = new Teacher("������", 21);
		Teacher t4 = new Teacher("������", 33);
		Teacher t5 = new Teacher("������", 26);
		lt.add(t1);
		lt.add(t2);
		lt.add(t3);
		lt.add(t4);
		lt.add(t5);

		Collections.sort(lt, new Comparator<Teacher>() {// �Ƚ�������
					@Override
					public int compare(Teacher o1, Teacher o2) {
						// ��Ҫ����������ʦ�������С��������
						int num = o1.getAge() - o2.getAge();
						// ��Ҫ������������ͬ����������������ͬ������Ҫ����������
						int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
						return num2;
					}
				});

		// ��ǿfor����
		for (Teacher tea : lt) {
			System.out.println(tea.getName() + "---" + tea.getAge());
		}
	}

}
