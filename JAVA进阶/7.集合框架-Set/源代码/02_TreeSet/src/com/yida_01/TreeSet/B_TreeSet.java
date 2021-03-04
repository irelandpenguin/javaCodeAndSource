/**
 * TreeSet�洢�Զ�����󲢱�֤�����Ψһ��
 * 
 * A:��ô����?
 * 		��Ȼ���򣬰��������С��������
 * B:Ԫ��ʲô�����Ψһ?
 * 		��Ա����ֵ����ͬ��Ϊͬһ��Ԫ��
 */
package com.yida_01.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class B_TreeSet {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>();// ��Ȼ����
		Student stu1 = new Student("����", 26);
		Student stu2 = new Student("����", 22);
		Student stu3 = new Student("����", 32);
		Student stu4 = new Student("����", 26);
		Student stu5 = new Student("���ĳ�", 28);
		Student stu6 = new Student("����", 28);
		Student stu7 = new Student("����", 32);

		ts.add(stu1);
		ts.add(stu2);
		ts.add(stu3);
		ts.add(stu4);
		ts.add(stu5);
		ts.add(stu6);
		ts.add(stu7);

		// ��ǿfor����
		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}

		System.out.println("------");

		// ����������
		Iterator<Student> it = ts.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}

}
