/*
 * ���ڵ�ʱ������ʹ��Object��������������͡�
 * ����ת����û���κ�����ģ�����������ת�͵�ʱ����ʵ����������ת�������⡣
 * 
 * Ҳ����˵�����ĳ�����ʵ�����ǰ�ȫ�ġ�����Java��JDK5�������˷��ͣ���߳���İ�ȫ�ԡ�
 */
package com.yida_02.GenericTool;

public class A_Test {

	public static void main(String[] args) {
		A_ObjectTool ot = new A_ObjectTool();
		ot.setObj("hello");// String -> Object
		String s = (String) ot.getObj();// Object -> String
		System.out.println(s);

		
		System.out.println("------");

		A_ObjectTool ott = new A_ObjectTool();
		ott.setObj(new Integer(100));//Integer -> Object
		ott.setObj(100);//����jdk5��������-�Զ�װ��
		ott.setObj(Integer.valueOf(100));
		Integer i = (Integer) ott.getObj();// Object -> Integer
		System.out.println(i);
		
		System.out.println("------");

		// ���ǣ�������Ĵ���ͻᱨClassCastException�쳣����Ϊʲô��
		// ��Ϊ�������Ͳ�һ�£���������ת���쳣��
		String str = (String) ott.getObj();// Object -> String
		System.out.println(str);
	}

}
