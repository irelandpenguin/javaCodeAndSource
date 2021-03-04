/*
 * Arrays:针对数组进行操作的工具类。比如说排序和查找。
 * public static String toString(int[] a) 把数组转成字符串
 * 
 * public static void sort(int[] a) 数组排序(默认从小到大)
 * public static void sort(int[] a, int fromIndex, int toIndex) 数组指定范围内的元素排序
 * 
 * public static int binarySearch(int[] a,int key) 二分查找，返回第一次出现的索引位置
 * 
 * public static int[] copyOfRange(int[] original, int from, int to) 将数组的指定范围复制到一个新数组，返回新数组
 * 
 * public static boolean equals(int[] a, int[] a2) 判断两个数组里的所有元素是否相同
 * 
 * 注意：上述所有方法里的数组参数，可以是其它数据类型， 如：boolean[],byte[],char[],long[],float[],double[],Object[]等。
 */
package com.yida_03;

import java.util.Arrays;

public class A_ArrayTool {
	public static void main(String[] args) {
		// public static String toString(int[] a) 把数组转成字符串
		int[] arr1 = { 12, 1, 8, 5, 80 };
		String s = Arrays.toString(arr1);
		System.out.println(s);
		System.out.println("------");
		
		// public static void sort(int[] a) 数组排序(默认从小到大)
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println("------");
		
		// public static void sort(int[] a, int fromIndex, int toIndex)数组指定范围内的元素排序
		int[] arr2 = { 20, 1, 12, 5, 80, 4, 60, 45, 25, 100 };
		System.out.println(Arrays.toString(arr2));// 排序前
		Arrays.sort(arr2, 1, 6);// 从fromIndex开始排序到toIndex。但不包括toIndex
		System.out.println(Arrays.toString(arr2));// 排序后
		System.out.println("------");
		
		// public static int binarySearch(int[] a,int key) 二分查找，返回第一次出现的索引位置
		int[] arr3 = { 2, 10, 12, 45, 80 };//从小到大排好序的数组
		System.out.println(Arrays.toString(arr3));
		int index = Arrays.binarySearch(arr3, 44);
		System.out.println("index=" + index);
		System.out.println("------");
		
		// public static int[] copyOfRange(int[] original, int from, int to)
		// 将数组的指定范围复制到一个新数组，返回新数组
		int[] newArr3 = Arrays.copyOfRange(arr3, 1, 5);// 从fromIndex开始复制到toIndex。但不包括toIndex
		System.out.println("newArr3:" + Arrays.toString(newArr3));
		System.out.println("------");
		
		// public static boolean equals(int[] a, int[] a2) 判断两个数组里的所有元素是否相同
		int[] arr4 = { 10, 23, 2, 12, 5 };
		int[] arr5 = { 10, 23, 2, 12, 5 };
		System.out.println(Arrays.equals(arr4, arr5));
	}
}
