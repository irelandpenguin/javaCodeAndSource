package com.yidahulian_01;

/*
 * 以前的做法：
 * 	需要什么对象，必须创建它。然后调用它的方法。
 */
public class AnimalTest {

	public static void main(String[] args) {
		// 创建一只狗
		Dog dog = new Dog();
		dog.eat();

		// 创建一只猫
		Cat cat = new Cat();
		cat.eat();
	}

}
