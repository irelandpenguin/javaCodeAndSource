package com.yida_02.Constructor;

import java.lang.reflect.Constructor;

/**
 * ����ͨ�������ȡ˽�й��췽����ʹ�á�
 * ����:
 * private Student(String name){}
 * Student stu = new Student("����");
 * System.out.println(stu);
 */
public class C_Reflect {

	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class<?> c = Class.forName("com.yida_02.Constructor.Student");

		// ��ȡ˽�й��췽������
		//Constructor<?> con = c.getConstructor(String.class);//���� NoSuchMethodException��û����������쳣
		// ԭ����һ��ʼ����ʹ�õķ���ֻ�ܻ�ȡ�����ģ��������ַ�ʽ�Ϳ����ˡ�
		Constructor<?> con = c.getDeclaredConstructor(String.class);

		// ͨ��˽�й��췽��������������ʵ��������ʼ��
		//Object obj = con.newInstance("����");//����IllegalAccessException:�Ƿ��ķ����쳣��
		//ԭ��������û������˽�й��췽������Ŀɷ����ԣ��������ַ�ʽ�Ϳ����ˡ�
		con.setAccessible(true);// ���ÿɷ��ʡ���ʾ����Ķ�����ʹ��ʱȡ��Java���Է��ʼ��
		Object obj = con.newInstance("����");
		System.out.println(obj);
		
		//������������ʹ��Ĭ�����εĹ��췽��
		Constructor<?> con2 = c.getDeclaredConstructor(String.class, int.class);
		con2.setAccessible(true);//���ÿɷ���
		Object obj2 = con2.newInstance("�˳�",39);// alt + shit + L �������ɾֲ�����������
		System.out.println(obj2);
		Student stu2 = (Student)obj2;
		stu2.setAddress("�Ϻ�");
		System.out.println(stu2);
	}

}
