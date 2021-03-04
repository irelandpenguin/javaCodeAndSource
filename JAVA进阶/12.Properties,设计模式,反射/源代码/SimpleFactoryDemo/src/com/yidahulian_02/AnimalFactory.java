package com.yidahulian_02;

/*
 * 简单工厂类
 */
public class AnimalFactory {
	// 构造方法私有化，防止外界创建工厂对象
	private AnimalFactory() {
	}

	public static Animal createAnimal(String type) {
		if (type.equals("dog")) {
			return new Dog();
		} else if (type.equals("cat")) {
			return new Cat();
		} else {
			return null;
		}
	}
}
