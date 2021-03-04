/*
 * public String toString():返回该对象的字符串表示。
 * 
 * 源代码
 * public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 * 
 * Integer类下的一个静态方法：
 * 		public static String toHexString(int i)：把一个整数转成一个十六进制表示的字符串
 * 
 * 这个信息的组成我们讲解完毕了，但是这个信息是没有任何意义的。所以，建议所有子类都重写该方法。
 * 怎么手工重写呢?
 * 		把该类的所有成员变量值组成返回即可。
 * 
 * 重写的最终版方案就是自动生成toString()方法。
 * 
 * 注意：
 * 	 直接输出一个对象的名称，其实就是调用该对象的toString()方法。
 */
package com.yida_02.toString;


public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student("张三", 28);
		System.out.println(s.hashCode());//打印s对象在内存中的虚拟地址
		System.out.println(s.getClass().getName());//获取字节码对象的实体类名称
		
		System.out.println("----------");
		
		System.out.println(s.toString());
		
		//toString()方法的值等价于getClass().getName() + "@" + Integer.toHexString(hashCode());
		System.out.println(s.getClass().getName()+"@"+Integer.toHexString(s.hashCode()));
		
		System.out.println("----------");
		
		//Student类重载的toString()方法后，测试
		Student s2 = new Student("李四", 30);
		System.out.println(s2.toString());//调用自己重写的方法，多态性
		System.out.println(s2);//直接输出一个对象的名称，其实就是调用该对象的toString()方法。
	}

}
