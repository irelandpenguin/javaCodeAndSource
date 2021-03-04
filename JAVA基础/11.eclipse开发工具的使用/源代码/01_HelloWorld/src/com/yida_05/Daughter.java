package com.yida_05;

public class Daughter implements Father {
	private String name;
	
	public Daughter() {}
	public Daughter(String name) {
		this.name = name;
	}
	
	//set和get方法
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public void song() {
		System.out.println(name+"唱民谣");
	}

	@Override
	public void dance() {
		System.out.println(name+"跳芭蕾");
	}

}
