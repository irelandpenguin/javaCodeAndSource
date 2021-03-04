package com.yida_05.GenericClassAndMethod;

public class Test {

	public static void main(String[] args) {
		GenericCM<String> cm = new GenericCM<String>();
		cm.setObj("宜达互联");
		System.out.println(cm.getObj());
		
		cm.show(100);//采用jdk5新特性，自动装箱
		cm.show("hello world");
		cm.show(3.14);//采用jdk5新特性，自动装箱
		cm.show(new Cat("花花", 2));
		
		System.out.println("-------");
		
		System.out.println(cm.print(Integer.valueOf(100)));
		System.out.println("hello java");
		System.out.println(new Double(3.14));
		System.out.println(new Cat("美美", 1));
	}

}
