package com.yida_01.exception;
/**
 * A:一个异常的处理
 * B:二个异常的处理
 * 		a:针对每个异常都写一个try...catch
 * 		b:写一个try，多个catch
 * 			try{
 * 				...
 * 			} catch(异常类名 变量名) {
 * 				...
 * 			} catch(异常类名 变量名) {
 * 				...
 * 			}
 * 			...
 * 
 * 			注意：
 * 				1:一旦try里面出了问题，就会在这里把问题给抛出去，然后和catch里面的问题进行匹配，
 * 				 如果有匹配的就执行catch里面的处理，然后结束try...catch继续执行后面的语句;
 * 				2:能明确的尽量明确，不要用大的来处理;
 * 				3:平级关系的异常谁前谁后无所谓，如果出现了子父关系，父必须在最后面。
 */
public class C_Exception {

	public static void main(String[] args) {
		//test1();//只有一个异常处理的
		//test2();//有3个异常处理的(a:针对每个异常都写一个try...catch)
		test3();// 有3个异常处理的(b:写一个try，多个catch)
	}
	
	// 只有一个异常处理的
	public static void test1() {
		int a = 8, b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		}

		System.out.println("over");
	}

	// 有2个异常处理的(a:针对每个异常都写一个try...catch)
	public static void test2() {
		int a = 8, b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		}

		int[] arr = { 12, 20, 2 };
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组索引越界了");
		}
		
		String s = "hello";
		try {
			System.out.println(s.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("字符串索引越界了");
		}

		System.out.println("over");
	}

	// 有2个异常处理的(b:写一个try，多个catch)
	public static void test3() {
		int a = 8, b = 0;
		int[] arr = { 21, 2, 32 };
		String s = "hello";
		try {//注意：一个try多个catch进行异常捕获时，如果try里有多行异常代码，它只能捕获第一次出现的异常。其它异常不再捕获！
			System.out.println(a / b);
			System.out.println(arr[3]);
			System.out.println(s.charAt(10));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组的索引越界了");
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("字符串索引越界了");
		} catch (Exception e) {
			System.out.println("程序出异常了，需要我们处理！");
		}

		System.out.println("over");
	}

}
