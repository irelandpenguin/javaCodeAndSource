package com.yida_05.Test;

import java.util.LinkedList;

public class StackList {
	private LinkedList lt;

	public StackList() {
		super();
		lt = new LinkedList();
	}

	public void add(Object obj) {
		lt.push(obj);// 压栈  , 可以用addFirst()替代
	}

	public Object get() {
		return lt.pop();// 弹栈， 可以用removeFirst()替代
	}

	public boolean isEmpty() {
		return lt.isEmpty();// 集合是否为空
	}
}
