package com.yida_06;
/**
 * 父类
 * @author Administrator
 *
 */
public abstract class Father {
	private String name;
	
	public Father(String name) {
		this.name = name;
	}
	
	//get和set方法
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void study();//学习
	public abstract void play();//玩
}
