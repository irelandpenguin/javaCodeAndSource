package com.yida_01.Class;

import java.util.List;

/**
 * 反射：就是通过class文件对象，去使用该文件中的成员变量，构造方法，成员方法。
 * 要想这样使用，首先你必须得到class文件对象，其实也就是得到Class类的对象。
 * Class类：
 * 		成员变量	Field
 * 		构造方法	Constructor
 * 		成员方法	Method
 * 
 * 获取class文件对象的方式：
 * A:Object类的getClass()方法
 * B:数据类型的静态属性class
 * C:Class类中的静态方法
 * 		public static Class forName(String className)
 * 
 * 一般我们到底使用谁呢?
 * 		优先第三种
 * 			为什么呢? 因为第三种是一个字符串，而不是一个具体的类名。这样我们就可以把这样的字符串配置到配置文件中。
 */
public class ReflectDemo01 {

	public static void main(String[] args) throws ClassNotFoundException {
		// 方式一
		Student stu1 = new Student();
		Class c = stu1.getClass();
		System.out.println(c);
		Class<? extends Student> cls = stu1.getClass();//方式一：去除警告
		System.out.println(cls);
		Class<?> clss = stu1.getClass();//方式二：去除警告
		System.out.println(clss);
		

		Student stu2 = new Student();
		Class<?> c2 = stu2.getClass();

		System.out.println(stu1 == stu2);// false
		System.out.println(c == c2);// true

		// 方式二
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
		
		// 方式三
		//Class<?> c4 = Class.forName("Student");//报ClassNotFoundException异常
		Class<?> c4 = Class.forName("com.yida_01.Class.Student");//只有写带包名(即：包名+类名)，程序才不会异常！！！
		System.out.println(c == c4);// true
	}

}
