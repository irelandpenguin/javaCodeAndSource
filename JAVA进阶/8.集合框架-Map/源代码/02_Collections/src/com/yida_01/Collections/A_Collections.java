/*
 * Collections:是针对Collection集合进行操作的工具类，都是静态方法。
 * 
 * 面试题：
 * Collection和Collections的区别?
 * Collection:是单列集合的顶层接口，有子接口List和Set。
 * Collections:是针对集合操作的工具类，有对集合进行排序和二分查找的方法
 * 
 * 要知道的方法
 * public static <T> void sort(List<T> list)：排序 默认情况下是自然排序。
 * public static <T> void sort(List<T> list, Comparator<? super T> c)：比较器排序。
 * public static <T> int binarySearch(List<?> list,T key):二分查找
 * public static <T> T max(Collection<?> coll):最大值
 * public static <T> T min(Collection<?> coll):最小值
 * public static void reverse(List<?> list):反转集合元素
 * public static void shuffle(List<?> list):随机置换集合元素
 */
package com.yida_01.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A_Collections {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("yida");
		list.add("hulian");
		System.out.println("原始list:" + list);
		System.out.println("------");

		// public static <T> void sort(List<T> list)：排序 默认情况下是自然排序。
		//Collections.sort(list);
		//System.out.println("自然排序后的list" + list);
		//System.out.println("------");

		
		// public static <T> void sort(List<T> list, Comparator<? super T>
		// c)：比较器排序。
		/*Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);// 从小到大排序。 o2.compareTo(o1);//从大到小排序
			}
		});
		System.out.println("比较器排序后的list" + list);
		System.out.println("------");*/
		 
		// public static <T> int binarySearch(List<?> list,T key):二分查找,先决条件：集合要进行排序！
		//int index = Collections.binarySearch(list, "world");
		//System.out.println("world索引位置为" + index);
		//index = Collections.binarySearch(list, "WORLD");
		//System.out.println("WORLD索引位置为" + index);
		//System.out.println("------");

		
		// public static <T> T max(Collection<?> coll):最大值
		//System.out.println("Max=" + Collections.max(list));
		// public static <T> T min(Collection<?> coll):最小值
		//System.out.println("Min=" + Collections.min(list));
		//System.out.println("------");
		
		// public static void reverse(List<?> list):反转集合元素
		//Collections.reverse(list);
		//System.out.println("反转后的元素为" + list);
		//System.out.println("------");
		
		// public static void shuffle(List<?> list):随机置换集合元素
		//Collections.shuffle(list);
		//System.out.println("随机置换后的元素为" + list);
	}

}
