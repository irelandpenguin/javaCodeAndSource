/**
 * Object:类 Object是类层次结构的根类。每个类都使用 Object作为超类。
 * 每个类都直接或者间接的继承自Object类。
 * 
 * Object类的方法：
 * 		public int hashCode():返回该对象的哈希码值。
 * 			注意：哈希值是根据哈希算法计算出来的一个值，这个值和地址值有关，但不是实际地址值。
 * 			           我们可以理解为虚拟地址值。
 * 
 *		public final Class getClass():返回此 Object的运行时类, 即：编译后的字节码对象。
 *			Class类的方法：
 *				public String getName()：以String的形式返回此Class对象所表示的实体类名称。
 */
package com.yida_01.Object;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode());//打印对象的虚拟地址
		
		Student s2 = new Student();
		System.out.println(s2.hashCode());//打印对象的虚拟地址
		
		Student s3 = s1;//把s1的虚拟地址(即：hash码值)赋值给s3
		System.out.println(s3.hashCode());
		
		System.out.println("----------");
		
		Student s = new Student();
		@SuppressWarnings("rawtypes")//过滤系统警告
		Class c = s.getClass();//获取字节码对象
		String name = c.getName();//获取字节码对象的实体类名称
		System.out.println(name);
		
		// 链式编程
		String name2 = s.getClass().getName();
		System.out.println(name2);
		
	}

}
