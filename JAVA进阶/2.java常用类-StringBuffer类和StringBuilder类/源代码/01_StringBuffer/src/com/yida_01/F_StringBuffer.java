/*
 * StringBuffer的查询功能:
 * public int indexOf(String str)返回第一次出现的指定子字符串在该字符串中的索引。找不到返回-1
 * public int indexOf(String str, int fromIndex)从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引。找不到返回-1
 * public int lastIndexOf(String str)返回最右边出现的指定子字符串在此字符串中的索引。找不到返回-1
 */
package com.yida_01;

public class F_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("helloyidajava").append("yidakeji").append("yidahulian");//链式编程
		System.out.println("sb:" + sb);
		System.out.println("-------");

		// public int indexOf(String str)返回第一次出现的指定子字符串在该字符串中的索引。找不到返回-1
		int index = sb.indexOf("yida");
		System.out.println("index:" + index);
		System.out.println("-------");
		
		// public int indexOf(String str, int fromIndex)从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引。找不到返回-1
		int index2 = sb.indexOf("yida", 13);
		System.out.println("index2:" + index2);
		System.out.println("--------");

		// public int lastIndexOf(String str)返回最右边出现的指定子字符串在此字符串中的索引。找不到返回-1
		int index3 = sb.lastIndexOf("yida");
		System.out.println("index3:" + index3);
	}

}
