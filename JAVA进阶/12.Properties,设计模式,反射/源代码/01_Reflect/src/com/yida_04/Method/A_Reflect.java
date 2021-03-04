package com.yida_04.Method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


/**
 * 通过反射获取成员方法。
 */
public class A_Reflect {

	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class<?> c = Class.forName("com.yida_04.Method.Student");

		// 获取所有的方法对象
		// public Method[] getMethods() 获取自己及父亲的公共方法
		// public Method[] getDeclaredMethods() 获取自己的所有方法
		//Method[] methods = c.getMethods();
		/*Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}*/

		
		
		// 获取带参构造方法对象
		// public Student(String name, int age, String address)
		Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
		Object obj = con.newInstance("李四", 28, "福田区");
		
		
		//通过方法对象调用show()方法
		// public void show() {}
		/**
		 *  参数1：方法名
		 *	参数2：方法的参数class类型
		 */
		// public Method getMethod(String name,Class<?>... parameterTypes)
		Method method = c.getMethod("show");// 获取show()公共无参方法的方法对象

		/**
		 * 参数1：方法所属的对象
		 * 参数2：方法的实参(实际参数)
		 * 返回值：方法最终返回的结果
		 */
		// public Object invoke(Object obj,Object... args)
		method.invoke(obj);// 调用show方法(注意：这里没有返回值，无需接收)		
		
		// 通过方法对象调用print()方法
		// private void print() {}
		//Method method2 = c.getMethod("print");// 报错 NoSuchMethodException
		//原因是因为一开始获取的都是公共方法，而print()是私有的。下面这样就可以了。
		Method method2 = c.getDeclaredMethod("print");//获取print()私有无参方法的方法对象
		method2.setAccessible(true);//设置可访问，必须设置！否则，报IllegalAccessException异常。
		method2.invoke(obj);//调用print()方法(注意：这里没有返回值，无需接收)
		
		
		
		// 通过方法对象调用hello()方法
		// void hello() {}
		Method method3 = c.getDeclaredMethod("hello");//获取hello()无参默认方法的方法对象
		method3.setAccessible(true);
		method3.invoke(obj);//调用hello()方法(注意：这里没有返回值，无需接收)
		
		
		
		// 通过方法对象调用test1()方法
		// public void test1(String str, int num) {}
		Method method4 = c.getMethod("test1", String.class, int.class);//获取test1()公共有参方法的方法对象
		method4.invoke(obj, "数字", 100);//调用test1()方法(注意：这里没有返回值，无需接收)
		
		
		
		// 通过方法对象调用test2()方法
		// public String test2(String s, int num1, int num2) {}
		Method method5 = c.getMethod("test2", String.class, int.class, int.class);//获取test2()公共带参且有返回值的方法对象
		String str = (String) method5.invoke(obj, "两个数字", 100, 80);//调用test2()方法
		System.out.println(str);
		
		
		
		// 通过方法对象调用test3()方法
		// private int test3(int a, int b) {}
		Method method6 = c.getDeclaredMethod("test3", int.class, int.class);//获取test3()私有带参且有返回值的方法对象
		method6.setAccessible(true);//设置可访问
		Integer num = (Integer) method6.invoke(obj, 100, 200);// 返回值采用 JDK5新特性-自动装箱
		System.out.println(num.intValue());
	}

}
