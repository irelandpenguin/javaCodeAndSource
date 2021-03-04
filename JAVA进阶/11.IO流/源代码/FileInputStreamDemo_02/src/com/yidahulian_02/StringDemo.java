package com.yidahulian_02;

import java.util.Arrays;

/*
 * 计算机是如何识别什么时候该把两个字节转换为一个中文呢?
 * 在计算机中,中文的存储分两个字节：
 * 		第一个字节肯定是负数。
 * 		第二个字节常见的是负数，可能有正数。但是没影响。
 */
public class StringDemo {

	public static void main(String[] args) {
		//String s = "abcde12*&@(){}[]";//[97, 98, 99, 100, 101, 49, 50, 42, 38, 64, 40, 41, 123, 125, 91, 93]
		String s = "宜达互联";// [-46, -53, -76, -17, -69, -91, -63, -86]

		byte[] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));
		System.out.println(new String(bys));

		// 通过打印结果，可以推断出：
		// 字母或其它符号对应的ASCII码均为正数。
		// 中文第一个字节对应的ASCII码一定是负数，第二个字节对应的ASCII码一般也为负数，也可能为正数。
		// 所以，计算机在处理字节时会自动判断，ASCII码为正数的，直接输出；ASCII码是负数的，就会自动合并后一个字节。就变成了汉字。
	}

}
