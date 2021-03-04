package com.yidahulian_03;

public class PigFactory extends Factory {

	@Override
	public Animal createAnimal() {
		return new Pig();
	}

}
