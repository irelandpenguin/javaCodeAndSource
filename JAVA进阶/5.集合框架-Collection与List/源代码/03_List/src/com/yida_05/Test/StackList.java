package com.yida_05.Test;

import java.util.LinkedList;

public class StackList {
	private LinkedList lt;

	public StackList() {
		super();
		lt = new LinkedList();
	}

	public void add(Object obj) {
		lt.push(obj);// ѹջ  , ������addFirst()���
	}

	public Object get() {
		return lt.pop();// ��ջ�� ������removeFirst()���
	}

	public boolean isEmpty() {
		return lt.isEmpty();// �����Ƿ�Ϊ��
	}
}
