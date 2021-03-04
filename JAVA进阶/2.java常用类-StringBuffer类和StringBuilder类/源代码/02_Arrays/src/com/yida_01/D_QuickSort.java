package com.yida_01;

/*
 * 此排序，不要求掌握。有精力的同学可以看一看，不懂随时问我。
 * 
 * 快速排序
 * 排序思想： 基准数归位思想。 
 * 即：
 * 每次都取数组的第一个元素作为基准数，首先，右哨兵探测比基准数小的元素，找到了则停止探测;
 * 然后，左哨兵探测比基准数大的元素，找到了，则停止探测;
 * 当左，右哨兵未相遇时，则不断交换左，右哨兵探测到的元素，直到左，右哨兵相遇时，基准数与相遇时的那个元素交换，即：基准数归位。
 */
public class D_QuickSort {
	private static int[] ary = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };
	
	public static void main(String[] args) {
		System.out.println("排序前：");
		printArray(ary);
		System.out.println("排序后：");
		quickSort(0, ary.length-1);
		printArray(ary);
	}

	// 打印数组元素
	public static void printArray(int[] ary) {
		StringBuffer sb = new StringBuffer("[");
		for (int i = 0; i < ary.length; i++) {
			if (i == ary.length-1) {
				sb.append(ary[i]).append("]");
			} else {
				sb.append(ary[i]).append(", ");
			}
		}
		System.out.println(sb.toString());
	}

	/**
	 * 快速排序
	 * 
	 * 排序思想： 基准数归位思想。 
	 * 即：
	 * 每次都取数组的第一个元素作为基准数，首先，右哨兵探测比基准数小的元素，找到了则停止探测;
	 * 然后，左哨兵探测比基准数大的元素，找到了，则停止探测;
	 * 当左，右哨兵未相遇时，则不断交换左，右哨兵探测到的元素，直到左，右哨兵相遇时，基准数与相遇时的那个元素交换，即：基准数归位。
	 * 
	 * 参数1：左哨兵，用于探测比基准数大的数 
	 * 参数2：右哨兵，用于探测比基准数小的数。且每一次都必须是右哨兵先探测！
	 */
	public static void quickSort(int left, int right) {
		if (left > right) {
			return;
		}

		int tmp = ary[left];// 基准数
		int i = left;// 左哨兵
		int j = right;// 右哨兵
		int t;// 用于交换的临时变量

		while (i != j) {
			// 首先，右哨兵先探测，找出比基准数小的元素
			while (ary[j] >= tmp && i < j) {
				j--;
			}

			// 然后，左哨兵探测，找出比基准数大的元素
			while (ary[i] <= tmp && i < j) {
				i++;
			}

			if (i < j) {// 当左，右哨兵未相遇时，则不断交换左，右哨兵探测到的元素
				t = ary[i];
				ary[i] = ary[j];
				ary[j] = t;
			}
		}

		// i == j 表示左，右哨兵相遇，此时基准数与相遇时的元素交换
		ary[left] = ary[i];
		ary[i] = tmp;

		quickSort(left, i-1);// 继续处理左边的，这里是一个递归的过程
		quickSort(i+1, right);// 继续处理右边的，这里也是一个递归的过程
	}
}
