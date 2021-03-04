package com.yida_02.Test;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet存储自定义对象并保证排序和唯一。
 * 
 * A:怎么排序?
 * 		自然排序，按照年龄从小到大排序
 * B:元素什么情况算唯一?
 * 		成员变量值都相同即为同一个元素
 */
public class DogDemo {
	public static void main(String[] args) {
		TreeSet<Dog> ts = new TreeSet<Dog>();
		Dog d1 = new Dog("heihu", 3, 'M', "黑色");
		Dog d2 = new Dog("lucy", 2, 'F', "黄色");
		Dog d3 = new Dog("wangwang", 4, 'M', "粉色");
		Dog d4 = new Dog("heibao", 3, 'M', "黑色");
		Dog d5 = new Dog("maomao", 6, 'F', "棕色");
		Dog d6 = new Dog("heihu", 3, 'M', "黑色");
		Dog d7 = new Dog("lucy", 1, 'M', "白色");
		Dog d8 = new Dog("maomao", 6, 'M', "棕色");

		ts.add(d1);
		ts.add(d2);
		ts.add(d3);
		ts.add(d4);
		ts.add(d5);
		ts.add(d6);
		ts.add(d7);
		ts.add(d8);

		// 增强for遍历
		for (Dog d : ts) {
			System.out.println(d.toString());
		}

		System.out.println("------");

		// 迭代器遍历
		Iterator<Dog> it = ts.iterator();
		while (it.hasNext()) {
			Dog d = it.next();
			System.out.println(d.toString());
		}
	}
}
