/*
 * 数组排序算法有很多种，比如：冒泡排序，选择排序，快速排序，插入排序，希尔排序等。
 * 这里我们只学习前面2种就足够了，即冒泡排序，选择排序。
 * 
 * 冒泡排序：
 * 	相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处
 */
package com.yida_01;

public class A_BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 23, 15, 5, 67, 9 };
		System.out.println("排序前：");
		printArray(arr);
		System.out.println("排序后：");
		bubbleSort(arr);
		printArray(arr);
	}

	// 冒泡排序
	public static void bubbleSort(int[] ary) {
		for (int i = 1; i < ary.length; i++) {//外层控制循环次数
			for (int j = 0; j < ary.length-i; j++) {//两两比较，找出最大的
				if (ary[j] > ary[j+1]) {
					int tmp = ary[j];//tmp变量，用于交换ary[j]和ary[j+1]
					ary[j] = ary[j+1];
					ary[j+1] = tmp;
				}
			}
		}
	}
	
	// 打印数组元素
	public static void printArray(int[] ary) {
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

	// 从大到小，代码怎么写呢？

}
