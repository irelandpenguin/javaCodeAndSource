/*
 * String类的获取功能
 * public int length():获取字符串的长度。
 * public char charAt(int index):获取指定索引位置的字符
 * public int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。找不到返回-1
 * public int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。找不到返回-1
 * public int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。找不到返回-1
 * public int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。找不到返回-1
 * public int lastIndexOf(String str)返回最右边出现的指定子字符串在此字符串中的索引。找不到返回-1
 * public String substring(int start):从指定位置开始截取字符串,默认到末尾。
 * public String substring(int start,int end):从指定位置开始到指定位置结束截取字符串。
 */
package com.yida_05.String;

public class A_StringDemo {

	public static void main(String[] args) {
		// public int length():获取字符串的长度。
		String s = "hello";
		System.out.println("length=" + s.length());

		System.out.println("------");

		// public char charAt(int index):获取指定索引位置的字符
		String s2 = "hello world";
		char c = s2.charAt(6);
		System.out.println("s2.charAt(6)=" + c);
		c = s2.charAt(s2.length()-1);//获取最后一个字符
		System.out.println("最后一个字符为：" + c);
		
		System.out.println("------");

		
		// public int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。
		int index = s2.indexOf('l');
		System.out.println(s2 + "中字符l第一次出现的位置为" + index);
		index = s2.indexOf('A');
		System.out.println(s2 + "中字符A第一次出现的位置为" + index);
		
		System.out.println("------");

		// public int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。
		int index2 = s2.indexOf('l', 6);
		System.out.println("字符l在原字符串" + s2 + "索引为6以后第一次出现的位置为" + index2);
		index2 = s2.indexOf('A', 6);
		System.out.println("字符A在原字符串" + s2 + "索引为6以后第一次出现的位置为" + index2);
		
		System.out.println("------");

		// public int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。
		String s3 = "hi, yidahulian, i love yida, welcom to yidahulian";
		String s4 = "yida";
		int index3 = s3.indexOf(s4);
		System.out.println(s4 + "在原字符串" + s3 + "中第一次出现的位置为" + index3);
		index3 = s3.indexOf("YIDA");
		System.out.println("YIDA在原字符串" + s3 + "中第一次出现的位置为" + index3);
		
		System.out.println("------");

		// public int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
		int index4 = s3.indexOf(s4, 15);
		System.out.println(s4 + "在原字符串" + s3 + "中从索引15以后第一次出现的位置为" + index4);
		index4 = s3.indexOf("YIDA", 15);
		System.out.println("YIDA在原字符串" + s3 + "中从索引15以后第一次出现的位置为" + index4);
		
		System.out.println("------");
		
		//public int lastIndexOf(String str)返回最右边出现的指定子字符串在此字符串中的索引。找不到返回-1
		int index5 = s3.lastIndexOf("yida");
		System.out.println("yida在原字符串" + s3 + "中最后第一次出现的位置为" + index5);
		
		System.out.println("------");

		// public String substring(int start):从指定位置开始截取字符串,默认到末尾。
		String sub1 = s3.substring(16);
		System.out.println("截取的子串为" + sub1);
		
		System.out.println("------");

		// public String substring(int start,int end):从指定位置开始到指定位置结束截取字符串。
		String sub2 = s3.substring(16, 27);
		System.out.println("截取的子串为" + sub2);
		
		System.out.println("------");

		// 需求：遍历获取字符串中的每一个字符。
		String str = "hello yidahulian";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}
	}

}
