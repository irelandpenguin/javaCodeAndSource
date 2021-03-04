package com.yida_04;

public class Dog extends Animal {
	
	public Dog(){}
	public Dog(String name) {
		super(name);//调用父类的带参构造，初始化父类数据
	}

	@Override //@override表示重写(或者覆盖)
	public void eat() {
		System.out.println(getName()+"吃骨头");
	}

	@Override
	public void sleep() {
		System.out.println(getName()+"趴着睡");
	}

}
