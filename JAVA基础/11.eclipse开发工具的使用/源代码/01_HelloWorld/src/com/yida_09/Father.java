package com.yida_09;

/**
 * 父类
 * 
 * @author 宜达互联-Mr Qain
 * @version V1.1
 */
public abstract class Father {
	private String name;

	/**
	 * 带参构造
	 * 
	 * @param name
	 *            姓名
	 */
	public Father(String name) {
		this.name = name;
	}

	/**
	 * 设置姓名
	 * 
	 * @param name
	 *            姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 返回姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 学习
	 */
	public abstract void study();// 学习

	/**
	 * 玩
	 */
	public abstract void play();// 玩
}
