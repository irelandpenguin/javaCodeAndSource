/**
 * 学习泛型之前，我们回顾下：ArrayList存储字符串并遍历
 * 
 * 泛型：是一种把类型明确的工作推迟到创建对象或者调用方法的时候才去明确的特殊类型。
 * 也称为参数化类型，即把类型当作参数一样传递。
 * 格式：
 * 		<数据类型>
 * 		注意：此处的数据类型只能是引用类型。
 * 好处：
 * 		A:把运行时期的问题提前到了编译期间
 * 		B:避免了强制类型转换
 * 		C:优化了程序设计，解决了黄色警告
 */
package com.yida_01.GenericDefine;

import java.util.ArrayList;
import java.util.Iterator;

public class A_Generic {

	public static void main(String[] args) {
		// 创建集合对象
		ArrayList list = new ArrayList();

		// 给集合对象添加元素
		list.add("hello");
		list.add("yida");
		list.add("java");
		System.out.println(list);

		// 再给集合添加一个Integer类型的对象
		list.add(new Integer(100));// 方式一，添加
		list.add(20);// 方式二，添加。采用自动装箱功能
		list.add(Integer.valueOf(30));// 方式三，添加
		System.out.println(list);

		// 集合一旦添加了Integer类型的对象后，再次遍历集合。会报错 ClassCastException。为什么呢？
		// 因为Integer类型默认转成String类型了，导致类型转换异常。

		
		// 遍历集合对象
		/*Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();// 强制转换
			System.out.println(s);
		}*/
		
		
		//System.out.println("------");

		// 也可以for循环遍历集合对象
		/*for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);// 强制转换
			System.out.println(s);
		}*/

		
		// 回想一下，我们之前学习的数组
		/*String[] arr = new String[3];
		arr[0] = "hello";
		arr[1] = "yida";
		arr[2] = 10;*///这里这样赋值就是错误的，因为数组已经指定是String类型的了。
		
		System.out.println("---下面是泛型的运用，先体验一下---");

		// 现在，我重新创建一个集合，也模仿着数组来指定类型
		ArrayList<String> lt = new ArrayList<String>();
		lt.add("hello");
		lt.add("yida");
		lt.add("java");
		//lt.add(new Integer(100));//这里这样赋值就是错误的，因为集合已经指定是String类型的了。

		// 遍历集合
		Iterator<String> irt = lt.iterator();
		while (irt.hasNext()) {
			String str = irt.next();// 不用再强制转换了
			System.out.println(str);
		}
		
		System.out.println("------");

		// 也可以for循环遍历集合
		for (int i = 0; i < lt.size(); i++) {
			String str = lt.get(i);// 不用再强制转换了
			System.out.println(str);
		}
	}

}
