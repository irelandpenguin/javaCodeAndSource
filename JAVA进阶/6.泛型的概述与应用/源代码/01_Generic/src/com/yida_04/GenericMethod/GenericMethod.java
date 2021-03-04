/**
 * 泛型方法：把泛型定义在方法上 
 * 注意：泛型方法与泛型类无关，即使是普通类，照样可以定义泛型方法。
 * 格式：<T>放在权限修饰符后，方法返回类型前。
 * 好处：一个方法定义为泛型方法，方法参数以及返回类型都共享该泛型。
 */
package com.yida_04.GenericMethod;

public class GenericMethod {
	public <T> void show(T obj) {//参数类型为泛型
		System.out.println(obj);
	}
	
	public <T> T print(T obj) {//参数和返回值类型为泛型
		return obj;
	}
}
