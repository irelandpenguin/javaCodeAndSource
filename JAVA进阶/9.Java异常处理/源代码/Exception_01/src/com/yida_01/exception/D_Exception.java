package com.yida_01.exception;
/**
 * JDK7出现了一个新的异常处理方案：
 * 		try{
 * 
 * 		}catch(异常名1 | 异常名2 | ...  变量 ) {
 * 			...
 * 		}
 * 
 * 		注意：这个方法虽然简洁，但是也不够好。
 * 			A:处理方式是一致的。(实际开发中，好多时候可能就是针对同类型的问题，给出同一个处理)
 *			B:多个异常间必须是平级关系。
 */
public class D_Exception {

	public static void main(String[] args) {
		int a = 8, b = 0;
		int[] arr = { 2, 21, 3 };
		String s = "hello";
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
			System.out.println(s.charAt(5));
		} catch (ArithmeticException|ArrayIndexOutOfBoundsException|StringIndexOutOfBoundsException e) {
			System.out.println("我写的程序出现异常了，需要检查我的代码来修正。");
		}

		System.out.println("over");
	}

}
