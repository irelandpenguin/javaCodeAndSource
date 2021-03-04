/**
 * 泛型高级(通配符)
 * ?：代表任意类型，即Object类型
 * ? extends E：向下限定，E及其子类
 * ? super E：向上限定，E及其父类
 */
package com.yida_07.tongpeifu;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		// 泛型如果明确写的时候，前后必须一致
		Collection<Object> c1 = new ArrayList<Object>();
		//Collection<Object> c2 = new ArrayList<Animal>();//报错，Object改成Animal试下
		//Collection<Object> c3 = new ArrayList<Dog>();//报错，Object改成Dog试下
		//Collection<Object> c4 = new ArrayList<Cat>();//报错，Object改成Cat试下

		// ?：代表任意类型，即Object类型
		//作用：用来表示任意类型的泛型类
		Collection<?> c5 = new ArrayList<Object>();
		Collection<?> c6 = new ArrayList<Animal>();
		Collection<?> c7 = new ArrayList<Dog>();
		Collection<?> c8 = new ArrayList<Cat>();
		System.out.println(c5+":"+c6+":"+c7+":"+c8);

		// ? extends E：向下限定，E及其子类
		//作用：用来表示E及其子类
		//Collection<? extends Animal> c9 = new ArrayList<Object>();//报错
		Collection<? extends Animal> c10 = new ArrayList<Animal>();
		Collection<? extends Animal> c11 = new ArrayList<Dog>();
		Collection<? extends Animal> c12 = new ArrayList<Cat>();

		// ? super E：向上限定，E极其父类
		//作用：用来表示E及其父类
		Collection<? super Animal> c13 = new ArrayList<Object>();
		Collection<? super Animal> c14 = new ArrayList<Animal>();
		//Collection<? super Animal> c15 = new ArrayList<Dog>();//报错
		//Collection<? super Animal> c16 = new ArrayList<Cat>();//报错
		 
		
		// 最后，通过API，查看下ArrayList的构造方法和普通方法，看它是如何构造的。
	}

}
