package com.yida_04.Method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


/**
 * ͨ�������ȡ��Ա������
 */
public class A_Reflect {

	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class<?> c = Class.forName("com.yida_04.Method.Student");

		// ��ȡ���еķ�������
		// public Method[] getMethods() ��ȡ�Լ������׵Ĺ�������
		// public Method[] getDeclaredMethods() ��ȡ�Լ������з���
		//Method[] methods = c.getMethods();
		/*Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}*/

		
		
		// ��ȡ���ι��췽������
		// public Student(String name, int age, String address)
		Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
		Object obj = con.newInstance("����", 28, "������");
		
		
		//ͨ�������������show()����
		// public void show() {}
		/**
		 *  ����1��������
		 *	����2�������Ĳ���class����
		 */
		// public Method getMethod(String name,Class<?>... parameterTypes)
		Method method = c.getMethod("show");// ��ȡshow()�����޲η����ķ�������

		/**
		 * ����1�����������Ķ���
		 * ����2��������ʵ��(ʵ�ʲ���)
		 * ����ֵ���������շ��صĽ��
		 */
		// public Object invoke(Object obj,Object... args)
		method.invoke(obj);// ����show����(ע�⣺����û�з���ֵ���������)		
		
		// ͨ�������������print()����
		// private void print() {}
		//Method method2 = c.getMethod("print");// ���� NoSuchMethodException
		//ԭ������Ϊһ��ʼ��ȡ�Ķ��ǹ�����������print()��˽�еġ����������Ϳ����ˡ�
		Method method2 = c.getDeclaredMethod("print");//��ȡprint()˽���޲η����ķ�������
		method2.setAccessible(true);//���ÿɷ��ʣ��������ã����򣬱�IllegalAccessException�쳣��
		method2.invoke(obj);//����print()����(ע�⣺����û�з���ֵ���������)
		
		
		
		// ͨ�������������hello()����
		// void hello() {}
		Method method3 = c.getDeclaredMethod("hello");//��ȡhello()�޲�Ĭ�Ϸ����ķ�������
		method3.setAccessible(true);
		method3.invoke(obj);//����hello()����(ע�⣺����û�з���ֵ���������)
		
		
		
		// ͨ�������������test1()����
		// public void test1(String str, int num) {}
		Method method4 = c.getMethod("test1", String.class, int.class);//��ȡtest1()�����вη����ķ�������
		method4.invoke(obj, "����", 100);//����test1()����(ע�⣺����û�з���ֵ���������)
		
		
		
		// ͨ�������������test2()����
		// public String test2(String s, int num1, int num2) {}
		Method method5 = c.getMethod("test2", String.class, int.class, int.class);//��ȡtest2()�����������з���ֵ�ķ�������
		String str = (String) method5.invoke(obj, "��������", 100, 80);//����test2()����
		System.out.println(str);
		
		
		
		// ͨ�������������test3()����
		// private int test3(int a, int b) {}
		Method method6 = c.getDeclaredMethod("test3", int.class, int.class);//��ȡtest3()˽�д������з���ֵ�ķ�������
		method6.setAccessible(true);//���ÿɷ���
		Integer num = (Integer) method6.invoke(obj, 100, 200);// ����ֵ���� JDK5������-�Զ�װ��
		System.out.println(num.intValue());
	}

}
