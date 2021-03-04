/*
 * 查找：
 * 		基本查找:数组元素无序(从头找到尾)
 * 		二分查找(折半查找):数组元素必须有序
 * 
 * 分析：
 * 		A:定义最大索引，最小索引;
 * 		B:计算出中间索引;
 * 		C:拿中间索引的值和要查找的值进行比较;
 * 			相等：就返回当前的中间索引;
 * 			不相等：
 * 				大	左边找
 * 					high = mid - 1;
 * 				小	右边找
 * 					low = mid + 1;
 * 		D:回到B;
 * 		E:当最小索引low大于最大索引high时，结束查找;
 */
package com.yida_02;

public class A_BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 12, 45, 80 };//一维的顺序数组
		int index = binSearch(arr, 45);
		System.out.println("index:" + index);
		index = binSearch(arr, 10);
		System.out.println("index:" + index);
		index = binSearch(arr, 8);
		System.out.println("index:" + index);
	}

	public static int binSearch(int[] ary, int value) {
		int min = 0, max = ary.length-1;
		while (min <= max) {
			int mid = (min+max)/2;
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
