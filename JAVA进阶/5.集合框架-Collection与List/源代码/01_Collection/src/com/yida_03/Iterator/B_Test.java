/*
 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б�����
 * (1).��forѭ��������
 * (2).�õ�����������
 */
package com.yida_03.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class B_Test {

	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();

		// ����ѧ������
		Student stu1 = new Student("����", 23);
		Student stu2 = new Student("����", 33);
		Student stu3 = new Student("����", 26);
		Student stu4 = new Student("����", 28);
		Student stu5 = new Student("����", 25);

		// ��ѧ��������ӵ�������
		c.add(stu1);
		c.add(stu2);
		c.add(stu3);
		c.add(stu4);
		c.add(stu5);

		// ��ʽһ��forѭ������
		/*Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			Student stu = (Student) arr[i];//ǿ������ת��
			System.out.println(stu.getName() + "---" + stu.getAge());
		}

		System.out.println("------");*/

		
		// ��ʽ��������������
		Iterator itt = c.iterator();
		while (itt.hasNext()) {
			Student stu = (Student) itt.next();//ǿ������ת��
			System.out.println(stu);//Ĭ�ϵ��ö����toString()
		}
	}

}
