/*
 * 选择排序：
 * 	从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处
 */
package com.yida_01;

public class B_SelectSort {

	public static void main(String[] args) {
		int[] arr = { 23, 15, 5, 67, 9 };
		System.out.println("排序前：");
		printArray(arr);
		System.out.println("排序后：");
		selectSort(arr);
		printArray(arr);
	}

	// 选择排序
	public static void selectSort(int[] ary) {
		for (int i = 0; i < ary.length-1; i++) {//外层循环控制循环次数
			for (int j = i+1; j < ary.length; j++) {//依次比较，找出最小值
				if (ary[i] > ary[j]) {
					int tmp = ary[i];//tmp变量，用于交换ary[i]和ary[j]
					ary[i] = ary[j];
					ary[j] = tmp;
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
