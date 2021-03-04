package com.yidahulian_03;

public class CatFactory extends Factory {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}

}
