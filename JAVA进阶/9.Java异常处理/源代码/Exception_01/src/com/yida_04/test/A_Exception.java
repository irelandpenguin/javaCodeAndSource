package com.yida_04.test;

import java.text.ParseException;

/**
 * 异常注意事项:
 * A:子类重写父类方法时，子类的方法必须抛出相同的异常或父类异常的子类;
 * B:如果父类抛出了多个异常,子类重写父类时,只能抛出相同的异常或者是他的子集,子类不能抛出父类没有的异常;
 * C:如果被重写的方法没有异常抛出,那么子类的方法绝对不可以抛出异常,如果子类方法内有异常发生,那么子类只能try,不能throws。
 */
public class A_Exception {

	public static void main(String[] args) {
		Zi zi = new Zi();
		try {
			zi.print();
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		/*try {
			zi.show();// 方法抛出的异常，调用者必须处理
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		//zi.method();// 方法没有抛出异常，调用者不用处理
	}
}

class Fu {
	public void show() throws Exception {

	}
	
	public void print() throws NullPointerException,StringIndexOutOfBoundsException,ArrayIndexOutOfBoundsException,ParseException {
		
	}

	public void method() {

	}
}

class Zi extends Fu {
	@Override
	public void show() throws Exception {
		System.out.println("hello");
	}
	
	public void print() throws StringIndexOutOfBoundsException, ArrayIndexOutOfBoundsException, NullPointerException, ParseException {
		super.print();
		System.out.println("world");
	}
	
	@Override
	public void method() {
		try {
			
		} catch (Exception e) {
			
		}
	}

	/*@Override
	public void show() throws ParseException {
		String s = "2018-08-08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(s);
		System.out.println(date);
	}

	@Override
	public void method() {
		String s = "2018-08-08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date);
	}*/
}
