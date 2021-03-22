 /*
 * 替换功能：
 * public StringBuffer replace(int start,int end,String str):从start开始到end用str替换
 * 
 * 反转功能：
 * public StringBuffer reverse()
 * 
 * 设置给定索引处的字符
 * public void setCharAt(int index, char ch)
 */
package com.yida_01;

public class D_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append("world");
		sb.append("java");
		System.out.println("sb:" + sb);
		System.out.println("------");
		
		
		// public StringBuffer replace(int start,int end,String
		// str):从start开始到end用str替换
		sb.replace(5, 10, "yidahulian");
		System.out.println("sb:" + sb);
		System.out.println("------");
		sb.replace(sb.length() - 4, sb.length(), "宜达互联");
		System.out.println("sb:" + sb);
		System.out.println("------");
		
		// public StringBuffer reverse()字符串反转功能
		StringBuffer sb2 = new StringBuffer("宜达互联");
		sb2.reverse();
		System.out.println("sb2:" + sb2);
		
		// public void setCharAt(int index, char ch)设置给定索引处的字符
		StringBuffer sb3 = new StringBuffer("你好,java");
		sb3.setCharAt(1, '棒');
		System.out.println("sb3:" + sb3);
		System.out.println("------");
		sb3.setCharAt(2, '!');
		System.out.println("sb3:" + sb3);
		System.out.println("------");
	 
	}

}
