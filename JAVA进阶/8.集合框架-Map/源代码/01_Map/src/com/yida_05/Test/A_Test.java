/*
 * 需求 ："aababcabcdabcde",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)
 * 
 * 分析：
 * 		A:定义一个字符串(可以改进为键盘录入)
 * 		B:定义一个TreeMap集合
 * 			键:Character
 * 			值：Integer
 * 		C:把字符串转换为字符数组
 * 		D:遍历字符数组，得到每一个字符
 * 		E:拿刚才得到的字符作为键到集合中去找值，看返结果
 * 			false:说明该键不存在，就把该字符作为键，1作为值存储
 * 			true:说明该键存在，就把值加1，然后重新存储该键和值
 * 		F:定义字符串缓冲区变量
 * 		G:遍历集合，得到键和值，进行按照要求拼接
 * 		H:把字符串缓冲区转换为字符串输出
 */
package com.yida_05.Test;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class A_Test {

	public static void main(String[] args) {
		// A:定义一个字符串(可以改进为键盘录入)
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = sc.nextLine();

		// B:定义一个TreeMap集合
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		// C:把字符串转换为字符数组
		char[] arr = str.toCharArray();

		// D:遍历字符数组，得到每一个字符
		for (char c : arr) {
			// E:拿刚才得到的字符作为键到集合中去找值，看返结果
			// false:说明该键不存在，就把该字符作为键，1作为值存储
			// true:说明该键存在，就把值加1，然后重新存储该键和值
			boolean b = tm.containsKey(c);
			if (b == false) {
				tm.put(c, 1);// jdk5新特性-自动装箱
			} else {
				Integer value = tm.get(c);
				value++;// jdk5新特性-自动拆箱，然后再装箱
				tm.put(c, value);
			}
		}

		// F:定义字符串缓冲区变量
		StringBuilder sb = new StringBuilder();

		// G:遍历集合，得到键和值，进行按照要求拼接
		Set<Character> set = tm.keySet();
		for (Character key : set) {
			Integer value = tm.get(key);
			sb.append(key).append('(').append(value).append(')');
		}

		// H:把字符串缓冲区转换为字符串输出
		System.out.println(sb.toString());
	}

}
