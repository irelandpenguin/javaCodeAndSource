package com.yida_02.Constructor;

import java.lang.reflect.Constructor;

/**
 * 需求：通过反射获取无参构造方法并使用。
 * 比如：
 * public Student() {}
 * Student stu = new Student();
 * System.out.println(stu);
 */
public class A_Reflect {

	public static void main(String[] args) throws Exception {
		// 获取子节码文件对象
		Class<?> c = Class.forName("com.yida_02.Constructor.Student");

		// 获取构造方法对象(即：构造器对象)
		// public Constructor[] getConstructors():所有公共构造方法
		// public Constructor[] getDeclaredConstructors():所有构造方法
		//Constructor<?>[] cons = c.getConstructors();
		Constructor<?>[] cons = c.getDeclaredConstructors();
		for (Constructor<?> con : cons) {
			System.out.println(con);
		}

		// 获取无参构造方法对象
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor<?> con = c.getConstructor();//返回的是无参构造方法对象(无参构造器对象)

		// 通过构造方法对象来创建新实例
		// public T newInstance(Object... initargs)
		Object obj = con.newInstance();
		System.out.println(obj);
		
		Student stu = (Student)obj;
		stu.setName("李连杰");
		stu.setAddress("新加坡");
		stu.setAge(55);
		System.out.println(stu);
	}
}
