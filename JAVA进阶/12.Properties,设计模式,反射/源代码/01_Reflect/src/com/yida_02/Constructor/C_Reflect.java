package com.yida_02.Constructor;

import java.lang.reflect.Constructor;

/**
 * 需求：通过反射获取私有构造方法并使用。
 * 比如:
 * private Student(String name){}
 * Student stu = new Student("张三");
 * System.out.println(stu);
 */
public class C_Reflect {

	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class<?> c = Class.forName("com.yida_02.Constructor.Student");

		// 获取私有构造方法对象
		//Constructor<?> con = c.getConstructor(String.class);//报错 NoSuchMethodException：没有这个方法异常
		// 原因是一开始我们使用的方法只能获取公共的，下面这种方式就可以了。
		Constructor<?> con = c.getDeclaredConstructor(String.class);

		// 通过私有构造方法对象来创建新实例，并初始化
		//Object obj = con.newInstance("张三");//报错IllegalAccessException:非法的访问异常。
		//原因是我们没有设置私有构造方法对象的可访问性，下面这种方式就可以了。
		con.setAccessible(true);// 设置可访问。表示反射的对象在使用时取消Java语言访问检查
		Object obj = con.newInstance("张三");
		System.out.println(obj);
		
		//接下来，我们使用默认修饰的构造方法
		Constructor<?> con2 = c.getDeclaredConstructor(String.class, int.class);
		con2.setAccessible(true);//设置可访问
		Object obj2 = con2.newInstance("邓超",39);// alt + shit + L 快速生成局部变量的名称
		System.out.println(obj2);
		Student stu2 = (Student)obj2;
		stu2.setAddress("上海");
		System.out.println(stu2);
	}

}
