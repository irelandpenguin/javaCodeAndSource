/**
 * boolean addAll(Collection c):添加一个集合的元素
 * boolean removeAll(Collection c):移除一个集合的元素
 * boolean containsAll(Collection c)：判断集合中是否包含另一集合的所有元素  
 * boolean retainAll(Collection c):返回两集合的交集
 */
package com.yida_02.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class B_Collection {

	public static void main(String[] args) {
		// 创建集合1
		Collection c = new ArrayList();
		c.add("hi1");
		c.add("hi2");
		c.add("hi3");
		c.add("hi4");
		System.out.println("c:" + c);

		// 创建集合2
		Collection c2 = new ArrayList();
		c2.add("hi1");
		c2.add("hi2");
		c2.add("hi3");
		c2.add("hi4");
		c2.add("hi5");
		c2.add("hi6");
		c2.add("hi7");
		System.out.println("c2:" + c2);
		System.out.println("------");

		// boolean addAll(Collection c):添加一个集合的元素
		// c.addAll(c2);
		// System.out.println("c:" + c);
		// System.out.println("------");

		// boolean removeAll(Collection c):移除一个集合的元素
		// c.removeAll(c2);// 注释部分c2的元素，看结果变化
		// System.out.println("c:" + c);
		// System.out.println("c2:" + c2);
		// System.out.println("------");

		// boolean containsAll(Collection c)：判断集合中是否包含另一集合的所有元素
		// System.out.println(c.containsAll(c2));// 注释部分c2的元素，看结果变化
		// System.out.println("------");

		// boolean retainAll(Collection c):返回两集合的交集
		// 假设有两个集合A，B。
		// A对B做交集，最终的结果保存在A中，B不变。
		// 返回值表示的是A是否发生过改变。
		// System.out.println(c.retainAll(c2));// 注释部分c2的元素，看结果变化
		// System.out.println("c:" + c);
		// System.out.println("c2:" + c2);
	}

}
