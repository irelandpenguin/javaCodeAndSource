package com.yida_02.Constructor;

import java.lang.reflect.Constructor;

/**
 * ����ͨ�������ȡ���ι��췽����ʹ�á�
 * ���磺
 * public Student(String name, int age, String address)
 * Student stu = new Student("����",25,"����");
 * System.out.println(stu);
 */
public class B_Reflect {
	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class<?> c = Class.forName("com.yida_02.Constructor.Student");//������(����+����)

		// ��ȡ���ι��췽������
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor<?> con = c.getConstructor(String.class, int.class, String.class);

		// ͨ�����췽��������������ʵ��������ʼ��
		// public T newInstance(Object... initargs)
		Object obj = con.newInstance("����", 25, "����");
		System.out.println(obj);
		
		
		//���ַ�ʽ���ò���˽�еĹ��췽������(˽�й���������)����ô���أ�
		/*Constructor<?> con2 = c.getConstructor(String.class);
		Object obj2 = con2.newInstance("��С��");
		System.out.println(obj2);*/
	}
}
