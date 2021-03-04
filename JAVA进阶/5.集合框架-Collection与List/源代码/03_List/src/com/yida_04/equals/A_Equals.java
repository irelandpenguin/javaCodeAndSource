/*
 * ArrayList去除集合中字符串的重复值(字符串的内容相同)
 * List特点：有序可重复。这里的有序不是排序，是指存放和取出是一致的。
 */
package com.yida_04.equals;

import java.util.ArrayList;
import java.util.Iterator;

public class A_Equals {

	public static void main(String[] args) {
		ArrayList lt = new ArrayList();
		lt.add("hello");
		lt.add("hello");
		lt.add("hello");
		lt.add("world");
		lt.add("java");
		lt.add("world");

		// 方式一：过滤集合重复字符串
		//filter(lt);

		// 方式二：过滤集合重复字符串
		filter2(lt);
	}

	// 方式一：过滤集合重复字符串
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
			String s = (String) it.next();
			if (newLt.contains(s) == false) {
				newLt.add(s);
			}
		}
		System.out.println(newLt);
	}

	// 方式二：过滤集合重复字符串
	public static void filter2(ArrayList lt) {
		// 思路分析：
		// 由选择排序思想引入，我们就可以通过这种思想做这个题目
		// 拿0索引的依次和后面的比较，有就把后的干掉
		// 同理，拿1索引...
		for (int i = 0; i < lt.size()-1; i++) {
			for (int j = i+1; j < lt.size(); j++) {
				String s1 = (String) lt.get(i);
				String s2 = (String) lt.get(j);
				if (s1.equals(s2)) {
					lt.remove(j);
					j--;// 需要向前走一位，防止漏网之鱼
				}
			}
		}

		System.out.println(lt);
	}

}
