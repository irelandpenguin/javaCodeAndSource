/*
 * 练习题1：把数组拼接成一个字符串。
 */
package com.yida_02;

public class A_Test {

	public static void main(String[] args) {
		int[] arr = { 12, 21, 2, 4, 32 };
		String result = arrayToString(arr);
		System.out.println(result);
		System.out.println("------");
		
		result = arrayToString2(arr);
		System.out.println(result);
	}

	// 方式一：
	public static String arrayToString(int[] ary) {
		String s = "[";
		for (int i = 0; i < ary.length; i++) {
			if (i == ary.length - 1) {
				s += ary[i] + "]";
			} else {
				s += ary[i] + ", ";
			}
		}
		return s;
	}
	
	//方式二：
	public static String arrayToString2(int[] ary) {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < ary.length; i++) {
			if (i == ary.length-1) {
				sb.append(ary[i]).append("]");
			} else {
				sb.append(ary[i]).append(", ");
			}
		}
		return sb.toString();
	}

}
