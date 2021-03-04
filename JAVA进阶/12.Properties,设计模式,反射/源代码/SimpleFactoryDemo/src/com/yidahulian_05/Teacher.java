package com.yidahulian_05;

public class Teacher {
	// 构造方法私有化，防止外界创建对象
	private Teacher() {
	}

	// 创建一个成员对象并赋值为null。private保证外界不能直接调用，static保证唯一
	private static Teacher tea = null;

	// 创建一个静态同步方法，防止多线程同时调用tea对象
	public synchronized static Teacher getTeacher() {
		if (tea == null) {
			tea = new Teacher();
		}
		return tea;
	}
}
