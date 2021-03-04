package com.yida_04;

public class Cat extends Animal {

	public Cat(){}
	public Cat(String name) {
		super(name);//调用父类的带参构造，初始化父类数据
	}
	
	@Override
	public void eat() {
		System.out.println(getName()+"吃鱼");
	}

	@Override
	public void sleep() {
		System.out.println(getName()+"躺着睡");
	}

}
