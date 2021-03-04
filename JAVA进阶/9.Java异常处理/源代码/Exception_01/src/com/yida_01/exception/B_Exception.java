package com.yida_01.exception;
/**
 * 我们自己如何处理异常呢?
 * A:try...catch...finally
 * B:throws 抛出
 * 
 * try...catch...finally的处理格式：
 * 		try {
 * 			可能出现问题的代码;
 * 		}catch(异常名 变量) {
 * 			针对问题的处理;
 * 		} finally {
 * 			释放资源;
 * 		}
 * 
 * 我们先讲它的变形格式：
 * 		try {
 * 			可能出现问题的代码;
 * 		}catch(异常名 变量) {
 * 			针对问题的处理;
 * 		}
 * 
 * 带finally的最终格式放到后面讲。
 * 
 * 注意：
 * 		A:try里面的代码越少越好；
 * 			因为代码越多，可能产生的异常就越多，JVM就会开辟更多资源处理异常，耗费内存和cpu就越多。
 * 		B:catch里面必须有内容，哪怕是一个简单的提示行。
 */
public class B_Exception {

	public static void main(String[] args) {
		int a = 8, b = 0;
		/*try {
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("程序出现异常了，需要处理.");
		}*/
		
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("注意了！除数不能为0！！");
		}
		
		// try...catch...的好处：可以让你的代码不终止，继续执行后面的代码。

		System.out.println("over");
	}

}
