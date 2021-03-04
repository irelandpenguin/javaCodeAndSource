/**
 * ArrayList�洢�Զ�����󲢱���
 */
package com.yida_01.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class B_ArrayList {

	public static void main(String[] args) {
		// �������϶���
		ArrayList list = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("����", 29);
		Student s2 = new Student("����", 27);
		Student s3 = new Student("����", 31);
		Student s4 = new Student("����", 22);

		// ���Ԫ��
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		// ����������
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

		System.out.println("------");

		// forѭ������
		for (int x = 0; x < list.size(); x++) {
			Student stu = (Student) list.get(x);
			System.out.println(stu.getName() + "---" + stu.getAge());
		}
	}

}
