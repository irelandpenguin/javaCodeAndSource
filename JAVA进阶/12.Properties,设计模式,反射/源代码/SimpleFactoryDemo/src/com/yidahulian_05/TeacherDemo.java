package com.yidahulian_05;

/*
 * 单例模式：
 * 		饿汉式：类一加载就创建对象
 * 			举例：下班回到家，看到一块馒头，一口吃完。(创建一个类，立即创建对象。)
 * 		懒汉式：用的时候，才去创建对象
 * 			举例：不到饿死的那一刻，决不吃那块馒头。(用到的时候，才去创建对象。)
 * 
 * 面试题：单例模式的思想是什么?请写一个代码体现。
 * 
 * 		开发使用：饿汉式(是不会出问题的单例模式 -- cpu执行的原子性保证)
 * 		面试使用：懒汉式(可能会出问题的单例模式 -- 多线程同时共享数据(可用synchronized解决))
 * 			A:懒加载(延迟加载，这个没问题的)	
 * 			B:线程安全问题(可用synchronized解决)
 */
public class TeacherDemo {

	public static void main(String[] args) {
		Teacher tea1 = Teacher.getTeacher();
		Teacher tea2 = Teacher.getTeacher();
		if (tea1 == tea2) {
			System.out.println(tea1);
			System.out.println(tea2);
			System.out.println("同一个对象");
		}
	}

}
