package com.yida_01.exception;
/**
 * throw:
 * 	如果程序出现了异常，我们也可以把该异常抛出，但抛出的是异常对象。
 * 
 * 总结：
 * 如果我们throw一个异常对象，什么时候在方法后throws ？
 * 	1）主动throw的异常对象是RuntimeException类型的，方法后可以不写throws。(当然，你加了，也对。)
 * 	2）主动throw的异常对象是非RuntimeExcetipn类型的，方法后必须写throws。因为它是编译期异常，必须处理。
 * 
 * throws和throw的区别(面试题)
 *	throws
 *		用在方法括号后面，抛的是异常类名，可以抛多个，用逗号分隔;
 *		抛出的异常由调用者来处理;
 *		throws抛的是可能发生的异常，并不一定真会发生。
 *	throw
 *		用在方法体内，抛的是异常对象且只能抛一个;
 *		抛出的异常由方法体内的语句处理;
 *		throw抛的异常，一定是真实存在的。
 */
public class G_Exception {

	public static void main(String[] args) {
		test();//运行期异常，调用者不做处理

		//编译期异常，调用者必须处理
		try {
			test2();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("OVER啦~~");
	}
	
	public static void test() {
		int a = 8, b = 0;
		if (b == 0) {
			throw new ArithmeticException();// 抛出一个运行期间异常(API查看)，调用者可不处理
		} else {
			System.out.println(a / b);
		}
	}

	public static void test2() throws Exception {
		int a = 8, b = 0;
		if (b == 0) {
			throw new Exception();// 抛出一个编译期间异常，调用者必须处理
		} else {
			System.out.println(a / b);
		}
	}
	
	/*public static void test3() throws ArithmeticException,ArrayIndexOutOfBoundsException,StringIndexOutOfBoundsException {
		
	}*/

}
