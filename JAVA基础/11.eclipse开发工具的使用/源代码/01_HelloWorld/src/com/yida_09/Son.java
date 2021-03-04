package com.yida_09;

/**
 * 
 * @author 宜达互联-Mr Qain
 * @version V1.1
 * 
 */
public class Son extends Father implements SongAndDance {

	/**
	 * 带参构造
	 * 
	 * @param name
	 *            姓名
	 */
	public Son(String name) {
		super(name);// 调用父类的构造方法，来初始化父类数据
	}

	/**
	 * 实现了接口SongAndDance的唱歌方法
	 */
	@Override
	public void song() {
		System.out.println(getName() + "唱流行歌曲-小苹果.mp3");
	}

	/**
	 * 实现了接口SongAndDance的跳舞方法
	 */
	@Override
	public void dance() {
		System.out.println(getName() + "跳街舞");
	}

	/**
	 * 重写了父类Father的学习方法
	 */
	@Override
	public void study() {
		System.out.println(getName() + "学习宜达互联的JAVA课程");
	}

	/**
	 * 重写了父类Father的玩方法
	 */
	@Override
	public void play() {
		System.out.println(getName() + "玩吃鸡游戏");
	}

}
