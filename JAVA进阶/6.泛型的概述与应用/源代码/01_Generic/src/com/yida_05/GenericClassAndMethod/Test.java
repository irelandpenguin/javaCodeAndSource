package com.yida_05.GenericClassAndMethod;

public class Test {

	public static void main(String[] args) {
		GenericCM<String> cm = new GenericCM<String>();
		cm.setObj("�˴ﻥ��");
		System.out.println(cm.getObj());
		
		cm.show(100);//����jdk5�����ԣ��Զ�װ��
		cm.show("hello world");
		cm.show(3.14);//����jdk5�����ԣ��Զ�װ��
		cm.show(new Cat("����", 2));
		
		System.out.println("-------");
		
		System.out.println(cm.print(Integer.valueOf(100)));
		System.out.println("hello java");
		System.out.println(new Double(3.14));
		System.out.println(new Cat("����", 1));
	}

}
