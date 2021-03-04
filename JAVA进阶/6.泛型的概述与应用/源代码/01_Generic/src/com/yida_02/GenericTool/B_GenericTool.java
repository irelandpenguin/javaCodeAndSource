/*
 * 泛型类：把泛型定义在类上
 */
package com.yida_02.GenericTool;

public class B_GenericTool<T> {
	private T obj;

	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
}
