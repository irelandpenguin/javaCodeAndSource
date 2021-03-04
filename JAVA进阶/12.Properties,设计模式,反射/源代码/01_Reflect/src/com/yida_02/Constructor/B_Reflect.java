package com.yida_02.Constructor;

import java.lang.reflect.Constructor;

/**
 * 需求：通过反射获取带参构造方法并使用。
 * 比如：
 * public Student(String name, int age, String address)
 * Student stu = new Student("张三",25,"深圳");
 * System.out.println(stu);
 */
public class B_Reflect {
	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class<?> c = Class.forName("com.yida_02.Constructor.Student");//带包名(包名+类名)

		// 获取带参构造方法对象
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor<?> con = c.getConstructor(String.class, int.class, String.class);

		// 通过构造方法对象来创建新实例，并初始化
		// public T newInstance(Object... initargs)
		Object obj = con.newInstance("张三", 25, "深圳");
		System.out.println(obj);
		
		
		//这种方式，得不到私有的构造方法对象(私有构造器对象)，怎么办呢？
		/*Constructor<?> con2 = c.getConstructor(String.class);
		Object obj2 = con2.newInstance("黄小明");
		System.out.println(obj2);*/
	}
}
