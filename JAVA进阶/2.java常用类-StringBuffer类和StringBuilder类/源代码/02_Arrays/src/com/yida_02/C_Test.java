/*
 * 练习题2：有一个数组{21, 45, 2, 30, 100, 60}，找出数字45，100对应索引，找不到打印-1。
 * 
 * 分析：
 * 		首先该数组不是顺序数组，不符合二分查找条件。
 * 		所以，不能用二分查找法。 只能使用顺序查找。
 * 
 * 疑惑：
 * 		有的学员说，老师我可以先对数组排序，然后再进行二分查找。不可以吗？
 * 解答：
 * 		不可以，你这样做，还是原数组吗？？ 找出来的索引对吗？
 */
package com.yida_02;

public class C_Test {

	public static void main(String[] args) {
		// 正确做法
		int[] arr = { 21, 45, 2, 30, 100, 60 };
		int[] ints = { 45, 100 };
		for (int i = 0; i < ints.length; i++) {
			int value = ints[i];
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] == value) {
					System.out.println(value + "在原数组中的索引为" + k);
				}
			}
		}

		System.out.println("------");

		// 错误做法
		/*bubbleSort(arr);//{ 2,21, 30, 45, 60, 100 };
		for (int i = 0; i < ints.length; i++) {
			int value = ints[i];
			int index = binSearch(arr, value);
			System.out.println(value + "在原数组中的索引为" + index);
		}*/
	}

	// 冒泡排序
	public static void bubbleSort(int[] ary) {
		for (int i = 1; i < ary.length; i++) {
			for (int j = 0; j < ary.length - i; j++) {
				if (ary[j] > ary[j + 1]) {
					int tmp = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = tmp;
				}
			}
		}
	}

	// 二分查找
	public static int binSearch(int[] ary, int value) {
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
