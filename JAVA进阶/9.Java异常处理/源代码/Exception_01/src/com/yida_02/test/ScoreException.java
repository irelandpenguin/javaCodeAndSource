package com.yida_02.test;
/**
 * 自定义异常 （编译期间的）
 * @author 宜达互联-Mr Qain
 *
 */
public class ScoreException extends Exception {
	private static final long serialVersionUID = 1L;

	public ScoreException() {
		super();
	}

	public ScoreException(String message) {
		super(message);
	}
}
