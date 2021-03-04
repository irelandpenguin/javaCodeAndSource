package com.yida_01;

/**
 * 该类主要用于为数组提供便捷的方法操作。
 * 
 * @author 宜达互联-Mr Qain
 * @version V1.0
 */
public class ArrayTool {
	// 创建一个私有构造，来强制外界不能创建无参构造
	private ArrayTool() {
	}

	/**
	 * 遍历数组元素
	 * 
	 * @param array 整型数组
	 */
	public static void show(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			System.out.println(j);
		}
	}

	/**
	 * 返回数组中的最大元素值
	 * 
	 * @param array 整型数组
	 * @return 数组中最大元素值
	 */
	public static int max(int[] array) {
		int maxValue = array[0];
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			if (maxValue < j) {
				maxValue = j;
			}
		}
		return maxValue;
	}

	/**
	 * 根据值，查找对应的索引
	 * 
	 * @param array 整型数组
	 * @param value 查找的值
	 * @return 返回查找到的对应索引，如果找不到，返回-1
	 */
	public static int findIndex(int[] array, int value) {
		int index = -1;// 如果找不到，则返回-1
		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
}
