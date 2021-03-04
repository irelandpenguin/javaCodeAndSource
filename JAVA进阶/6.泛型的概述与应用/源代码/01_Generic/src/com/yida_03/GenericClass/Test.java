package com.yida_03.GenericClass;

public class Test {

	public static void main(String[] args) {
		GenericClass<String> gt = new GenericClass<String>();
		gt.setObj("hello");
		String s = gt.getObj();
		System.out.println(s);

		System.out.println("------");

		GenericClass<Integer> gtt = new GenericClass<Integer>();
		gtt.setObj(100);// 采用JDK5的新特性：自动装箱
		Integer i = gtt.getObj();
		System.out.println(i);
		
		System.out.println("------");
		
		GenericClass<Character> gt2 = new GenericClass<Character>(new Character('A'), "吴京", 35);
		System.out.println(gt2.getObj()+"---"+gt2.getName()+"---"+gt2.getAge());
		System.out.println(gt2);
		
		System.out.println("------");
		
		GenericClass<Double> gt3 = new GenericClass<Double>(3.14, "李连杰", 56);
		System.out.println(gt3.getObj()+"---"+gt3.getName()+"---"+gt3.getAge());
		System.out.println(gt3);
		
	}

}
