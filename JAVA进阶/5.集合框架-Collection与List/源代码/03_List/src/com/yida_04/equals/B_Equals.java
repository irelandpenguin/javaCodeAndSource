/*
 * 需求：去除集合中重复的学生对象(对象的成员变量值都相同，视为重复)
 */
package com.yida_04.equals;

import java.util.ArrayList;
import java.util.Iterator;

public class B_Equals {

	public static void main(String[] args) {
		// 创建集合对象
		ArrayList lt = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("张三", 29);
		Student s2 = new Student("张三", 29);
		Student s3 = new Student("李四", 27);
		Student s4 = new Student("王五", 31);
		Student s5 = new Student("李四", 27);

		// 添加元素
		lt.add(s1);
		lt.add(s2);
		lt.add(s3);
		lt.add(s4);
		lt.add(s5);

		//show(lt);
		
		// 方式一：过滤重复的学生对象
		//filter(lt);

		// 方式二：过滤集合重复字符串
		filter2(lt);
	}

	// 方式一：过滤重复的学生对象
	public static void filter(ArrayList lt) {
		// 思路分析：
		// A:创建集合对象
		// B:添加多个字符串元素(包含内容相同的)
		// C:创建新集合
		// D:遍历旧集合,获取得到每一个元素
		// E:拿这个元素到新集合去找，看有没有。 有则不添加， 没有：就添加。
		// F:遍历新集合
		ArrayList newLt = new ArrayList();
		Iterator it = lt.iterator();
		while (it.hasNext()) {
			Student stu = (Student) it.next();
			if (newLt.contains(stu) == false) {
				newLt.add(stu);
			}
		}
		show(newLt);

		// 我们按照和字符串一样的操作，发现出问题了。
		// 为什么呢?
		// 通过简单的分析，我们知道问题出现在了判断上。
		// 而这个判断功能是集合自己提供的，所以我们如果想很清楚的知道它是如何判断的，就应该去看源码。
		// contains()方法的底层依赖的是equals()方法。
		// 而我们的学生类中没有equals()方法，这个时候，默认使用的是它父亲Object的equals()方法
		// Object的equals()默认比较的是地址值，所以，它们进去了。因为new的东西，地址值都不同。
		// 按照我们自己的需求，比较成员变量的值，重写equals()即可。
		// 也可以自动生成即可。
	}

	// 方式二：过滤集合重复字符串
	public static void filter2(ArrayList lt) {
		// 思路分析：
		// 由选择排序思想引入，我们就可以通过这种思想做这个题目
		// 拿0索引的依次和后面的比较，有就把后的干掉
		// 同理，拿1索引...
		for (int i = 0; i < lt.size() - 1; i++) {
			for (int j = i + 1; j < lt.size(); j++) {
				Student stu1 = (Student) lt.get(i);
				Student stu2 = (Student) lt.get(j);
				//if (stu1.equals(stu2)) {
				if (stu1.getName().equals(stu2.getName()) && stu1.getAge() == stu2.getAge()) {
					lt.remove(j);
					j--;// 需要向前走一位，防止漏网之鱼   在ArrayList原来的副本基础上修改，index会改变的，所以j这个index需要自减；
				}
			}
		}

		show(lt);
	}

	// 显示学生信息
	public static void show(ArrayList lt) {
		Iterator it = lt.iterator();
		while (it.hasNext()) {
			Student stu = (Student) it.next();
			System.out.println(stu);
		}
	}

}
