package com.yida_04;
/**
 * 一个完整抽象类的创建与使用
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Animal an = new Dog("黑虎");//多态的体现
		an.eat();//编译看左边，运行看右边
		an.sleep();
		
		an = new Dog();
		an.setName("黑豹");
		an.eat();
		an.sleep();
		
		System.out.println("-------------");
		
		an = new Cat("美美");//多态的体现
		an.eat();//编译看左边，运行看右边
		an.sleep();
		
		an = new Cat();
		an.setName("喵喵");
		an.eat();
		an.sleep();
	}

}
