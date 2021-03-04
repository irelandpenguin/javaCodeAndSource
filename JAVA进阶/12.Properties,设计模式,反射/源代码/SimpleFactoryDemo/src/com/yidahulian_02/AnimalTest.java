package com.yidahulian_02;

/*
 * 简单工厂模式：
 * 	需要什么对象，由工厂去创建它。然后调用各自的方法。
 * 
 * 好处：创建动物时，不再关注具本对象创建了。直接由工厂来实现。接口统一化。
 * 弊端：每次想创建不存在的动物时，都要更改工厂类。违背了功能扩展的原则。
 * 功能扩展原则：不改动当前类的情况下，实现功能添加。
 */
public class AnimalTest {

	public static void main(String[] args) {
		// 创建一只狗
		Animal dog = AnimalFactory.createAnimal("dog");
		dog.eat();

		// 创建一只猫
		Animal cat = AnimalFactory.createAnimal("cat");
		cat.eat();

		// 创建一只猪
		Animal pig = AnimalFactory.createAnimal("pig");
		if (pig == null) {
			System.out.println("对不起，目前不能提供此类动物");
		}
	}

}
