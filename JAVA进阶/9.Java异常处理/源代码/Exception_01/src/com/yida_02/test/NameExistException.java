package com.yida_02.test;

/**
 * 自定义姓名已存在的异常 （编译期间的异常）
 * @author 宜达互联-Mr Qain
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
