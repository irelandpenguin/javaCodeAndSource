package com.yida_06;

public class Son extends Father implements SongAndDance {

	public Son(String name) {
		super(name);//调用父类的构造方法，来初始化父类数据
	}
	
	@Override
	public void song() {
		System.out.println(getName()+"唱流行歌曲-小苹果.mp3");
	}

	@Override
	public void dance() { System.out.println(getName()+"跳街舞");
	}

	@Override
	public void study() {
		System.out.println(getName()+"学习宜达互联的JAVA课程");
	}

	@Override
	public void play() {
		System.out.println(getName()+"玩吃鸡游戏");
	}

}
