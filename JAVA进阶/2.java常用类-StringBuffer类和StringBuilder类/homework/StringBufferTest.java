package com.yida;

import java.util.Scanner;

public class StringBufferTest {

	public static void main(String[] args) {
		test1();
		//test2();
		//test3();
		//test4();
		//test5();
		//test6();
		//test7();
		//test8();
		//test9();
		//test10();
		//test11();
		//test12();
		//test13();
		//test14();
	}
	
	//1.  对字符串对象"helloboy"进行加密，要求使用可变字符串添加密文字符。加密后的密文是"IFMMPCPZ"，打印输出该密文。
	//(思路：根据字符的ASCII码可知，小写字母与大写字母数值差为32。即 'h'-32就是字符'H')
	public static void test1() {
		StringBuffer sb = new StringBuffer("helloboy");
		StringBuffer ss = new StringBuffer();
		for(int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			c = (char)(c-32+1);//强制类型转换
			ss.append(c);
		}
		System.out.println(ss);
	}

	//2. 定义一个可变字符串"today, we will study another string, this string is import for us, now begin the string!"，
	//在逗号后面插入字符串"msn"，打印输出插入后的英文。
	public static void test2() {
		StringBuffer sb = new StringBuffer("today, we will study another string, this string is import for us, now begin the string!");
		int index = sb.indexOf(",");
		while(index != -1) {
			sb.insert(index+1, "msn");//在逗号之后，插入"msn"
			index = sb.indexOf(",", index+1);//从逗号之后，继续往后找
		}
		System.out.println(sb);
	}
	
	//1.  有一个可变字符串"i love java, beging to learning java needs a persisting hert!"，
	//去掉后辍为"ing"的单词后辍，打印输出改写后的原可变字符串。
	public static void test3() {
		StringBuffer sb = new StringBuffer("i love java, beging to learning java needs a persisting hert!");
		int index = sb.indexOf("ing");
		while(index != -1) {
			sb.delete(index, index+3);//这里3表示"ing"的长度
			index = sb.indexOf("ing");//继续找下一个"ing"
		}
		System.out.println(sb);
	}
	
	//1. 有一个可变字符串"today, we will study another string, this string is import for us, now begin the string!"，
	//把含有"string"字符串替换成"STRING"，打印输出替换后的原字符串。
	public static void test4() {
		StringBuffer sb = new StringBuffer("today, we will study another string, this string is import for us, now begin the string!");
		int index = sb.indexOf("string");
		while (index != - 1) {
			sb.replace(index, index+6, "STRING");//这里6表示"string"的长度
			index = sb.indexOf("string");
		}
		System.out.println(sb);
	}
	
	//1. 把可变字符串"thank you very much, my friends!"截取"very much, my"，截取成功后把字符串"dear students!"拼接其后并打印输出。
	public static void test5() {
		StringBuffer sb = new StringBuffer("thank you very much, my friends!");
		String s = "very much, my";
		StringBuffer ss = new StringBuffer();
		int index = sb.indexOf(s);
		ss.append(sb.substring(index, index+s.length()));
		ss.append("dear students!");
		System.out.println(ss);
	}
	
