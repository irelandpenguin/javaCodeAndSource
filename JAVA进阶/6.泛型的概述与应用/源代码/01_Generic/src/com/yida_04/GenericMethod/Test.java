package com.yida_04.GenericMethod;

public class Test {

	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		gm.show("�˴�");
		gm.show(100);//����jdk5�����ԣ��Զ�װ��
		gm.show(Double.valueOf(3.14));
		
		System.out.println("---------");
		
		System.out.println(gm.print("Hello"));
		System.out.println(gm.print(new Integer(200)));
		System.out.println(gm.print(new Double(6.28)));
	}

}
