/*
 * 早期的时候，我们使用Object来代表任意的类型。
 * 向上转型是没有任何问题的，但是在向下转型的时候其实隐含了类型转换的问题。
 * 
 * 也就是说这样的程序其实并不是安全的。所以Java在JDK5后引入了泛型，提高程序的安全性。
 */
package com.yida_02.GenericTool;

public class A_Test {

	public static void main(String[] args) {
		A_ObjectTool ot = new A_ObjectTool();
		ot.setObj("hello");// String -> Object
		String s = (String) ot.getObj();// Object -> String
		System.out.println(s);

		
		System.out.println("------");

		A_ObjectTool ott = new A_ObjectTool();
		ott.setObj(new Integer(100));//Integer -> Object
		ott.setObj(100);//采用jdk5的新特性-自动装箱
		ott.setObj(Integer.valueOf(100));
		Integer i = (Integer) ott.getObj();// Object -> Integer
		System.out.println(i);
		
		System.out.println("------");

		// 但是，我下面的代码就会报ClassCastException异常错误，为什么？
		// 因为还是类型不一致，导致类型转换异常。
		String str = (String) ott.getObj();// Object -> String
		System.out.println(str);
	}

}
