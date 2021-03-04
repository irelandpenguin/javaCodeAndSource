/*
 * 练习题1：有一个顺序字符数组{'A','C','E','P','R','T','V','X','Y','Z'}，找出字符'A','E','X','W'对应索引，找不到打印-1。
 */
package com.yida_02;

public class B_Test {

	public static void main(String[] args) {
		char[] arr = { 'A', 'C', 'E', 'P', 'R', 'T', 'V', 'X', 'Y', 'Z' };
		
		/*int idx = binSearch(arr, 'A');
		System.out.println("字符" + 'A' + "的索引为" + idx);
		idx = binSearch(arr, 'E');
		System.out.println("字符" + 'E' + "的索引为" + idx);
		idx = binSearch(arr, 'X');
		System.out.println("字符" + 'X' + "的索引为" + idx);
		idx = binSearch(arr, 'W');
		System.out.println("字符" + 'W' + "的索引为" + idx);*/
		
		//改进版本
		char[] chars = { 'A', 'E', 'X', 'W' };
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			int idx = binSearch(arr, c);
			System.out.println("字符" + c + "的索引为" + idx);
		}
	}

	// 二分查找
	public static int binSearch(char[] ary, char value) {
		int min = 0, max = ary.length - 1;
		while (min <= max) {
			int mid = (min + max) / 2;
			if (ary[mid] == value) {
				return mid;
			} else if (ary[mid] > value) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}
		return -1;
	}

}
