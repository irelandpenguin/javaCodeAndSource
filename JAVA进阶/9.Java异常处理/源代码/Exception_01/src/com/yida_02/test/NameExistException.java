package com.yida_02.test;

/**
 * �Զ��������Ѵ��ڵ��쳣 �������ڼ���쳣��
 * @author �˴ﻥ��-Mr Qain
 *
 */
public class NameExistException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NameExistException() {
		super();
	}
	public NameExistException(String msg) {
		super(msg);
	}
}
