/*
 * ==:
 * 		基本类型：比较的就是值是否相同
 * 		引用类型(数组，类，接口)：比较的就是地址值是否相同
 * 
 * public boolean equals(Object obj):指示其他某个对象是否与此对象“相等”。 
 * 这个方法，默认情况下比较的是地址值。
 *  源代码：
 * 		public boolean equals(Object obj) {
 *       	return (this == obj);
 *   	}
 *   
 * 比较地址值一般来说意义不大，所以我们要重写该方法。
 * 怎么重写呢?
 * 		一般都是用来比较对象的成员变量值是否相同。
 *
 * 最终版：
 * 		其实还是自动生成。
 * 
 */
package com.yida_03.equals;


public class StudentTest {

	public static void main(String[] args) {
		int a = 2, b = 2;
		System.out.println(a == b);//true == 基本类型比较的是值

		Student s1 = new Student("张三", 22);
		Student s2 = new Student("李四", 30);
		System.out.println(s1 == s2);//false == 引用类型比较的是地址
		
		Student s3 = s1;
		System.out.println(s3 == s1);//true == 引用类型比较的是地址
		
		System.out.println("----------");

		System.out.println(s1.equals(s2));//false 	equals() 引用类型比较的是地址
		System.out.println(s1.equals(s3));//true	 equals() 引用类型比较的是地址
		
		System.out.println("----------");
		
		//重写equals方法后，测试
		Student s4 = s2;
		System.out.println(s1.equals(s2));//false
		System.out.println(s2.equals(s4));//true

	}

}
