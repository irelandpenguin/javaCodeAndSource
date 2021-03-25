/*
 * String的转换功能：
 * public byte[] getBytes():把字符串转换为字节数组。
 * public char[] toCharArray():把字符串转换为字符数组。
 * public static String valueOf(char[] chs):把字符数组转成字符串。
 * public static String valueOf(int i):把int类型的数据转成字符串。
 * public static String valueOf(char c):把char类型的数据转成字符串。
 * public static String valueOf(double d):把double类型的数据转成字符串。
 * 注意：valueOf方法还有很多其它重载，看JDK API帮助文档。它可以把任意类型的数据转成字符串。
 * public String toLowerCase():把字符串转成小写。
 * public String toUpperCase():把字符串转成大写。
 * public String concat(String str):把字符串拼接。
 * public String[] split(String regex):根据给定正则表达式的匹配拆分此字符串。
 * 		注意：这里只是简单使用，正则表达式后面还会详细讲解。
 */
package com.yida_06.String;

public class A_StringDemo {

	public static void main(String[] args) {
		// public byte[] getBytes():把字符串转换为字节数组。
		String s = "helloworld";
		byte[] bye = s.getBytes();
		for (int i = 0; i < bye.length; i++) {
			System.out.print(bye[i] + " ");
		}
		
		//字节数组转字符串
		//String ss = new String(bye);
		//System.out.println(ss);
		
		 
		System.out.println("\n------");

		// public char[] toCharArray():把字符串转换为字符数组。
		char[] cha = s.toCharArray();
		for (int i = 0; i < cha.length; i++) {
			System.out.print(cha[i] + " ");
		}
		
		//字符数组转字符串
		//String ss = new String(cha);
		//System.out.println(ss);

		System.out.println("\n------");
		
		// public static String valueOf(char[] chs):把字符数组转成字符串。
		char[] chars = { 'y', 'i', 'd', 'a', 'h', 'u', 'l', 'i', 'a', 'n' };
		String s2 = String.valueOf(chars);
		System.out.println(s2);

		System.out.println("------");
		
		// public static String valueOf(int i):把int类型的数据转成字符串。
		// public static string valueOf(char c):把char类型的数据转成字符串。
		// public static string valueOf(double d):把double类型的数据转成字符串。
		// 注意：valueOf方法还有很多其它重载，看JDK API帮助文档。它可以把任意类型的数据转成字符串。
		int num = 100;
		char c = 'A';
		double dl = 3.14;
		String s_num = String.valueOf(num);
		String s_c = String.valueOf(c);
		String s_dl = String.valueOf(dl);
		System.out.println("转换后的结果为" + s_num + ", " + s_c + ", " + s_dl);
		
		System.out.println("------");

		// public String toLowerCase():把字符串转成小写。
		// public String toUpperCase():把字符串转成大写。
		String s3 = "YiDaHuLian";
		String s_low = s3.toLowerCase();
		String s_upper = s3.toUpperCase();
		System.out.println("输换后的结果为" + s_low + ", " + s_upper);
		
		System.out.println("------");

		// public String concat(String str):把字符串拼接。
		String s4 = "hello", s5 = "world", s6, s7;
		s6 = s4.concat(s5);
		System.out.println("拼接后的字符串为" + s6);
		s7 = s4 + s5;
		System.out.println("拼接后的字符串为" + s7);
		
		System.out.println("------");

		// public String[] split(String regex):根据给定正则表达式的匹配拆分此字符串。
		//注意：这里只是简单使用，正则表达式后面还会详细讲解。
		String s8 = "hello world i love yida";
		String[] ary = s8.split(" ");
		for (int i = 0; i < ary.length; i++) {
			String str = ary[i];
			System.out.println(str);
		}
		
		System.out.println("------");
		
		String[] ary2 = s8.split("world");
		for (int i = 0; i < ary2.length; i++) {
			String str = ary2[i];
			System.out.println(str);
		}
	}

}
