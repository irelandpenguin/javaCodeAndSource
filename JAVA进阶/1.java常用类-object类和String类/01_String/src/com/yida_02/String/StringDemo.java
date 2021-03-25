/*
 * 字符串：就是由多个字符组成的一串数据。也可以看成是一个字符数组。
 * 通过查看API，我们可以知道
 * 		A:字符串字面值"abc"也可以看成是一个字符串对象。
 * 		B:字符串是常量，一旦被赋值，就不能被改变。
 * 
 * 构造方法：
 * 		public String():空构造
 *		public String(byte[] bytes):把字节数组转成字符串
 *		public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
 *		public String(char[] value):把字符数组转成字符串
 *		public String(char[] value,int index,int count):把字符数组的一部分转成字符串
 *		public String(String original):把字符串常量值转成字符串
 *
 * 字符串的方法：
 * 		public int length()：返回此字符串的长度。
 * 
 * 字符串的特点：一旦被赋值，就不能改变。
 */
package com.yida_02.String;

public class StringDemo {
	
	public static void main(String[] args) {
		// public String():空构造
		String s1 = new String();
		System.out.println("s1=" + s1);
		System.out.println("length=" + s1.length());
		System.out.println("----------");

		// public String(byte[] bytes):把字节数组转成字符串对象
		byte[] bye = { 65, 66, 67, 68, 69 };
		String s2 = new String(bye); 
		System.out.println("s2=" + s2);
		System.out.println("length=" + s2.length());
		System.out.println("-----------");
		
		
		// public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串对象
		byte[] bye2 = { 65, 66, 67, 68, 69 };// {97,98,99,100,101};//{48,49,50,51,52};
		String s3 = new String(bye2, 2, 3);
		System.out.println("s3=" + s3);
		System.out.println("length=" + s3.length());
		System.out.println("---------");
		
		// public String(char[] value):把字符数组转成字符串对象
		char[] ch = { 'a', 'b', 'c', 'd', 'e' };
		String s4 = new String(ch);
		System.out.println("s4=" + s4);
		System.out.println("length=" + s4.length());
		System.out.println("---------");
		
		// public String(char[] value,int index,int count):把字符数组的一部分转成字符串对象
		String s5 = new String(ch, 1, 3);
		System.out.println("s5=" + s5);
		System.out.println("length=" + s5.length());
		System.out.println("---------");
		
		// public String(String original):把字符串常量值转成字符串对象
		String s6 = new String("helloworld");
		System.out.println("s6=" + s6);
		System.out.println("length=" + s6.length());
		System.out.println("---------");
		
		// 字符串的特点：一旦被赋值，就不能改变。
		/*
		 * "hello"会放到代码区里的常量区里;
		 * "world"也会放到代码区里的常量区里;
		 * 同时还会重新生成一个"helloworld"放到常量区里，s7重新指向这个地址;
		 * 这里还需要注意一点：s7是变量，"hello","world","helloworld"都是常量
		 */
		String s7 = "hello";//s7是字符串常量
		s7 += "world";//等效于 s7 = s7+"world";
		System.out.println("s7=" + s7);//helloworld
	}

}
