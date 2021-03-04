/*
 * Character 类在对象中包装一个基本类型 char 的值
 * 此外，该类提供了几种方法，以确定字符的类别（小写字母，大写字母，数字等）
 * 并将字符从大写转换成小写，从小写转换成大写。
 * 
 * 构造方法：
 * 		Character(char value)
 * 
 * public static boolean isUpperCase(char ch):判断给定的字符是否是大写字符
 * public static boolean isLowerCase(char ch):判断给定的字符是否是小写字符
 * public static boolean isDigit(char ch):判断给定的字符是否是数字字符
 * public static char toUpperCase(char ch):把给定的字符转换为大写字符
 * public static char toLowerCase(char ch):把给定的字符转换为小写字符
 */
package com.yida_01;

public class A_Character {

	public static void main(String[] args) {
		Character ch = new Character('A');
		System.out.println("ch:" + ch);
		System.out.println("------");

		// public static boolean isLowerCase(char ch):判断给定的字符是否是小写字符
		System.out.println(Character.isLowerCase('a'));//true
		System.out.println(Character.isLowerCase('A'));//false
		System.out.println("------");

		// public static boolean isUpperCase(char ch):判断给定的字符是否是大写字符
		System.out.println(Character.isUpperCase('A'));//true
		System.out.println(Character.isUpperCase('a'));//false
		System.out.println("------");
		
		
		// public static boolean isDigit(char ch):判断给定的字符是否是数字字符
		System.out.println(Character.isDigit('8'));//true
		System.out.println(Character.isDigit('b'));//false
		System.out.println("------");
		
		// public static char toUpperCase(char ch):把给定的字符转换为大写字符
		char ch1 = Character.toUpperCase('w');
		System.out.println("ch:" + ch1);
		System.out.println("------");
		
		// public static char toLowerCase(char ch):把给定的字符转换为小写字符
		char ch2 = Character.toLowerCase('B');
		System.out.println("ch2:" + ch2);
	}

}
