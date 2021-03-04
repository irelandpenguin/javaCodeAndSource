/*
 * 泛型类的测试
 */
package com.yida_02.GenericTool;

public class B_Test {

	public static void main(String[] args) {
		B_GenericTool<String> gt = new B_GenericTool<String>();
		gt.setObj("hello");
		String s = gt.getObj();
		System.out.println(s);

		System.out.println("------");

	
		//Integer ii = gt.getObj();// 这行自动提示错误了，因为上面已经指定了gt对象只能处理String类型的

		B_GenericTool<Integer> gtt = new B_GenericTool<Integer>();
		gtt.setObj(100);// 采用JDK5的新特性：自动装箱
		// gtt.setObj(new Integer(100));
		// gtt.setObj(Integer.valueOf(100));
		Integer i = gtt.getObj();
		System.out.println(i);
	
		System.out.println("------");

		//String str = gtt.getObj();// 这行自动提示错误了，因为上面已经指定了gtt对象只能处理Integer类型的
	}

}
