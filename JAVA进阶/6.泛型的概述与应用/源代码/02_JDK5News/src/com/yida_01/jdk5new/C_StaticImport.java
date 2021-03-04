/*
 * 静态导入：
 * 格式：import static 包名….类名.方法名;
 * 可以直接导入到方法的级别
 * 
 * 静态导入的注意事项：
 * 		A:方法必须是静态的
 * 		B:如果有多个同名的静态方法，容易不知道使用谁?这个时候要使用，必须加前缀。由此可见，意义不大，所以一般不用，但是要能看懂。
 */
package com.yida_01.jdk5new;

//静态导入
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class C_StaticImport {

	public static void main(String[] args) {
		System.out.println(Math.max(100, 50));//100
		System.out.println(Math.min(100, 50));//50
		System.out.println(Math.abs(-35));//35

		System.out.println("------");
		
		// 我也可以这样写
		System.out.println(java.lang.Math.max(100, 50));
		System.out.println(java.lang.Math.min(100, 50));
		System.out.println(java.lang.Math.abs(-35));

		System.out.println("------");

		// 静态导入后，我就可以这样写
		System.out.println(max(100, 50));//如果下面写了个同名max方法，此行报错
		System.out.println(min(100, 50));
		System.out.println(abs(-35));
		
		/*
		// 下面创建一个静态方法，名称为max。然后看编译结果
		// 会发现报错了，同名的静态方法，编译器不知道使用谁了。
		// 这个时候要使用，必须加前缀。由此可见，意义不大，所以一般不用。但要能看懂。
		System.out.println(java.lang.Math.max(100, 50));
		*/
	}

	/*public static void max() {
		System.out.println("hello");
	}*/
}
