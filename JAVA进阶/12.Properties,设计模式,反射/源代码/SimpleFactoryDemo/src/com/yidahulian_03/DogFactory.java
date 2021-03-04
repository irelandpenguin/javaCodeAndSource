package com.yidahulian_03;

public class DogFactory extends Factory {

	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
