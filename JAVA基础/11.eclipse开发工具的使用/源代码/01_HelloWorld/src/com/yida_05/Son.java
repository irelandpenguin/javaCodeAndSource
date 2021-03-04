package com.yida_05;

public class Son implements Father {
	private String name;
	
	public Son(String name) {
		this.name = name;
	}

	@Override
	public void song() {
		System.out.println(name+"唱流行歌曲-小苹果.mp3");
	}

	@Override
	public void dance() {
		System.out.println(name+"跳街舞");
	}

}
