/*
 * System类包含一些有用的类字段和静态方法。它不能被实例化。 
 * 
 * 方法：
 *		//运行垃圾回收器。 
 * 		public static void gc()
 * 
 * 		//终止当前正在运行的 Java 虚拟机。
 *		//参数用作状态码; 根据惯例，非 0 的状态码表示异常终止。所以，一般都给0，表示正常退出程序。
 *		public static void exit(int status)
 *
 *		//返回以毫秒为单位的当前时间。
 *		public static long currentTimeMillis()
 *		
 *		//从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
 *		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */
package com.yida_01.system;

import java.util.Arrays;

public class SystemDemo {
	public static void main(String[] args) {
		//test1();//运行垃圾回收器。
		//test2();//返回以毫秒为单位的当前时间。
		//test3();//从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
	}
	
	//运行垃圾回收器。 
	//public static void gc()
	public static void test1() {
		Student stu = new Student("张三", 28);
		System.out.println(stu);

		System.exit(0);//正常退出

		stu.setName("李四");
		stu.setAge(25);
		System.out.println(stu);

		stu = null;
		System.gc();// 运行垃圾回收器
	}
	
	//返回以毫秒为单位的当前时间。
	//public static long currentTimeMillis()
	public static void test2() {
		// 单独得到这样的实际目前对我们来说意义不大
		// 那么，它到底有什么作用呢?
		// 要求：请大家给我统计这段程序的运行时间
		long beginTimer = System.currentTimeMillis();
		for (int i = 1; i <= 10000; i++) {
			System.out.println("java" + i);
		}
		long endTimer = System.currentTimeMillis();
		System.out.println("共耗时：" + (endTimer - beginTimer)+"毫秒");
	}
	
	//从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
	//参数1：源始数组
	//参数2：源始数组复制的起始索引
	//参数3：目标数组
	//参数4：目标数组的指定索引(即：就是你要复制到目标数组的哪个位置)
	//参数5：源始数组要复制的长度
	//public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
	public static void test3() {
		// 定义数组
		int[] arr1 = { 11, 22, 33, 44, 55 };
		int[] arr2 = { 6, 7, 8, 9, 10 };

		// 请大家看这个代码的意思
		System.arraycopy(arr1, 1, arr2, 2, 3);
		//System.arraycopy(arr1, 0, arr2, 1, 2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		/*
		 * System.arraycopy(arr1, 1, arr2, 2, 3);
		 * 
		 * 代码解释： 从源数组arr1索引1的位置开始复制3数组元素，复制到目标数组arr2索引为2的位置。
		 * 此时，目标数组arr2索引为2的位置开始的3个数组元素会被arr1复制的3个数组元素覆盖！
		 */
	}
}
