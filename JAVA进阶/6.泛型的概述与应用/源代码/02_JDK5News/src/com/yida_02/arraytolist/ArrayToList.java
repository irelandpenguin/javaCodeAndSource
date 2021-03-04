/**
 * 集合与数组互转
 * 
 * 集合转数组
 * 	 使用ArrayList里的toArray()方法
 * 
 * 数组转集合
 * 使用工具类Arrays里的一个方法
 * public static <T> List<T> asList(T... a):把数组转成集合
 * 
 * 注意事项：
 * 		虽然可以把数组转成集合，但是集合的长度不能改变。
 */
package com.yida_02.arraytolist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		// 集合转数组
		ArrayList<String> lit = new ArrayList<String>();
		lit.add("hello");
		lit.add("world");
		Object[] arr = lit.toArray();

		for (Object obj : arr) {
			String str = (String) obj;
			System.out.println(str);
		}
		
		System.out.println("-----");
		
		String[] arr2 = new String[lit.size()];
		lit.toArray(arr2);
		for(String s : arr2) {
			System.out.println(s);
		}

		
		System.out.println("------");

		// 数组转集合
		String[] arr3 = { "你好", "hello", "java" };
		List<String> list = Arrays.asList(arr3);

		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("------");

		// 虽然可以把数组转成集合，但是集合的长度不能改变。
		//list.add("宜达互联");// 此行报错，UnsupportedOperationException
		// list.remove(1);// 此行报错，UnsupportedOperationException
		list.set(1, "宜达互联");// 此行正确，因为集合的长度没改变
		System.out.println(list);
		
		System.out.println("------");
		
		List<String> list2 = Arrays.asList("hello","world","yida");
		for (String s2 : list2) {
			System.out.println(s2);
		}
	}

}
