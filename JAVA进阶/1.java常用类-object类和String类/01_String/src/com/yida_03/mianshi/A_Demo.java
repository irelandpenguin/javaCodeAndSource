/*
 * 面试题1：
 * String s = new String(“hello”)和String s = “hello”;有区别吗?
 * 	答：有！前者会创建2个对象，后者创建1个对象。
 * 
 * 面试题2：==和equals有区别吗？
 * 	答：	==：比较基本类型，比较的是值是否相同; 如果比较引用类型，则比较的是对象地址值是否相同;
 * 		equals：主要用于比较引用类型，默认比较的也是地址值是否相同，而String类重写了equals()方法，所以，比较的是内容是否相同。
 */
package com.yida_03.mianshi;

public class A_Demo {

	public static void main(String[] args) {
		String s1 = new String("hello");//这里会创建2个对象
		String s2 = "hello";//这里会创建一个对象
		
		// ==：比较引用类型，比较的是地址值是否相同
		System.out.println(s1 == s2);//false

		//equals：比较引用类型，默认也是比较地址值是否相同，而String类重写了equals()方法，所以比较的是内容是否相同
		System.out.println(s1.equals(s2));//true
	}
}
