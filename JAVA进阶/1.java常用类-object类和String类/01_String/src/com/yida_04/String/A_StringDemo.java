/*
 * String类的判断功能：
 * public boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
 * public boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
 * public boolean contains(String str):判断大字符串中是否包含小字符串
 * public boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
 * public boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾
 * public boolean isEmpty():判断字符串是否为空。
 * 
 * 注意：
 * 		字符串内容为空和字符串对象为空。
 * 		String s = "";
 * 		String s = null;
 */
package com.yida_04.String;

public class A_StringDemo {

	public static void main(String[] args) {
		String s1 = "hello world";
		String s2 = "hello world";
		String s3 = "Hello WORLD";
		//public boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		
		
		System.out.println("-----------");
		
		//public boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
		System.out.println(s1.equalsIgnoreCase(s3));//true
		
		System.out.println("-----------");
		 
		//public boolean contains(String str):判断大字符串中是否包含小字符串
		System.out.println(s1.contains("wor"));//true
		System.out.println(s1.contains("Wor"));//false
		
		System.out.println("-----------");
		
		//public boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
		System.out.println(s1.startsWith("hello"));//true
		System.out.println(s1.startsWith("h"));//true
		System.out.println(s1.startsWith("Hel"));//false
		
		System.out.println("-----------");
		
		//public boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾
		System.out.println(s1.endsWith("world"));//true
		System.out.println(s1.endsWith("ld"));//true
		System.out.println(s1.endsWith("lD"));//false
		
		System.out.println("-----------");
		
		String s4 = "";//有内存地址，但内容为空
		System.out.println("isEmpty:" + s4.isEmpty());//true
		
		//String s5 = null;//内存地址为空
		//System.out.println("isEmpty:" + s5.isEmpty());// NullPointerException s5对象都不存在，所以不能调用方法，空指针异常
		
	}

}
