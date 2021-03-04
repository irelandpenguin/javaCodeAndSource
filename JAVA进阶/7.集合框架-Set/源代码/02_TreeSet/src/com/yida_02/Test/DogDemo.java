package com.yida_02.Test;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet�洢�Զ�����󲢱�֤�����Ψһ��
 * 
 * A:��ô����?
 * 		��Ȼ���򣬰��������С��������
 * B:Ԫ��ʲô�����Ψһ?
 * 		��Ա����ֵ����ͬ��Ϊͬһ��Ԫ��
 */
public class DogDemo {
	public static void main(String[] args) {
		TreeSet<Dog> ts = new TreeSet<Dog>();
		Dog d1 = new Dog("heihu", 3, 'M', "��ɫ");
		Dog d2 = new Dog("lucy", 2, 'F', "��ɫ");
		Dog d3 = new Dog("wangwang", 4, 'M', "��ɫ");
		Dog d4 = new Dog("heibao", 3, 'M', "��ɫ");
		Dog d5 = new Dog("maomao", 6, 'F', "��ɫ");
		Dog d6 = new Dog("heihu", 3, 'M', "��ɫ");
		Dog d7 = new Dog("lucy", 1, 'M', "��ɫ");
		Dog d8 = new Dog("maomao", 6, 'M', "��ɫ");

		ts.add(d1);
		ts.add(d2);
		ts.add(d3);
		ts.add(d4);
		ts.add(d5);
		ts.add(d6);
		ts.add(d7);
		ts.add(d8);

		// ��ǿfor����
		for (Dog d : ts) {
			System.out.println(d.toString());
		}

		System.out.println("------");

		// ����������
		Iterator<Dog> it = ts.iterator();
		while (it.hasNext()) {
			Dog d = it.next();
			System.out.println(d.toString());
		}
	}
}
