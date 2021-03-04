package com.yida_06.GenericInter;

import java.util.ArrayList;

/**
 * 测试泛型接口 
 */
public class Test {

	public static void main(String[] args) {
		//接口实现类，指定泛型类型
		MyInter<String> mi = new MyInterImpl();
		mi.show("你好，JAVA！");
		System.out.println(mi.print("你好！宜达。"));

		System.out.println("--------");
		
		//接口实现类，未指定泛型类型
		//ArrayList<String> list = new ArrayList<String>();
		//list.add("hello");
		//list.add("world");
		//list.add(Integer.valueOf(100));
		
		//String
		MyInter<String> mi2 = new WinInterImpl<String>();
		mi2.show("吴京的战狼2不错!");
		System.out.println(mi2.print("羞羞的铁拳也好看!"));
		
		//Integer
		MyInter<Integer> mi3 = new WinInterImpl<Integer>();
		mi3.show(100);//jdk5新特性，自动装箱
		System.out.println(mi3.print(new Integer(200)));
		
		//Character
		MyInter<Character> mi4 = new WinInterImpl<Character>();
		mi4.show('A');
		System.out.println(mi4.print('B'));
		
		//Double
		MyInter<Double> mi5 = new WinInterImpl<Double>();
		mi5.show(3.14);//jdk5新特性，自动装箱
		System.out.println(mi5.print(6.28));
		
		//Movie
		Movie mv = new Movie("红海行动", "2018.2.8");
		MyInter<Movie> mi6 = new WinInterImpl<Movie>();
		mi6.show(mv);
		System.out.println(mi6.print(mv));
	
		
		// 最后，通过API，查看下ArrayList，看它是如何实现它的泛型接口的。
		
		
		int num = mi.sum(100, 20);
		System.out.println(num);
		
		num = mi6.sum(20, 40);
		System.out.println(num);
		
	}

}
