package com.yidahulian_02;

/*
 * �򵥹�����
 */
public class AnimalFactory {
	// ���췽��˽�л�����ֹ��紴����������
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
