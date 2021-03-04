package com.yida_03.Field;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;



/**
 * 通过反射获取成员变量并使用。
 */
public class A_Reflect {

	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class<?> c = Class.forName("com.yida_03.Field.Student");

		// 获取所有的成员变量
		//Field[] fields = c.getFields();//获取公共成员变量
		//Field[] fields = c.getDeclaredFields();//获取所有成员变量
		/*for (Field field : fields) {
			System.out.println(field);
		}*/

		// 通过无参构造方法对象创建新实例
		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();

		// 获取address并对其赋值
		Field addressField = c.getField("address");
		//public void set(Object obj,Object value)//设置实例对象该Field字段的值。
		addressField.set(obj, "深圳");
		System.out.println(obj);
		System.out.println(addressField.get(obj));

		// 获取name并对其赋值
		//Field nameField = c.getField("name");// 报错 NoSuchFieldException
		//nameField.set(obj, "张三");
		//原因是一开始我们获取的是公共的成员变量，而name是私有的。用下面的就可以了。
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);//设置可访问
		nameField.set(obj, "张三");
		System.out.println(obj);
		System.out.println(nameField.get(obj));

		// 获取age并对其赋值
		//Field ageField = c.getField("age");// 报错 NoSuchFieldException
		//ageField.set(obj, 25);
		//原因是一开始我们获取的是公共的成员变量，而age是默认的。用下面的就可以了。
		Field ageField = c.getDeclaredField("age");
		ageField.setAccessible(true);//设置可访问
		ageField.set(obj, 25);
		System.out.println(obj);
		System.out.println(ageField.get(obj));
	}

}
