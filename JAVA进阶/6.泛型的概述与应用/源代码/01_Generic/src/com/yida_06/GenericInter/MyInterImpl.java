package com.yida_06.GenericInter;

/**
 * ��һ��������Ѿ�֪���ýӿ���ʲô���͵��� 
 * һ���õĲ��ࡣ
 */
public class MyInterImpl implements MyInter<String> {

	@Override
	public String print(String msg) {
		return "��ӡ��Ϣ��"+msg;
	}
	
	@Override
	public void show(String msg) {
		System.out.println("��ʾ��Ϣ��"+msg);
	}

	@Override
	public int sum(int a, int b) {
		return a+b;
	}
	
	
}