	//2.  有一个字符数组{"hello","world","foodwater","goodluck","hello","rootboy","photo","toomany","well","hold"};
	//找出数组中包含"oo"的数组元素，然后截取其"oo"后面的字符串，打印输出。
	public static void test6() {
		String[] arr = {"hello","world","foodwater","goodluck","hello","rootboy","photo","toomany","well","hold"};
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			int index = s.indexOf("oo");//查找包含"oo"的数组元素
			if (index != -1) {//找到了
				sb.append(s.substring(index+2)+" ");//这里2表示"oo"的长度，使用空格把每个截取的单词分开
			}
		}
		System.out.println(sb);
	}
	
	//1. 有一可变字符串"welcom to China, My Friends!"，查找字符串"China"，若存在打印它所在的位置所引。
	public static void test7() {
		StringBuffer sb = new StringBuffer("welcom to China, My Friends!");
		int index = sb.indexOf("China");
		while(index != -1) {//找到了
			System.out.println("China的索引位置为："+index);
			//可能不只一个"China"，所以要继续找下一个，直到找不到为止，退出while循环
			index = sb.indexOf("China", index+5);//这里5表示"China"的长度
		}
	}
	
	//2. 查找可变字符串"today, we will study another string, this string is import for us, now begin the string!"
	//"中包含的"string", 输出它们的所有位置。
	public static void test8() {
		StringBuffer sb = new StringBuffer("today, we will study another string, this string is import for us, now begin the string!");
		int index = sb.indexOf("string");
		while(index != -1) {//找到了
			System.out.println("string的索引位置为："+index);
			//可能不只一个"string"，所以要继续找下一个，直到找不到为止，退出while循环
			index = sb.indexOf("string", index+6);//这里6表示"string"的长度
		}
	} 
	
	//1. 键盘录入字符串，判断该字符串是否是对称字符串。
    //例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串。
	public static void test9() {
		System.out.print("请输入一个字符串：");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		String ss = sb.reverse().toString();//得到反转后的字符串
		if (ss.equals(s)) {//判断是否是对称字符串
			System.out.println(s+"是对称字符串");
		} else {
			System.out.println(s+"不是对称字符串");
		}
		sc.close();
	}
	
	//1. 有一整型数组 {29, 36, 157, 112, 14, 21, 6, 81, 10, 53}，利用冒泡排序对其进行从大到小排序。
	public static void test10() {
		int[] arr = {29, 36, 157, 112, 14, 21, 6, 81, 10, 53};
		for(int i = 1; i < arr.length; i++) {//控制循环次数
			for(int j = 0; j < arr.length-i; j++) {//两两比较，大的下沉，轻的上浮
				if (arr[j] < arr[j+1]) {//从大到小排
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		//打印输出数组元素
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//2. 有一字符数组{'X', 'P', 'T', 'B', 'O', 'C', 'Q', 'A', 'U', 'L'}，利用选择排序对其进行从小到大排序。
	public static void test11() {
		char[] arr = {'X', 'P', 'T', 'B', 'O', 'C', 'Q', 'A', 'U', 'L'};
		for(int i = 0; i < arr.length-1; i++) {//外层控制循环次数
			for (int j = i+1; j < arr.length; j++) {//内层用于比较
				if (arr[i] > arr[j]) {//从小到大排
					char c = arr[i];
					arr[i] = arr[j];
					arr[j] = c;
				}
			}
		}
		
		//打印输出数组元素
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//3. 有一整型顺序数组{29, 36, 57, 112, 314, 421, 630, 841, 1090, 5200}，
	//利用二分查找法找出57,630，1090，555分别对应的索引，没找到返回-1。
	public static void test12() {
		int[] arr = {29, 36, 57, 112, 314, 421, 630, 841, 1090, 5200};
		int[] vals = {57,63, 1090, 555};
		for (int i = 0; i < vals.length; i++) {
			int val = vals[i];
			int index = binSearch(arr, val);
			System.out.println(val+"的索引位置为："+index);
		}
	}
	
	public static int binSearch(int[] arr, int val) {
		int low = 0, hight = arr.length-1;//设置低索引，高索引
		while (low <= hight) {
			int mid = (low+hight)/2;//获取中间索引
			if (arr[mid] == val) {//找到返回
				return mid;
			}
			if (arr[mid] > val) {//中间索引对应的值大于val，从左边找
				hight = mid-1;
			} else {//中间索引对应的值小于val，从右边找
				low = mid+1;
			}
		}
		
		return -1;
	}
	
	//1. 键盘录入一个整数，打印输出其对应的二进制，八进制，十六进制。
	public static void test13() {
		System.out.print("请输入一个整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();//获取整数
		System.out.println("十进制："+Integer.toString(num));
		System.out.println("二进制："+Integer.toBinaryString(num));
		System.out.println("八进制："+Integer.toOctalString(num));
		System.out.println("十六进制："+Integer.toHexString(num));
		sc.close();
	}
	
	//2. 键盘录入一个字符串，统计字符串中大写字母字符，小写字母字符，数字字符。
	public static void test14() {
		int big=0, lte=0, num=0;//big统计大写字符，lte统计小写字符，num统计数字字符
		System.out.print("请输入一个字符串：");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);//获取指定索引对应的字符
			if (Character.isLetter(c)) {//是否是字母
				if (Character.isLowerCase(c)) {//是小写字母
					lte++;
				}
				if (Character.isUpperCase(c)) {//是大写字母
					big++;
				}
			}
			
			if (Character.isDigit(c)) {//是否是数字
				num++;
			}
		}
		System.out.println("大写字母有"+big+"个，小写字母有"+lte+"个，数字有"+num+"个");
		sc.close();
	}

}
