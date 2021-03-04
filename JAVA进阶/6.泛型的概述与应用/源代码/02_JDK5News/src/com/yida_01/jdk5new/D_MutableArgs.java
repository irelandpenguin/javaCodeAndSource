/**
 * 可变参数：定义方法的时候不知道该定义多少个参数
 * 格式：
 * 		修饰符  返回值类型  方法名(数据类型… 变量名){
 * 
 * 		}
 * 
 * 		比如：public int sum(int... args) {}
 * 
 * 		注意：
 * 			这里的变量名其实是一个数组
 * 			如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是放到最后一位。
 */
package com.yida_01.jdk5new;

public class D_MutableArgs {

	public static void main(String[] args) {
		// 求2个数的和
		int a = 10, b = 20;
		int result = sum(a, b);
		System.out.println("result=" + result);
		/*
		 * 1）快速生成方法
		 * 这里讲下如何快速创建方法，选择 a+b; 然后单击右键在弹出菜单中选择Refactor -> Extract Method...，
		 * 然后在弹出框中给方法起名，选择public，最后确定即可。
		 * 
		 * 2）快速定位方法，类以及成员变量所在位置。
		 * 		1. 光标定位到你要定位的方法，类或成员变量位置，然后按F3这个快捷键;
		 * 		2. 光标定位到你要定位的方法，类或成员变量位置,然后按ctrl键，出现一个小手，再单击鼠标左键;
		 * 		3. 光标定位到你要定位的方法，类或成员变量位置,在弹出提示界面的最前面 点击红色的小图标，快速进入。
		 */

		// 求3个数的和
		int x = 12, y = 90;
		int result2 = sum(x, y, 10);
		System.out.println("result=" + result2);

		// 求4个数的和
		int m = 0, n = 9;
		int result3 = sum(m, n, 10, 20);
		System.out.println("result=" + result3);

		// 需求：我要写一个求和的功能，到底是几个数据求和呢，不太清楚，为了解决这个问题，Java就提供了：可变参数.

		
		// 如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定要放到最后一位。
		hello(11, 22, 33, 44);
		
		System.out.println("------");
		
		//引用类型的可变参数
		world("girl","boy","man","femail");
		
		System.out.println("------");
		
		Student s1 = new Student("黄小明", 30);
		Student s2 = new Student("邓超", 40);
		Student s3 = new Student("鹿晗", 25);
		java(100, "跑男成员:", s1,s2,s3);
	}

	/*public static int sum(int a, int b) {
		return a+b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}*/

	public static int sum(int... args) {// 可变参数，这里的args其实就是数组，可反编译查看。
		int s = 0;
		for (int num : args) {
			s += num;
		}
		return s;
	}

	// 如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是放到最后一位。
	public static void hello(int x, int y, int... args) {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		for(int s : args) {
			System.out.println(s);
		}
	}
	
	
	//引用类型的可变参数
	public static void world(String... a) {
		for(String s : a) {
			System.out.println(s);
		}
	}
	
	public static void java(int x, String y,Student... b) {
		System.out.println("x="+x);
		System.out.println("y="+y);
		for(Student stu : b) {
			System.out.println(stu);
		}
	}
}
