package com.yidahulian_03;

/*
 * 工厂方法模式：
 * 	需要什么对象，由专门工厂去创建它。然后调用各自的方法。
 * 
 * 好处：创建动物时，不再修改原工厂类了。直接由新增的专门工厂来实现。符合功能扩展原则。
 * 弊端：每次想创建不存在的动物时，都要创建专门工厂类及动物类。实现文件多。
 */
public class AnimalTest {

	public static void main(String[] args) {
		// 创建一只狗
		Animal dog = new DogFactory().createAnimal();
		dog.eat();

		// 创建一只猫
		Animal cat = new CatFactory().createAnimal();
		cat.eat();

		// 创建一只猪
		Animal pig = new PigFactory().createAnimal();
		pig.eat();
	}

}
