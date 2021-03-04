package com.yida_01.Class;

import java.util.List;

/**
 * ���䣺����ͨ��class�ļ�����ȥʹ�ø��ļ��еĳ�Ա���������췽������Ա������
 * Ҫ������ʹ�ã����������õ�class�ļ�������ʵҲ���ǵõ�Class��Ķ���
 * Class�ࣺ
 * 		��Ա����	Field
 * 		���췽��	Constructor
 * 		��Ա����	Method
 * 
 * ��ȡclass�ļ�����ķ�ʽ��
 * A:Object���getClass()����
 * B:�������͵ľ�̬����class
 * C:Class���еľ�̬����
 * 		public static Class forName(String className)
 * 
 * һ�����ǵ���ʹ��˭��?
 * 		���ȵ�����
 * 			Ϊʲô��? ��Ϊ��������һ���ַ�����������һ��������������������ǾͿ��԰��������ַ������õ������ļ��С�
 */
public class ReflectDemo01 {

	public static void main(String[] args) throws ClassNotFoundException {
		// ��ʽһ
		Student stu1 = new Student();
		Class c = stu1.getClass();
		System.out.println(c);
		Class<? extends Student> cls = stu1.getClass();//��ʽһ��ȥ������
		System.out.println(cls);
		Class<?> clss = stu1.getClass();//��ʽ����ȥ������
		System.out.println(clss);
		

		Student stu2 = new Student();
		Class<?> c2 = stu2.getClass();

		System.out.println(stu1 == stu2);// false
		System.out.println(c == c2);// true

		// ��ʽ��
		Class<?> c3 = Student.class;
		System.out.println(c == c3);// true
		Class<?> intC = int.class;
		System.out.println(intC);
		Class<?> stringC = String.class;
		System.out.println(stringC);
		// double.class;
		// char.class;
		// boolean.class;
		Class<?> listC = List.class;
		System.out.println(listC);
		Class<?> voidC = void.class;
		System.out.println(voidC);
		
		// ��ʽ��
		//Class<?> c4 = Class.forName("Student");//��ClassNotFoundException�쳣
		Class<?> c4 = Class.forName("com.yida_01.Class.Student");//ֻ��д������(��������+����)������Ų����쳣������
		System.out.println(c == c4);// true
	}

}
