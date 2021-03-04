package com.yida_04.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * �Ƚ�����ϰ
 * 
 * TreeSet�洢�Զ�����󲢱�֤�����Ψһ��
 * 
 * A:��ô����?
 * 		��Ȼ���򣬰��������С��������
 * B:Ԫ��ʲô�����Ψһ?
 * 		��Ա����ֵ����ͬ��Ϊͬһ��Ԫ��
 */
public class DogDemo {
	public static void main(String[] args) {
		TreeSet<Dog> ts = new TreeSet<Dog>(new Comparator<Dog>() {
			@Override
			public int compare(Dog o1, Dog o2) {
				// ��Ҫ����
				int num = o1.getName().compareTo(o2.getName());
				// ��Ҫ����1��������ͬ����������������ͬ
				int num2 = num == 0 ? o1.getAge() - o2.getAge() : num;
				// ��Ҫ����2��������ͬ�����������Ա���ͬ
				int num3 = num2 == 0 ? o1.getSex() - o2.getSex() : num2;
				// ��Ҫ����3���Ա���ͬ������������ɫ��ͬ
				int num4 = num3 == 0 ? o1.getColor().compareTo(o2.getColor())
						: num3;
				return num4;
			}
		});
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
