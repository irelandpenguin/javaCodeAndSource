package com.yida_01.exception;
/**
 * 运行期异常抛出，将来调用者不用处理，交给J(Java)V(Virtual)M(Machine)处理。
 * @author 宜达互联-Mr Qain
 *
 */
public class F_Exception2 {

	public static void main(String[] args) {
		//test1();
		
		/*try {
			test1();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		//test2();
		
		/*try {
			test2();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("我的程序，我要处理！");
		}*/
		
		System.out.println("over");
	}
	
	//案例1：运行期异常，即：RuntimeException类型的异常
	public static void test1() {
		int a=8,b=0;
		System.out.println(a/b);//这行代码，有可能在程序运行时，产生ArithmeticException异常
	}
	
	//案例2：运行期异常，即：RuntimeException类型的异常
	public static void test2() {
		//NullPointerException
		String s = null;
		System.out.println(s.concat("hello"));
	}
}
