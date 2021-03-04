/*
 * 键盘录入字符串，然后对录入的字符串从大到小排序。
 * 	冒泡排序法
 * 	选择排序法
 */
package com.yida_01;

import java.util.Scanner;

public class C_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个字符串:");
		String s = sc.nextLine();
		bubbleSort(s);
		selectSort(s);
	}

	// 冒泡排序
	public static void bubbleSort(String s) {
		char[] ary = s.toCharArray();
		for (int i = 1; i < ary.length; i++) {
			for (int j = 0; j < ary.length-i; j++) {
				if (ary[j] < ary[j+1]) {
					char c = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = c;
				}
			}
		}
		printArray(ary);
	}

	// 选择排序
	public static void selectSort(String s) {
		char[] ary = s.toCharArray();
		for (int i = 0; i < ary.length-1; i++) {
			for (int j = i+1; j < ary.length; j++) {
				if (ary[i] < ary[j]) {
					char c = ary[i];
					ary[i] = ary[j];
					ary[j] = c;
				}
			}
		}
		printArray(ary);
	}

	// 打印数组元素
	public static void printArray(char[] ary) {
		StringBuffer sb = new StringBuffer("[");
		for (int i = 0; i < ary.length; i++) {
			if (i == ary.length - 1) {
				sb.append(ary[i]).append("]");
			} else {
				sb.append(ary[i]).append(", ");
			}
		}
		System.out.println(sb.toString());
	}

}
