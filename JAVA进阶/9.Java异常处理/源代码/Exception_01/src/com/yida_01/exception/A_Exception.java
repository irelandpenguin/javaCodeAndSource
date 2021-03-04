package com.yida_01.exception;
/**
 * 程序的异常：Throwable
 * 		严重问题：我们不处理。这种问题一般都是很严重的，比如说内存溢出。
 * 		普通问题：Exception
 * 			编译期问题:非RuntimeException的异常，必须进行处理的，因为你不处理，编译就不通过。
 * 			运行期问题:RuntimeException的异常，一般不作处理，但因为我们的代码不够严谨导致的，要做处理。
 * 
 * 如果程序出现了问题，我们没有做任何处理，最终jvm会做出如下默认的处理:
 * <1>.把异常的名称，原因及出现的问题等信息输出在控制台。
 * <2>.同时会结束程序。
 */
public class A_Exception {
	public static void main(String[] args) {
		int a = 8, b = 0;
		System.out.println(a / b);// 报错，ArithmeticException算法异常。原因是0不能做除数
		System.out.println("over");
	}
}
