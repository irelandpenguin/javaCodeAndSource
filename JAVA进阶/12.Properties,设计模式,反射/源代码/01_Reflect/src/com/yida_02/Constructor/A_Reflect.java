package com.yida_02.Constructor;

import java.lang.reflect.Constructor;

/**
 * ����ͨ�������ȡ�޲ι��췽����ʹ�á�
 * ���磺
 * public Student() {}
 * Student stu = new Student();
 * System.out.println(stu);
 */
public class A_Reflect {

	public static void main(String[] args) throws Exception {
		// ��ȡ�ӽ����ļ�����
		Class<?> c = Class.forName("com.yida_02.Constructor.Student");

		// ��ȡ���췽������(��������������)
		// public Constructor[] getConstructors():���й������췽��
		// public Constructor[] getDeclaredConstructors():���й��췽��
		//Constructor<?>[] cons = c.getConstructors();
		Constructor<?>[] cons = c.getDeclaredConstructors();
		for (Constructor<?> con : cons) {
			System.out.println(con);
		}

		// ��ȡ�޲ι��췽������
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor<?> con = c.getConstructor();//���ص����޲ι��췽������(�޲ι���������)

		// ͨ�����췽��������������ʵ��
		// public T newInstance(Object... initargs)
		Object obj = con.newInstance();
		System.out.println(obj);
		
		Student stu = (Student)obj;
		stu.setName("������");
		stu.setAddress("�¼���");
		stu.setAge(55);
		System.out.println(stu);
	}
}
