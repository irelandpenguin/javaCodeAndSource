/*
 * ������Ĳ���
 */
package com.yida_02.GenericTool;

public class B_Test {

	public static void main(String[] args) {
		B_GenericTool<String> gt = new B_GenericTool<String>();
		gt.setObj("hello");
		String s = gt.getObj();
		System.out.println(s);

		System.out.println("------");

	
		//Integer ii = gt.getObj();// �����Զ���ʾ�����ˣ���Ϊ�����Ѿ�ָ����gt����ֻ�ܴ���String���͵�

		B_GenericTool<Integer> gtt = new B_GenericTool<Integer>();
		gtt.setObj(100);// ����JDK5�������ԣ��Զ�װ��
		// gtt.setObj(new Integer(100));
		// gtt.setObj(Integer.valueOf(100));
		Integer i = gtt.getObj();
		System.out.println(i);
	
		System.out.println("------");

		//String str = gtt.getObj();// �����Զ���ʾ�����ˣ���Ϊ�����Ѿ�ָ����gtt����ֻ�ܴ���Integer���͵�
	}

}
