/**
 * ���ϵ�Ƕ�ױ���
 * ����
 * 		���ǰ��ж�λѧԱ��ÿλѧԱ����һ�������������ǿ���ʹ��һ����������ʾ������ArrayList<Student>
 * 		�����أ������ٿ�һ��JAVA��ĩ�࣬������ǲ���Ҳ��һ��ArrayList<Student>��
 * 		��ô�������ж��ArrayList<Student>��ҲҪ�ü��ϴ洢����ô����?
 * 		���������ã�ArrayList<ArrayList<Student>>
 */
package com.yida_01.ArrayListNest;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// ���һ���ѧ����Ϣ
		ArrayList<Student> list1 = new ArrayList<Student>();
		Student stu1 = new Student("����", 21);
		Student stu2 = new Student("����", 32);
		Student stu3 = new Student("����", 27);
		list1.add(stu1);
		list1.add(stu2);
		list1.add(stu3);

		// ��Ӷ����ѧ����Ϣ
		ArrayList<Student> list2 = new ArrayList<Student>();
		Student stu4 = new Student("�⾩", 23);
		Student stu5 = new Student("������", 22);
		Student stu6 = new Student("���", 20);
		list2.add(stu4);
		list2.add(stu5);
		list2.add(stu6);

		// ��������ѧ����Ϣ
		ArrayList<Student> list3 = new ArrayList<Student>();
		Student stu7 = new Student("��С��", 35);
		Student stu8 = new Student("�˳�", 24);
		Student stu9 = new Student("¹��", 29);
		list3.add(stu7);
		list3.add(stu8);
		list3.add(stu9);

		// ����������װ��һ���󼯺���
		ArrayList<ArrayList<Student>> bigList = new ArrayList<ArrayList<Student>>();
		bigList.add(list1);
		bigList.add(list2);
		bigList.add(list3);

		// ��ǿfor����
		for (ArrayList<Student> lit : bigList) {
			for (Student stu : lit) {
				System.out.println(stu);
			}
			System.out.println("------");
		}
		
		System.out.println("-------");
		
		//���﷢ɢ��˼ά��������Ƕ����
		ArrayList<String[]> list4 = new ArrayList<String[]>();
		String[] arr1 = {"����","����","�ܲ�"};
		list4.add(arr1);
		String[] arr2 = {"hello","world","java"};
		list4.add(arr2);
		for(String[] arr : list4) {
			for(String s : arr) {
				System.out.println(s);
			}
		}
		
		
	}

}
