/*
 * String类的其他功能：
 * 
 * 替换功能
 * public String replace(char old,char new)
 * public String replace(CharSequence target,CharSequence replacement)
 *
 * 去除字符串两边的空格	
 * public String trim()
 * 
 * 比较两个字符串  
 * public int compareTo(String str)
 * public int compareToIgnoreCase(String str)
 */
package com.yida_07.String;

public class A_StringDemo {
	
	public static void main(String[] args) {
		// public String replace(char old,char new) 替换功能(字符的替换)
		String s = "hi,yidahulian";
		String s2 = s.replace('i', 'o');
		System.out.println(s + "替换后的结果为" + s2);
		
		System.out.println("------");
		
		// public String replaceAll(String old,String new) 替换功能(字符串的替换)
		String s3 = "i love yida, welcom to yida, study yida";
		//String s4 = s3.replaceAll("yida", "java");
		
		//public String replace(CharSequence target,CharSequence replacement) 替换功能(字符串的替换)
		String s4 = s3.replace("yida", "java");
		System.out.println(s3 + "替换后的结果为" + s4);
		
		System.out.println("------");

		// public String trim() 去除字符串两头的空格
		String s5 = " 		 good good study, day day up! 				 ", s6;
		s6 = s5.trim();
		System.out.println("去除字符串两头的空格，最终为" + s6);
		
		System.out.println("------");

		// public int compareTo(String str) 比较两个字符串(区分大小写)
		String s7 = "hello", s8 = "java";
		int result = s7.compareTo(s8);
		System.out.println(s7 + "与" + s8 + "比较后的结果为" + result);
		if (result > 0) {
			System.out.println(s7 + "大于" + s8);
		} else if (result < 0) {
			System.out.println(s7 + "小于" + s8);
		} else {
			System.out.println(s7 + "等于" + s8);
		}
		
		System.out.println("------");
		
		// public int compareToIgnoreCase(String str) 比较两个字符串(不区分大小写)
		String s9 = "zELLO";
		int result2 = s7.compareToIgnoreCase(s9);
		System.out.println(s7 + "与" + s9 + "比较后的结果为" + result2);
		if (result2 > 0) {
			System.out.println(s7 + "大于" + s9);
		} else if (result2 < 0) {
			System.out.println(s7 + "小于" + s9);
		} else {
			System.out.println(s7 + "等于" + s9);
		}
	} 

}
